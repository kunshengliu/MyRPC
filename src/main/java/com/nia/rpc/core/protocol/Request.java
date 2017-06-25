package com.nia.rpc.core.protocol;

import lombok.Data;
/**
 * @author liukunsheng
 *
 */
@Data
public class Request {
	private long requestId;
	private Class<?> clazz;
	private String method;
	private Class<?>[] parameterTypes;
	private Object[] params;
	private long requestTime;
}
