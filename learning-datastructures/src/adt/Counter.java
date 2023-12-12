package adt;
public class Counter {
    private String name = null;
    private Integer value = 0;

    public Counter(String str) {
        this.name = str;
    }

    public void increment() {
        value++;
    }
    public int getCurrentValue() {
        return value;
    }
    public String toString() {
        return name + ": " + value;
    }
}



