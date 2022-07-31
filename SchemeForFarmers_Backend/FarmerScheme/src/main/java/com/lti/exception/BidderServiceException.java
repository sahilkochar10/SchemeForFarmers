package com.lti.exception;

public class BidderServiceException extends RuntimeException {

	public BidderServiceException() {
	}
	public BidderServiceException(String arg0) {
		super(arg0);
	}
	public BidderServiceException(Throwable arg0) {
		super(arg0);
	}
	public BidderServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	public BidderServiceException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
}
