
public class Driver
{
    
    public static void main(){
        Dog d1 = new Dog();
        Dog d2 = new Dog("dug", "brown", 5);
        
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        
        System.out.println(d1.getWeight());
    }
}
