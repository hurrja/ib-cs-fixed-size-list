public class List <T>
{
  public List (T[] array)
  {
    elements = array;
    maxSize = array.length;
    size = 0;
  }
  
  public boolean isFull ()
  {
    return size >= maxSize;
  }
  
  public boolean isEmpty ()
  {
    // code to be written
    return true;
  }

  public void addFirst (T element)
  {
    for (int i = size - 1; i >= 0; i--)
      elements [i + 1] = elements [i];
    elements [0] = element;
    size++;
  }
  
  public void addLast (T element)
  {
    // code to be written
  }

  public void add (int index, T element)
  {
    // code to be written
  }

  public T removeLast ()
  {
    size--;
    return elements [size];
  }
  

  // code to be written
  // public T removeFirst ()
  // {
  // }

  public String toString ()
  {
    StringBuffer strBuf = new StringBuffer ();
    for (int i = 0; i < size; i++)
    {
      strBuf.append (elements [i]);
      if (i < size - 1)
        strBuf.append (", ");
    }
    return strBuf.toString ();
  }
  
  private int maxSize;
  private int size;
  private T[] elements;
}
