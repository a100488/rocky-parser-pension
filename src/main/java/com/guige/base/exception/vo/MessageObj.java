package com.guige.base.exception.vo;

import lombok.Data;
/**
 * 功能：错误消息对象
 * 备注：
 */
@Data
public class MessageObj {
    public static final String MESSAGE_INFO="info";
    public static final String  MESSAGE_WARN="warn";
    public static final String MESSAGE_ERROR="error";
    public static final String MESSAGE_FATAL="fatal";



    private String msg_id;//消息的编号(在properties中定义的ID)
    private String field;//消息对应的界面字段名
    private String message;//消息内容(多国语言的消息文字)
    private String type;//错误等级
    public MessageObj() {
    }

    public MessageObj(String message_id, String message) {
        this.msg_id = message_id;
        this.message = message;
    }

    public MessageObj(String message_id,  String message,String message_obj) {
        this.type=MESSAGE_ERROR;
        this.msg_id = message_id;
        this.field = message_obj;
        this.message = message;
    }
    public MessageObj(String type,String message_id, String message,String message_obj) {
        this.msg_id = message_id;
        this.field = message_obj;
        this.message = message;
        this.type=type;
    }

}
