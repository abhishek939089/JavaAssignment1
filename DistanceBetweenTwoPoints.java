import java.util.*;
public class DistanceBetweenTwoPoints{
    public static void main(String args[]){
        int x1,x2,y1,y2;
        x1=5;x2=10;y1=20;y2=30;
        Double Distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.print("Distance is:" +Distance); 
    }
}
