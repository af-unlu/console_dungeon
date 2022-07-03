public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player,"Safe House");
    }
    
    @Override
    public boolean onLocation(){
        System.out.println("Safe House: Your HP is regenerating");
        return true;
    }
    
}
