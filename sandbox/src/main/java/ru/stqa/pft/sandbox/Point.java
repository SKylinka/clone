package ru.stqa.pft.sandbox;

public class Point {

  public int x;
  public int y;
  public int n;
  public int m;

  public Point(int x, int y, int n, int m ) {

    this.x = x;
    this.y = y;
    this.n = n;
    this.m = m;
  }

  public double distance() {
    return Math.sqrt((this.n - this.x)^2+(this.m -this.y)^2);
  }
}
