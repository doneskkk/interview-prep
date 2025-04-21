package model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private long id;
    private String subjectName;
    private int semester;

    private List<TeacherCourse> teacherCourses = new ArrayList<>();

    public Course() {}

    public Course(long id, String subjectName, int semester) {
        this.id = id;
        this.subjectName = subjectName;
        this.semester = semester;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getSubjectName() { return subjectName; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }
    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }
    public List<TeacherCourse> getTeacherCourses() { return teacherCourses; }
    public void setTeacherCourses(List<TeacherCourse> teacherCourses) {
        this.teacherCourses = teacherCourses;
    }
}
