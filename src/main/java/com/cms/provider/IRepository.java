package com.cms.provider;

import com.cms.repository.CmsRepository;
import com.cms.repository.ICmsRepository;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class IRepository {

    @Binds
    abstract ICmsRepository provideRepository(CmsRepository cmsRepository);
}
