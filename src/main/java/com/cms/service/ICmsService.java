package com.cms.service;

import com.cms.database.DbModel;
import com.cms.exception.CmsException;

public interface ICmsService {

    DbModel create() throws CmsException;
    DbModel update(DbModel entity);
    void read(String key);
    void delete(String key);
    void listN();

}
