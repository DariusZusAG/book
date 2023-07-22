public class NumberOccurenceInArrayVers2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2};
        int[] dublicateNumbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    dublicateNumbers[j] = numbers[i];

                    //System.out.println("Number is " + numbers[i] + " on position " + i);
                    //System.out.println("Number is " + numbers[j] + " on position " + j);
                }
            }
        }
        for (int k=0; k < dublicateNumbers.length; k++){
            if (dublicateNumbers[k] == 0){
                continue;
            }
           // System.out.println(dublicateNumbers[k]);
            System.out.println("Number is " + dublicateNumbers[k] + " on position " + k);
        }
    }
}
