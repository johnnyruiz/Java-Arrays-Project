package grades;

import java.util.HashMap;

public class GradesApplication {


//    public static void ListStudents(HashMap hashmap){
//        hashmap.get
//
//    }

    System.out.println(students.keySet().toString());

    public static void main(String[] args) {
        HashMap<String ,Student> students = new HashMap<>();
        Student bob = new Student("Bob");
        Student synthia = new Student("Synthia");
        Student cloey = new Student("Cloey");
        Student ted = new Student("Ted");
        students.put("bbBob",bob);
        students.put("SynthGurl",synthia);
        students.put("Kloee23",cloey);
        students.put("SadT3d002",ted);
        bob.addGrade(67,34,78,84,97);
        synthia.addGrade(63,23,98,87,56);
        cloey.addGrade(85,47,100,74,94);
        ted.addGrade(85,84,96,63,100);


        System.out.println("Hello User");
        System.out.println("Which student's Grades would you like to view?");












    }
}
