package org.assignment;

public class Principal extends Staff{
    public Principal() {
    }

    public Principal(String name, int age) {
        super(name, age);
    }


    public void admitApplicant (Applicant applicant){ //don't know why the age is not called even when i called it getage()
        if ( applicant.getAge() >=18){
            System.out.println("Admission granted!"); // what if I want to use my return as " result" not sout
        }else {
            System.out.println(" Not admitted!");
        }
    }

    public void expelStudent(Student student){
        System.out.println(student.getName() + " has been expelled ");

    }

   // public void admitApplicant(Applicant applicant) {
   // }
}
