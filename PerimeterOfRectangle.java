import java.util.*;
public class PerimeterOfRectangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER LENGTH:");
		double l=sc.nextDouble();
		System.out.println("ENTER WIDTH:");
		double w=sc.nextDouble();
		System.out.println("PERIMETER OF RECTANGLE= "+(2*(l+w)));
	}
}