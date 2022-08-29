import java.util.*;
public class VolumeOfCylinder{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of cylinder:");
		float r=sc.nextFloat();
		System.out.print("Enter height of cylinder:");
		float h=sc.nextFloat();
		double volume=3.14f*(r*r)*h;  
 		System.out.print("Volume of cylinder="+volume);  
	}		
}