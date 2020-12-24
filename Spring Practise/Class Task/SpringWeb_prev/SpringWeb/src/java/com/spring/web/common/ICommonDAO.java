package com.spring.web.common;

import java.util.List;


public interface ICommonDAO<T> {
    public T save(T trainee);
    public List<T> getAll();
    public T update(T trainee);
    public T delete(int id);
    public T getById(int id);
}
