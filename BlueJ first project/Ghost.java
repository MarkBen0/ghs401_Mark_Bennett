
public class Ghost
{
    //instance variables for the class Ghost
    private String color;
    private int speed;
    private int level;
    //zero-argument construct, basically makes a defalt Ghost
    public Ghost(){
        color = null;
        speed = 0;
        level = 0;
    }
    //2-argument constructor, can set the instance varibles to anytheing desired
    public Ghost(String color, int speed, int level){
        this.color = color;
        this.speed = speed;
        this.level = level;
    }
    
    public void bumpSpeed(){
        this.speed++;
    }
    
    public void bumpSpeed(int bump){
        this.speed+=bump;
    }
    
    public void doubleColor(){
        this.color = this.color +" "+ this.color;
    }
    //public meand other classes have access to this methpod
    //string is the return-type of this method, it gives back a String
    //toString is the name of this method
    public String toString(){
        return"Color: " + this.color + ", Speed: " + this.speed + ", Level: " + this.level ;
    }
}
