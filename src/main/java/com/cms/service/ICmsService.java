package com.cms.service;

import com.cms.database.DbModel;

public interface ICmsService {

    DbModel create();
    DbModel update(DbModel entity);
    void read(DbModel key);
    void delete(DbModel key);
    void listN(int n);

}
