//Room class for the linked lists in StillLost.
//Made by Michael Rollins. 5/10/2024
import java.util.*;//Randoms, among other things.

public class Room {
    int orient;//This might not matter either.
    Room prev;//Not sure that this matters.
    int ID;
    String look = new String();//Generate a breif description of each room.
    String exits = new String();
    boolean newRoom = true;
    Random rand = new Random();
    int odds;//Store the last used rand.

    Room n;//What room in in that direction?
    Room s;//Various pointers.
    Room e;
    Room w;

    public Room(){//Lore generator.
        ID = rand.nextInt(9000000) + 1000000;//The biggest number I can get. I don't remeber if I actually used this for anything. Full function TBD
        look = "You are in a";
        odds = rand.nextInt(10);
        switch (odds) {//adjective
            case 0:look = look + " dark"; break;
            case 1:look = look + " cold"; break;
            case 2:look = look + " barren"; break;
            case 3:look = look + " smelly"; break;
            case 4:look = look + " damp"; break;
            case 5:look = look + " bone-filled"; break;
            case 6:look = look + " rat-infested"; break;
            case 7:look = look + " dusty"; break;
            case 8:look = look + "n old"; break;
            case 9:look = look + " boring"; break;
            default://Unreachable code.
        }
        look= look + " room with ";
        odds = rand.nextInt(10);
        switch (odds) {//breif description.
            case 0:look = look + "a low ceiling."; break;
            case 1:look = look + "manacles on the walls."; break;
            case 2:look = look + "mold and mildew."; break;
            case 3:look = look + "noises echoing off the walls."; break;
            case 4:look = look + "rusty metal on the floor."; break;
            case 5:look = look + "a dirt floor."; break;
            case 6:look = look + "unreadable writting on the walls."; break;
            case 7:look = look + "pools of dirty water."; break;
            case 8:look = look + "a threadbare tapestry."; break;
            case 9:look = look + "some used candle stubs."; break;
            default://Unreachable code.
        }
    }

    public String exits() {//What directions are valid exits.
        exits = "";//Clear previous value.
        if (n!=null) {
            exits = exits + "There is an exit to the north. ";
        }
        if (s!=null) {
            exits = exits + "There is an exit to the south. ";
        }
        if (e!=null) {
            exits = exits + "There is an exit to the east. ";
        }
        if (w!=null) {
            exits = exits + "There is an exit to the west.";//This could get pretty long if there are four exits.
        }
        return exits;//Simple enough.
    }

    public void clear(){
        newRoom = false;//Simple.
    }

    public boolean enter(Room prev) {
        return newRoom;//Is this a new room?
    }

    public void addRoom(Room add, String direction){
        switch(direction) {
            case "n": n = add; break;//Convert a string to a pointer.
            case "s": s = add; break;
            case "e": e = add; break;
            case "w": w = add; break;
            default://No error message on this one, I don't know where I would do the error handling for it. I just won't work.
            //If the room your adding is a null, then connecting the other way will throw an error, so no need to throw another here.
        }
    }
}