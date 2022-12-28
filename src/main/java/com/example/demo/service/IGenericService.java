package com.example.demo.service;

import java.util.List;

public interface IGenericService<T,D> {

    List<T> getALl();

    void upsert(T t);

    void upsertBulk(List<T> ts);

    void delete (D d);

    T getById(Long id);
}
