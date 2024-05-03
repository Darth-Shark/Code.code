import java.util.*;//Randoms, among other things.

public class StillLost {
    Room prev;
    Room here;
    Room newRoom;

    public boolean nextRoom(Room next){
        if (next!=null) {
            prev = here;
            here = next;
            next.enter(prev);
            return true;
        }
        return false;
    }

    public boolean connect(Room first, Room second, String direction) {
        if (first!=null && second != null) {
            switch (direction) {//Relative direction of movement from first room to second.
                case "n": first.addRoom(second, "n"); second.addRoom(first, "s"); break;
                case "s": first.addRoom(second, "s"); second.addRoom(first, "n"); break;
                case "e": first.addRoom(second, "e"); second.addRoom(first, "w"); break;
                case "w": first.addRoom(second, "w"); second.addRoom(first, "e"); break;
                default: return false;
            }
            return true;
        }
        return false;
    }

    public Room move(String direction){
        Room next = null;
        switch (direction) {
            case "n": next = here.n; break;
            case "s": next = here.s; break;
            case "e": next = here.e; break;
            case "w": next = here.w; break;            
            default:
            return null;
        }
        return next;
    }

    public String invert(String direction) {
        switch (direction) {
            case "n": direction = "s"; break;
            case "s": direction = "n"; break;
            case "e": direction = "w"; break;
            case "w": direction = "e"; break;            
            default:
            return null;
        }
        return direction;
    }

    public Room newRoom(){
        Room newRoom = new Room();
        return newRoom;
    }

    public static void main(String[] args) {
    Random rand = new Random();
    rand.nextInt(50);
    }
}
