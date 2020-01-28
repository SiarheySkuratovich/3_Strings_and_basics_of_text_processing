public class Main {
    public static void main(String[] args) {
        String string = "asd dfg  dfgh     sdfsdf  fd         ";
        int spaceCount = 0;
        int maxSpaceCount = 0;
        int firstOccurrenceFromI = string.indexOf(' ', 0);
        int i;
        while (firstOccurrenceFromI != -1) {
            i = firstOccurrenceFromI;
            while (string.charAt(i) == ' ') {
                i++;
                if (i >= string.length()) {
                    break;
                }
                spaceCount++;
            }
            if (spaceCount > maxSpaceCount) {
                maxSpaceCount = spaceCount;
            }
            spaceCount = 0;
            firstOccurrenceFromI = string.indexOf(' ', i);
        }
        System.out.println("MAX space count is: " + maxSpaceCount);
    }
}
