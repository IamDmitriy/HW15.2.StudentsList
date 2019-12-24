package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        //TODO ввод с клавиатуры

        Student[] studentsArray = new Student[] {
                new Student("Иванов Петр Николаевич", "1243-Б", "31231343"),
                new Student("Петрова Татьяна Михайловна", "1243-Б", "43221343"),
                new Student("Петрова Татьяна Михайловна", "1243-Б", "123"),
                new Student("Петрова Татьяна Михайловна", "1243-Б", "123")
        };

        for (int i = 0; i < studentsArray.length; i++) {
            boolean isAdded = studentSet.add(studentsArray[i]);
            System.out.println(isAdded);
        }

        System.out.println(studentSet.toString());


    }
}
