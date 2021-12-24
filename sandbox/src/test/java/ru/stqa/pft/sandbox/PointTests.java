package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class PointTests {

  @Test
public void testDistance(){
    Point p = new Point(1,2,3,4);
  assert p.distance() == 2;
}
}
