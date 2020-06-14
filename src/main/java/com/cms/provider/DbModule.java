package com.cms.provider;


import com.cms.database.Database;
import com.cms.database.StudentDB;
import com.cms.database.TeacherDB;
import com.cms.model.Student;
import com.cms.model.Teacher;
import com.cms.stream.Input;
import com.cms.stream.Output;
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

    @Provides @Singleton Student provideStudent(){ return new Student(); }

    @Provides @Singleton TeacherDB provideTeacherDB(){
        return new TeacherDB();
    }

    @Provides @Singleton StudentDB provideStudentDB(){ return new StudentDB(); }

    @Provides @Singleton Database providesDatabase(){
        return new Database();
    }

    @Provides @Singleton ICmsValidator provideIValidator(){ return new CmsValidator(); }

    @Provides @Singleton Input providesInput(){ return new Input(); }

    @Provides @Singleton Output providesOutput(){ return new Output(); }
}
