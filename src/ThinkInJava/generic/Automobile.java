package ThinkInJava.generic;

public class Automobile {
}

class Holder1 {
  Automobile a;

  public Holder1(Automobile a) {
    this.a = a;
  }

  Automobile get() {
    return this.a;
  }
}

class Holder3<T> {
  private T a;
  public Holder3(T a) {
    this.a = a;
  }

  public void setA(T a) {
    this.a = a;
  }

  public T getA() {
    return a;
  }
}