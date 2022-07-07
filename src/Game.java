
import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Welcome to Console Dungeon !");
        System.out.println("What is your name young human?");
        System.out.print("-> :");
        //Player player = new Player(input.nextLine());
        Player player = new Player("Michael");
        System.out.printf("Good Luck %s !\n",player.getName());
        player.SelectChar();
        
        Location location = null;
        boolean gameLoop = true;
        while(gameLoop){
            System.out.println("Player Damage "+player.getDamage());;
            System.out.println("Where do you want to go ?");
            System.out.println("1 - Safe House");
            System.out.println("2 - Tool Store");
            System.out.print("->: ");
            int selectedLoc = input.nextInt();
            switch (selectedLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);        
                    break;
                default:
                    location = new SafeHouse(player);
                    break;
            }
            if(!location.onLocation()){
                System.out.println("Game Over ...");
                gameLoop = false;
                break;
            }
        }
        
    }
}
