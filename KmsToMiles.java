import java.util.*;
public class KmsToMiles{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER DISTANCE (IN KMS):");
		double d=sc.nextDouble();
		System.out.println("GIVEN DISTANCE IN MILES = "+(d*0.621371));
	}
	
}