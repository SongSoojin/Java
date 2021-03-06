package w10;

/*
 * 공백 제거, String trim()
 * 
 * 키보드나 파일로부터 스트링을 입력 시, 스트링 앞 뒤 공백이 끼는 경우가 많다. 
 * -> trim()을 이용하면 스트링 앞 뒤에 있는 공백문자(' ', \t , \n) 제거
 *
 */

public class Ex1_String활용 {

	public static void main(String[] args) {
		
		String a = " xyz\t\n";
		System.out.println(a);
		System.out.println("a의 길이 : "+a.length()); //6
		
		String b = a.trim();	 // b = "xyz". 빈 칸과 '\t' , '\n' 제거됨
		System.out.println(b);
		System.out.println("b의 길이 : "+b.length()); //3
		
	}

}
