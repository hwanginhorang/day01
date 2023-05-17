package variable;
	/*
	 변수
	 - 데이터를 저장하는 공간
	 자료형
	 -int: 정수를 저장할 목적. 4byte
	 -char : 문자 하나 저장. 1byte
	 -float : 실수(소수점 수) . 4byte
	 -double : 실수 . 8byte
	 -boolean : true 또는 false. 1byte
	 */
public class TestClass01 {
	public static void main(String[] args) {
		/*
		 변수를 만드는 규칙
		 - 첫문자는 소문자이며 합서어라면 합성어의 첫 문자는 대문자로 표기
		 ( 예) youName)
		 -변수이름은 의미를 부여해서 만드는게 좋다
		 */
		int age = 20;
		double test = 1.11;
		
		
		System.out.println("나의 나이는"+age+"살 입니다");
		System.out.print(age+"살은 좋다");
		System.out.print("나의 몸무게는" +test+ "kg입니다");
	}

}
