import javax.swing.JOptionPane;

public class inputs
{
    public static void main(){
        String name = JOptionPane.showInputDialog("What is your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        
        if(age > 15){
            System.out.println("You can drive");
        }
        else{
            System.out.println("Join XC");
        }
    }
}