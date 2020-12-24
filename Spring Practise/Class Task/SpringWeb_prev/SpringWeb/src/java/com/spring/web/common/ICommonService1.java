package com.spring.web.common;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;


public interface ICommonService1<T> {
    public Map<String, Object> save(HttpServletRequest request);
}
