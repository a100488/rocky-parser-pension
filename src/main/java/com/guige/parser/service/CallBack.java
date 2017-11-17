package com.guige.parser.service;

import java.util.Map;

public interface CallBack<T> {

    String callCellPre(Map<String, String> dataMap, String key, String cellStr);

    void callLinePre(Map<String, String> dataMap);
}