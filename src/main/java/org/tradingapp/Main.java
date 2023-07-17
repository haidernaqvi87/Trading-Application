package org.tradingapp;

import org.tradingapp.external.Algo;
import org.tradingapp.services.RestDataService;
import org.tradingapp.signals.Signal0;
import org.tradingapp.signals.Signal1;
import org.tradingapp.signals.Signal2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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

        //JUST FOR THE SAKE OF EXAMPLE consider it to be a service. Of course one can use a broadcast receiver
        Runnable drawRunnable = () -> {
            //HERE we are getting the signal from a fake HTTP endpoint
            int num = api.getSignalInt();
            signalReceived(app,num);
        };

        //Let's run the SERVICE after every 5 seconds to receive a signal int
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
        exec.scheduleAtFixedRate(drawRunnable , 0, 5, TimeUnit.SECONDS);

    }

    private static void signalReceived(Application app, int number) {
        try {
            app.switchSignal(number);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("There is no signal at "+number);
        }
    }

}