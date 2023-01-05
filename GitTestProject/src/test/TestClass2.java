package test;

public class TestClass2 {
	public static void main(String[] args) {
System.out.println("Hello World");
		
		int a = 1;
		int b = 3;
		int c = 0;
		
		for(int i = 0 ; i < 3 ; i++) {
			c += a + i;
			b = i;
		}
		
		System.out.println(c);
		System.out.println(b);
	}
}
