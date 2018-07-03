package methods;

/** https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html
 * Для блокирования переменной c при ее использовании в одном потоке.
 * Перед выполнением синхронизированного метода/блока кода,
 * значение задействованной переменной передедается всем заинтересованными потоками
 */
public class SynchronisedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}