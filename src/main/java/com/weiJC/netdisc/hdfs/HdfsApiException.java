package com.weiJC.netdisc.hdfs;

public class HdfsApiException extends Exception{
	public HdfsApiException(String message) {
	    super(message);
	  }

	  public HdfsApiException(String message, Throwable cause) {
	    super(message, cause);
	  }
}
