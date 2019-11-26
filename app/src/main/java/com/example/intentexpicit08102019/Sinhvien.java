package com.example.intentexpicit08102019;

import java.io.Serializable;

public class Sinhvien implements Serializable {
    public String name;
    public String age;

    public Sinhvien(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
