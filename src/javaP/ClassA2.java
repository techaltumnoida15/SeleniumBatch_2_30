package javaP;

public class ClassA2 {

	public void evenOdd(int i) {
		//int i = 5;
		
		int reminder = i%2;
		
		if(reminder == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	
	public void primeNum() {
		int t = 21;
		int counter = 0;
		
		for(int i = 2; i<=t; i++) {
			
			int reminder = t%i;
			
			if(reminder == 0) {
				counter++;
			}
		}
		
		if(counter == 1) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
	}

	public void calcFact() {
		int t = 5;
		int fact = 1;
		
		if(t == 0) {
			System.out.println("Factorial of 0 is = 1");
		}
		else if(t == 1){
			System.out.println("Factorial of 1 is = 1");
		}
		else {
			for(int i = t; i>0; i--) {
				fact = fact * i;
			}
		}
		System.out.println("Fact is = " + fact);
	}
	
	public void reverseString() {
		String s = "Selenium";
		String revString = "";
		
		char c = s.charAt(3);
		System.out.println(c);
		
		char[] arr1 = s.toCharArray();
		
		int length = arr1.length;
		
		for(int i = length - 1; i>=0; i--) {
			
			char charValue = arr1[i];
			
			revString = revString + charValue;
			//System.out.println(charValue);
		}
		System.out.println("Reverse string is = " + revString);
	}
	
	public static void main(String[] args) {
		ClassA2 obj = new ClassA2();
		//obj.evenOdd(6);
		//obj.primeNum();
		//obj.calcFact();
		obj.reverseString();
	}
}
