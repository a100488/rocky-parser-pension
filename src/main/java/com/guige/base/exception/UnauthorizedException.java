package com.guige.base.exception;

import com.guige.base.exception.vo.MessageVo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends BaseException {

	private static final long serialVersionUID = -1490728564509176810L;
	
	private String loginId;

	public UnauthorizedException() {
        super();
    }

    public UnauthorizedException(String errCode) {
        super(errCode);
    }

    public UnauthorizedException(Throwable throwable) {
        super(throwable);
    }

    public UnauthorizedException(String errCode, Throwable throwable) {
        super(errCode, throwable);
    }
    
    public UnauthorizedException(String errCode, String loginId) {
        super(errCode);
        this.loginId = loginId;
    }
    
    public UnauthorizedException(MessageVo messages) {
    	super();
    	setMessageVo(messages);
    }

    public String getLoginId() {
    	return loginId;
    }
}