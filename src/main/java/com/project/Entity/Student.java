package com.project.Entity;

public class Student {

    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Student(){}

    public int setId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String setName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String setCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }
}
