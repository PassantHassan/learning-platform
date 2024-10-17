package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CourseService {
    private CourseRecommender courseRecommender;


    public CourseService(CourseRecommender courseRecommender) {
        this.courseRecommender = courseRecommender;
    }

    @Autowired
    @Qualifier("beginnerCourseRecommender")
    public void setCourseRecommender(CourseRecommender courseRecommender) {
        this.courseRecommender = courseRecommender;
    }
}
