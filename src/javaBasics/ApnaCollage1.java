package javaBasics;

import java.util.Scanner;

//Arrays
public class ApnaCollage1 {

	// Driver program to test above function
	public static void main (String[] args)
	{
		//Take input for array size
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows of array: ");
		int rows = sc.nextInt();
		System.out.print("Enter the cols of array: ");
		int cols= sc.nextInt();
		
		int numbers[][] = new int[rows][cols];
		
		//Initialize the array
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				numbers[i][j]=sc.nextInt();	
			}	
		}
		
		sc.close();
		
		int x=6;
	
		//Print the array
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
					System.out.print(numbers[i][j]+" ");		
			}	
			System.out.println();
		}
		//Print the value of index
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(numbers[i][j]==6) {
					System.out.print("x=6 is at index: "+i+""+j);	
				}	
			}	
		}
	}
}