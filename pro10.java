
class Threadx extends Thread{
    public void run(){
        for(int i=0;i<20;i++)
        {
            System.out.println("x i="+i);
        }
        System.out.println("x ends");
    }
}

public class pro10 {
    public static void main(String[] args) {
       System.out.println( Thread.currentThread().getName());
       Thread x =new Thread(new Threadx());

       x.setPriority(Thread.MAX_PRIORITY);
       System.out.println("The Priotity :"+x.getPriority());
       x.start();
       System.out.println("The x thread is runing or not  "+x.isAlive());
       try{
        x.sleep(2500);


       }
       catch(Exception e){
        System.out.println(e);
       }
       System.out.println("The x thread is runing or not   "+x.isAlive());
       System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getPriority());
       System.out.println("main program ends ");


    }

}
