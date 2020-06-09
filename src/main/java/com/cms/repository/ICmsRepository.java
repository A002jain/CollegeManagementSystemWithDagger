package com.cms.repository;

import com.cms.database.Database;
import com.cms.database.DbModel;

import java.util.ArrayList;

public interface ICmsRepository {

    void create(DbModel entity);
    void update(DbModel entity);
    DbModel read(String key);
    void delete(String key);
    void listN();
    ArrayList<DbModel> listN(int n);
}
