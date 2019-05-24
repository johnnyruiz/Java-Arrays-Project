package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void Continue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to continue?");
        String userconfirm = scan.nextLine();
        while (!(userconfirm.contains("y") || userconfirm.contains("n"))){
            System.out.println("Would you like to continue?");
            userconfirm = scan.nextLine();
        }
        if (userconfirm.contains("y")){
            System.out.println("You will Continue");
        }else{
            System.out.println("Exiting...");
            System.exit(0);
        }

    }


    public static boolean contains(String input,ArrayList array){
        for (int i = 0; i < array.size();i++) {
            if (array.get(i).toString().equals(input)){
                return true;
            }
        }
            return false;
    }

    public static void main(String[] args) {

        System.out.println("  _______ .______          ___       _______   _______     _______.\n" +
                " /  _____||   _  \\        /   \\     |       \\ |   ____|   /       |\n" +
                "|  |  __  |  |_)  |      /  ^  \\    |  .--.  ||  |__     |   (----`\n" +
                "|  | |_ | |      /      /  /_\\  \\   |  |  |  ||   __|     \\   \\    \n" +
                "|  |__| | |  |\\  \\----./  _____  \\  |  '--'  ||  |____.----)   |   \n" +
                " \\______| | _| `._____/__/     \\__\\ |_______/ |_______|_______/    \n" +
                "                                                                   ");
        System.out.println("     ___      .______   .______   \n" +
                "    /   \\     |   _  \\  |   _  \\  \n" +
                "   /  ^  \\    |  |_)  | |  |_)  | \n" +
                "  /  /_\\  \\   |   ___/  |   ___/  \n" +
                " /  _____  \\  |  |      |  |      \n" +
                "/__/     \\__\\ | _|      | _|      \n" +
                "                                ");
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


        String userconfirm = "";

        while (userconfirm.equals("")) {
            System.out.println("Which student's Grades would you like to view?");
            String userResponse = "";
            students.forEach((key, value) -> users.add(key));

//        for (int i = 0; i < users.size();i++) {
//            System.out.println(users.get(i));
//        }

            students.forEach((key, value) -> System.out.print(" [" + key + "] "));
            System.out.print("\nEnter a name: ");
            userResponse = scan.nextLine();
            while (!contains(userResponse, users)) {
                System.out.println(userResponse + " Is not a UserName\nPlease enter in students UserName");
                students.forEach((key, value) -> System.out.print(" [" + key + "] "));
                System.out.println("\nEnter a name: ");
                userResponse = scan.nextLine();
            }

            System.out.println(userResponse + "'s grade average is: " + students.get(userResponse).getGradeAverage() + " %");

            Continue();
        }












    }
}
