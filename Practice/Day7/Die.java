public class Die
{
    private int face;
    
    public Die(){
        face = 1;
    }
    
    public Die(int face){
        if(face >= 1 & face <=6){
            this.face = face;
        }
        else{
            face = 1;
        }
    }
    
    public int getFace(){
        return face;
    }
    
    public void setFace(int face){
        if(face >= 1 & face <= 6){
            this.face = face;
        }
        else{
            face = 1;
        }
    }
    
    public int roll(){
        int roll = (int)(Math.random() * 6 + 1);
        return roll;
    }
}