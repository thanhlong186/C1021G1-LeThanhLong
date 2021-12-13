package extra_exercises.bai_2.controller;

import extra_exercises.bai_2.model.Student1;
import extra_exercises.bai_2.service.IStudent1Service;
import extra_exercises.bai_2.service.impl.Student1ServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Student1Controller {

    public static void main(String[] args) {
        IStudent1Service iStudent1Service = new Student1ServiceImpl();
        Scanner sc = new Scanner(System.in);
        Student1[] studentList = null;

        int select = 0;
        do {
            System.out.println("1. Print student List: ");
            System.out.println("2. Add new 1 student: ");
            System.out.println("3. Remove: ");
            System.out.println("4. Remove index: ");
            System.out.println("5. Search: ");
            System.out.println("6. Sort: ");
            System.out.println("0. Exit");

            select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1:
                    studentList = iStudent1Service.findAll();
                    for (Student1 student1 : studentList) {
                        if (student1 == null) {
                            continue;
                        }
                        System.out.println(student1);
                    }
                    break;
                case 2:
                    System.out.print("Input Id: ");
                    int id = Integer.parseInt((sc.nextLine()));
                    System.out.print("Input fullName: ");
                    String fullName = sc.nextLine();
                    System.out.print("Input dayOfBirth: ");
                    String dayOfBirth = sc.nextLine();
                    System.out.print("Input gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Input nameClass: ");
                    String nameClass = sc.nextLine();
                    System.out.print("Input course: ");
                    String course = sc.nextLine();
                    Student1 studentNew = new Student1(id, fullName, dayOfBirth, gender, nameClass, course);
                    iStudent1Service.addNewStudent1(studentNew);
                    break;
                case 3:
                    System.out.print("Input id: ");
                    int idRemove = Integer.parseInt(sc.nextLine());
                    iStudent1Service.remove(idRemove);
                    break;
                case 4:
                    System.out.print("Input index: ");
                    int index = Integer.parseInt(sc.nextLine());
                    iStudent1Service.revomeIndex(index);
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("Input searchName: ");
                    String searchName = sc.nextLine();
                    iStudent1Service.search(searchName);
                    break;
                case 6:
                    Arrays.sort(iStudent1Service.findAll());
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("input err!");


            }

        }
        while (select != 0);
    }
}
