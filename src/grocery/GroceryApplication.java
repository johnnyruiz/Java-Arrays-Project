package grocery;

import java.util.Scanner;

public class GroceryApplication {
    public static String userItem(String str){
        String Item;
        Scanner scan = new Scanner(System.in);
        if(str.equalsIgnoreCase("yes")){
            System.out.println("enter a new item : ");
            Item = scan.nextLine();
            return Item;
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
