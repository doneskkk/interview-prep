package model;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private String surname;
    private int semester;

    private List<StudentCourse> studentCourses = new ArrayList<>();

    public Student() {}

    public Student(long id, String name, String surname, int semester) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.semester = semester;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }
    public List<StudentCourse> getStudentCourses() { return studentCourses; }
    public void setStudentCourses(List<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }
}
