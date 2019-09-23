import javax.swing.JOptionPane;


public class GOAT
{
    
    public static void main(){
        
        int arrayNums = Integer.parseInt(JOptionPane.showInputDialog("How many #s do you want in array?"));
        int min = 15;
        int max = 21;
        while(arrayNums<10 || arrayNums>10000){
            arrayNums = Integer.parseInt(JOptionPane.showInputDialog("No: try again"));
        }
        
        int[] myArray = new int[arrayNums];
        
        for(int i=0; i<arrayNums; i++){
            myArray[i] = (int)(Math.random()*(max - min + 1) + min);
            System.out.print(myArray[i]+" ");
        }
        int greatest = 0;
        int smallest = 100;
        for(int i=0; i<arrayNums; i++){
            if(myArray[i]>greatest){
               greatest=myArray[i];
        }
    }
        for(int i=0; i<arrayNums; i++){
            if(myArray[i]<smallest){
                smallest=myArray[i];
        }
    }
    System.out.println("");
    System.out.println("greatest: "+greatest);
    System.out.println("least: "+smallest);
    }
}
