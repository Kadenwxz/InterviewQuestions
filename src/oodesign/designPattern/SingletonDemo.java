package oodesign.designPattern;

public class SingletonDemo {
    
    private static volatile SingletonDemo instance = null;
    
    private SingletonDemo(){}
    
    public SingletonDemo getInstance(){
        if(instance == null){
            synchronized (SingletonDemo.class) {
                if(instance == null){
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }
}
