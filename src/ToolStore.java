public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player,"Tool Store");
    }

    @Override
    boolean onLocation() {
        System.out.println("Welcome young warrior ! How can i help you?");
        System.out.println("Options :");
        System.out.println("1 : Buy Armor");
        System.out.println("2 : Buy Weapon");
        System.out.println("3 : Exit");
        System.out.print(":");
        int selectedOption = Location.input.nextInt();
        switch (selectedOption) {
            case 1:
                System.out.println("It will protect you !");
                break;
            case 2:
                System.out.println("Hunt them down !");
                SelectAWeapon();
                break;    
            case 3:
                System.out.println("As you wish young warrior !");
                break;    
            default:
                break;
        }
        System.out.println("See you again!");
        return true;
    }

    //Seperate buying,selecting and printing
    public void SelectAWeapon(){
        Weapon[] tempWeapons = Weapon.weapons();
        System.out.println("Your Weapon : "+ this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Your Current : "+ this.getPlayer().getMoney());
        System.out.println("---------Weapons-----------\n");
        System.out.println("ID  |   Name    | Damage | Price ");
        
        for (Weapon w : tempWeapons) {
        System.out.printf("\n%d   %-10s       %d       %d",w.getId(),w.getName(),w.getDamage(),w.getPrice());
        }
        System.out.printf("\n:");
        int selected = input.nextInt();
        if(selected>0 && selected<tempWeapons.length){
            System.out.println("Are you sure you want to buy a "+tempWeapons[selected-1].getName()+" ?");
            if(this.getPlayer().getMoney()>tempWeapons[selected-1].getPrice()){
                System.out.println("Its "+tempWeapons[selected-1].getPrice()+" !");
                this.getPlayer().setMoney(this.getPlayer().getMoney()-tempWeapons[selected-1].getPrice());
                this.getPlayer().getInventory().setWeapon(tempWeapons[selected-1]);
            }else{
                System.out.println("You dont have enough money for that one!");
            }
        }
        else{

        }

    }
    
}
