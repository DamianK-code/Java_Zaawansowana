package javaZaawans.javaZaavansowana.zadaniaIO.zadanie1;

public class SzukanieParzystych {
    public static void main(String[] args) {
        Thread thread = new Thread(new SzukanieParzystej());
        thread.start();

        Thread thread2 = new Thread(new SzukanieParzystej());
        thread2.start();

/*     gdy robiłem sam :)
        SzukanieParzystej2 szukanieParzystej2 = new SzukanieParzystej2();
        szukanieParzystej2.start();
        */
    }


    static class SzukanieParzystej implements Runnable {

        @Override
        public void run() {
            for (int i = 1000; i <= 2000; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

    }


    static class SzukanieParzystej2 implements Runnable {

        @Override
        public void run() {
            for (int i = 14300; i <= 17800; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}


