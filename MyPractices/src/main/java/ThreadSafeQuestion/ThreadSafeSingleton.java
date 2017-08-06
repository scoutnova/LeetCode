package ThreadSafeQuestion;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton inst;

    private ThreadSafeSingleton() {
    }

    public synchronized static ThreadSafeSingleton getInstance() {
        if (inst == null)
            inst = new ThreadSafeSingleton();
        return inst;
    }
}