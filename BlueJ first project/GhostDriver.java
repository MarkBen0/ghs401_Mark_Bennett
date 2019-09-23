
public class GhostDriver
{
    public static void main(){
        
        Ghost g4 = new Ghost("blue", 99, 100);
        System.out.println(g4.toString());
        g4.bumpSpeed(17);
        System.out.println(g4.toString());
        g4.bumpSpeed(); //+1speed
        System.out.println(g4.toString());
        g4.doubleColor();
        System.out.println(g4.toString());
    }
}
