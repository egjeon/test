package test;

import java.util.Random;
import java.util.Scanner;

public class lockPaperSizer {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		int lose = 0;
		int win = 0;
		int drow = 0;
		
		while(true) {
			System.out.println(cnt + "회차 가위바위보 게임 컴퓨터를 이겨라 ! \n  ex) 0 바위 , 1 가위  , 2 보자기  ,3 게임종료");
			int user = sc.nextInt();
			if(user != 3) {
				int random = rand.nextInt(3);
				String users = "";
				String computer = "";
				
				
				System.out.println("랜덤숫자 = " + random);
				
				if(user == 0) {
					users = "주먹";
				}else if(user == 1) {
					users = "가위";
				}else if(user == 2) {
					users = "보자기";
				}
				if(random == 0) {
					computer = "주먹";
				}else if(random == 1) {
					computer = "가위";
				}else if(random == 2) {
					computer = "보자기";
				}
					
				System.out.println("컴퓨터 = " + computer);
				
				
				if(users.equals("주먹") && computer.equals("가위")) {
					System.out.println("나 : " + users  + " VS " + "컴퓨터 :" + computer);
					System.out.println("승리하셨습니다.");
					win++;
				}else if(users.equals("주먹") && computer.equals("보자기")) {
					System.out.println("나 : " + users  + " VS " + "컴퓨터 :" + computer);
					System.out.println("패배하셨습니다.");
					lose++;
				}else if(users.equals("가위") && computer.equals("주먹")) {
					System.out.println("나 : " + users  + " VS " + "컴퓨터 :" + computer);
					System.out.println("패배하셨습니다.");
					lose++; 
				}else if(users.equals("가위") && computer.equals("보자기")) {
					System.out.println("나 : " + users  + " VS " + "컴퓨터 :" + computer);
					System.out.println("승리하셨습니다.");
					win++;
				}else if(users.equals("보자기") && computer.equals("주먹")) {
					System.out.println("나 : " + users  + " VS " + "컴퓨터 :" + computer);
					System.out.println("승리하셨습니다.");
					win++;
				}else if(users.equals("보자기") && computer.equals("가위")) {
					System.out.println("나 : " + users  + " VS " + "컴퓨터 :" + computer);
					System.out.println("패배하셨습니다.");
					lose++;
				}else if(users.equals(computer)) {
					System.out.println("나 : " + users  + " VS " + "컴퓨터 :" + computer);
					System.out.println("무승부입니다.");
					drow++;
				}
				cnt++;
				System.out.println("현재 전적은  \n 승 : " + win +" 패 : " + lose + " 무 : " + drow);
			}else {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		sc.close();
		
	}
}
