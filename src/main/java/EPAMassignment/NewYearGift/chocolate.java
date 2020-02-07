package EPAMassignment.NewYearGift;

import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;

public class chocolate extends App {
	
	public chocolate(int weight,int price,String name) {
		ar.add(weight);
		hm.put(price,name);
	}
	public chocolate() {	
	////
	}
	static int wgt=0;
	public static int totalweight() {
		for(int i=0;i<ar.size();i++) {
			wgt=wgt+ar.get(i);
		}
		return wgt;
	}
	public static void sortchoco() {
		TreeMap< Integer, String>sorted=new TreeMap<Integer,String>();
		sorted.putAll(hm);
	}
}
