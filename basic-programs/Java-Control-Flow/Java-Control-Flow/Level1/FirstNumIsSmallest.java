import java.util.*;

class FirstNumIsSmallest{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number1: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter your number2: ");
		int number2 = sc.nextInt();
		
		System.out.print("Enter your number3: ");
		int number3 = sc.nextInt();
		
		if(number1 < number2 && number1 < number3){
		    System.out.println("Is the first number the smallest? Yes");
		}
		
		else{
		    System.out.println("Is the first number the smallest? No");
		}
	sc.close();
	}
}