import java.util.*;
public class tempconverter{
	public static void main(String args[]){
		System.out.print("Enter temperature in fahrenheit:");
		Scanner sc=new Scanner(System.in);
		double fahrenheit=sc.nextDouble();
		double Celcius = (fahrenheit - 32) * 5/9;
		System.out.println("Temperature in Celcius is:"+Celcius);
	}
}