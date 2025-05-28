package chapter12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GradeTester {
//    public static void main(String[] args) {
//
//        Map<String,Integer> map1 = TestResults.getOriginalGrades();
////        for(Map.Entry<String, Integer> entry: map1.entrySet()){
////            System.out.println(entry.getKey() + " " + entry.getValue());
////        }
//
//        Map<String,Integer> map2 = TestResults.getMakeUpGrades();
////        for(Map.Entry<String,Integer> entry2 : map2.entrySet()){
////            System.out.println(entry2.getKey() + " " +entry2.getValue());
////        }
//
//        for(Map.Entry<String,Integer> entry3 : map1.entrySet()){
//            String id = entry3.getKey();
//            int val = entry3.getValue();
//            int val2 = map2.get(id);
//            if(val>val2) System.out.println(id + " " + map1.get(id));
//            else System.out.println(id+ " " + map2.get(id));
//        }

    public static void main(String[] args) {
        Map<String, Integer> map1 = TestResults.getOriginalGrades();
        Map<String, Integer> map2 = TestResults.getMakeUpGrades();
        System.out.println("Final Grade: ");

        for (Map.Entry<String, Integer> entry3 : map1.entrySet()) {
            String id = entry3.getKey();
            int test1 = entry3.getValue();
            int test2 = map2.get(id);
            if (test1 > test2) System.out.println("Student: " + id + " " + "Grade: " + map1.get(id));
            else System.out.println("Students: " + id +" "+ "Grade: " + map2.get(id));

        }
    }


}

//    public static Map finalGrade(){
//        Map finalGrade;
//
//        System.out.println(TestResults.getOriginalGrades());
//        System.out.println(TestResults.getMakeUpGrades());
//
//        return finalGrade;
//
//    }

