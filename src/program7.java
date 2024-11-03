package JAVA;

import java.util.Scanner;
public class program7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks in maths;");
        int maths = sc.nextInt();
        System.out.println("enter marks in english;");
        int english = sc.nextInt();
        System.out.println("enter marks in computer;");
        int computer = sc.nextInt();
        int total = maths+english+computer;
        System.out.println("total marks are : "+total);
        float percentage = ((total)/300)*100;
        System.out.println("percentage is :"+ percentage);
    }
}