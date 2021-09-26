package pattern_ass2;

public class Main {
    public static void main(String[] args){
        Apple apple = new Apple();
        Windows windows = new Windows();
        Mobile mobile = new Mobile();

        apple.registerObserver(mobile);
        windows.registerObserver(mobile);


        for(int i=0;i<2;i++){
            apple.updatePrice((int)(Math.random()*101)+5);
            windows.updatePrice((int)(Math.random()*101)+1);
        }
    }
}
