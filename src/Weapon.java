public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Weapon(String name, int id, int damage, int price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }
    public static Weapon[] weapons(){
        Weapon[] weaponList = new Weapon[3];
        int i=0;
        weaponList[i++]= new Weapon("Hand Gun", 1, 10, 10);
        weaponList[i++]= new Weapon("Sword", 2, 20, 20);
        weaponList[i++]= new Weapon("Rifle", 3, 20, 30);
        return weaponList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
