package com.guige.base.exception;

import com.guige.base.exception.vo.MessageVo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.MOVED_PERMANENTLY)
public class MovedPermanentlyException extends BaseException {

    private static final long serialVersionUID = 8935143312958653140L;

    public MovedPermanentlyException() {
        super();
    }

    public MovedPermanentlyException(String errCode) {
        super(errCode);
    }

    public MovedPermanentlyException(Throwable throwable) {
        super(throwable);
    }

    public MovedPermanentlyException(String errCode, Throwable throwable) {
        super(errCode, throwable);
    }
    
    public MovedPermanentlyException(MessageVo messages) {
    	super();
    	setMessageVo(messages);
    }

}
