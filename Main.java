package Exam;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] agrs) throws IOException {
        String choose = null;
        Student2 student2 = new Student2();
        Menu();
        while (true){
            choose = sc.nextLine();
            switch (choose){
                case "1":
                    student2.add();
                    break;

                case "2":
                    student2.add();
                    break;

                case "3":
                    student2.add();
                    break;

                case "0":
                    System.out.println("Hehe!");
                    break;
                default:
                    System.out.println("-----");
                    break;
            }
        }
    }
    private static void Menu() {
        System.out.println("-----------Menu------------");
        System.out.println("1. Add new Student.");
        System.out.println("2.Save.");
        System.out.println("3.Student.");
        System.out.println("4.  Exit");
        System.out.println("---------------------------");
        System.out.print("Please: ");
    }


}
