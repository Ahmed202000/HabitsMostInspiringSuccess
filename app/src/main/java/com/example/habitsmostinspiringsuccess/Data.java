package com.example.habitsmostinspiringsuccess;


public class Data {
    String subject1;
    private Integer part1,text1;

    public Data(String tt1, Integer tt2, Integer tt3) {
        this.subject1 = tt1;
        this.part1 = tt2;
        this.text1 = tt3;
    }


    public String getSubject1() {
        return this.subject1;
    }

    public Integer getPart1() {
        return this.part1;
    }

    public Integer getText1() {
        return this.text1;
    }
}