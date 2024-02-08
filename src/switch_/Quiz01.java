package switch_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;
		String house = "집주소를 등록하세요", office = "회사를 등록하세요";

		while(true) {
			System.out.println("1.우리집 등록\n2.회사 등록\n3.등록 보기");
			num = sc.nextInt();
				switch (num) {
				case 1 :
					System.out.print("우리집 목적지 입력 : ");
					house = sc.next();
					System.out.println("등록 성공");
					break;
				case 2 : 
					System.out.print("회사 목적지 입력 : ");
					office = sc.next();
					System.out.println("등록 성공");
					break;
				case 3 : 
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
			}
			if (num==3) {
				System.out.println("우리집 : "+house+"\n회사 : "+office);
				break;
			}
		}
	}
}
