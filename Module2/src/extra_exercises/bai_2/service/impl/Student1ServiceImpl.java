package extra_exercises.bai_2.service.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import extra_exercises.bai_2.model.Student1;
import extra_exercises.bai_2.service.IStudent1Service;


import java.util.Scanner;

public class Student1ServiceImpl implements IStudent1Service {

    private static Student1[] studentList = new Student1[100];
    private static Scanner sc = new Scanner(System.in);
    private static int count = 0;


    @Override
    public void addNewStudent1(Student1 student1) {
        if (count < studentList.length) {
            System.out.println("Input Id: ");
            int id = Integer.parseInt((sc.nextLine()));
            System.out.println("Input fullName: ");
            String fullName = sc.nextLine();
            System.out.println("Input dayOfBirth: ");
            String dayOfBirth = sc.nextLine();
            System.out.println("Input gender: ");
            String gender = sc.nextLine();
            System.out.println("Input nameClass: ");
            String nameClass = sc.nextLine();
            System.out.println("Input course: ");
            String course = sc.nextLine();
            Student1 student11 = new Student1(id, fullName, dayOfBirth, gender, nameClass, course);
            studentList[count] = student1;
            count++;
        } else {
            System.out.println("The list in full, can't be added.");
        }
    }


    @Override
    public Student1[] findAll() {
        return studentList;
    }

}
