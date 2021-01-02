/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.common;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Faculty Pc
 */
public interface ICommonService <T> {
    public T save(HttpServletRequest request);
    public T update(HttpServletRequest request);
    public T delete(int id);
    public List<T> getAll();
    public T getById(int id);
}
