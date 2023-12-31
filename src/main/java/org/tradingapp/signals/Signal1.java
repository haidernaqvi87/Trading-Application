package org.tradingapp.signals;

import org.tradingapp.external.Algo;
import org.tradingapp.interfaces.Signal;

public class Signal1 implements Signal {
    Algo algo;

    public Signal1(Algo algo) {
        this.algo = algo;
    }

    public void execute() {
        algo.setAlgoParam(1,101);
        algo.submitToMarket();
        algo.doAlgo();
    }
}
