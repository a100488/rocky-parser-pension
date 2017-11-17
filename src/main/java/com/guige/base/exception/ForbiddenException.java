package com.guige.base.exception;

import com.guige.base.exception.vo.MessageVo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 非法访问异常
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class ForbiddenException extends BaseException {

	private static final long serialVersionUID = -1490728564509176810L;

	public ForbiddenException() {
        super();
    }

    public ForbiddenException(String errCode) {
        super(errCode);
    }

    public ForbiddenException(Throwable throwable) {
        super(throwable);
    }

    public ForbiddenException(String errCode, Throwable throwable) {
        super(errCode, throwable);
    }
    
    public ForbiddenException(MessageVo messages, Object srcClass) {
    	super();
    	setMessageVo(messages);
    }

}