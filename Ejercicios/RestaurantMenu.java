package Wehymar.JavaFiles.Ejercicios;

public class RestaurantMenu {
	String menuname;
	int price;
	
	
	public  RestaurantMenu(String Menuname, int Price) {
		this.menuname = Menuname;
		this.price = Price;
		
	}


	public String getMenuname() {
		return menuname;
	}


	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "RestaurantMenu [menuname=" + menuname + ", price=" + price + "]\n";
	}
		
}

