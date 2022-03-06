package com.cms.modules;

import com.cms.repository.CmsRepository;
import com.cms.repository.ICmsRepository;
import com.cms.service.CmsService;
import com.cms.service.ICmsService;
import com.cms.validator.CmsValidator;
import com.cms.validator.ICmsValidator;
import dagger.Binds;
import dagger.Module;

import javax.inject.Singleton;

@Module
public interface ServiceModule {

    @Singleton
    @Binds
    ICmsService provideCmsService(CmsService cmsService);

    @Singleton
    @Binds
    ICmsRepository provideCmsRepository(CmsRepository cmsRepository);

    @Singleton
    @Binds
    ICmsValidator provideCmsValidator(CmsValidator cmsValidator);

}
