package test;

import java.lang.*;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "preeti";
		int length = str.length();
		int mid = length / 2;

		if (mid % 2 == 0) {
			String midChar = 
		}
		String midChar = (length % 2 != 0) ? (str.substring(0, mid) + str.substring(mid + 1, str.length()))
				: (str.substring(0, mid - 1) + str.substring(mid + 1, str.length()));
				System.out.println("Midde character is : "+midChar);   
				System.out.println("Midde character is : "+midChar);

	}

}
