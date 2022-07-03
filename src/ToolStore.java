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
        int selectedOption = input.nextInt();
        switch (selectedOption) {
            case 1:
                System.out.println("It will protect you !");
                break;
            case 2:
                System.out.println("Penetrate their hearts !");
                break;    
            case 3:
                System.out.println("As you wish young warrior !");
                break;    
            default:
                break;
        }
        return true;
    }
    
}
