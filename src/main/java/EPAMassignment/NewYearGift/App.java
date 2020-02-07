package EPAMassignment.NewYearGift;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
/**
 * Hello world!
 *
 */
public class App 
{
	public static ArrayList<Integer> ar = new ArrayList<Integer>();
	public static Map<Integer,String>hm = new HashMap<Integer,String>();
    public static void main( String[] args )
    {
        chocolate chocy1=new chocolate(24,120,"silk");
        chocolate chocy2=new chocolate(18,55,"kacha");
        chocolate chocy3=new chocolate(13,30,"lollipop");
        chocolate chocy4=new chocolate(20,45,"5star");
        chocolate chocy5=new chocolate(19,10,"tuffle");
        chocolate choco = new chocolate();
        System.out.println("Enter the low and high ranges of chocolate's prices:");
        Scanner sc=new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("the weight of total chocolates is "+choco.totalweight());
        choco.sortchoco();
        hm.forEach((price,name) -> {
        	if(price >= l && price <= h) {
        		System.out.println("key: "+price+", Value: "+name);
        	}
        });
     }
}

