// SINGLETON -

package simple.theory.pattern.singleton;

public class CounterSingleton {
    private volatile static CounterSingleton uniqueInstance = new CounterSingleton();
    private int currentValue;

    private CounterSingleton() {
        currentValue = getCurrentValue();
    }

    public static synchronized CounterSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (CounterSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new CounterSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void add() {
        currentValue = currentValue + 1;
    }

}
