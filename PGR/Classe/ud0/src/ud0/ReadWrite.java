package ud0;

import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int firstNum;
		int secondeNum;
		
		System.out.println("Please write first number entero entero entero: ");
		firstNum=input.nextInt();

		System.out.println("Please write seconde number : ");
		secondeNum=input.nextInt();
		
		System.out.println("a" + " + " + "b" + " = " + (firstNum +secondeNum));
		System.out.println("a" + " - " + "b" + " = " + (firstNum - secondeNum));
		System.out.println("a" + " * " + "b" + " = " +  firstNum * secondeNum);
		System.out.println("a" + " / " + "b" + " = " +  firstNum / secondeNum);

		input.close();
		
	}

}
