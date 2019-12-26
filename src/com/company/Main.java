package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Set<Student> studentSet = new HashSet<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\", " +
                    "для выхода введите \"end\"");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            parseStudent(input);
        }

        addStudents();

        printSetStudents();
    }

    private static void printSetStudents() {
        System.out.println("Список студентов:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }

    private static void parseStudent(String str) {
        String[] inputArray = str.split(",");
        if (inputArray.length != 3) {
            System.out.println("Введите данные о студенте в формате: \"ФИО, номер группы, номер студенческого " +
                    "билета\"!");
            return;
        }

        String name = inputArray[0].trim();
        String group = inputArray[1].trim();
        String studentId = inputArray[2].trim();

        Student curStudent = new Student(name, group, studentId);

        checkAdd(curStudent);

    }

    private static void addStudents() {
        Student[] studentsArray = new Student[]{
                new Student("Иванов Петр Николаевич", "1243-Б", "1"),
                new Student("Петрова Татьяна Михайловна", "1243-Б", "2"),
                new Student("Петрова Татьяна Михайловна", "1243-Б", "2"),
                new Student("Петрова Татьяна Михайловна", "1243-Б", "3")
        };

        for (Student student : studentsArray) {
            checkAdd(student);
        }
    }

    private static void checkAdd(Student student) {
        boolean isAdded = studentSet.add(student);
        if (isAdded) {
            System.out.println("Студент успешно добавлен в список");
        } else {
            if (studentSet.contains(student)) {
                System.out.println("Студент уже есть в списке!");
            } else {
                System.out.println("Что-то пошло не так!");
            }
        }
    }
}