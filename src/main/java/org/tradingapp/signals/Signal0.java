package org.tradingapp.signals;

import org.tradingapp.external.Algo;
import org.tradingapp.interfaces.Signal;

public class Signal0 implements Signal {
    Algo algo;

    public Signal0(Algo algo) {
        this.algo = algo;
    }

    public void execute() {
        algo.setAlgoParam(0,100);
        algo.submitToMarket();
        algo.doAlgo();
    }
}
