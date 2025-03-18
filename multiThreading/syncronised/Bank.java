package multiThreading.syncronised;

public class Bank {
    double balance = 100;

    public synchronized void  withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() + " Withdrawing ammount : " + amount);

        if(balance < amount) {
            System.out.println(Thread.currentThread().getName() +
                    " Amount is lesser than balance, please withdraw lesser than : " + balance);

            return;
        } else {
            System.out.println(Thread.currentThread().getName() + " Withdrawing amount " + amount + " from balance " + balance + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
        }

        System.out.println(Thread.currentThread().getName() + "remaining Balance " + balance + " ");
    }
}
