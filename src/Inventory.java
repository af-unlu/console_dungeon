public class Inventory {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Inventory(){
        this.weapon = new Weapon("Empty2", 0, 0, 0);
    }
    
}
