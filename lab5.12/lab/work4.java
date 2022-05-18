package lab;

import java.util.Arrays;
import java.util.Random;
public class work4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=0;
         int[] array =new int[10];
        for (int b=0 ; b<10; b++) {
        	 array[b] = (int)Math.round(Math.random()*10);
        	 
         }
        for (int b=0 ; b<10; b++) {
        	 System.out.print(array[b]+" ");
        }
        for (int b=0 ; b<10; b++) {
        	if (array[b] % 2 == 0)
        		array[b]=0;
        	a++;
        	
        }
        System.out.print(Arrays.toString(array));
	}

}
