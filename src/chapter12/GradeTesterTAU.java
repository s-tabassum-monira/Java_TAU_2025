package chapter12;

import java.util.Map;

public class GradeTesterTAU {
    public static void main(String[] args) {
        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String,Integer> test2 = TestResults.getMakeUpGrades();

        for(var entry : test2.entrySet()){
            String student = entry.getKey();
            Integer firstGrade = gradeBook.get(student);
            Integer secondGrade = entry.getValue();

            if(secondGrade>firstGrade) gradeBook.put(student,secondGrade);
            else gradeBook.put(student, firstGrade);
        }
        System.out.println("Final Grade: ");
        gradeBook.forEach((k,v) -> System.out.println("Student Name: " + k + ", Grade Obtained: " + v));
    }

//    public static void main(String[] args) {
//        Map<String,Integer> originalGradeMap = TestResults.getOriginalGrades();
//        Map<String, Integer> makeupGradeMap = TestResults.getMakeUpGrades();
//        for(var students : makeupGradeMap.entrySet()){
//            Integer firstGrade = originalGradeMap.get(students.getKey());
//            Integer secondGrade = makeupGradeMap.get(students.getKey());
//            if(secondGrade > firstGrade) originalGradeMap.put(students.getKey(), secondGrade);
//        }f
//        System.out.println("Final Grade");
//        originalGradeMap.forEach((k,v) -> System.out.println("Student: " + k + " " + "Grade: " + v));
//
//    }

}
