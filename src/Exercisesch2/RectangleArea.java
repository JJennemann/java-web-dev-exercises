package Exercisesch2;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        double length = input.nextDouble();
        System.out.println("What is the width of the rectangle?");
        double width = input.nextDouble();
        double area = length*width;
        System.out.println("The area of a rectangle with length " + length + " and width " + width + " is " + area + ".");
        input.close();
    }
}
