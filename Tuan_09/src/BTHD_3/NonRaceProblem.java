package BTHD_3;

import java.util.Date;

public class NonRaceProblem {
    Date d = null;
    long n1 = 0, n2 = 0;
    TimeThread t1 = new TimeThread();
    AddThread t2 = new AddThread();

    public NonRaceProblem(){
        d = new Date(System.currentTimeMillis());
        randomNumbers();
        t1.start();
        t2.start();
    }

    public void randomNumbers(){
        n1 = Math.round(Math.random()*10000000);
        n2 = Math.round(Math.random()*10000000);
    }

    class TimeThread extends Thread{
        public TimeThread(){
            super();
        }
        public void run(){
            while (true){
                try {
                    System.out.println(d);
                    sleep(1000);
                    d = new Date(System.currentTimeMillis());
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class AddThread extends  Thread{
        public AddThread(){
            super();
        }
        public void run(){
            while (true){
                try {
                    System.out.println(n1+n2);
                    randomNumbers();
                    sleep(500);
                } catch (java.lang.InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
