package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static String has(ArrayList array){
        for (int i = 0; i < array.size();i++) {
            return array.get(i).toString();
        }
            return "error";
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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
        ArrayList<String> users = new ArrayList<>();
        System.out.println("Hello User");
        System.out.println("Which student's Grades would you like to view?");
        String userResponse;
        students.forEach((key,value) -> users.add(key));

        for (int i = 0; i < users.size();i++) {
            System.out.println(users.get(i));
        }

        do{
            students.forEach((key, value) -> System.out.print(" [" + key + "] "));
            userResponse = scan.nextLine();
            System.out.println(students.get(userResponse).getGradeAverage());

        }while (!userResponse.equals(has(users)));

        students.get(userResponse).getGradeAverage();
        System.out.println(students.get(userResponse).getGradeAverage());












    }
}
