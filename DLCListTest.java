

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DLCListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DLCListTest
{
    private DLCList<Person> list;
    private Person[] people;
    private Person person;
    public DLCListTest()
    {
        people = new Person[]
        {
          new Person("Dave", "Jones", "123456789"),
          new Person("Anna", "Smith", "987654321"),
          new Person("Jenny", "Rogers", "132457680"),
          
        };
        
        Person person = new Person("New","Person", "101101101");
        String toFind = "Jenny";
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        list = new DLCList<>();
        list.add(people[0]);
        list.add(people[1]);
        list.add(people[2]);
    }

    @Test
    public void testLength()
    {
        assertTrue(people.length == list.size());
    }
    
    @Test
    public void testAdd()
    {
      list.add(person);
      assertTrue(list.size() == people.length + 1);
    }
    
    @Test
    public void testGetFirst()
    {
        assertTrue(list.getFirst().getID().equals("123456789"));
    }
    
    @Test
    public void testGetLast()
    {
      assertTrue(list.getLast().getID().equals("132457680"));
    }
    
    @Test 
    public void testSize()
    {
        assertTrue(list.size() == 3);
    }
   
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
