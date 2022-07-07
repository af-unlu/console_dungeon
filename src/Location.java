import java.util.Scanner;

import javafx.scene.transform.Scale;

public abstract class Location {
    private Player player;
    public String name;

    public static Scanner input = new Scanner(System.in);

    abstract boolean onLocation();

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    } 
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
}
