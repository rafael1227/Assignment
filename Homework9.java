package Homework9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Homework9 {

	public static void main(String[] args) {
		HashMap<String, String> credentials = new HashMap<>();
        try {
            Scanner sc = new Scanner(new FileInputStream("db.txt"));
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String id = parts[0].trim();
                    String password = parts[1].trim();
                    credentials.put(id, password);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일이 존재하지 않습니다.");
            return;
        }

        Scanner input = new Scanner(System.in);
        String id, password;

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            id = input.nextLine().trim();

            if (!credentials.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            password = input.nextLine().trim();

            if (password.equals(credentials.get(id))) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }

        input.close();
    }
}