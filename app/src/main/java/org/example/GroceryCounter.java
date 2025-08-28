package org.example;

public class GroceryCounter {

    private int counter;
    private int overflowCounter;

    public GroceryCounter() {
        counter = 0000;
        overflowCounter = 0;
    }

    private void handleOverflow() {
        if (counter > 9999) {
            overflowCounter += counter / 10000;
            counter %= 10000;
        }
    }

    public void tens() {
        counter += 1000;
        handleOverflow();
    }
    
    public void ones() {
        counter += 100;
        handleOverflow();
    }

    public void tenths() {
        counter += 10;
        handleOverflow();
    }

    public void hundreths() {
        counter += 1;
        handleOverflow();
    }
    
    public int rawCounter() {
        return counter;
    }

    public void clear() {
        overflowCounter = 0;
        counter = 0000;
    }
    
    public String total() {
        return '$' + String.format("%.2f", (double) counter / (double) 100);  
    }

    public int overflows() {
        return overflowCounter;
    }
    
}