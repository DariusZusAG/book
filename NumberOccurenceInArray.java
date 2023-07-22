public class NumberOccurenceInArray {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,1,2};

        //int getNumberOccurence = 1;
        int getNumberOccurence = 2;
        int numberOccurenceCount = 0;
        int[] finalOccuredNumbers = new int[1];
        int[] finalOccurencesCount = new int[1];
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == getNumberOccurence){
                numberOccurenceCount++;
                System.out.println("Number " + getNumberOccurence + " found at position " + i);
            }

            if(numberOccurenceCount > 1){
                finalOccuredNumbers[0] = getNumberOccurence;
                finalOccurencesCount[0] = numberOccurenceCount;
            }

        }
        //print the final array
       // for (int i = 0; i < finalOccuredNumbers.length; i++){
            //System.out.println(finalOccuredNumbers[i]);

        if (numberOccurenceCount > 1){
            System.out.println("Number " + finalOccuredNumbers[0] + " occured " + finalOccurencesCount[0] + " times ");
        } else {
            System.out.println("Number " + getNumberOccurence + " did not occur twice ");
        }
    }
}
