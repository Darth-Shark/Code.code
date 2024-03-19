//Linked list class for CTE Software Development class 2024
//Much of code donated by Mr. Kim Gross
import java.util.*; //scanner class, converting String to int. Also exception handling.

class linkedList {

    Card data;
    bucket head;
    bucket tail = head;
    bucket active = head;
    bucket temp;
 

    public linkedList(){
        head=new bucket ();
        active=head;
        tail=head;
    };
    public void addBucket(Card data){
        temp=new bucket(data);
        tail.setTail(temp);
        tail=temp;
    };
    public Card getData(){
        return active.getData();
    };
    public boolean nextBucket(){
        if (active.next != null) {
            active=active.next;
            return true;
        } else return false;
    };
    public void selNext(){//select next bucket
        if (active.next != null) {
            active = active.next;
        }
    };
    public void selHead(){//select the head bucket
        active = head;
    };
    public void setData(Card data){
        active.setData(data);
    };

    public static void main(String[] args) {
        linkedList list = new linkedList();
        Scanner scan = new Scanner(System.in);
        String input = new String();
        int status = 1;

        System.out.println("Hello, lets stack a deck of cards!");
        while(status!=0) {
            if (status==1) {
                System.out.println("What action would you like to take next?");
                System.out.println("A: Add a new card.");
                System.out.println("B: Select the next card.");
                System.out.println("C: Readout selected card.");
                System.out.println("D: Modify Selected card.");
                System.out.println("E: End program and readout all cards.");
                while(true) {
                    input = scan.next();
                    input = input.trim();
                    input = input.toLowerCase();
                    if (input.equals("a")) {
                        status = 2;
                        break;
                    } else if (input.equals("b")) {
                        status = 3;
                        break;
                    } else if (input.equals("c")) {
                        status = 4;
                        break;
                    } else if (input.equals("d")) {
                        status = 5;
                        break;
                    } else if (input.equals("e")) {
                        status = 0;
                        break;
                    } else if (input.equals("break")) {
                        break;
                    } else if (input.equals("help")) {
                        System.out.println("*ahem*");
                        break;
                    } else {
                        System.out.println("Invalid action, Try 'help'");
                    }
                }
            } else if (status==2) {
                System.out.println("Creating new card.");
                Card card = new Card(1, "spades");
                while(true){
                    System.out.println("What action would you like to take next?");
                    System.out.println("A: Set card suit.");
                    System.out.println("B: Set card data.");
                    System.out.println("C: Add card to stack.");
                    input = scan.next();
                    input = input.trim();
                    input = input.toLowerCase();
                    if (input.equals("a")) {
                        System.out.println("Input suit: s/d/c/h");
                        while(true){
                            input = scan.next();
                            input = input.trim();
                            input = input.toLowerCase();
                            if (input.equals("s")||input.equals("spade")||input.equals("0")||input.equals("spades")) {
                                card.setSuit("spades");
                                System.out.println("Suit set.");
                                break;
                            } else if (input.equals("d")||input.equals("diamond")||input.equals("1")||input.equals("diamonds")) {
                                card.setSuit("diamonds");
                                System.out.println("Suit set.");
                                break;
                            } else if (input.equals("c")||input.equals("club")||input.equals("2")||input.equals("clubs")) {
                                card.setSuit("clubs");
                                System.out.println("Suit set.");
                                break;
                            } else if (input.equals("h")||input.equals("diamond")||input.equals("3")||input.equals("hearts")) {
                                card.setSuit("hearts");
                                System.out.println("Suit set.");
                                break;
                            } else if (input.equals("help")) {
                                System.out.println("Just pick a letter: s/d/c/h");
                            } else if (input.equals("break")) {
                                break;
                            } else {
                                System.out.println("Invalid action, Try 'help'");
                            }
                        }
                        System.out.println("What action would you like to take next?");
                    } else if (input.equals("b")) {
                        System.out.println("Input value: 1, 2, 3, ... 12, or 13.");
                        while(true){
                            input = scan.next();
                            input = input.trim();
                            input = input.toLowerCase();
                            try {
                                int i = Integer.parseInt(input);
                                if (i<=14) {
                                    card.setValue(i);
                                    System.out.println("Value set.");
                                    break;
                                } else {
                                    System.out.println("Pick a number from 1 to 13.");
                                }
                            } catch (InputMismatchException e) {
                                if (input.equals("help")) {
                                    System.out.println("Pick a number from 1 to 13.");
                                    System.out.println("2 is an ace, 2 is a two, etc.");
                                    System.out.println("11 is a jack, 12 is a queen, 13 is a king.");
                                } else if (input.equals("break")) {
                                    break;
                                } else {
                                    System.out.println("Invalid action, Try 'help'");
                                }
                            }
                        }
                    } else if (input.equals("c")) {
                        System.out.println("Card set: " + card.name());
                        break;
                    } else if (input.equals("break")) {
                        break;
                    } else if (input.equals("help")) {
                        System.out.println("A: Set card suit.");
                        System.out.println("B: Set card data.");
                        System.out.println("C: Add card to stack.");
                    } else {
                        System.out.println("Invalid action, Try 'help'");
                    }
                }
                list.addBucket(card);
                status = 1;
            } else if (status==3) {
                if (list.nextBucket()) {
                    list.active = list.active.next;
                } else {
                    System.out.println("You have reached the last card in the list, returning to the first card.");
                    list.active = list.head;
                }
                status = 1;
            } else if (status==4) {
                if (list.active!=null) {
                    Card card = list.active.getData();
                    if (card!=null) {
                        System.out.println("Currently selected card: " + card.name());
                    } else {
                        System.out.println("Active card has no data.");
                    }
                } else {
                    System.out.println("Null");
                }
                status = 1;
            } else if (status==5) {
                if (list.active!=null) {
                    if (list.active.data!=null) {} else {
                        list.active.data = new Card(1, "spades");
                    }
                } else {
                    list.active.data = new Card(1, "spades");
                }
                while(true){
                    System.out.println("What action would you like to take next?");
                    System.out.println("A: Set card suit.");
                    System.out.println("B: Set card data.");
                    System.out.println("C: Return card to stack.");
                    input = scan.next();
                    input = input.trim();
                    input = input.toLowerCase();
                    if (input.equals("a")) {
                        System.out.println("Input suit: s/d/c/h");
                        while(true){
                            input = scan.next();
                            input = input.trim();
                            input = input.toLowerCase();
                            if (input.equals("s")||input.equals("spade")||input.equals("0")||input.equals("spades")) {
                                list.active.data.setSuit("spades");
                                System.out.println("Suit set.");
                                break;
                            } else if (input.equals("d")||input.equals("diamond")||input.equals("1")||input.equals("diamonds")) {
                                list.active.data.setSuit("diamonds");
                                System.out.println("Suit set.");
                                break;
                            } else if (input.equals("c")||input.equals("club")||input.equals("2")||input.equals("clubs")) {
                                list.active.data.setSuit("clubs");
                                System.out.println("Suit set.");
                                break;
                            } else if (input.equals("h")||input.equals("diamond")||input.equals("3")||input.equals("hearts")) {
                                list.active.data.setSuit("hearts");
                                System.out.println("Suit set.");
                                break;
                            } else if (input.equals("help")) {
                                System.out.println("Just pick a letter: s/d/c/h");
                            } else if (input.equals("break")) {
                                break;
                            } else {
                                System.out.println("Invalid action, Try 'help'");
                            }
                        }
                        System.out.println("What action would you like to take next?");
                    } else if (input.equals("b")) {
                        System.out.println("Input value: 1, 2, 3, ... 12, or 13.");
                        while(true){
                            input = scan.next();
                            input = input.trim();
                            input = input.toLowerCase();
                            try {
                                int i = Integer.parseInt(input);
                                if (i<=14) {
                                    list.active.data.setValue(i);
                                    System.out.println("Value set.");
                                    break;
                                } else {
                                    System.out.println("Pick a number from 1 to 13.");
                                }
                            } catch (InputMismatchException e) {
                                if (input.equals("help")) {
                                    System.out.println("Pick a number from 1 to 13.");
                                    System.out.println("2 is an ace, 2 is a two, etc.");
                                    System.out.println("11 is a jack, 12 is a queen, 13 is a king.");
                                } else if (input.equals("break")) {
                                    break;
                                } else {
                                    System.out.println("Invalid action, Try 'help'");
                                }
                            }
                        }
                    } else if (input.equals("c")) {
                        System.out.println("New card created: " + list.active.data.name());
                        break;
                    } else if (input.equals("break")) {
                        break;
                    } else if (input.equals("help")) {
                        System.out.println("A: Set card suit.");
                        System.out.println("B: Set card data.");
                        System.out.println("C: Add card to stack.");
                    } else {
                        System.out.println("Invalid action, Try 'help'");
                    }
                }
                status = 1;
            }
        }
        list.active = list.head;
        while (true) {
            if (list.active!=null) {
                Card card = list.active.getData();
                if (card!=null) {
                    System.out.println(card.name());
                } else {
                    System.out.println("Null");
                }
            } else {
                System.out.println("Null");
            }

            if (list.nextBucket()) {
                list.active = list.active.next;
            } else {
                break;
            }
        }

        scan.close();//Closing some source leaks.
        input = input.trim();
        list.selNext();
        System.out.println();
        System.out.println("Have a nice day.");
    }
}