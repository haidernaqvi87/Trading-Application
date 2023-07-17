package org.tradingapp;

import org.tradingapp.interfaces.Signal;
import org.tradingapp.signals.NoSignal;

public class Application {
    // Just need to increase the signals every month before releasing production
    private static final int TOTAL_SIGNALS = 10;
    Signal[] signals;

    public Application() {
        signals = new Signal[TOTAL_SIGNALS];

        for (int i = 0; i < TOTAL_SIGNALS; i++) {
            signals[i] = new NoSignal();
        }
    }

    public void setSignal(int signalInt, Signal signal) {
        signals[signalInt] = signal;
    }

    public void switchSignal(int signalInt) throws ArrayIndexOutOfBoundsException{
        signals[signalInt].execute();
    }
}
