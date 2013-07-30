
public class Q10OutputTest{
    public static void main(String [] args){
        Cube x = new Cube(5);
        x.setEdge(-3);
        x.setEdge(x.getEdge() + 2));
        System.out.println(x.volume());
    }
}

public class Cube{
    private int edge;
    public Cube(){
        edge = 1;
    }

    public Cube(int x){
        edge = x;
    }

    public int getEdge(){ return edge; }

    public void setEdge(int x){
        if(x > 0)
            edge = x;
    }

    public int volume(){
        return edge*edge*edge;
    }
}

