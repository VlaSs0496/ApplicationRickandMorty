package appRickandMorty.demo.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class GetAllEpisodes {

    private List<EpisodeResponse> results;


}
