package javabasics;

public class parameters {
	public static void main(String[] args)
	{
		int y=3;
		
		 passMethod (y);
		System.out.println(y);
		
		
	}
	public static void passMethod(int p) {
		
		p=10;
	}

}
