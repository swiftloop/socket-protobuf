//
//  ViewController.m
//  socket-demo
//
//  Created by cocos on 2020/6/4.
//  Copyright © 2020 cocos. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    
   GCDAsyncSocket * socket =  [[GCDAsyncSocket alloc] initWithDelegate:self delegateQueue:dispatch_get_main_queue()];
    NSError* err;
    if (![socket connectToHost:@"localhost" onPort:8888 error:&err]) {
        NSLog(@"连接失败");
        return;
    }
    [socket readDataToLength:4 withTimeout:-1 tag:1];
    NSLog(@"dd");
    
}


-(void)socket:(GCDAsyncSocket *)sock didReadData:(NSData *)data withTag:(long)tag{
    if (tag == 1) {
       int headerLen =  [ByteBuffer readInt:data];
       [sock readDataToLength:headerLen withTimeout:-1 tag:2];
    }else if(tag == 2){
        //读取到了准确的数据
        NSError * err;
        Packet * packet = [[Packet alloc] initWithData:data error:&err];
        //todo 检查错误 &err
        NSLog(@"sid is %d,%@",packet.sid,[[NSString alloc] initWithData:packet.body encoding:NSUTF8StringEncoding]);

        //缓存下一个消息头
        [sock readDataToLength:4 withTimeout:-1 tag:1];
    }
    
}

-(void)socketDidDisconnect:(GCDAsyncSocket *)sock withError:(NSError *)err{
    NSLog(@"socketDidDisconnect :%@",err);
}

-(void)socket:(GCDAsyncSocket *)sock didWriteDataWithTag:(long)tag{
    if (tag == 1) {
        NSLog(@"didWriteDataWithTag");
    }
}


-(void)socket:(GCDAsyncSocket *)sock didConnectToHost:(NSString *)host port:(uint16_t)port{
    NSLog(@"connection successful %@:%d",host,port);
    Packet * sendPacket = [Packet message];
    sendPacket.cid = 3;
    sendPacket.sid = 3;
    LoginReq * req = [LoginReq message];
    req.userId = @"122";
    req.tag = @"cc";
    req.platform = @"mm";
    sendPacket.body = [req data];
    NSData * message = [sendPacket data];
    NSMutableData *mu = [ByteBuffer writeInt: (int)[message length]];
    [mu appendData:message];
    int8_t m[22];
    [mu getBytes:&m length:22];
    for(int i = 0;i<22;i++){
        NSLog(@"dd------- %d",m[i]);
    }

    [sock writeData:mu withTimeout:-1 tag:1];
}



@end
