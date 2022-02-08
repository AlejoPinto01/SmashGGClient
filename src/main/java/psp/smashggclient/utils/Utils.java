package psp.smashggclient.utils;

import java.io.IOException;
import psp.smashggclient.apiclient.ApiClient;

public class Utils {
    static ApiClient api = new ApiClient();

    public void createJsonObjects() throws IOException, InterruptedException {
        String json = api.getTournamentPhase("super-charge-shot-series");

//        JsonObject obj = new JsonObject(" .... ");
//        String pageName = obj.getJSONObject("pageInfo").getString("pageName");
//
//        JSONArray arr = obj.getJSONArray("posts");
//        for (int i = 0; i < arr.length(); i++) {
//            String post_id = arr.getJSONObject(i).getString("post_id");
    }
}
