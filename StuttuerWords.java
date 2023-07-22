public class StuttuerWords {

    public static void main(String[] args) {

    String  text = "I am me you are you and we are both unique";

    //for (int i = 0; i < text.length(); i++){}
        String[] words = text.split(" ");
        System.out.println("Numbere of words: " + words.length);
        System.out.println("Words: ");
        StringBuilder stutterWords = new StringBuilder(); //here we create a StringBuilder object
        for (String word : words) {
            for (int i = 0; i < 2; i++) {
                stutterWords.append(word).append(" ");
            }
        }
        System.out.println(stutterWords);
    }
}