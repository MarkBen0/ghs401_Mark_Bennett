import javax.swing.JOptionPane;
public class stringstuff
{
    
    public static void main(){
        
        String[] classmates = {"Mark", "Sam", null, "Seth", "Camron"};
        
        for(int i=0; i<classmates.length; i++){
            
            if(classmates[i] != null)
              System.out.println(classmates[i].length());
        }
  }
}