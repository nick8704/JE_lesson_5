package com.company;

public enum SecondName {
    BONDARENKO(0),
    GLUSHENKO(1),
    MIRONOV(2),
    SILANTIEV(3),
    SHEVCHENKO(4),
    IVANOV(5);

    int value;

    SecondName(int value) {
        this.value = value;
    }
}