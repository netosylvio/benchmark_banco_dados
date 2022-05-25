

package modelo_banco;

import java.util.Random;


public class MyThread implements Runnable {
  int count;

 public MyThread() {
    count = 0;
  }
  public void run() {
    System.out.println("MyThread starting............");
    try {
      do {
        Thread.sleep(500);
        System.out.println("In MyThread, count is " + count);
        count++;
      } while (count < 5);
    } catch (InterruptedException exc) {
      System.out.println("MyThread interrupted.");
    }
    System.out.println("MyThread terminating.");
  }
}

class RunnableDemo {
  public static void main(String args[]) {
    System.out.println("Main thread starting.");
    MyThread mt = new MyThread();
    Thread newThrd = new Thread(mt);
    newThrd.start();
    do {
      System.out.println("In main threadddddd.");
      try {
        Thread.sleep(250);
      } catch (InterruptedException exc) {
        System.out.println("Main thread interrupted.");
      }
    } while (mt.count != 5);

    System.out.println("Main thread ending.");


    Random random = new Random();
 //   Random random = new Random(System.currentTimeMilis());
    long ttt = System.currentTimeMillis();
     System.out.println("tempoo = "+ttt);

    int i = random.nextInt(10);
   
    System.out.println("valor = "+i);


  }
}




