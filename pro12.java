import java.util.Random;

class A extends Thread{

    public void run(){
         Random r = new Random();

        for(int i=0; i<5; i++){
            int num = r.nextInt(50);

            System.out.println("Number generated: " + num);

            if(num % 2 == 0){
                Square s = new Square(num);
                s.start();
            }else{
                Cube c = new Cube(num);
                c.start();
            }

            try{
                sleep(1000);
            }catch(Exception e){}
        }
    }   
}

class Square extends Thread{
    int num;
    Square(int n){
        num = n;
    }
    public void run(){
        System.out.println("Square of num: " + (num*num));
    }
}

class Cube extends Thread{
    int num;
    Cube(int n){
        num = n;
    }
    public void run(){
        System.out.println("Cube of num: " + (num*num*num));
    }
}

public class pro12{
    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}

