package NIM;

public class Player
{
    private int wins;
    private int losses;
    private String name;
    private boolean myTurn; //if players turn, true, false otherwise
    private boolean winner; //true = user wins, false otherwise

    public Player(int w, int l, String n){
        this.wins = w;
        this.losses = l;
        this.name = n;
    }
    
    public int getWins(){
        return wins;
    }
    
    public int getLosses(){
        return losses;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean getMyTurn(){
        return myTurn;
    }
    
    public boolean getWinner(){
        return winner;
    }
    
    public void setWins(int newWins){
        this.wins = newWins;
    }
    
    public void setLosses(int newLosses){
        this.losses = newLosses;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setMyTurn(boolean newMyTurn){
        this.myTurn = newMyTurn;
    }
    
    public void setWinner(boolean newWinner){
        this.winner = newWinner;
    }
    
    public void win(){
        winner = true;
        wins += 1;
    }
    
    public void lose(){
        winner = false;
        losses += 1;
    }
}
