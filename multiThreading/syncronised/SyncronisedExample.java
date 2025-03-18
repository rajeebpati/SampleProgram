package multiThreading.syncronised;

public class SyncronisedExample {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                bank.withdraw(54);
            }
        };

        Thread t1 = new Thread(task, "thread1");
        t1.start();

        Thread t2 = new Thread(task, "thread2");
        t2.start();
    }
}
