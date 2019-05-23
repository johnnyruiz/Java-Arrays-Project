package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

public static String listusernames(HashMap Hm){

    Scanner scan = new Scanner(System.in);
    System.out.println("Which student's Grades would you like to view?");
    Hm.forEach((key,value) -> System.out.print(" ["+key+"] "));
    System.out.print("\n");

    String userResponse = scan.nextLine();

    Hm.forEach((key,value) -> {
        if (userResponse.equals(key)){
            System.out.println(value.);
            return userResponse;
        }else{

            listusernames(Hm);
            return userResponse;
        }

    });
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
//        students.forEach((key,value) -> System.out.println("Username :"+key));


        System.out.println("Hello User");
        listusernames(students);
        students.forEach((key,value) -> {
            if (userResponse.equals(key)){
                System.out.println(value.);
            }else{
                listusernames(students);
            }

        });










    }
}
