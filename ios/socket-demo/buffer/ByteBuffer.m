//
//  ByteBuffer.m
//  socket-demo
//
//  Created by cocos on 2020/6/9.
//  Copyright © 2020 cocos. All rights reserved.
//

#import "ByteBuffer.h"

@implementation ByteBuffer


+(int)readInt:(NSData *) data{
    NSInteger len = [data length];
    if (len != 4) {
        @throw [NSException exceptionWithName:@"Exception" reason:@"read int error len!=4" userInfo:nil];
    }
    return ([self read:data index:NSMakeRange(0, 1)] & 0xff) << 24 | ([self read:data index:NSMakeRange(1,1)] &0xff) << 16 | ([self read:data index:NSMakeRange(2, 1)] &0xff) << 8  | ([self read:data index:NSMakeRange(3, 1)] & 0xff);
}

+ (NSMutableData *)writeInt:(int)num{
    int8_t ch[4];
    ch[0] = num >> 24 & 0xff;
    ch[1] = num >> 16 & 0xff;
    ch[2] = num >> 8 & 0xff;
    ch[3] = num & 0xff;
    NSMutableData * data = [[NSMutableData alloc] init];
    [data appendBytes: ch length:4];
    return data;
}



+(int32_t)read:(NSData *)data index:(NSRange) index{
    int8_t v;
    [data getBytes:&v range:index];
   return v & 0xff;
}


@end
