import java.util.*;
public class SimpleInterest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER PRINCIPAL:");
		double p=sc.nextDouble();
		System.out.println("ENTER RATE:");
		double r=sc.nextDouble();
		System.out.println("ENTER TIME:");
		double t=sc.nextDouble();
		System.out.println("SIMPLE INTEREST= "+((p*r*t)/100));
	}
}