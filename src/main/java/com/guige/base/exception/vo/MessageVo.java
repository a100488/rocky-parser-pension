package com.guige.base.exception.vo;

import com.googlecode.gentyref.GenericTypeReflector;
import com.guige.base.util.MessageUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 功能：
 * 备注：
 */
@Slf4j
public class MessageVo<T> {

    private List<MessageObj> reasons;
    private List<T> data;
    public MessageVo addMessageVo(MessageVo messageVo){

        getReasons().addAll(messageVo.getReasons());
        return this;
    }
    public MessageVo addDataMessageVo(MessageVo messageVo){
        if(CollectionUtils.isNotEmpty(messageVo.getData())){
            try {
                Type type = GenericTypeReflector.getTypeParameter(data.getClass(), Collection.class.getTypeParameters()[0]);
                Type type2 = GenericTypeReflector.getTypeParameter(messageVo.getData().getClass(), Collection.class.getTypeParameters()[0]);
                if (type == type2) {
                    getData().addAll(messageVo.getData());
                }

            }catch (Exception e){

            }
        }
        getReasons().addAll(messageVo.getReasons());
        return this;
    }
    public MessageVo replaceDataAddMessageVo(MessageVo messageVo){
        if(CollectionUtils.isNotEmpty(messageVo.getData())){
            try {

                Type type = GenericTypeReflector.getTypeParameter(getData().getClass(), Collection.class.getTypeParameters()[0]);

                Type type2 = GenericTypeReflector.getTypeParameter(messageVo.getData().getClass(), Collection.class.getTypeParameters()[0]);
                if (type==null||type == type2) {
                    getData().clear();
                    getData().addAll(messageVo.getData());
                }

            }catch (Exception e){
                log.error(e.getMessage(),e);
            }
        }
        getReasons().addAll(messageVo.getReasons());
        return this;
    }
    public MessageVo addMessageObj(String message_id, String message,String message_obj){
        MessageObj messageObj = new MessageObj(message_id,message,message_obj);
        getReasons().add(messageObj);
        return this;
    }

    /**
     *  信息
     * @param errCode
     * @param values
     * @return
     */
    public MessageVo addInfoMessageObj(String errCode, Object... values) {
        MessageObj messageObj = new MessageObj(MessageObj.MESSAGE_INFO,errCode,MessageUtil.getMessage(errCode, values),null);
        getReasons().add(messageObj);
        return this;
    }

    /**
     * 警告
     * @param errCode
     * @param values
     * @return
     */
    public MessageVo addWarnMessageObj(String errCode, Object... values) {
        MessageObj messageObj = new MessageObj(MessageObj.MESSAGE_WARN,errCode,MessageUtil.getMessage(errCode, values),null);
        getReasons().add(messageObj);
        return this;
    }

    /**
     * 错误
     * @param errCode
     * @param values
     * @return
     */
    public MessageVo addErrorMessageObj(String errCode, Object... values) {
        MessageObj messageObj = new MessageObj(MessageObj.MESSAGE_ERROR,errCode,MessageUtil.getMessage(errCode, values),null);
        getReasons().add(messageObj);
        return this;
    }

    /**
     * 严重错误
     * @param errCode
     * @param values
     * @return
     */
    public MessageVo addFatalMessageObj(String errCode, Object... values) {
        MessageObj messageObj = new MessageObj(MessageObj.MESSAGE_FATAL,errCode,MessageUtil.getMessage(errCode, values),null);
        getReasons().add(messageObj);
        return this;
    }
    public void setMessage(String messageCode,String type, Object... values) {

    }
    public List<MessageObj> getReasons() {
        if(null == reasons){
            reasons = new ArrayList<MessageObj>();
        }
        return reasons;
    }
    public List<T> getData() {
        if(null == data){
            data = new ArrayList<>();
        }
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void setReasons(List<MessageObj> reasons) {
        this.reasons = reasons;
    }
}
