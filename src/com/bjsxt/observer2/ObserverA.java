package com.bjsxt.observer2;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

    private int myState; //myState需要跟目标对象的state值保持一致

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject)o).getState();
    }
}
