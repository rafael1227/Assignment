package Homework4;

import java.util.Scanner;

class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int result = gcd(m, n);
        System.out.println("두 수의 최대공약수는 " +result+"입니다.");
    }

    public static int gcd(int m, int n) {
        /*if (m == 0) {
            return n;
        }
        return gcd(n % m, m); ///재귀호출 */
    	
    	while (m != 0) {
             int temp = m;
             m = n % m;
             n = temp;
        }
        return n; ///반복문
    }
    	 
}