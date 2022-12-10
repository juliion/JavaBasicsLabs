public class SportsEquipment {
    private String name;
    private String kindOfSport;
    private String category;
    private int number;
    private double price;

    public SportsEquipment(String name, String kindOfSport, String category, int number, int price)
    {
        this.name = name;
        this.kindOfSport = kindOfSport;
        this.category = category;
        this.number = number;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public String getKindOfSport(){
        return kindOfSport;
    }
    public String getCategory(){
        return category;
    }
    public int getNumber(){
        return number;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Name:" + getName() + "\n"
                + "Kind of sport:" + getKindOfSport() + "\n"
                + "Category:" + getCategory() + "\n"
                + "Number:" + getNumber() + "\n"
                + "Price:" + getPrice() + "\n";
    }
}
