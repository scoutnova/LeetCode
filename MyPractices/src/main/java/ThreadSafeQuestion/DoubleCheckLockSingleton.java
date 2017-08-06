package ThreadSafeQuestion;

public class DoubleCheckLockSingleton {
    private static DoubleCheckLockSingleton inst;

    private DoubleCheckLockSingleton() {
    }

    public synchronized static DoubleCheckLockSingleton getInstance() {
        if (inst == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (inst == null)
                    inst = new DoubleCheckLockSingleton();
            }
        }
        return inst;
    }
}