package com.cms.provider;

import com.cms.service.CmsService;
import com.cms.service.ICmsService;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class IService {

    @Binds
    abstract ICmsService provideService(CmsService cmsService);

}
