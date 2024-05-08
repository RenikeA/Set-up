package org.assignment;

public class Teacher extends Staff{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teachCourse(Course course){

        System.out.println(name + " Is currently taking this course : " + course);
    }
}
