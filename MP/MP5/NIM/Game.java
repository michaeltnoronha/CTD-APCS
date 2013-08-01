package NIM;
import java.util.*;

public class Game
{
    private int stones;
    private Player player1;
    private Player player2;

    public Game(int s, Player p1, Player p2){
        this.stones = s;
        this.player1 = p1;
        this.player2 = p2;
    }

    public int getStones(){
        return stones;
    }

    public Player getPlayer1(){
        return player1;
    }

    public Player getPlayer2(){
        return player2;
    }

    public void setStones(int stones){
        this.stones = stones;
    }

    public void setPlayer1(Player player1){
        this.player1 = player1;
    }

    public void setPlayer2(Player player2){
        this.player2 = player2;
    }

    public void randomizeTurn(){
        int randomTurn = (int)(Math.random()*2+1);

        if(randomTurn == 1){
            player1.setMyTurn(true);
        }
        else{
            player1.setMyTurn(false);
        }
    }

    public void randomizeStones(){
        stones = (int)(Math.random()*11+20);
    }

    public void reset(){
        randomizeTurn();
        randomizeStones();
        player1.setWinner(false);
        player2.setWinner(false);
    }

    public void drawUserStones(){
        Scanner keys = new Scanner(System.in);

        System.out.printf("There are %d stones. How many do you want? ", stones);

        int userStones = keys.nextInt();

        if(validEntry(userStones)){
            stones = stones - userStones;
        }
    }

    public void drawComputerStones(){
        int removestones;
        do{
            removestones = (int)(Math.random()*3+1);
        }while(!validEntry(removestones));

        if(validEntry(removestones)){
            System.out.printf("There are %d stones. \nThe computer takes %d stones.\n",stones,removestones);
            stones = stones - removestones;
        }
    }

    public boolean validEntry(int num){
        if(num > stones){
            return false;
        }
        else if(num <= 3 & num >= 0){
            return true;
        }

        else{
            return false;
        }
    }

    public boolean gameOver(){
        if(player1.getWinner()){
            return true;
        }
        else if(player2.getWinner()){
            return true;
        }
        else{
            return false;
        }
    }
}