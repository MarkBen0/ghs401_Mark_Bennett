import javax.swing.JOptionPane;


public class Quizreview
{
    
    public static void main(){
        
        double hoursSleep = Double.parseDouble(JOptionPane.showInputDialog("How many hours of sleep did you get last night?"));
        
        while(hoursSleep<0){
            hoursSleep = Double.parseDouble(JOptionPane.showInputDialog("Imposible: try again"));
        }
        
        System.out.println("you got " + hoursSleep + " last night.");
    }
}
