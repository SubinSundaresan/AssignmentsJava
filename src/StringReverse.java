import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str1=sc.next();
        int j=str1.length();
        n=j-1;
        System.out.println(str1.length());
        char array[]=str1.toCharArray();
        char tempo[]=new char[n+1];
        for (i=0;i<=n;i++) {
            tempo[i] = array[n - i];
        }
        String str2 = new String(tempo);
        System.out.println(str2);
    }
}