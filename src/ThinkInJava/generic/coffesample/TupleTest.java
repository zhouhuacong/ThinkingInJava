package ThinkInJava.generic.coffesample;

import ThinkInJava.generic.TwoTuple;

public class TupleTest {
  static TwoTuple<String, Integer> f() {
    return new TwoTuple<>("h1", 47);
  }

  static TwoTuple<Amphibian, Vehicle> get() {
    return new TwoTuple<>(new Amphibian(), new Vehicle());
  }
}

class Amphibian {
}

class Vehicle {
}