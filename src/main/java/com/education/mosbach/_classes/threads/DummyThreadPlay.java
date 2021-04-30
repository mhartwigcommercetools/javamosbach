package com.education.mosbach._classes.threads;


public class DummyThreadPlay {

    static class CounterLowPriority extends Thread {
        public void run() {
            int count = 0;
            for (int i = 0; i < 1_000_000_000; i++)
                if (i % 3 == 0) count++;
            System.out.println("CounterLowPriority endet mit " + count);
        }
    }

    static class CounterHighPriority implements Runnable {
        @Override
        public void run() {
            int count = 0;
            for (int i = 0; i < 1_000_000_000; i++)
                if (i % 3 == 0) count++;
            System.out.println("CounterHighPriority endet mit " + count);
        }
    }

   public static void main(String[] args) {

        Thread counterLowPriority = new CounterLowPriority();
        counterLowPriority.setPriority(2);
        counterLowPriority.start();                     // Probiere auch mal mit run()
        System.out.println("Ich bin das Hauptprogramm.");

        Thread counterHighPriority = new Thread(new CounterHighPriority());
        counterHighPriority.setPriority(9);
        counterHighPriority.start();

        new Thread(() -> {
           int count = 0;
           for (int i = 0; i < 1_000_000_000; i++)
               if (i % 3 == 0) count++;
           System.out.println("CounterNormalPriority endet mit " + count);
        }).start();

    }

}
