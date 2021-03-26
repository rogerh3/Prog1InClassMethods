
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayMessage(); 
		displayMessage1(); 
		
		int number = 10;
		
		addNumber(number, 5); 
		addNumber(15,25);
		
		int numberFromMethod = addNumbersWithReturn(20,5);
		System.out.println("The number from our method is: " + numberFromMethod);
		
		//making a string into an integer
//		int num = Integer.parseInt("700"); 
//			System.out.println(num);
		
	}
//This is called method calling where we input down here and call it on top
		public static void displayMessage() {
			System.out.println("Hello ");
	}
		public static void displayMessage1(){
			System.out.println("How are you"); 
	}
		public static void addNumber(int num1, int num2) {
	//		System.out.println(num1); 
	//		System.out.println(num2); 
			int total;
			total = num1 + num2;
			System.out.println("Your total is: " + total); 
		}
		public static int addNumbersWithReturn(int num, int num2){
			int total;
			total = num + num2;
			System.out.println("Your total is: " + total);
			return total; 
		}
		
}

