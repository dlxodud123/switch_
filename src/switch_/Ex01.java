package switch_;

public class Ex01 {
	public static void main(String[] args) {
		int select = 1;
		switch (select) {
		case 1 : System.out.println(1); break;
		case 2 : System.out.println(2); break;
		default : System.out.println("1, 2 제외한 값");
		}System.out.println("다음 문장 실행");
	}
}
