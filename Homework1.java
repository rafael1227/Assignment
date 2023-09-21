package Homework1;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1)+"번째 정수: ");
			int num = sc.nextInt();
			total += num;
		}
		
		System.out.println("입력된 모든 정수의 합은 "+total+"입니다.");
	}

}
