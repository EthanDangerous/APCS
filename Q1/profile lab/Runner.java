import java.util.Scanner;
import java.io.*;

public class Runner{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        //public String career;
        Profile p1 = new Profile("John", 15, "Math", "Movies", "Ice Cream");
        Profile p2 = new Profile("Jane", 16, "Art", "Drawing", "Cake");
        Profile p3 = new Profile("Jimothy", 14, "Science", "Sports", "Cake");
        Profile p4 = new Profile(" ", 0, " ", " ", " ");
        /*
        Subject: Math, Art, Science
        Hobby: Drawing, Building
        Food: Healthy food, Junk food
        */
        while (running){
            System.out.println("Enter the word go to continue. If you just changed a profile, it will show up after this.");
            scan.next();
            System.out.println("\nFirst profile: ");
            p1.printInfo();
            System.out.println("\nSecond profile: ");
            p2.printInfo();
            System.out.println("\nThird profile: ");
            p3.printInfo();
            System.out.println("\nWould you like to change profile 1, 2, or 3? If you would instead like to determine a career, enter 4. If you would like to exit, enter 0.");
            int choice = scan.nextInt();
            if (choice == 1){
                System.out.println("What is the new name?");
                scan.nextLine();
                String nameIn = scan.nextLine();
                System.out.println("What is the new age?");
                int ageIn = scan.nextInt();
                System.out.println("What is the new favorite subject?");
                scan.nextLine();
                String subjectIn = scan.nextLine();
                System.out.println("What is the new hobby?");
                String hobbyIn = scan.nextLine();
                System.out.println("What is the new favorite food?");
                String foodIn = scan.nextLine();
                p1.updateProfile(nameIn, ageIn, subjectIn, hobbyIn, foodIn);
            }
            //else if is an else statement, but with a condition
            else if (choice == 2){
                System.out.println("What is the new name?");
                scan.nextLine();
                String nameIn = scan.nextLine();
                System.out.println("What is the new age?");
                int ageIn = scan.nextInt();
                System.out.println("What is the new favorite subject?");
                scan.nextLine();
                String subjectIn = scan.nextLine();
                System.out.println("What is the new hobby?");
                String hobbyIn = scan.nextLine();
                System.out.println("What is the new favorite food?");
                String foodIn = scan.nextLine();
                p2.updateProfile(nameIn, ageIn, subjectIn, hobbyIn, foodIn);
            }else if (choice == 3){
                System.out.println("What is the new name?");
                scan.nextLine();
                String nameIn = scan.nextLine();
                System.out.println("What is the new age?");
                int ageIn = scan.nextInt();
                System.out.println("What is the new favorite subject?");
                scan.nextLine();
                String subjectIn = scan.nextLine();
                System.out.println("What is the new hobby?");
                String hobbyIn = scan.nextLine();
                System.out.println("What is the new favorite food?");
                String foodIn = scan.nextLine();
                p3.updateProfile(nameIn, ageIn, subjectIn, hobbyIn, foodIn);
            }else if (choice == 4){
                System.out.println("\nDo you prefer math, art, or science? No capital letters.");
                scan.nextLine();
                String subjectChoice = scan.nextLine();
                System.out.println("\nDo you prefer drawing or building? No capital letters.");
                String hobbyChoice = scan.nextLine();
                System.out.println("\nDo you prefer healthy food or junk food? No capital letters. Include the word food.");
                String foodChoice = scan.nextLine();
                p4.printCareer(subjectChoice, hobbyChoice, foodChoice);
            } else{
                //stops it from repeating
                running = false;
            }
        }
        
    }
}