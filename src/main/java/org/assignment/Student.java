package org.assignment;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void courseTobeTaken(Course course , Classes classroom){ // not called here too
        System.out.println(name +" is taking " + course.name() + " in "+ classroom.getName()+ ".");
    }


}
