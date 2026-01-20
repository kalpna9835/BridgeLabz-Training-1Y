import java.util.*;
public class VolumeOfCylinder{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER RADIUS:");
		double x=sc.nextDouble();
		System.out.println("ENTER HEIGHT:");
		double y=sc.nextDouble();
		System.out.println("VOLUME="+Math.PI*x*x*y);
	}
}