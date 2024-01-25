package HashSet;

import java.util.*;

public class SumOfSecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,5,5,6,6};

        HashSet<Integer>  hs=new HashSet<Integer>();

        for(int el:arr){
            hs.add(el);
        }

        int smallest= (int) hs.toArray()[1];

        int largest = (int) hs.toArray()[hs.size()-2];

        System.out.println(smallest+largest);
    }
}
