package ExercisesCh2;

import java.util.Scanner;

public class Alice2 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        String aliceLine = "Alice was beginning to get very tired" +
                " of sitting by her sister on the bank, and of" +
                " having nothing to do: once or twice she had peeped" +
                " into the book her sister was reading, but it had no" +
                " pictures or conversations in it, 'and what is the use" +
                " of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("What term would you like to search?");
        String searchWord = input.nextLine();
        boolean result = aliceLine.toUpperCase().contains(searchWord.toUpperCase());
        double searchWordIndex = aliceLine.toUpperCase().indexOf(searchWord.toUpperCase());
        double searchWordLength = searchWord.length();
        String newAliceLine = aliceLine.replace(searchWord, "");
        System.out.println("Search term was found: " +result);
        System.out.println("Search term was found at index: " + searchWordIndex);
        System.out.println("Search term has a length of : " + searchWordLength);
        System.out.println(newAliceLine);
        input.close();
    }
}
