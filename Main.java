package com.company;

public class Main {
    public static void main(String[] args) {
    Person man=new Person();
    Person woman=new Person(15,"Маша","5 метров");
    man.setFullName("Юра");
    man.setAge(21);
    man.setWalk("2 метра");
    man.talk();
    man.walk();
        System.out.println();
    woman.talk();
    woman.walk();
        System.out.println();
        man.talkIt("Маша");
        woman.talkIt("Юра");

    }
}
