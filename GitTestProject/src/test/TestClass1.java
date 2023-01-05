package test;

public class TestClass1 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int a = 1;
		int b = 3;
		int c = 0;
		
		for(int i = 0 ; i < 3 ; i++) {
			c += a + i;
		}
		
		System.out.println(c);
	}
}
