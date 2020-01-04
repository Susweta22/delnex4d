package assignment2;

import java.util.ArrayList;

public class Showroom {
		String Showname;
		int Id;
		ArrayList<CarDetail> cars;
		public String getShowname() {
			return Showname;
		}
		public void setShowname(String showname) {
			Showname = showname;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public ArrayList<CarDetail> getCars() {
			return cars;
		}
		public void setCars(ArrayList<CarDetail> cars) {
			this.cars = cars;
		}
		public Showroom(String Showname,int Id,ArrayList<CarDetail> cars ) {
			super();
			this.cars = cars;
			this.Id = Id;
			this.Showname = Showname;
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Showroom [Showname=" + Showname + ", Id=" + Id + ", cars=" + cars + "]";
		}
		
	

}
