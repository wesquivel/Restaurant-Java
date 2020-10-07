package Wehymar.JavaFiles.Ejercicios;

import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayList<RestaurantMenu> menus = new ArrayList<RestaurantMenu>();
		
		RestaurantMenu menu1 = new RestaurantMenu("Bandeja Paisa", 19000);
		RestaurantMenu menu2 = new RestaurantMenu("Sancocho Huilense", 17000);
		RestaurantMenu menu3 = new RestaurantMenu("Vegan Option", 25000);
		RestaurantMenu menu4 = new RestaurantMenu("Chuleta Vayuna", 22000);
		RestaurantMenu menu5 = new RestaurantMenu("Chuleta Vayuna", 22000);
		
		menus.add(menu1);
		menus.add(menu2);
		menus.add(menu3);
		menus.add(menu4);
		menus.add(menu5);
	
		//Call the Size method to get the elments number on the list
		int size = menus.size(); 
		System.out.println(" Number of Choices for today's Menu:" + " " + size  + "\n");// print the size of arrlist 
		System.out.println(menus);
	}

}
//sizes : para contar elementos de las listas

