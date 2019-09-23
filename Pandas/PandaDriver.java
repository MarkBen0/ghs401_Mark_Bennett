
public class PandaDriver
{
    
    public static void main()
    {
        Panda p1 = new Panda("USA", 832.78);
        
        double currentWeight=p1.getWeight();
        
        currentWeight += 1000;
        p1.setWeight(currentWeight);
        System.out.println(p1.toString());
        
        Panda[] zoo = new Panda[3];
        zoo[0] = new Panda("China", 432.78);
        zoo[1] = new Panda("Greace", 957.43);
        zoo[2] = new Panda("Minecraft", 350.50);
        for(int i=0; i<zoo.length; i++)
        {
            System.out.println(zoo[i]);
        }
    }
}
