package com.company;

public class Person {
  private  int age;
  private String fullName;
  private String walk;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public String getFullName() {
        return fullName;
    }

    public String getWalk() {
        return walk;
    }

    public Person(int age, String fullName, String walk) {
        this.age = age;
        this.fullName = fullName;
        this.walk = walk;
    }
    public Person(){

    }
    public void talk(){

        System.out.println("Привет я " +getFullName());//this.fullName
    }

    public void walk(){
        System.out.println("Пройденное растояние: " +getWalk());//this.walk
    }

}

