package com.example.cs.lol_riot_esport;

import android.os.AsyncTask;


import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

public class getTheDataInTheBackground extends AsyncTask {
    @Override
    protected Object doInBackground(Object[] objects) {
        try {
            ApiConfig config = new ApiConfig().setKey("RGAPI-bf1fe02f-ef06-4534-894d-31af43680931");
            RiotApi api = new RiotApi(config);

            Summoner summoner = api.getSummonerByName(Platform.EUNE, "mid2killer");
            System.out.println("Name: " + summoner.getName());
            System.out.println("Summoner ID: " + summoner.getId());
            System.out.println("Account Id: " + summoner.getAccountId());
            System.out.println("Summoner Level: " + summoner.getSummonerLevel());
            System.out.println("Profile Icon Id: " + summoner.getProfileIconId());

            return null;
        } catch (RiotApiException e) {
            e.printStackTrace();
            return null;
        }
    }
}