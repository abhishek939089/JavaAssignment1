import java.util.*;
public class VolumeOfSphere{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of a circle:");
		float r=sc.nextFloat();
		double volume=(4.0/3.0)*3.14f*(r*r*r);
		System.out.print("The volume of sphere is :"+volume);
	}
}