package Objects;

public class Menu {
    private String menu_name;
    private int price;


    public Menu(String menu_name, int price ){
        this.menu_name = menu_name;
        this.price     = price;
    }


    public String getMenu_name() {return menu_name;}
    public void setMenu_name(String menu_name ){this.menu_name = menu_name;}

    public int getPrice(){return price;}
    public void setPrice(int price){this.price = price;}

    @Override
    public String toString() {
        return "Menu:" +
                "{ Menu Name= " + menu_name + ", Price=" + price +"}\n";
    }
}
