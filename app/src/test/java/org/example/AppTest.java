package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
  GroceryCounter GroceryCounter;

  @BeforeEach
  void setUp() {
    GroceryCounter = new GroceryCounter();
  }

  @Test
  public void testTens() {
    GroceryCounter.tens();
    assertEquals("$10.00", GroceryCounter.total());
  }

  @Test
  public void testOnes() {
    GroceryCounter.ones();
    assertEquals("$1.00", GroceryCounter.total());
  }

  @Test
  public void testTenths() {
    GroceryCounter.tenths();
    assertEquals("$0.10", GroceryCounter.total());
  }

  @Test
  public void testHundreths() {
    GroceryCounter.hundreths();
    assertEquals("$0.01", GroceryCounter.total());
  }

  @Test
  public void testRawCounter() {
    GroceryCounter.tens();
    GroceryCounter.ones();
    GroceryCounter.tenths();
    GroceryCounter.hundreths();
    assertEquals(1111, GroceryCounter.rawCounter());
  }

  @Test
  public void testClearCounter() {
    GroceryCounter.tens();
    GroceryCounter.clear();
    assertEquals("$0.00", GroceryCounter.total());
  }

  @Test
  public void testClearOverflow() {
    for (int i = 0; i <= 10; i++) {
      GroceryCounter.tens();
    }
    GroceryCounter.clear();
    assertEquals(0, GroceryCounter.overflows());
  }

  @Test
  public void testOverflow() {
    for (int i = 0; i <= 10; i++) {
      GroceryCounter.tens();
    }
    assertEquals(1, GroceryCounter.overflows());
  }

}
