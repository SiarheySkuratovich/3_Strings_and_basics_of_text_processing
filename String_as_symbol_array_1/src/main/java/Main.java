public class Main {
    public static void main(String[] args) {
        /*System.out.println("Enter quantity of names: ");
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[scanner.nextInt()];
        System.out.println("Fill the array of names:");
        scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            System.out.print(i + ": ");
            names[i] = scanner.nextLine();
        }*/

        String s = "camelCaseBaseFace";
        System.out.println(getSnakeCaseOf(s));

    }

    public static String getSnakeCaseOf(String string) {
        String newString = "";
        String rightPart;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) < 97) {
                newString = string.substring(0, i);
                rightPart = string.substring(i + 1);
                newString = newString.concat("_" + (char)(string.charAt(i) + 32));
                newString = newString.concat(rightPart);
                string = newString;
            }
        }
        return newString;
    }
}
