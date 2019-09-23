
public class Square
{
    public static void main(){
        int num1 = 1;
        for(int i = 1; i<11; i++){
            int Rnum = (i);
            int Sqnum = ((Rnum)*(Rnum));
            int Randnum;
            System.out.print(Rnum);
            System.out.print("\t\t" + (Sqnum));
            Randnum = (int)(Math.random()*(Sqnum - Rnum+1) + (Rnum) );
            System.out.print("\t\t" + Randnum);
            if(Randnum == Rnum){
                System.out.println("\t The random value is equel to the index.");
            }
            else if(Randnum == Sqnum){
                System.out.println("\t The random value is equel to the index Squared.");
            }
            else{
                System.out.println();
            }
        }
        System.out.println();
        String[] Favmovies = {"Star Wars", "Indiana Jones", "Avengers"};
        String[] Favsongs = {"Fireflys", "Gangnam Style", "816"};
        for(int i = 0; i<3; i++){
            System.out.println(Favmovies[i]);
        }
        System.out.println();
        int a = 0;
        int songnum = 0;
        while(a<Favmovies.length){
            
            if (a<Favmovies.length-1){
                
                System.out.print(Favsongs[a]+ ",");
                
      
        }
        else{
            
            System.out.print(Favsongs[a]);
        
    }
    a++;
}
}
}
