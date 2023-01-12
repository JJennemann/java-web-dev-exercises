package Exercisesch3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students ID number (or Enter to finish):");

        do{
            System.out.println("Student name: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")){
                System.out.println("ID number: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");
        for(Map.Entry<Integer, String> student: students.entrySet()){
            System.out.println((student.getKey()+": " + student.getValue()));
        }

    }
}
