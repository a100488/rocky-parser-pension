package com.guige.base.exception;

import com.guige.base.exception.vo.MessageVo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 *找不到数据
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends BaseException {

    private static final long serialVersionUID = -8687066286979480116L;

    public NotFoundException() {
        super();
    }

    public NotFoundException(String errCode) {
        super(errCode);
    }

    public NotFoundException(Throwable throwable) {
        super(throwable);
    }

    public NotFoundException(String errCode, Throwable throwable) {
        super(errCode, throwable);
    }
    
    public NotFoundException(MessageVo messages) {
    	super();

    	setMessageVo(messages);
    }

}
