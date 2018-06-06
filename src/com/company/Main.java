package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        int size = 100;
        while (users.size() < size) {
            User user = new User();
            if (!users.contains(user)) {
                users.add(user);
            }
        }
        System.out.println(users);
        Collections.sort(users);
        printSpaces();
        System.out.println(users);
        printSpaces();

        List<Student> students = new ArrayList<>();
        while (students.size() < size) {
            Student student = new Student();
            if (!students.contains(student)) {
                students.add(student);
            }
        }
        System.out.println(students);
        Collections.sort(students);
        printSpaces();
        System.out.println(students);
    }

    private static void printSpaces() {
        System.out.println();
        System.out.println("=================================================");
        System.out.println();
    }
}