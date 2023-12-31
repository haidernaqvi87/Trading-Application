package org.tradingapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.tradingapp.external.Algo;
import org.tradingapp.interfaces.Signal;
import org.tradingapp.signals.Signal1;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ApplicationTest {
    Application mockApplication;
    Algo mockAlgo;
    Signal mockSignal;

    @BeforeEach
    void setUp() {
        mockApplication = mock(Application.class);
        mockAlgo = mock(Algo.class);
        mockSignal = new Signal1(mockAlgo);
    }

    @Test
    public void setSignalTest() {
        //when a signal is set
        //verify if the signal is being set
        //verify the signal received and switchSignal is called
    }


    @Test
    public void getSignalTest() {
        //when a get signal is called
        //verify get signal is called
        //verify success
    }

    @Test
    public void setSignalTestWithException() {
        //when a get signal is called
        //verify get signal is called
        //verify exception being thrown
    }
}