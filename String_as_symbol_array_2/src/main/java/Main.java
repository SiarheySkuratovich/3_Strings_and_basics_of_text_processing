public class Main {
    public static void main(String[] args) {
        String string = "word blabla word and wo and so on and words";
        System.out.println(string);
        for (int i = 0; i < string.length() - 4; i++) {
            if (string.charAt(i) == 'w') {
                i++;
                if (string.charAt(i) == 'o') {
                    i++;
                    if (string.charAt(i) == 'r') {
                        i++;
                        if (string.charAt(i) == 'd') {
                            i++;
                            string = string.substring(0, i - 4) + "letter" + string.substring(i);
                            i +=2;
                        }
                    }
                }
            }
        }
        System.out.println(string);
    }
}
