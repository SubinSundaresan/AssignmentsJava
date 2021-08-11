import java.util.Locale;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        System.out.println("CHECKING IF A VOWEL IS PRESENT AND/OR HOW MANY TIMES IT APPEARS");
        System.out.println("___________________________________________________________________________");
        System.out.println("ENTER YOUR STRING: ");
        Scanner sc=new Scanner(System.in);
        String test1 = sc.nextLine();
        String test = test1.toLowerCase();
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int c5=0;
        char arr[]=test.toCharArray();
        for(int i=0;i<=arr.length-1;i++) {
            if (arr[i] == 'a') {
                c1 = c1 + 1;
            } else if (arr[i] == 'e') {
                    c2 = c2 + 1;
                } else
                    if (arr[i] == 'i') {
                        c3 = c3 + 1;
                    } else
                        if (arr[i] == 'o') {
                            c4 = c4 + 1;
                        } else
                            if (arr[i] == 'u') {
                                c5 = c5 + 1;
                            } else {
                                c1 = c1 + 0;
                                c2 = c2 + 0;
                                c3 = c3 + 0;
                                c4 = c4 + 0;
                                c5 = c5 + 0;
                            }
                        }
        System.out.println("Following are the results");
        System.out.println("____________________________");
                        System.out.println("vowel 'a' appeared "+c1+" times");
                        System.out.println("vowel 'e' appeared "+c2+" times");
                        System.out.println("vowel 'i' appeared "+c3+" times");
                        System.out.println("vowel 'o' appeared "+c4+" times");
                        System.out.println("vowel 'u' appeared "+c5+" times");
                    }
                }
