import java.util.*;
public class PerimeterOfRectangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of rectangle:");
		float l = sc.nextFloat();
		System.out.print("Enter the width of rectangle:");
		float w = sc.nextFloat();
		float Perimeter = 2*(l+w);
		System.out.print("perimeter of rectangle is :" + Perimeter);
	}
}