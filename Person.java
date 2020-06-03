
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String ID;
    private String first;
    private String last;
    
    public Person(String first,String last, String ID)
    {
       this.first = first;
       this.last = last;
       this.ID = ID;
    }
    
    public String getFirst()
    {
      return first;  
    }
    
    public String getLast()
    {
      return last;  
    }
    
    public String getID()
    {
      return ID;  
    }
    
    public String toString()
    {
        String details = "Name: " + getFirst() + " "  + getLast() + 
                            " ID: " + getID();
        return details;
    }
}
