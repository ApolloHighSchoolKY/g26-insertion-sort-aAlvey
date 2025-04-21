import java.util.ArrayList;
import java.util.Arrays;
public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;
		System.out.println("Unsorted Array " + Arrays.toString(myNumbers));
	
			sorted.add(myNumbers[0]);
	
			for(int i = 1; i < myNumbers.length; i++){
				inserted = false;
				int spot = 0;

				while (inserted == false && spot < sorted.size()){

					if (myNumbers[i] < sorted.get(spot)){
						sorted.add(spot, myNumbers[i]);
						inserted = true;
					}
					spot++;
				}
				if (inserted == false)
					sorted.add(myNumbers[i]);
			}
		
			for (int q = 0; q < myNumbers.length; q++){
				myNumbers[q] = sorted.get(q);
			}
		System.out.println("Sorted Array: " + Arrays.toString(myNumbers));

    }


}
