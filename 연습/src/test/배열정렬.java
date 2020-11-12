package test;

import java.util.Arrays;

public class 배열정렬 {
	public static void main(String[] args)  {
        int arr[] = {95, 75, 85, 100, 50};
         Arrays.sort(arr);
        
        for (int i : arr) {
            System.out.println("" + i);
        }
    }

}
