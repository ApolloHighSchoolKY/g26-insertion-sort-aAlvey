import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};

        int tempNum = 0;

        for (int i = 1; i < myNumbers.length; i++){
         
           int spot =  i;

            while (myNumbers[spot] < myNumbers[spot-1] && spot >= 0){
            tempNum = myNumbers[spot-1];
            myNumbers[spot-1] = myNumbers[spot];
            myNumbers[spot] =tempNum;
          
          spot --;
            }
    }
        System.out.println("Sorted Array: " + Arrays.toString(myNumbers));
    }
}
