package service;

import entity.Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentService {



    public void inputInfo() {
        System.out.println("Nhập số lượng sinh viên bạn cần sắp xếp: ");
        int stundentNumber;
        while (true) {
            try {
                stundentNumber = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Giá trị bạn vừa nhập không phải là một số nguyên. Vui lòng nhập lại.");
            }
        }
        Student[] students = null;
        for (int i = 0; i < stundentNumber; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1));
            System.out.println("Nhập tên sinh viên: ");
            String studentName = new Scanner(System.in).next();
            System.out.println("Nhập tuổi sinh viên: ");
            int studentAge;
            while (true) {
                try {
                    studentAge = new Scanner(System.in).nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Giá trị bạn vừa nhập không phải là một số nguyên. Vui lòng nhập lại.");
                }
            }
            System.out.println("Nhập GPA của sinh viên: ");
            double studentGPA;
            while (true) {
                try {
                    studentGPA = new Scanner(System.in).nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Giá trị bạn vừa nhập không phải là một số nguyên. Vui lòng nhập lại.");
                }
            }


            students = new Student[100];
            students[i] = new Student(studentName, studentAge, studentGPA);

        }
        System.out.println("Danh sách sinh viên ban đầu:");
        for (Student s : students) {
            System.out.println(s);
        }


    }

    public void sortByNameAndAge(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].fullname.compareTo(students[j + 1].fullname) > 0 ||
                        (students[j].fullname.equals(students[j + 1].fullname) && students[j].age < students[j + 1].age)) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public void sortByAgeAndGPA (Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].age > students[j + 1].age ||
                        (students[j].age == students[j + 1].age && students[j].gpa < students[j + 1].gpa)) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public void sortByLastName(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                String lastName1 = students[j].fullname.substring(students[j].fullname.lastIndexOf(" ") + 1);
                String lastName2 = students[j + 1].fullname.substring(students[j + 1].fullname.lastIndexOf(" ") + 1);
                if (lastName1.compareTo(lastName2) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }



}
