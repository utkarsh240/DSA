import java.util.*;
public class largestinarray {
    public static int getLargest(int numbers[]){
        int largest =Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){

            if (largest<=numbers[i]){
                largest=numbers[i];
            }
        }

        return largest;



    }

    public static void main(String[] args) {
        int numbers[]= { 2,3,32,5,9};

        System.out.println("largest is "+ getLargest(numbers) );

    }
    
}
