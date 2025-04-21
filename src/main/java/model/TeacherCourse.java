package model;

import java.util.ArrayList;
import java.util.List;

public class TeacherCourse {
    private long id;
    private Teacher teacher;
    private Course course;
    private int year;

    private List<StudentCourse> studentCourses = new ArrayList<>();
    private List<Schedule> schedules = new ArrayList<>();

    public TeacherCourse() {}

    public TeacherCourse(long id, Teacher teacher, Course course, int year) {
        this.id = id;
        this.teacher = teacher;
        this.course = course;
        this.year = year;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public Teacher getTeacher() { return teacher; }
    public void setTeacher(Teacher teacher) { this.teacher = teacher; }
    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public List<StudentCourse> getStudentCourses() { return studentCourses; }
    public void setStudentCourses(List<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }
    public List<Schedule> getSchedules() { return schedules; }
    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }
}
