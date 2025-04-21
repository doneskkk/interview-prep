package service;

import model.Student;
import model.StudentCourse;
import model.TeacherCourse;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {


    public List<Student> getAllStudentsByAvgGreaterThan5(List<Student> students) {
        return students.stream()
                .filter(s -> s.getStudentCourses().stream()
                        .mapToDouble(StudentCourse::getGrade)
                        .average()
                        .orElse(0.0) > 5.0)
                .collect(Collectors.toList());
    }


    public List<String> getPhysicsStudentsNames(List<Student> students) {
        return students.stream()
                .filter(s -> s.getStudentCourses().stream()
                        .map(StudentCourse::getTeacherCourse)
                        .map(TeacherCourse::getCourse)
                        .anyMatch(c -> "Physics".equals(c.getSubjectName()))
                )
                .map(s -> s.getName() + " " + s.getSurname())
                .collect(Collectors.toList());
    }
}
