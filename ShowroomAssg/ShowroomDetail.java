package assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ShowroomDetail {
	public static void main(String[] args){
	CarDetail c1 = new CarDetail("Maruti Suzuki", "yellow", "Baleno", 4);
	CarDetail c2 = new CarDetail("Hyundai", "blue", "i20", 5);
	CarDetail c3 = new CarDetail("Maruti Suzuki", "white", "S-Cross", 2);
	
	CarDetail c4 = new CarDetail("Audi", "white", "A011", 4);
	CarDetail c5 = new CarDetail("Maruti Suzuki", "black", "Baleno", 3);
	CarDetail c6 = new CarDetail("Hyundai", "black", "Creta", 2);
	
	ArrayList<CarDetail> showroom1 = new ArrayList<>();
	showroom1.add(c1);
	showroom1.add(c2);
	showroom1.add(c3);
	
	ArrayList<CarDetail> showroom2 = new ArrayList<>();
	showroom2.add(c4);
	showroom2.add(c5);
	showroom2.add(c6);
	
	
	HashMap<Integer, Showroom> showroom=new HashMap<>();
	
	Showroom s1 = new Showroom("Showroom1", 001, showroom1);
	Showroom s2 = new Showroom("Showroom2", 002, showroom2);
	showroom.put(s1.getId(), s1);
	showroom.put(s2.getId(), s2);
	

	Set<Integer> keys=showroom.keySet();
	Iterator<Integer> itr=keys.iterator();
	while(itr.hasNext())
	{
	System.out.println(showroom.get(itr.next()));

	}

}
}
