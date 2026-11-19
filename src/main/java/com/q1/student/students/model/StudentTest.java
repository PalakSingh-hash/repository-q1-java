
package com.q1.student.students.model;

import java.util.Arrays;

public class StudentTest {

    public static void main(String[] args) {

        Student s1 = new Student(
            101,
            "Palak",
            "palak@gmail.com",
            "BTech IT",
            85,
            90,
            Arrays.asList("Java", "C++", "SQL")
        );

        s1.addSkill("Spring Boot");

        System.out.println(s1);
    }
}
