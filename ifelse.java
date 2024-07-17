import java.util.Scanner;

class ifelse{
    public static void main(String[] args){
        // Grading System
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if(marks > 90){
            System.out.println("Encellent");
        }else if(marks > 80 && marks <= 90){
            System.out.println("Good");
        }else if(marks > 70 && marks <=80){
            System.out.println("Fair");
        }else if(marks > 60 && marks <= 70){
            System.out.println("Meets expectations");
        }else if(marks <= 60){
            System.out.println("Below par");
        }
    }
}
