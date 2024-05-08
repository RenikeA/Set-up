package org.assignment;

public class SchoolSystem {
    public static void main(String[] args) {
        Principal principal =new Principal("Mr sanwo",55);

        Teacher teacher = new Teacher("Darasimi",23);

        Student  student1 = new Student("Joel", 18);
        Student  student2 = new Student("kiki", 12);
        Student  student3 = new Student("zeki", 12);
        Student  student4 = new Student("bloom", 15);
        Student  student5 = new Student("tiaraoluaw", 8);
        Student  student6 = new Student("racheal", 11);
        Student  student7 = new Student("ayomide", 7);
        Student  student8 = new Student("khadijat", 5);
        Student  student9 = new Student("omolola", 4);
        Student  student10 = new Student("olasunbo", 9);
        Student  student11 = new Student("johnson", 13);

        Applicant applicant1 = new Applicant("favour", 19);
        Applicant applicant2 = new Applicant("IFY", 11);

        NonAcademicStaff cleaner = new NonAcademicStaff("prosper", 23); // create a method for this


        Course course = Course.ART;
        Classes classroom = new Classes("Class1");


        principal.admitApplicant(applicant1);
        principal.admitApplicant(applicant2);
        principal.expelStudent(student1);
        teacher.teachCourse(course);
        //student1.courseTobeTaken(course, classroom );



        // i want to know the number of student doing a course by assigning them the course and classroom and teacher
        // assign cleaner to a class by creating a method
    }
}