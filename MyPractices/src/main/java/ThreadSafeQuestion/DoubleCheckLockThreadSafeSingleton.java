package ThreadSafeQuestion;

public class DoubleCheckLockThreadSafeSingleton {
    private volatile static DoubleCheckLockThreadSafeSingleton inst;

    private DoubleCheckLockThreadSafeSingleton() {
    }

    public static DoubleCheckLockThreadSafeSingleton getInstance() {
        if (inst == null) {
            synchronized (DoubleCheckLockThreadSafeSingleton.class) {
                if (inst == null)
                    inst = new DoubleCheckLockThreadSafeSingleton();
            }
        }
        return inst;
    }
}