import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Character Want To Check : ");
        char vowel=s.next().charAt(0);

        checkIfVowelOrNot(vowel);
    }

    private static void checkIfVowelOrNot(char vowel) {
        if (vowel == 'a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u'||vowel == 'A'||vowel=='E'||vowel=='I'||vowel=='O'||vowel=='U'){
            System.out.println(vowel+" is Vowel");
        }else {
            System.out.println(vowel+" is Consonant");
        }
    }
}
