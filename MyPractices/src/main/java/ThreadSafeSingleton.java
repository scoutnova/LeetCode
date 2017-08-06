public class ThreadSafeSingleton {
    private volatile static ThreadSafeSingleton inst = null;

    private ThreadSafeSingleton() {
    }

    //Lazy-load Singleton + ThreadSafe
    public static synchronized ThreadSafeSingleton getInstance() {
        //First-check
        if (inst == null) {
            //Double-check locking
            synchronized (ThreadSafeSingleton.class) {
                if (inst == null)
                    inst = new ThreadSafeSingleton();
            }
        }
        return inst;
    }

    public void funcA() {
        //TODO
    }

    public void funcB() {
        //TODO
    }

    public void funcC() {
        //TODO
    }

}