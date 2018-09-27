package ThinkInJava.holdObject;

import java.util.Iterator;

public class ZhcIT implements Iterable<String> {
  protected String[] words = ("And that is how " +
  "we know the Earth to be banana-shaped.").split(" ");

  @Override
  public Iterator<String> iterator() {
    return null;
  }
}
