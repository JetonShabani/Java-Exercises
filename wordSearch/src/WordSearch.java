//For a given input string, return a Boolean TRUE if the string starts with a given input word.
//create a program that returns the number of times a word appears in an input string
//(doesn't work if a word is not separated with comma?)
import java.util.*;

public class WordSearch {
    public static void main(String[] args) {
        //Hier haben wir einen Code, der bei einem Satz und einem Wort einfach prüft, ob dieses Wort vorhanden ist.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = scanner.nextLine();
        String[] words = line.split("[ ]+");

        System.out.print("Input a particular word: ");
        String searchedWord = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (searchedWord.equals(words[i]))
                count++;
        }

            if (line.toLowerCase().indexOf(searchedWord.toLowerCase()) != -1) {
                System.out.println(" is present");
                System.out.println( searchedWord + " is present " + count +" times");
            } else {
                System.out.println("not found");
            }
        }
    }
