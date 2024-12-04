package com.gmail.box.avpog;

import com.gmail.box.avpog.classes.Students;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        Students student01 = new Students("Andrii", 16, 4);
        Students student02 = new Students("Mykola", 17, 3);
        Students student03 = new Students("Nikita", 20, 5);
        Students student04 = new Students("Aleksandr", 21, 3);
        Students student05 = new Students("Daniil", 15, 4);
        Students student06 = new Students("Yaroslav", 19, 5);

        List<Students> studentsList = new ArrayList<>(Arrays.asList(
                student01,
                student02,
                student03,
                student04,
                student05,
                student06
        ));

        //
        List studentsListLowerThan4 = new ArrayList<>();
        studentsListLowerThan4 = studentsList.stream().filter(student -> student.getGrade() < 4).collect(Collectors.toList());
        //
        List studentsListBest = new ArrayList<>();
        studentsListBest = studentsList.stream().filter(student -> student.getGrade() == 5).collect(Collectors.toList());
        //
        long students20PlusCount = studentsList.stream().filter(student -> student.getAge() > 20).count();
        //
        List studentsListGradeRating = new ArrayList<>();
        studentsListGradeRating = studentsList.stream().sorted((c1, c2) -> Double.compare(c2.getGrade(), c1.getGrade())).collect(Collectors.toList());
        //
        boolean ifAnyStudent5 = studentsList.stream().anyMatch(student -> student.getGrade() == 5);
        //
        studentsList.stream().filter(student -> student.getGrade() > 4).forEach(student -> System.out.println(student.getName()));





    }
}
