/**
 * Created by brianwallace on 10/2/15.
 */
    // high level pseudocode.
    // A = unsorted input
    // n = length of A
    // for i = 2 to n
    //    key = A[i]                        // key will look back on sorted list and insert
    //    j = i - 1                         // j is a tracker.  used to look back on elements in array
    //    while j > 0 & key > A[j]          // if we haven't reached the end and the key is smaller
    //       A[j + 1] = key                 // push value to next spot in array
    //       j--                            // reduce tracker to traverse down array
    //    A[j+1] = key                      // either we traversed to start of array or key is larger than value

public class sort_insertion {

    public static void main(String[] args)
    {
        //actual code
        Integer[] array = {4,3,5,2,1,6};

        for(int i = 1; i < array.length; i++)
        {
            int key = array[i];
            int j = i - 1;

            while(j >= 0 && key < array[j])
            {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key;
        }

        //to output
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

}
