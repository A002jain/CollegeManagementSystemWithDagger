package com.cms.repository;

public interface ICmsRepository {

    void create(Object entity);
    void update(Object entity);
    Object read(String key);
    void delete(String key);
    Object listN();
    Object listN(int n);
    void setFlag(boolean flag);
}
