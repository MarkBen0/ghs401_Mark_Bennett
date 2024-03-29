
public class Panda
{
    private String country;
    private double weight;
    
    public Panda()
    {
        this.country=null;
        this.weight=0;
    }
    
    public Panda(String country, double weight)
    {
        this.country=country;
        this.weight=weight;
    }
    
    public void setWeight(double weight)
    {
        this.weight=weight;
    }
    
    public void setCountry(String country)
    {
       this.country=country;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public String getWeight(){
        return this.weight;
    }
    
    public String toString()
    {
        return "Country: " + this.country + "Weight: " + this.weight;
    }
}
