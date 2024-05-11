//Maze class made by Michael Rollins for CTE Software Developement.
//Instructor Kim Gross, 5/10/2024
//I want to expand this game heavily in a future assignment.
import java.util.*;//Randoms, among other things.

public class StillLost {
    Room prev;//Initializing things.
    Room here = new Room();
    Room newRoom;//I don't want to store to many variables in the object, because there are more akward to access.
    Random rand = new Random();

    public StillLost() {
        while (this.explore(here)==false) {
            System.out.println("Build failed, new attempt...");
        }
    }

    public boolean nextRoom(Room next){//Move to next room.
        if (next!=null) {
            prev = here;//The current room becomes the last room.
            here = next;//The next room becomes the current room.
            next.enter(prev); //Storing the previous room in a potentially convinient location.
            return true;
        }
        return false;//Unlikely to matter.
    }

    public boolean explore(Room room) {//A lot of loops and ifs.
        int i;//Consistent odds.
        if (room.newRoom) {i=2;} else {i=10;}//If this room has been explored before, you probably won't find anything new, but you might.

        if (room.n==null) {
            if (this.rand.nextInt(i)==1) {//Is a 50% chance too high? A 10% seems reasonable for multple tries.
                newRoom = new Room();
                room.addRoom(newRoom, "n");//Link in both directions.
                newRoom.addRoom(room, "s");//Should I make this its own function? I don't think that would actually be efficient 
            }
        }
        if (room.s==null) {//again.
            if (this.rand.nextInt(i)==1) {
                newRoom = new Room();
                room.addRoom(newRoom, "s");
                newRoom.addRoom(room, "n");
            }
        }
        if (room.e==null) {//ditto.
            if (this.rand.nextInt(i)==1) {
                newRoom = new Room();
                room.addRoom(newRoom, "e");
                newRoom.addRoom(room, "w");
            }
        }
        if (room.w==null) {//uno mas.
            if (this.rand.nextInt(i)==1) {
                newRoom = new Room();
                room.addRoom(newRoom, "w");
                newRoom.addRoom(room, "e");
            }

        }
        if (room.n==null && room.s==null && room.e==null && room.w==null) {//I can think of any other scenario in which something has gone wrong.
            return false;//If there is nowhere to go.
        } 
        else {
            room.clear();//This room has been explored successfully.
            return true;//Success!
        }
    }

    public boolean connect(Room first, Room second, String direction) {//It's not hard to put two rooms together.
        if (first!=null || second != null) {
            switch (direction) {//Relative direction of movement from first room to second.
                case "n": first.addRoom(second, "n"); second.addRoom(first, "s"); break;
                case "s": first.addRoom(second, "s"); second.addRoom(first, "n"); break;
                case "e": first.addRoom(second, "e"); second.addRoom(first, "w"); break;
                case "w": first.addRoom(second, "w"); second.addRoom(first, "e"); break;
                default: return false;//If you input a wierd direction.
            }
            return true;//It worked!
        }
        return false;//Not sure if this matters. It's covered by the default above. Just in case.
    }

    public Room move(String direction){//Move in a direction.
        Room next = null;//Clear this item, it will be needed below.
        switch (direction) {
            case "n": next = here.n; break;//Straightforward.
            case "s": next = here.s; break;
            case "e": next = here.e; break;
            case "w": next = here.w; break;            
            default:
            return null;//There is no room in that direction.
        }
        if (next==null) {//This might happen.
            return null;//Basically being used as a break;
        } else if (next.newRoom==true){
            while(true) {
                if (this.explore(next)==true) {break;}//I guess there are other places I could put this.
            }
        }
        return next;
    }

    public Room move(Room destination) {//Move to a known location. Probably the previous room.
        Room next = destination;//Easy. I could probably skip this step if I replace 'destination' with 'next' above.
        if (next==null){
            next = new Room();//If that room dosent exist. Basically an error message.
        }
        if (next.newRoom==true){
            while(true) {
                if (this.explore(next)==true) {break;}//Simple enough, this will repeat if the result had no adjecent rooms the first time.
            }
        } // else {} //Anouther superflous else.
        return next;
    }

    public String invert(String direction) {//This will only matter for computing user input.
        switch (direction) {
            case "n": direction = "s"; break;
            case "s": direction = "n"; break;
            case "e": direction = "w"; break;
            case "w": direction = "e"; break;
            default: return null;//Error message.
        }
        return direction;
    }

    public Room newRoom(){//Make a new room function.
        Room newRoom = new Room();
        return newRoom;//Straightforward.
    }

