package Homework3;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 수를 입력할 예정인가요? ");
		int count = sc.nextInt();
		
		int[] num = new int[count];
		
		for(int i = 0; i < count; i++) {
			System.out.print("수를 입력하세요: ");
            num[i] = sc.nextInt();
		}
		
		int min = num[0];
        int max = num[0];

        for (int i = 1; i < count; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        
        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);
        
        sc.close();
	}

}
