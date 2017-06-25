package com.nia.rpc.core.protocol;

import com.nia.rpc.core.serializer.Serializer;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class RpcEncoder extends MessageToByteEncoder<Object> {
	private Serializer serializer = new KryoSerializer();
	@Override
	protected void encode(ChannelHandlerContext arg0, Object arg1, ByteBuf arg2) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
