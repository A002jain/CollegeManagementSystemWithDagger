package com.cms.component;

import com.cms.database.StudentDB;
import com.cms.database.TeacherDB;
import com.cms.model.Student;
import com.cms.model.Teacher;
import com.cms.provider.DbModule;
import com.cms.provider.IRepository;
import com.cms.provider.IService;
import com.cms.service.ICmsService;
import com.cms.stream.Input;
import com.cms.stream.Output;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DbModule.class,
        IRepository.class,
        IService.class
})
public interface ObjComponent {

    ICmsService providesCmsService();
    Teacher provideTeacher();
    Student provideStudent();
    StudentDB provideStudentDatabase();
    TeacherDB provideTeacherDatabase();
    Input provideInput();
    Output provideOutput();
}
