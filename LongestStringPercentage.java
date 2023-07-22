public class LongestStringPercentage {
    public static void main(String[] args) {
        String text = "webcsdfndsb dfghjjjkkj lljhgffddf hgfdsdsd" + "333" + "         ";
        int spaceCount = 0;
        int textTotalLenght = text.length();//here we get the total lenght of our string

        for (int i = 0; i < textTotalLenght; i++) {
            if (text.charAt(i) == ' ') {//here er check if the character at position i is a space

                System.out.println("Space found at position " + i);
                spaceCount++;
            }
        }
        System.out.println("Space count is " + spaceCount);
        //here we calculate the percentage of spaces in our string
        double spacePercentage = (double) spaceCount / textTotalLenght * 100;
        System.out.format("Space percentage is %.2f", spacePercentage);
        //show only 2 digits after the decimal point
    }
}
