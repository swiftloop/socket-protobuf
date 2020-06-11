//
//  ByteBuffer.h
//  socket-demo
//
//  Created by cocos on 2020/6/9.
//  Copyright © 2020 cocos. All rights reserved.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface ByteBuffer : NSObject

+(int)readInt:(NSData*)data;
+(NSMutableData*)writeInt:(int) num;

@end

NS_ASSUME_NONNULL_END
