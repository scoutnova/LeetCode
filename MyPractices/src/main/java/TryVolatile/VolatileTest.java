package TryVolatile;

public class VolatileTest {
    //建立一個我們要關注的INT
    private static volatile int THE_VERY_INT = 0;
    //private static int THE_VERY_INT = 0;

    public static void main(String[] args) {
        //處理兩個Thread, 一個用來修改THE_VERY_INT的值, 一個用來監聽THE_VERY_INT的值有沒有被更改
        new ValueChangeListener().start();
        new ValueChangePerformer().start();
    }
    //監聽用的THREAD
    static class ValueChangeListener extends Thread {
        @Override
        public void run() {
            //透過建立一個temp物件來參考THE_VERY_INT，並判斷THE_VERY_INT在進程中有沒有被修改
            int temp = THE_VERY_INT;
            while ( temp < 5){
                if( temp!= THE_VERY_INT){
                    temp= THE_VERY_INT;
                    System.out.println("THE_VERY_INT Has been changed to: " + THE_VERY_INT);
                }
            }
        }
    }

    //改變值用的THREAD
    static class ValueChangePerformer extends Thread{
        @Override
        public void run() {
            //透過建立一個temp物件來參考THE_VERY_INT，用來處理進程中來修改這個THE_VERY_INT
            int temp = THE_VERY_INT;
            while (THE_VERY_INT < 5){
                THE_VERY_INT = ++temp;
                System.out.println("THE_VERY_INT increased to "+ THE_VERY_INT);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
