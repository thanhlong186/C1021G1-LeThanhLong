package extra_exercises.bai_2.service;

import extra_exercises.bai_2.model.Student1;

public interface IStudent1Service {
    void addNewStudent1(Student1 student1);

    Student1[] findAll();


    void remove(int id);

    void revomeIndex(int index);

    void search(String mssv);
}
