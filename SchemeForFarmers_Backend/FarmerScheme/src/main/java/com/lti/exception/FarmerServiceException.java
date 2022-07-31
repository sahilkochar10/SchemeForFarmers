package com.lti.exception;

public class FarmerServiceException extends RuntimeException {
public FarmerServiceException() {
}
  
  public FarmerServiceException(String arg0) {
    super(arg0);
}
  
  public FarmerServiceException(Throwable arg0) {
    super(arg0);
}
  
  public FarmerServiceException(String arg0, Throwable arg1) {
    super(arg0, arg1);
}
  
  public FarmerServiceException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
    super(arg0, arg1, arg2, arg3);
  }
}
