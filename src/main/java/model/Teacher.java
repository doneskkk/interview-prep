package model;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private long id;
    private String name;
    private String surname;

    private List<TeacherCourse> teacherCourses = new ArrayList<>();

    public Teacher() {}

    public Teacher(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public List<TeacherCourse> getTeacherCourses() { return teacherCourses; }
    public void setTeacherCourses(List<TeacherCourse> teacherCourses) {
        this.teacherCourses = teacherCourses;
    }
}
