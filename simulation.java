package montecarlosSimulation;


import java.util.Random;
import java.util.Scanner;
import java.util.stream.*;


public class simulation {

	public static void main(String[] args) {
		 Random rand = new Random();
		
		 
		 
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("For How many random numbers do you want to find the PI for? ");
		 int n = input.nextInt();
		
		
		 
		 int max = 1;
		 int min = -1;
		 
		 System.out.println("for "+ n +" random numbers: ");
		 
		 float xCod[] = new float[n]; 
		 float yCod[] = new float[n]; 
		 float newxCod[] = new float[n];
		 float newyCod[] = new float[n];
		 int newxxCod []= new int [n];
		 int newyyCod[] = new int[n];
		 
		 
		 for(int i = 0; i<n; i++) {
		 float result = rand.nextFloat() * (max - min) + min;
		 xCod[i] = result;
		 
		 }
		
		 for(int i = 0; i<n; i++) {
			 float result = rand.nextFloat() * (max - min) + min;
			 yCod[i] = result;
			 
			 }

		 
		 for ( int i = 0; i<n; i++) {
			
			 
			 float x = xCod[i] * xCod[i];
			 float y =  yCod[i] *  yCod[i] ;
			 
			 float r = (x+y);
			 
			 if ( r<1) {
				 newxCod[i] = xCod[i];
				 newxxCod[i] = 1;
				 
			 }else {
				 newxCod[i] = 0;
				 newxxCod[i] = 0;
			 }
			 
			 if ( r<1) {
				 newyCod[i] = yCod[i];
				 newyyCod[i]= 1;
				 
				 
			 }else {
				 newyCod[i] = 0;
				 newyyCod[i]= 1;
			 }

			 
		 }

		 
		 int sumofX = IntStream.of(newxxCod).sum();
		
		 
		 int sumofY = IntStream.of(newyyCod).sum();
		
		 
		 float divXandY =  (float) sumofX/ sumofY;
		
		 
		 System.out.println("value of pi = "+ (4*divXandY));
		}
		 
		 
	}





