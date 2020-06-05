
/**
 * Write a description of class DLCList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DLCList<E> implements List<E>
{
    private Node<E> start;
    private int size;
    public DLCList()
    {
        start = null;
        size = 0;      
    }
    
    public boolean add(E element)
    {
      if (start == null)
      {
          start = new Node<>(element);
       }
      else {
           Node temporary = new Node<>(element, start.getPrevious(), start);
           start.getPrevious().setNext(temporary);
        }
      size += 1; 
      
      return true;  
    }
    
    public boolean addFirst(E element)
    {
       Node<E> node = new Node(element);
       Person p = (Person)node.getData();
       System.out.println(p);
       return true;  
    }
    
    public boolean addLast(E element)
    {
        add(element);
        return true;
    }
    
    public void delete(int index){ }
    public void deleteFirst()
    {
        //start.getData() = null;
    }
    
    
    public void deleteLast()
    {
        
    }
    
    
    public int size()
    {
      return size;  
    }
    public void clear() {}
    public boolean contains(E object)
    {
      return true;  
    }
    

    public E get(int index)
    {
      
       for(int i = 0; i < index; i++)
      {
         start.getNext();
         int placement = 0;
         placement = placement + 1;
         if(index == placement)
         {
            return (E) start.getNext().getData();
         }
         
        }
      return (E) start.getData(); 
    }
    
    public E getFirst()
    {
      return start.getData();
    }
    
    public E getLast()
    {
      return (E) start.getPrevious().getData();  
    }
    
    public void set(int index, E element)
    {
        
    }
    
    
}
