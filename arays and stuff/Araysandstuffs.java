
public class Araysandstuffs
{
    public static void main(){
      //random double between 90 and 100 inclusive
      int num = Math.random()*11;
      
      for(int i=0; i<30; i++){
          num = (int)(Math.random()*11)+90;
          System.out.println(num);
          
          System.out.println("remainder when divied by 2 is " + num%2);
      }
    }
}
