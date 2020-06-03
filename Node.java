
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node<E>
{
    private Node previous;
    private Node next;
    private E data;
    
    public Node(E data)
    {
       initialize(data, this , this);
    }
    
    public Node(E data, Node previous, Node next)
    {
       initialize(data, previous , next);
    }
    
    private void initialize(E data, Node previous, Node next)
    {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }
    
    public void setPrevious(Node previous)
    {
      this.previous = previous;  
    }
    
    public void setNext(Node next)
    {
      this.next = next;  
    }
    
    public Node getPrevious()
    {
        return previous;  
    }
    
    public Node getNext()
    {
      return next;  
    }
    
    public E getData()
    {
       return data; 
    }
    
    // public String toString()
    // {
        // String details = "Previous: " + getPrevious() + " Next: " + getNext();
        // return details;
    // }
}
