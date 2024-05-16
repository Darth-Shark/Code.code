//katelynn.graham@malad.us
//G-crafts code
//By Katelynn Graham
//For Software Developement 11B
//Semester 2 Final Project
//For Kim Gross

//Creating my imports
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//The class main gamestatusmanager
public class GameStatusManager {
    //creating a function fo save the game from the GameState file
    public void saveGame(GameState GameState) {
    try (FileOutputStream fileOut = new FileOutputStream("gamestate.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
        out.writeObject(GameState);
        System.out.println("Game state saved successfully!");

        //catching an io exception
    } catch (IOException e) {
        e.printStackTrace();
    }

}

//Creating a load feature for the game
public GameState loadGame() {
    try (FileInputStream fileIn = new FileInputStream("gamestate.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn)) {
        return (GameState) in.readObject();


        
//catching an io exception and classnotfound exception
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        return null;
    }
}

}
