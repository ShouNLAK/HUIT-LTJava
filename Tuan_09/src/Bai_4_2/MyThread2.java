package Bai_4_2;

public class MyThread2 extends Thread {
    public MyThread2(){
        super();
    }

    public void run(){
        Le thread1 = new Le();
        Chan thread2 = new Chan();

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }

    class Le extends  Thread{
        public Le(){
            super();
        }
        public void run(){
            for (int i = 0; i < 10 ; i ++){
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    class Chan extends Thread{
        public Chan(){
            super();
        }
        public void run(){
            for (int i = 0; i<10 ; i++){
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
