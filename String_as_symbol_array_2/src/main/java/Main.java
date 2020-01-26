import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /////////////////123456789123456789123456789123456789
        String string = "word blabla word and so on and words";
        for (int i= 0; i < string.length(); i++) {
            System.out.print(i);
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();
        String string2 = "letter blabla letter and so on and letter";
        for (int i= 0; i < string2.length(); i++) {
            System.out.print(i);
            System.out.print(string2.charAt(i) + " ");
        }
        System.out.println();



        for (int i = 0; i < string.length() - 4; i++) {
            System.out.print(i);
            System.out.print(string.charAt(i) + " ");
            if (string.charAt(i) == 'w') {
                i++;
                if (string.charAt(i) == 'o') {
                    if (string.charAt(i++) == 'r') {
                        if (string.charAt(i++) == 'd') {
                            string = string.substring(0, i - 4) + "letter" + string.substring(i);
                            i +=2;
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println(string);
    }
}
