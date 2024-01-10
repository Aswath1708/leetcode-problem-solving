package HashSet;

import java.util.*;
import java.io.*;

public class SumOfSecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,5,5,6,6};

        HashSet<Integer>  hs=new HashSet<>();

        for(int el:arr){
            hs.add(el);
        }
//        hs.toArray();
        System.out.println(hs);
    }
}
