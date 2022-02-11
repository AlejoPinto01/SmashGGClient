package psp.smashggclient.apiclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import psp.smashggclient.models.Converter;
import psp.smashggclient.models.Entities;
import psp.smashggclient.models.Entrant;
import psp.smashggclient.models.Player;

public class ApiClient {

    private final String baseURL = "https://api.smash.gg/";
    
    public String getTournamentJson(String tournamentSlug) {
        String uri = "tournament/" + tournamentSlug + "?expand[]=phase&expand[]=event&expand[]=entrants";
        return getResponse(uri);
    }

    public String getEventEntrantsJson(int eventId) {
        return getResponse("event/" + eventId + "?expand[]=entrants");
    }
    
    public String getPlayerDetailsJson(int playerId) {
        return getResponse("player/" + playerId);
    }
    
    public ArrayList<Entrant> getEntrants(String tournamentSlug) throws IOException {
        Entities e = Converter.fromJsonString(getTournamentJson(tournamentSlug));
        ArrayList<Entrant> entrants = e.getEntities().getEntrants();
        return entrants;
    }
    
    public ArrayList<Player> getPlayers(String tournamentSlug) throws IOException {
        Entities e = Converter.fromJsonString(getTournamentJson(tournamentSlug));
        ArrayList<Player> players = e.getEntities().getPlayer();
        return players;
    }
    
    // List<Set>

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
        return "code not 200";
    }
}
