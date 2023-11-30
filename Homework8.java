package Homework8;

import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		HashMap<String, String> userCredentials = new HashMap<>();
        userCredentials.put("myId", "myPass");
        userCredentials.put("myId2", "myPass2");
        userCredentials.put("myId3", "myPass3");
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = sc.nextLine().trim();

            // 입력된 ID가 존재하지 않으면 메시지 출력 후 재입력 요구
            if (!userCredentials.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String inputPassword = sc.nextLine().trim();

            if (inputPassword.equals(userCredentials.get(inputId))) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } 
            else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }

        sc.close();
    }
}