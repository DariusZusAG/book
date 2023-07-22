import java.util.HashMap;

public class NumberOccurenceInArrayVers3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2};
        HashMap<Integer, Integer> duplicateNumbers = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int numberOfOccurence = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i] + " is a duplicate number ");
                    numberOfOccurence++;
                }
                if (numberOfOccurence > 0) {
                    if (!duplicateNumbers.containsKey(numbers[i])) {
                        duplicateNumbers.put(numbers[i], numberOfOccurence);
                        System.out.println(" Number " + numbers[i] + " is a duplicate number " + " and occurs " + numberOfOccurence + " times ");
                    } else {
                        System.out.println(" Number " + numbers[i] + " is a duplicate number " + " and occurs " + numberOfOccurence + " timesx ");
                        duplicateNumbers.put(numbers[i], duplicateNumbers.get(numbers[i]) + 1);
                    }
                }
            }
        }
        for (Integer key : duplicateNumbers.keySet()) {

            int foundDuplicateNo = key;
            int timesFound = (int) duplicateNumbers.get(key);
            System.out.println(foundDuplicateNo + " occurs " + " times ");


        }
    }
}