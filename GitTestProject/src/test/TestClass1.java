package test;

public class TestClass1 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int a = 1;
		int b = 3;
		int c = 0;
		
		for(int i = 0 ; i < 3 ; i++) {
			c += a + i;
			
			a *= b;
		}
		
		System.out.println(c);
		
		System.out.println("개발 진행 중 동일 파일이 변경되었을 경우 merge 필요");
		System.out.println("master에서 변경된 소스 개발브랜치에서 수정함.");
	}
}
