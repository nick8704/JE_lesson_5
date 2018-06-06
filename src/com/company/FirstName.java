package com.company;

public enum FirstName {
    OLEG(0),
    MIHAIL(1),
    ALEXANDR(2),
    IGOR(3),
    ALEXEY(4),
    MAKSIM(5);

    int value;

    FirstName(int value) {
        this.value = value;
    }
}