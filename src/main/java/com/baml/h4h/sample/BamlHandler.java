package com.baml.h4h.sample;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.backendless.async.callback.BackendlessCallback;
import com.backendless.exceptions.BackendlessFault;

public class BamlHandler<T> extends BackendlessCallback<T> {

	public void handleResponse(T response) {
		System.out.println(response.toString());
	}

	@Override
	public void handleFault(BackendlessFault fault) {
		/*
		 * com.backendless.exceptions.BackendlessFault@3eb094b1[message=Unable to register user. User already exists.,detail=<null>,faultCode=3033]
		 */
		System.out.println(ReflectionToStringBuilder.toString(fault));
		//super.handleFault(fault);
	}

}
