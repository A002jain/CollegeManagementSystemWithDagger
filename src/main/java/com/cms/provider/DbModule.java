package com.cms.provider;


import com.cms.database.Database;
import com.cms.database.DbModel;
import com.cms.model.Hod;
import com.cms.model.Student;
import com.cms.model.Teacher;
import com.cms.validator.CmsValidator;
import com.cms.validator.ICmsValidator;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DbModule {

    @Provides @Singleton Teacher provideTeacher(){
        return new Teacher();
    }

    @Provides @Singleton Student provideStudent(){
        return new Student();
    }

    @Provides @Singleton Hod provideHod(){
        return new Hod();
    }

    @Provides @Singleton Database providesDatabase(){
        return new Database();
    }

    @Provides @Singleton DbModel providesDbModel(){
        return new DbModel();
    }

    @Provides @Singleton ICmsValidator provideIValidator(){
        return new CmsValidator();
    }

}
