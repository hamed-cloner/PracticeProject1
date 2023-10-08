import java.util.Arrays;

class numGenerator {
    static int min = 1;
    static int max = 10000;
    // generating random numbers between 1 and 10000 for our array
    static int Generator() {
        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random;
    }
}
public class PracticeProject1 {
    public static void main(String[] args) {
        // creating array with 500 items using our generator
        int[] array = new int[500];
        for(int i=0 ; i<500; i++ ) {
            array[i] = numGenerator.Generator();
        }
        //finding maximum and minimum number in array
        int maximum = array[0];
        int minimum = array[0];
        for(int i=1 ; i< array.length ; i++){
            if(array[i]>maximum){
                maximum = array[i];
            }
            else if(array[i]<minimum){
                minimum = array[i];
            }
        }
        // Calculate the sum of items in array
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++ ){
            sum += array[i];
        }

        // calculate the sum of Odd numbers in array

        int oddSum = 0;
        for(int i = 0; i < array.length ; i++ ){
            if(array[i] % 2 != 0 ){
                oddSum += array[i];
            }
        }
        System.out.println(sum);
        System.out.println(oddSum);

    }




}