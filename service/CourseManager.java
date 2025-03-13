package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.Course;

public class CourseManager {
    private final String courseTaken = "courseTaken.txt";
    private final String courses = "allCourses.txt";

    public String addCourse(Course course) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(courseTaken, true))) {
            writer.write(courseToCsv(course));
            writer.newLine();
        } catch (IOException e) {
            return "Error adding course: " + e.getMessage();
        }
        return "Course added successfully";
    }

    private String courseToCsv(Course course) {
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append(course.getTitle() != null ? course.getTitle() : "").append(",");
        stringBuilder.append(course.getDescription() != null ? course.getDescription() : "").append(",");
        stringBuilder.append(course.getCourseCode()).append(",");
        stringBuilder.append(course.getCredits()).append(",");
        stringBuilder.append(course.getCRN()).append(",");
        stringBuilder.append(course.getPassingGrade()).append(",");
        stringBuilder.append(course.getPrerequisites() != null ? course.getPrerequisites() : "").append(",");
        stringBuilder.append(course.getStudents() != null ? course.getStudents() : "").append(",");
        stringBuilder.append(course.getTeacher() != null ? course.getTeacher() : "");
        
        return stringBuilder.toString();
    }

    public void readAllCourses() {
        try (BufferedReader reader = new BufferedReader(new FileReader(courses))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            
            System.out.println("Error reading courses: " + e.getMessage());
        }
    }
}
