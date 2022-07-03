import java.util.Scanner;
public class Player {
    //enkapsüle etmek
    private int damage;

    private int health;
    private int money;
    private String name;
    private String charName;

    private Scanner input = new Scanner(System.in);

    Player(String name){
        this.name = name;
    }
    public void SelectChar(){
        //polymorphism
        GameChar[] gameChars = {new Samurai(),new Archer(),new Knight()};
        System.out.println("Choose a Character");
        for (GameChar gameChar : gameChars) {
            System.out.printf("\n%s",gameChar.getName());
        }
        System.out.print("\n:");
        int selectedChar = input.nextInt();
        
        if(selectedChar>0 && selectedChar<=gameChars.length){
            initPlayer(gameChars[selectedChar-1]);
        }
        else{
            //default samurai
            initPlayer(gameChars[0]);
        }
    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    //#region getter setter
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCharName() {
        return charName;
    }
    public void setCharName(String charName) {
        this.charName = charName;
    }
    //#endregion
}
