package com.guige.base.exception;

import com.guige.base.exception.vo.MessageVo;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

/**
 * 用户输入错误的异常
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends BaseException {

    private static final long serialVersionUID = -8998072342743536663L;

    public BadRequestException() {
        super();
    }

    public BadRequestException(String errCode) {
        super(errCode);
    }

    public BadRequestException(Throwable throwable) {
        super(throwable);
    }

    public BadRequestException(String errCode, Throwable throwable) {
        super(errCode, throwable);
    }
    
    public BadRequestException(MessageVo messages) {
    	super();
    	setMessageVo(messages);
    }
    
    public BadRequestException(BindingResult result) {
    	super();
    	if(result.hasErrors()){
            List<ObjectError>  list = result.getAllErrors();
            for(ObjectError error:list){
            	if (error instanceof FieldError) {
            		FieldError ferr = (FieldError) error;
            		setMessage(ferr.getDefaultMessage(), error.getObjectName()+"."+ferr.getField());
            	} else {
            		setMessage(error.getDefaultMessage(), "");
            	}
            }
    	}
    }
    
    /**
     * 
     * @param errCode
     * @param values 占位符信息
     */
    public BadRequestException(String errCode,  Object... values) {
    	super();
   		setMessage(errCode, values);
    }
    
    /**
     * 
     * @param errCode
     * @param field 占位字段名
     */
    public BadRequestException(String errCode, String field) {
    	super();
   		setMessage(errCode, field);
    }
}
