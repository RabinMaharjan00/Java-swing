package Login;


public class state {
	static int a=10;
	static int b;
	
	static void setValue(int x) {
		System.out.println("x "+ x);
		System.out.println("a "+a);
		System.out.println("b "+b);
		
		
	}
	static {
		b=a*4;
	}

	public static void main(String[] args) {
		setValue(32);
		
	}

}
