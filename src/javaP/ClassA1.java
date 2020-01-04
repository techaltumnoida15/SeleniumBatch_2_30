package javaP;

public class ClassA1 {

	int i = 10;
	
	public void addTwoNums() {
		//Logic
		int a = i + 8;
		System.out.println(a);
		System.out.println("Total of two numbers are = " + a);
		
		
		System.out.println(i);

		System.out.println("value of i is = " + i);
	}

	public void multiplyTwoNum(int t, int k, String s) {    //pass parameters in methods
		int a = k * t;
		System.out.println(a);
		
		System.out.println(s);
		
		System.out.println("Hello " + s);
	}
	
	
	public void checkEvenOddNum(int t) {
		if(t%2 == 0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
	}
	
	public static void main(String[] args) {    //starting point - Execution point
		//Create object
		ClassA1 obj = new ClassA1();
		
		//obj.addTwoNums();
		//obj.multiplyTwoNum(5, 6, "Java");
		obj.checkEvenOddNum(13);
	}
}
