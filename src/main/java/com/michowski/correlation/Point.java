package com.michowski.correlation;

public class Point<X, Y> {
  protected X x;
  protected Y y;

  public Point(X x, Y y) {
    this.x = x;
    this.y = y;
  }

  public X getX() {
    return x;
  }

  public Y getY() {
    return y;
  }

  @Override
  public String toString() {
    return "(" + x + "," + y + ")";
  }
}
