package com.guige.base.exception;

import com.guige.base.exception.vo.MessageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局捕获
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Value("${spring.application.name:}")
    private String systemName;

    @ExceptionHandler(BadRequestException.class)
    @ResponseBody
    public ResponseEntity<MessageVo> handleBadRequestException(HttpServletRequest request, HttpServletResponse response, BadRequestException ex) {
        log.error(ex.getMessage(), ex);
        return new ResponseEntity<>(ex.getMessageList(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public ResponseEntity<MessageVo> handleBusinessException(HttpServletRequest request, HttpServletResponse response, BusinessException ex) {

       Throwable orgEx = ex.getOriginalException();
       if(orgEx!=null ){
           log.error(orgEx.getMessage(), orgEx);
       }
        log.error(ex.getMessage(), ex);
        if(ex.getMessageList() == null){
            BusinessException ne = new BusinessException(BaseException.ERR_9999);
            return new ResponseEntity<>(ne.getMessageList(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        else
            return new ResponseEntity<>(ex.getMessageList(), HttpStatus.INTERNAL_SERVER_ERROR);

//        if (orgEx != null)
//            log.error(orgEx.getMessage(), orgEx);
//        else
//            log.error(ex.getMessage(), ex);
//
//        return ResponseEntity.status(499).body(ex.getMessageList());


    }

    @ExceptionHandler(UnauthorizedException.class)
    @ResponseBody
    public ResponseEntity<MessageVo> handleUnauthorizedException(HttpServletRequest request, HttpServletResponse response, UnauthorizedException ex) {

        Throwable orgEx = ex.getOriginalException();
        if(orgEx!=null ){
            log.error(orgEx.getMessage(), orgEx);
        }
        log.error(ex.getMessage(), ex);
        return new ResponseEntity<>(ex.getMessageList(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    public ResponseEntity<MessageVo> handleNotFoundException(HttpServletRequest request, HttpServletResponse response, NotFoundException ex) {

        Throwable orgEx = ex.getOriginalException();
        if(orgEx!=null ){
            log.warn(orgEx.getMessage(), orgEx);
        }
        log.warn(ex.getMessage(), ex);
        if(ex.getMessageList() == null){
            NotFoundException ne = new NotFoundException(BaseException.ERR_9996);
            return new ResponseEntity<>(ne.getMessageList(), HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(ex.getMessageList(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ForbiddenException.class)
    @ResponseBody
    public ResponseEntity<MessageVo> handleForbiddenException(HttpServletRequest request, HttpServletResponse response, ForbiddenException ex) {

        Throwable orgEx = ex.getOriginalException();
        if(orgEx!=null ){
            log.error(orgEx.getMessage(), orgEx);
        }
        log.error(ex.getMessage(), ex);
        return new ResponseEntity<>(ex.getMessageList(), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(MovedPermanentlyException.class)
    @ResponseBody
    public ResponseEntity<MessageVo> handleMovedPermanentlyException(HttpServletRequest request, HttpServletResponse response, MovedPermanentlyException ex) {
        return new ResponseEntity<>(ex.getMessageList(), HttpStatus.MOVED_PERMANENTLY);
    }



    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        BindingResult result = ex.getBindingResult();
        BadRequestException brex = new BadRequestException(result);
        log.warn(ex.getMessage(), ex);
        return handleExceptionInternal(ex, brex.getMessageList(), headers, status, request);
    }
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)) {
            request.setAttribute(WebUtils.ERROR_EXCEPTION_ATTRIBUTE, ex, WebRequest.SCOPE_REQUEST);
        }

        log.error(ex.getMessage(), ex);
        if(body instanceof MessageVo) {
            MessageVo messages = (MessageVo) body;
            return new ResponseEntity<>(messages, headers, status);
        }
        else {
            MessageVo messages = new MessageVo();
            messages.addMessageObj(BaseException.ERR_9999, ex.getMessage(), "");
            return new ResponseEntity<>(messages, headers, status);
        }

    }
    //401 未授权
//    @ExceptionHandler(AuthorizationException.class)
//    @ResponseBody
//    public ResponseEntity<MessageVo> handleAuthorizationException(HttpServletRequest request, HttpServletResponse response, AuthorizationException ex) {
//        log.error(ex.getMessage(), ex);
//        UnauthorizedException uae = new UnauthorizedException(BaseException.ERR_9997, this);
//        return new ResponseEntity<>(uae.getMessageList(), HttpStatus.UNAUTHORIZED);
//    }
    //全局异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<MessageVo> handleException(HttpServletRequest request, HttpServletResponse response, Exception ex) {
        log.error(ex.getMessage(), ex);
        MessageVo messages = new MessageVo();
        messages.addMessageObj(BaseException.ERR_9999, ex.getMessage(), "");
        return new ResponseEntity<>(messages, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
