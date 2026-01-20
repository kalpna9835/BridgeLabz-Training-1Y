import java.util.*;
public class Temperature{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE TEMPERATURE (IN CELSIUS):");
		double x=sc.nextDouble();
		System.out.println("GIVEN TEMPERATURE IN FAHRENHEIT="+(x*(9.0/5.0)+32));
	}
}