import java.util.*;
public class PowerCalc{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER BASE:");
		double b=sc.nextDouble();
		System.out.println("ENTER EXPONENT:");
		double e=sc.nextDouble();
		System.out.println("ANSWER = "+Math.pow(b,e));
	}
}