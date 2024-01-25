package Arrays;

import java.util.Scanner;

public class countingBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        printArray(countBits(n));
    }


    public static void printArray(int[] arr){
        for(int el:arr){
            System.out.print(el+" ");
        }
    }
    public static int[] countBits(int n) {
        int[] arr=new int[n+1];

        arr[0]=0;

        for(int i=1;i<=n;i++){
            arr[i]=countingBits(i);
        }

        return arr;
    }

    public static int countingBits(int n){
        int count=0;
        while(n>0){
            int rem=n%2;

            n/=2;

            if(rem==1){
                count++;
            }
        }
        return count;
    }
}