    public String simplify(String in){//simplify the user's input in one easy function!
        in = in.toLowerCase();//I DOnt kNow whY THiS wOUlD bE usEFul.
        in = in.trim();//            definatly useful          
        if (in.equals("west")||in.equals("w")||in.equals("go west")||in.equals("go w")) {//the line 'in.equals("w"' is unnecesary because the input will get changed to itself if true.
            in="w";
        } else if (in.equals("east")||in.equals("e")||in.equals("go east")||in.equals("go e")) {//Above for east.
            in="e";
        } else if (in.equals("north")||in.equals("n")||in.equals("go north")||in.equals("go n")) {//Above for north.
            in="n";
        } else if (in.equals("south")||in.equals("s")||in.equals("go south")||in.equals("go s")) {//Above for south.
            in="s";
        } else if (in.equals("previous")||in.equals("prev")||in.equals("back")||in.equals("go back")||in.equals("return")) {//The obvious possibilities.
            in="prev";
        } else if (in.equals("look")||in.equals("see")||in.equals("explore")||in.equals("search")) {//Same here.
            in="look";
        } else if (in.equals("exit")||in.equals("stop")||in.equals("halt")||in.equals("off")||in.equals("done")||in.equals("out")) {//access standby.
            in="exit";
        } else if (in.equals("help")||in.equals("halp")||in.equals("wat")||in.equals("what")||in.equals("?")||in.equals("help!")||in.equals("please help")||in.equals("pls help")||in.equals("help me")||in.equals("what?")||in.equals("hlp")) {
            //I doubt most of these will matter, but if a user is inputting random words and hits one of these, it will be worth it.
            in="help";
        }
        return in;
    }

    public void see() {
        System.out.println(here.look);//Return the current room's description.
            if (here.exits()!=null) {//Are there exits?
                System.out.println(here.exits);//Return extits.
            } else {
                System.out.println("There are no exits, somehow. You should look for one if you have claustrophobia.");
            }
    }

    public static void main(String[] args) {//Let the show begin!
        StillLost maze = new StillLost();
        Scanner scan = new Scanner(System.in);//Important things.
        String in = new String();
        maze.see();

        while (true) {//Inifinite loop.
            System.out.println();
            in = scan.nextLine();//Get next user input.
            in = maze.simplify(in);//Make it legible.
            System.out.println();

            if (in.equals("w")||in.equals("e")||in.equals("n")||in.equals("s")) {//If the input was a movement command.
                if (maze.move(in)==null) {//If there is no room in that direction.
                    System.out.println("There is no room in that direction.");//That's what I just said!
                } else {//If there is a room, then go there.
                    maze.nextRoom(maze.move(in));
                    maze.see();
                }
            } else if (in.equals("look")) {//If the user wants to look around. Prevents softlocks.
                maze.explore(maze.here);//I am glad that explore dosen't use this.here by default. That was a good choice to make.
                maze.see();
            } else if (in.equals("prev")) {//Go back. I could merge this with cardinal movement ig
                if (maze.move(maze.prev)==null) {//I will make this return different information to the user.
                    System.out.println("You can't go back.");
                } else {//This section is copy-pasted from above.
                    maze.nextRoom(maze.move(in));
                    maze.see();
                }
            } else if (in.equals("exit")) {//If the user dosen't want to play anymore.
                System.out.println("Thanks for playing my game!");
                break;//Exit the loop.
            } else if (in.equals("help")) {//Because you deserve an explanation.
                System.out.println("Valid commands include but are not limited to; help, north, south, east, west, look, previous, exit, etc.");//There is an easter egg on this line.
                System.out.println("Many commands may be shortened; w instead of west, prev instead of previous.");
            } else if (in.equals("id")) {
                System.out.println(maze.here.ID);//debug purposes
            } else {//I decieded to lump all the easter eggs together.
                if (in.equals("etc.")) {
                    System.out.println("I didn't mean that literally!");
                } else if (in.equals("dennis")) {
                    System.out.println("You are a cultured user, I see.");
                    if (maze.move("w")==null) {
                        System.out.println("There is no room in that direction.");
                    } else {
                        maze.nextRoom(maze.move(in));
                    }
                } else if (in.equals("get ye flask")) {
                    System.out.println("you can't get ye flask");
                } else if (in.equals("who's on first")) {
                    System.out.println("I'm asking you who's on first!");
                } else if (in.equals("what's on second")) {
                    System.out.println("I don't know.");
                } else if (in.equals("third base")) {
                    System.out.println("There we go, back on third again!");
                } else if (in.equals("dark")) {
                    System.out.println("Fortunatly, gue's don't exist in this universe.");
                } else if (in.equals("dinnerbone")){
                    System.out.println("Flip your monitor upside down.");
                } else if (in.equals("debug")) {
                    System.out.println("Calling pest control.");
                } else {
                    System.out.println("I don't know that");//Error message.
                }
            }//If you know, you know.
            //Lets do it again!
        }
        scan.close();//Closing resource leaks.
        System.out.println("Your last words were " + in);//Probably useful for error handling.
        System.out.println("Goodbye.");
    }
}
