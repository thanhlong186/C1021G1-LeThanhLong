package extra_exercises.bai_2.controller;

import extra_exercises.bai_2.model.Student1;
import extra_exercises.bai_2.service.IStudent1Service;
import extra_exercises.bai_2.service.impl.Student1ServiceImpl;

import java.util.Scanner;

public class Student1Controller {

    public static void main(String[] args) {
        IStudent1Service iStudent1Service = new Student1ServiceImpl();
        Scanner sc = new Scanner(System.in);
        Student1[] student1s = null;

        System.out.println("1. Add new 1 student");
        System.out.println("2. List all student");
        System.out.println("3. Exit");
    }
}
