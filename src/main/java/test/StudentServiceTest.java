package test;


import model.*;
import org.junit.Test;
import service.StudentService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentServiceTest {

    private final StudentService service = new StudentService();

    @Test
    public void testGetAllStudentsByAvgGreaterThan5() {
        Student s1 = new Student(1, "Ann", "Nova", 1);
        Student s2 = new Student(2, "Boris", "Ivanov",   1);
        Student s3 = new Student(3, "Maria", "Petrova",   1);

        TeacherCourse tc = new TeacherCourse();
        s1.getStudentCourses().add(new StudentCourse(s1, tc, 6.0));
        s1.getStudentCourses().add(new StudentCourse(s1, tc, 4.0));
        s2.getStudentCourses().add(new StudentCourse(s2, tc, 7.0));
        s2.getStudentCourses().add(new StudentCourse(s2, tc, 8.0));

        List<Student> input = Arrays.asList(s1,s2,s3);

        List<Student> res = service.getAllStudentsByAvgGreaterThan5(input);

        assertEquals("There should be only one student with avg > 5.0",1, res.size()  );
        assertTrue("Only Boris Ivanov should be included in the result",res.contains(s2));
    }

    @Test
    public void testGetAllStudentsByAvgGreaterThan5_whenNoneAboveThreshold_returnsEmptyList() {
        Student s1 = new Student(1, "Dmitry", "Orlov", 2);
        TeacherCourse dummyTc = new TeacherCourse();

        s1.getStudentCourses().add(new StudentCourse(s1, dummyTc, 5.0));

        List<Student> result = service.getAllStudentsByAvgGreaterThan5(List.of(s1));

        assertTrue("No student should pass if avg ≤ 5.0",result.isEmpty());
    }

    @Test
    public void testGetPhysicsStudentsNames_returnsPhysicsStudents() {

        Course physics = new Course(1, "Physics", 1);
        Course math    = new Course(2, "Math",    1);

        Teacher dummyTeacher = new Teacher(1, "Ivan", "Petrov");
        TeacherCourse physTc = new TeacherCourse(1, dummyTeacher, physics, 2025);
        TeacherCourse mathTc = new TeacherCourse(2, dummyTeacher, math,    2025);

        Student alice = new Student(1, "Alice", "Ivanova", 1);
        Student bob = new Student(2, "Bob",   "Sidorov",  1);

        StudentCourse scAlicePhys = new StudentCourse(alice, physTc, 7.0);
        StudentCourse scAliceMath = new StudentCourse(alice, mathTc, 6.0);
        StudentCourse scBobMath   = new StudentCourse(bob,   mathTc, 8.0);

        alice.getStudentCourses().addAll(Arrays.asList(scAlicePhys, scAliceMath));
        bob.getStudentCourses().add(scBobMath);

        List<Student> all = Arrays.asList(alice, bob);

        List<String> result = service.getPhysicsStudentsNames(all);

        assertEquals("There should be only one student with the Physics course",1, result.size());
        assertTrue( "The name and surname 'Alice Ivanova' should be present",result.contains("Alice Ivanova"));
    }

}