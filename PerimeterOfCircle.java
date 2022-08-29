import java.util.*;
public class PerimeterOfCircle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of circle:");
		float radius=sc.nextFloat();
		float perimeter=2*3.14f*radius;
		System.out.println("perimeter of circle:" + perimeter);
	}
}