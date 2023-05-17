package variable;

public class TestClass03 {
	public static void main(String[] args) {
		/*
		 형변환
		 - 자료형은 변화시키는 것
		 */
		int num = 65;
		System.out.println(num);
		System.out.println((char)num);
		
		char ch = 5 + 'A';
		char ch3;
		int ch2;
		
		num = 5;
		ch2 = ch + num;
		ch3 = (char)(ch + num);
		
		System.out.println(ch2);
		System.out.println(ch3);
		
		float f1 = (float)1.11;
		float f1_2 = 1.11f;
		double dou = 1.11;
		
		String name = "홍";
		System.out.println("당신 이름: ");
		
	}
}
