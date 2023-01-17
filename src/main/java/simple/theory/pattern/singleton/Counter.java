package simple.theory.pattern.singleton;

public class Counter {
    private int currentValue;

    Counter() {
        currentValue = getCurrentValue();
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void add() {
        currentValue = currentValue + 1;
    }

}
