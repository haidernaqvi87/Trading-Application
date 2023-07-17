package org.tradingapp.signals;

import org.tradingapp.interfaces.Signal;

public class NoSignal implements Signal {

    @Override
    public void execute() {
        System.out.println("NO SIGNAL");
    }
}
