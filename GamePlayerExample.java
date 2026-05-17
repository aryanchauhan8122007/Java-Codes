class GamePlayer {

    String playerName;
    int level;

    GamePlayer(String playerName, int level) {
        this.playerName = playerName;
        this.level = level;
    }

    void login() {
        System.out.println(playerName + " logged in at Level " + level + " 🎮");
    }

    void logout() {
        System.out.println(playerName + " logged out 👋");
    }
}

class WarriorPlayer extends GamePlayer {

    String weapon;

    WarriorPlayer(String playerName, int level, String weapon) {
        super(playerName, level);
        this.weapon = weapon;
    }

    void attack() {
        System.out.println(playerName + " attacks with " + weapon + " ⚔️");
    }
}

class MagicPlayer extends GamePlayer {

    String spell;

    MagicPlayer(String playerName, int level, String spell) {
        super(playerName, level);
        this.spell = spell;
    }

    void castSpell() {
        System.out.println(playerName + " casts " + spell + " spell! ✨");
    }
}

public class GamePlayerExample {
    public static void main(String[] args) {

        WarriorPlayer w = new WarriorPlayer("Thor", 10, "Sword");
        w.login();
        w.attack();
        w.logout();

        System.out.println("----------");

        MagicPlayer m = new MagicPlayer("Merlin", 15, "Fireball");
        m.login();
        m.castSpell();
        m.logout();
    }
}
