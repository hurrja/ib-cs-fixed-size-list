public class Main
{
  public static void main(String[] args)
  {
    List<Integer> list = new List<> (new Integer[10]);
    for (int i = 2; i < 20; i += 2)
      list.addFirst (i);

    list.removeLast ();
    
    System.out.println (list);
  }
}
