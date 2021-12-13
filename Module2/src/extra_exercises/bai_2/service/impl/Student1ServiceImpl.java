package extra_exercises.bai_2.service.impl;


import extra_exercises.bai_2.model.Student1;
import extra_exercises.bai_2.service.IStudent1Service;


import java.util.Scanner;

public class Student1ServiceImpl implements IStudent1Service {

    private static Student1[] studentList = new Student1[5];


static {
    studentList[0] = new Student1(5,"Long", "02/12/1998", "male", "C1021G1", "C10");
    studentList[1] = new Student1(3, "Trọng", "14/05/1995", "male", "C1021G1", "C10");
    studentList[2] = new Student1(1, "Tuân", "09/12/2001", "male", "C1021G1", "C10");
    studentList[3] = new Student1(2, "Ngọc", "07/08/1997", "female", "C10G121", "C10");
    studentList[4] = new Student1(4, "Khoa" , "11/12/2003", "male", "C10G121", "C10");
}


    @Override
    public void addNewStudent1(Student1 student1) {
        Student1[] newStudentList = new Student1[studentList.length + 1];
        newStudentList[newStudentList.length - 1] = student1;
        for (int index = 0; index < studentList.length; index++) {
            newStudentList[index] = studentList[index];
        }
        studentList = newStudentList;

    }

    @Override
    public Student1[] findAll() {
         return studentList;

    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].getId() == id) {
                studentList[i] = null;
            }
        }
    }

    @Override
    public void revomeIndex(int index) {
        studentList[index - 1] = null;
    }


    @Override
    public void search(String mssv) {
        for (int i = 0; i < studentList.length; i++) {
            if (isNumeric(mssv)) {
                if(studentList[i].getId() == (Integer.parseInt(mssv))){
                    System.out.println(studentList[i]);
                }
            }else{
                if(studentList[i].getFullName().equals(mssv)) {
                    System.out.println(studentList[i]);
                }
            }
        }
    }

    public static boolean isNumeric(CharSequence chars) {
        if (chars.equals(null)) {
            return false;
        }
        for (int i = 0; i < chars.length(); i++) {
            if (!Character.isDigit(chars.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}






