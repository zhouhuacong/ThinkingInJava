package ThinkInJava.generic.coffesample;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator<Coffee> implements Generator<Coffee>, Iterable<Coffee> {

  private Class[] types = {Latte.class, Mocha.class};
  private Random rand = new Random(47);
  private int size = 0;

  public CoffeeGenerator(int sz) {
    size = sz;
  }

  @Override
  public Coffee next() {
    return null;
  }

  @Override
  public Iterator<Coffee> iterator() {
    return null;
  }
}
