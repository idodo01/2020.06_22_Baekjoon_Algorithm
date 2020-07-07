package Step11;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iNum = scan.nextInt();
		System.out.println(factorialMethod(iNum));
	}
	
	static int factorialMethod(int iNum) {
		// 0고 1은 1를 반환
		if(iNum<2) {
			return 1;
		} else {
			return iNum*factorialMethod(iNum-1);
		}
		
		
		// 	5 * factorialMethod(iNum-1) 
		//		4 * factorialMethod(iNum-1)
		//			3 * factorialMethod(iNum-1)
		// 				2* factorialMethod(iNum-1)
		//					1
	}

}
