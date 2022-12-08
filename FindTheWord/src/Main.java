//Starting with an input string of words, find the second-to-last word of the string.
//allow for a second numerical input, n, that results in returning the nth word of a string
import java.util.*;
public class Main {
    public static void main(String[] args){
        //Zuerst starten wir einen Scanner, der liest, was der Benutzer schreibt
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Sentence: ");

        // nextLine() Methode  liest Eingaben vom Eingabegerät, bis die Zeile wechselt.
        String line = scanner.nextLine();

        //im Wort-Array werden alle Wörter durch ein Leerzeichen getrennt (definiert durch Regex)
        String[] words = line.split("[ ]+");
        // in der letzten Zeile wählen wir einfach das vorletzte Wort mit der -2
        System.out.println("Penultimate word: "+words[words.length - 2]);

        //in diesem Fall eine Nummer ist, so dass ich zuerst parseInt ausführen muss,
        //um die Strings  von String in Nummern zu ändern.
        System.out.print("Input a number to print that particular word: ");
        int line2 = Integer.parseInt(scanner.nextLine());

        // Dann gehe ich in einer Loop und wiederhole sie für alle Wörter
        for (int i = 0; i < words.length; i++) {
        }

        //wenn die eingegebene nummer größer als 1 und kleiner oder gleich
        //der Länge des words ist, wird das Wort für diese Position gedruckt
        if(line2 >= 1 && line2 <= words.length)
            System.out.println("the word for that number is: "+words[line2-1]);
    }


}
