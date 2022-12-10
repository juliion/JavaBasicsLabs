import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        SportsEquipment equipment1 = new SportsEquipment("Skipping rope with a calorie counter",
                "Fitness", "Jump ropes", 7, 345);
        SportsEquipment equipment2 = new SportsEquipment("Collapsible hoop",
                "Fitness", "Hoops", 5, 690);
        SportsEquipment equipment3 = new SportsEquipment("Ball Mikasa MVA ",
                "Volleyball", "Balls", 20, 540);
        SportsEquipment equipment4 = new SportsEquipment("Ball Barcelona",
                "Football", "Balls", 9, 490);
        SportsEquipment equipment5 = new SportsEquipment("Ball Wilson №7 PU AllStar",
                "Basketball", "Balls", 2, 820);

        SportsEquipment[] equipments = { equipment1, equipment2, equipment3, equipment4, equipment5 };
        System.out.println("\n- Sports equipments:");
        System.out.println("  ==================");
        DisplayArray(equipments);

        Arrays.sort(equipments, Comparator.comparing(SportsEquipment::getNumber));

        System.out.println("\n- Sports equipments sort by increasing number:");
        System.out.println("  =================================");
        DisplayArray(equipments);

        Arrays.sort(equipments, Comparator.comparingDouble(SportsEquipment::getPrice).reversed());

        System.out.println("\n- Sports equipments sort by descending price:");
        System.out.println("  ===========================================");
        DisplayArray(equipments);

    }
    public static void DisplayArray(SportsEquipment[] equipments) {
        for (int i = 0; i < equipments.length; i++) {
            System.out.print(equipments[i]);
            System.out.println("--------------------------------");
        }
    }
}