package psp.smashggclient.apiclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApiClient {

    private final String baseURL = "https://api.smash.gg/";

    public String getTournamentJson(String tournamentSlug) {
        String uri = "tournament/" + tournamentSlug + "?expand[]=phase&expand[]=event";
        return getResponse(uri);
    }

    public String getEventEntrantsJson(int eventId) {
        return getResponse("event/" + eventId + "?expand[]=entrants");
    }
    
    public String getPlayerDetailsJson(int playerId) {
        return getResponse("player/" + playerId);
    }

    public String getResponse(String uri) {
        String url = baseURL + uri;
        try {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            int responseCode = response.statusCode();

            if (responseCode == 200) {
                return responseBody;
            }
        } catch (IOException ex) {
            Logger.getLogger(ApiClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ApiClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "xdd";
    }
}
