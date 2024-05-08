package org.assignment.service.impl;

import org.assignment.Course;
import org.assignment.service.CourseService;

public class TeachableServiceImpl implements CourseService {
    @Override
    public void teachCourse(Course course) {
        System.out.println("John is teaching " + course + ".");
    }
}
