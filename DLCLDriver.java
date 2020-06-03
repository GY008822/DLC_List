
/**
 * Write a description of class DLCLDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DLCLDriver
{
    public static void main(String[] args)
    {
       DLCList<Person> list = new DLCList<>(); 
       
       Person[] people = new Person[]
        {
          new Person("Dave", "Jones", "123456789"),
          new Person("Anna", "Smith", "987654321"),
          new Person("Jenny", "Rogers", "132457680"),
          
        };
        list.add(people[0]);
        list.add(people[1]);
        list.add(people[2]);
        
     
       // System.out.println(list.getFirst().getID());
       // System.out.println(list.getLast().getID());
       // //System.out.println("Index 1: " + list.get(1));
       
       var p1 = new Person("Walter", "White", "99999999");
       list.addLast(p1);
       System.out.println(list.getLast());
       System.out.println(list.get(0));
    }
}
