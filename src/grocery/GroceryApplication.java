package grocery;

import java.util.Scanner;

public class GroceryApplication {
    public static String userItem(String str){
        String confirm;
        Scanner scan = new Scanner(System.in);
        if(str.equalsIgnoreCase("yes")){
            System.out.println("Would you like to enter a new item?(yes/no)");
            confirm = scan.nextLine();
            if(confirm.equalsIgnoreCase("yes")){
                //this is where we put the three prompts
            }
            return confirm;
        } else {
            return "Goodbye";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to make a grocery list?(Yes/No)");
        String userConfirm = scan.nextLine();
        System.out.println(userItem(userConfirm));
    }
}
