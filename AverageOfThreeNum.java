import java.util.*;
public class AverageOfThreeNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER 1ST NUMBER:");
		double x=sc.nextDouble();
		System.out.println("ENTER 2ND NUMBER:");
		double y=sc.nextDouble();
		System.out.println("ENTER 3RD NUMBER:");
		double z=sc.nextDouble();
		System.out.println("AVERAGE= "+((x+y+z)/3));
	}
}