package lab;

import java.util.Random;


public class work2 {

	public static void main(String[] args) {
       int a = 0;
       int araay[]= new int[15];
       System.out.print("all even numbers");
       for ( int i =0; i< 10; i++) {
    	   araay[i] = (int) Math.round(Math.random()*10);
		System.out.print(array[i]);
    	   if (array[i] % 2==0) {
    		   System.out.print("("+array[i]+")");
    	   }
       }
	}

}
