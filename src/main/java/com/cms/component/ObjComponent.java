package com.cms.component;

import com.cms.database.DbModel;
import com.cms.model.Student;
import com.cms.model.Teacher;
import com.cms.provider.DbModule;
import com.cms.provider.IRepository;
import com.cms.provider.IService;
import com.cms.service.ICmsService;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DbModule.class,
        IRepository.class,
        IService.class
})
public interface ObjComponent {

    ICmsService providesCmsService();
    DbModel provideDbModel();
    Teacher provideTeacher();
    Student provideStudent();

}
