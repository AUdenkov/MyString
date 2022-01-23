package com.company;

public class Main {

    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("Ass");
        myStringBuilder.append("er");
        myStringBuilder.append("er");
        System.out.println(myStringBuilder);
        myStringBuilder.undo();
        myStringBuilder.undo();
        System.out.println(myStringBuilder);

    }
}
