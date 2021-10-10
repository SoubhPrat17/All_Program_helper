/* An array contains elements from 1-n while some of them are missing. Instead of missing elements
there are duplicate elements. Finding the missing elements from an array. Here t no. of arrays are taken
* And from each array the missing elements are printed. */

import java.util.Scanner;

public class missing_element {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc, i, j, n;
        tc = sc.nextInt();
        for (i = 0; i < tc; i++) {
            n = sc.nextInt();
            int[] arr = new int[n];

            for (j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int[]register = new int[arr.length+1];

            for (int k:arr){
                register[k]=1;
            }

            for (j=1;j<register.length;j++)
            {
                if (register[j]==0)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}

