//This Program is to implement boundary of an equilateral triangle.

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int height = sc.nextInt();
		 for(int i = 0; i <height; i++){
			 for(int j = i; j <height-1; j++) {
				System.out.print(" ");
			 }
			 for(int k = 1; k <= ((2 * i) + 1); k++) {
				  if (i > 0 && i < height - 1) {
				     if (k > 1 && k < 2 * i + 1) {
				      System.out.print(" ");
				     } 
             else
				      System.out.print("*");
				    } 
            else
				     System.out.print("*");
				    }
				   System.out.println();
				   }
				}
		}
