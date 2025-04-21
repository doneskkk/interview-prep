package model;

public class StudentCourse {
    private Student student;
    private TeacherCourse teacherCourse;
    private double grade;

    public StudentCourse() {}

    public StudentCourse(Student student, TeacherCourse teacherCourse, double grade) {
        this.student = student;
        this.teacherCourse = teacherCourse;
        this.grade = grade;
    }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
    public TeacherCourse getTeacherCourse() { return teacherCourse; }
    public void setTeacherCourse(TeacherCourse teacherCourse) {
        this.teacherCourse = teacherCourse;
    }
    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }
}
