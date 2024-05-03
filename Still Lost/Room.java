import java.util.*;//Randoms, among other things.

public class Room {
    int orient;
    Room prev;
    int ID;
    Random rand = new Random();

    Room n;
    Room s;
    Room e;
    Room w;

    public Room(){
        ID = rand.nextInt(999999999);
    }

    public void enter(Room prev) {

    }

    public void addRoom(Room add, String direction){
        switch(direction) {
            case "n": n = add; break;
            case "s": s = add; break;
            case "e": e = add; break;
            case "w": w = add; break;
            default:
        }
    }
}
