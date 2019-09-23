import javax.swing.JOptionPane;
public class Waldo
{
    
    public static void main(){
        
        String school = JOptionPane.showInputDialog("What school do you go to?");
        String stuffs[] = {"Waldo", null, "Flash", "Baymax"};
        
        if(school.equals("granada")){
            String mascot = JOptionPane.showInputDialog("What is your school's mascot?");
            if(mascot.equals("matador")){
               System.out.println("Access: GRANTED");
               for(int i=0; i<stuffs.length; i++){
                if(stuffs[i] == null){
                    System.out.println("There is no one in spot "+(i+1));
                }
                else if(stuffs[i].equals("Waldo")){
                   System.out.println("Waldo is in spot" + (i + 1) + ".");
                }
                else{
                   System.out.println("Waldo isn't here in spot " + (i + 1) + ", " + stuffs[i] + " is."); 
                }
            }
             
             String character = JOptionPane.showInputDialog("Who's your favorite movie character?");
             if(character.equals("Baymax")){
                System.out.println("We have the same taste in movies!");
             }
             else{
                System.out.println("We do not have the same favorite character. :(");
             }
            
        }
            else{
            System.out.println("Matador is the correct answer.");
        }
        }
        else{
            System.out.println("Granada is the correct answer.");
        }
  }
}