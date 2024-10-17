package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AdvancedCourseRecommender implements CourseRecommender {
    @Override
    public String recommendCourse() {
        return "Advanced Course Recommender";
    }
}
