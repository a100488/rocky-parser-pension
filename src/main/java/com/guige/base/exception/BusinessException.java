package com.guige.base.exception;

import com.guige.base.exception.vo.MessageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 业务异常
 */

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class BusinessException extends BaseException {

    private static final long serialVersionUID = 3086627551412398745L;

    public BusinessException() {
        super();

    }

    public BusinessException(String errCode) {
        super(errCode);
    }

    public BusinessException(Throwable throwable) {
        super(throwable);
    }

    public BusinessException(String errCode, Throwable throwable) {
        super(errCode, throwable);
    }

    public BusinessException(MessageVo messages) {
    	super();
    	setMessageVo(messages);
    }

    /**
     * 
     * @param errCode
     * @param values 占位符信息
     */
    public BusinessException(String errCode, Object... values) {
    	super();
   		setMessage(errCode, values);
    }
    
    /**
     * 
     * @param errCode
     * @param field 占位字段名
     */
    public BusinessException(String errCode, String field) {
    	super();
   		setMessage(errCode, field);
    }
}
