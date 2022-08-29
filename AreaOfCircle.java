import java.util.*;
public class AreaOfCircle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of circle:");
		float radius=sc.nextFloat();
		float Area=3.14f*radius*radius;
		System.out.println("Area of circle is:" + Area);
	}
}