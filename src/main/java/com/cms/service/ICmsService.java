package com.cms.service;

import com.cms.exception.CmsException;

public interface ICmsService {

    Object create() throws CmsException;
    Object update();
    void read();
    void delete();
    void listN();
    void setFlag(boolean flag);

}
