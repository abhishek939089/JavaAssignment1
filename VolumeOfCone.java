import java.util.*;
public class VolumeOfCone{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of cone:");
		int r=sc.nextInt();
		System.out.print("Enter the height of cone:");
		int h=sc.nextInt();
		float volume = 3.14f*(r*r)*(h/3);
		System.out.print("Volume of cone is :"+volume);	
	}
}