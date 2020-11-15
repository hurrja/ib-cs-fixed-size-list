public class List <T>
{
  public List (T[] array)
  {
    elements = array;
    maxSize = array.length;
  }
  
  int maxSize;
  private T[] elements;
}
