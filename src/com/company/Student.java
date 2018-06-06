package com.company;

import java.util.Random;

public class Student extends User{

    private enum Group {
        JAVA(0),
        CPP(1),
        PYTON(2),
        QA(3),
        DESIGN(4),
        FRONTEND(5);

        int value;

        Group(int value){
            this.value = value;
        }


    }
    private Group group;
    private static Random random = new Random();

    public Student() {
        new User();
        this.group = Group.values()[random.nextInt(Group.values().length)];
    }

    @Override
    public int compareTo(User user) {
        int result = 0;
        if(user instanceof Student) {
            result = Integer.compare(group.value, ((Student) user).group.value);
            if(result == 0) {
                result = super.compareTo(user);
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return group == student.group;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group = " + group +
                ", " + secondName +
                " " + firstName +
                ", " + age +
                " years old}\n";
    }
}