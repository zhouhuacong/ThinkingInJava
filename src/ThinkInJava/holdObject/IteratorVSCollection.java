package ThinkInJava.holdObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratorVSCollection {

  public void compare() {
    Map<String, String> map = new LinkedHashMap<>();
    map.put("a", "a");

  }

  private static void display(Iterator<String> it) {
    while (it.hasNext()) {
      System.out.println("ad");
    }
  }
}
