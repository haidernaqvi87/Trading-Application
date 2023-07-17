package org.tradingapp.services;

import java.net.http.HttpClient;
import java.util.Random;

public class RestDataService {
    private static String BASE_URL = "https://getSignalInt.com"; //endpoint
    private HttpClient httpClient;
    public RestDataService() {}

    //HERE GOES THE LOGIC TO FETCH SIGNAL INT OF COURSE WITH EXCEPTIONS like IO etc
    //JUST FOR THE SAKE OF TESTING I AM SENDING A RANDOM INT
    public int getSignalInt() {
        //httpClient.get(BASE_URL) // to be honest, I have never worked on this in java
        Random rand = new Random();
        int number = rand.nextInt(10);
        return number;
    }
}
