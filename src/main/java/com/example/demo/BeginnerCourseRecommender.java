package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BeginnerCourseRecommender implements CourseRecommender {
    @Override
    public String recommendCourse(){
        return "Beginner Course Recommender";
    }
}
