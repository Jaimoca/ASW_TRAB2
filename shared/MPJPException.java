package mpjp.shared;

import java.lang.String;
import java.lang.Throwable;

public class MPJPException extends java.lang.Exception {
	
	public MPJPException () {
		super();
	}
	
	public MPJPException(String message) {
		super(message);
	}
	
	public MPJPException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public MPJPException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public MPJPException(Throwable cause) {
		super(cause);
	}

}
