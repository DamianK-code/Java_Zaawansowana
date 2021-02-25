package javaZaawans.javaZaavansowana.wielowatkowosc.zadanie4;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    account.wypłata(1300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    account.wpłata(100);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        });

      /*  Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.wpłata(1000);

            }
        });*/
        thread1.start();
        thread2.start();
        //   thread3.start();
    }
}
