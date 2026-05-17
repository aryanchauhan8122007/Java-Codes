class MilitaryPerson {

    String name;
    String rank;
    int yearsOfService;

    MilitaryPerson(String name, String rank, int yearsOfService) {
        this.name = name;
        this.rank = rank;
        this.yearsOfService = yearsOfService;
    }

    void salute() {
        System.out.println(rank + " " + name + " salutes! 🫡");
    }

    void showService() {
        System.out.println(name + " has served for " + yearsOfService + " years 🎖️");
    }
}

class ArmySoldier extends MilitaryPerson {

    String battalion;

    ArmySoldier(String name, String rank, int years, String battalion) {
        super(name, rank, years);
        this.battalion = battalion;
    }

    void marchForward() {
        System.out.println(name + " from " + battalion + " battalion is marching forward! 🪖");
    }
}

class NavyOfficer extends MilitaryPerson {

    String shipName;

    NavyOfficer(String name, String rank, int years, String shipName) {
        super(name, rank, years);
        this.shipName = shipName;
    }

    void sailShip() {
        System.out.println(name + " is sailing ship " + shipName + "! ⚓");
    }
}

public class MilitaryRank {
    public static void main(String[] args) {

        ArmySoldier soldier = new ArmySoldier("Arjun", "Captain", 8, "Alpha");
        soldier.salute();
        soldier.showService();
        soldier.marchForward();

        System.out.println("----------");

        NavyOfficer officer = new NavyOfficer("Vikram", "Commander", 12, "INS Vikrant");
        officer.salute();
        officer.showService();
        officer.sailShip();
    }
}
