import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Welcome to Console Dungeon !");
        System.out.println("What is your name young human?");
        System.out.print("-> :");
        //Player player = new Player(input.nextLine());
        Player player = new Player("Michael");
        System.out.printf("Good Luck %s !!",player.getName());
        player.SelectChar();
        System.out.println(player.getCharName());
        
    }
}
