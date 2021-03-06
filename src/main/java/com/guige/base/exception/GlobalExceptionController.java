package com.guige.base.exception;

import com.guige.base.exception.vo.MessageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 全局异常  其他异常
 */
@Controller
@Slf4j
public class GlobalExceptionController extends AbstractErrorController {
    private final ErrorProperties errorProperties;

    public GlobalExceptionController(){
        this(new DefaultErrorAttributes());
    }
    public GlobalExceptionController(ErrorAttributes errorAttributes) {
        this(errorAttributes, new ErrorProperties());
    }
    public GlobalExceptionController(ErrorAttributes errorAttributes, ErrorProperties errorProperties) {
        super(errorAttributes);
        Assert.notNull(errorProperties, "ErrorProperties must not be null");
        this.errorProperties = errorProperties;
    }

    private static final String PATH = "/error";

    @Override
    public String getErrorPath() {
        return PATH;
    }

    @RequestMapping("${server.error.path:${error.path:/error}}")
    @ResponseBody
    public ResponseEntity error(HttpServletRequest request) {
        Map<String, Object> body = getErrorAttributes(request, isIncludeStackTrace(request, MediaType.ALL));
        HttpStatus status = getStatus(request);
        log.error("url:{},error:{},message:{}", body.get("path"), body.get("error"), body.get("message"));
//        log.error("http code={}; Reason={}",status.value(), status.getReasonPhrase());
        if(status == HttpStatus.NOT_FOUND) {
            NotFoundException ne = new NotFoundException(BaseException.ERR_9996);
            return new ResponseEntity(ne.getMessageList(), status);
        } else {
            MessageVo msg = new MessageVo();
            msg.addMessageObj(BaseException.ERR_9999, (String) body.get("message"), null);
            return new ResponseEntity(msg, status);
//            return new ResponseEntity(body, status);
        }
    }

    protected ErrorProperties getErrorProperties() {
        return this.errorProperties;
    }

    protected boolean isIncludeStackTrace(HttpServletRequest request, MediaType produces) {
        ErrorProperties.IncludeStacktrace include = getErrorProperties().getIncludeStacktrace();
        if (include == ErrorProperties.IncludeStacktrace.ALWAYS) {
            return true;
        }
        if (include == ErrorProperties.IncludeStacktrace.ON_TRACE_PARAM) {
            return getTraceParameter(request);
        }
        return false;
    }

    
}
