//Write a Program to Check Whether a Character is
//Vowel or Consonant.

package ifelse;

public class Q2 {

    static String checkVowelOrConsonant(char character){
        return (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') ? "Vowel" : "Consonant";

    }

    public static void main(String[] args) {

        System.out.println(checkVowelOrConsonant('f'));

    }
}
