package NIM;

import java.util.Scanner;
public class NimDriver{
    public static void main(String [] args){
        Scanner keys = new Scanner(System.in);
        String name1, name2,goAgain;
        Player p1, p2;
        int num;

        System.out.print("Enter your name: ");
        name1 = keys.next();
        System.out.print("Enter the computer's name: ");
        name2 = keys.next();
        p1 = new Player(0,0,name1);
        p2 = new Player(0,0,name2);
        Game g = new Game(10, p1, p2);
        do{
            g.reset();
            while(!g.gameOver()){
                if(p1.getMyTurn()){
                    g.drawUserStones();
                    if(g.getStones() == 0){
                        p1.lose();
                        p2.win();
                    }
                    p1.setMyTurn(false);
                    p2.setMyTurn(true);
                }
                else{
                    g.drawComputerStones();
                    if(g.getStones() == 0){
                        p1.win();
                        p2.lose();
                    }
                    p1.setMyTurn(true);
                    p2.setMyTurn(false);
                }
            }
            if(p1.getWinner())
                System.out.println("You win!");
            else
                System.out.println("The computer beat you!");
            System.out.print("Want to play again(y/n)? ");
            goAgain = keys.next();
        }while(goAgain.equalsIgnoreCase("y"));
        //You will be making some changes here
    }
}

