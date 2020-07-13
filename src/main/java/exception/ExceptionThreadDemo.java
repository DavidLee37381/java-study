package exception;

public class ExceptionThreadDemo extends Thread{
    public void run(){
        System.out.println("Throwing in " +"MyThread");
        throw new RuntimeException();
    }
}
class Main {
    public static void main(String[] args){
        ExceptionThreadDemo t = new ExceptionThreadDemo();
        t.start();
        try{
            Thread.sleep(1000);
        }
        catch (Exception x){
            System.out.println("Caught it" + x);
        }
        System.out.println("Exiting main");
    }
}