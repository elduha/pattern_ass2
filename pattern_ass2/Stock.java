package pattern_ass2;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Stock implements Observable{
    private List<Observer> observers;

    public Stock(){
        observers = new ArrayList<Observer>();
    }
    private String name;
    private int price;

    public String getStockName(){
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer != null){
            this.observers.add(observer);
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
        if(observer == null){
            this.observers.remove(observer);
        }
    }

    @Override
    public void nofifyObdervers() {
        Iterator<Observer>it=observers.iterator();
        while(it.hasNext()){
            Observer observer = it.next();
            observer.update(this);
        }
    }
    public int getPrice(){
        return price;
    }
    public void updatePrice(int updatedPrice){
        this.price= updatedPrice;
        this.nofifyObdervers();
    }
    public void setName(String stockName){
        this.name=stockName;
    }
}
