package org.tradingapp;

import org.tradingapp.external.Algo;
import org.tradingapp.services.RestDataService;
import org.tradingapp.signals.Signal0;
import org.tradingapp.signals.Signal1;
import org.tradingapp.signals.Signal2;

public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        RestDataService api = new RestDataService();
        Algo algo = new Algo();

        // THE APP HAS TOTAL 10 Signals
        // Here I can set channels from 0...9
        // if all 10 signals are not set then the remaining single position will be of NO SIGNAL
        app.setSignal(0, new Signal0(algo));
        app.setSignal(1, new Signal1(algo));
        app.setSignal(2, new Signal2(algo));

    }

}