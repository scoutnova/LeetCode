package ThreadSafeQuestion;

public class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton inst;

    private NonThreadSafeSingleton() {
    }

    public static NonThreadSafeSingleton getInstance() {
        if (inst == null) //Point 1
            inst = new NonThreadSafeSingleton(); //Point 2
        return inst;
    }
}