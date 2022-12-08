
// and the output should be the words in reverse but with
// the letters in the original order. For example, the string “Dog bites man”
// should output as “man bites Dog.”


import java.util.regex.Pattern;

public class Reverse {
    static String reverseWords(String str) {

        //Die Methode pattern() der Klasse Pattern holt den regulären
        // Ausdruck im String-Format, mit dem das aktuelle Muster kompiliert
        // wurde, und gibt ihn zurück.
        //Aufteilung der String str mit einem Pattern
        // (d.h. Aufteilung des Strings immer dann, wenn es
        // Leerzeichen vorhanden sind und in einem temporären Array speichern.

        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(str);
        String result = "";

        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "Dog bites man";
        System.out.println(reverseWords(s1));

        String s2 = "Codecademy is the best !";
        System.out.println(reverseWords(s2));
    }
}
