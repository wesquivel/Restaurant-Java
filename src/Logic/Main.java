package Logic;

import Objects.Menu;

import java.util.ArrayList;

public class Main {

    public final static String restaurantName = "Andre´s restaurant";

    public static void main(String[] args){

        ArrayList<Menu> menus = new ArrayList<Menu>();

        Menu menu1 = new Menu("Bandeja Paisa", 15000);
        Menu menu2 = new Menu("Ajiaco", 12000);
        Menu menu3 = new Menu("Bandeja con Carne", 18000);
        Menu menu4 = new Menu("Bandeja con Pezcado", 20000);
        Menu menu5 = new Menu("Bandeja con Lechona", 25000);

        menus.add(menu1);
        menus.add(menu2);
        menus.add(menu3);
        menus.add(menu4);
        menus.add(menu5);

        System.out.println(menus);
        System.out.println("                                    ");
        System.out.println("My Restaurant has:" + " " + menus.size()+ " " + "Menus");
        System.out.println("                                    ");
        /* The next Line change the menu in Third position by the Vegan menu */
        menus.set(2, new Menu("Bandeja Vegana", 40000));
        System.out.println("The New Menu List:");
        System.out.println("------------------");
        System.out.println(menus);
    }
}
