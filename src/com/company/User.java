package com.company;

import java.util.Random;

public class User implements Comparable<User> {

    protected FirstName firstName;
    protected SecondName secondName;
    protected int age;

    private static Random random = new Random();

    public User() {
        this.firstName = FirstName.values()[random.nextInt(FirstName.values().length)];
        this.secondName = SecondName.values()[random.nextInt(SecondName.values().length)];
        this.age = random.nextInt(10) + 18;
    }

    @Override
    public int compareTo(User user) {
        int result = Integer.compare(secondName.value, user.secondName.value);
        if (result == 0) {
            result = Integer.compare(firstName.value, user.firstName.value);
        }
        if (result == 0) {
            result = Integer.compare(age, user.age);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return age == user.age && firstName == user.firstName && secondName == user.secondName;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                secondName +
                " " + firstName +
                ", " + age +
                " years old}\n";
    }
}