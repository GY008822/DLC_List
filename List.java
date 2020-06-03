
/**
 * Write a description of interface List here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface List<E>
{
    boolean add(E element);
    boolean addFirst(E element);
    boolean addLast(E element);
    
    void delete(int index);
    void deleteFirst();
    void deleteLast();
    
    int size();
    void clear();
    boolean contains(E object);
    
    E get(int index);
    E getFirst();
    E getLast();
    
    void set(int index, E element);
}
