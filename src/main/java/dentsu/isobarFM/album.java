package dentsu.isobarFM;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;



public class album {

    @JsonProperty("name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("image")
    private String image;
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("releasedDate")
    private LocalDateTime releasedDate;
    public LocalDateTime getReleasedDate() {
        return releasedDate;
    }
    public void setReleasedDate(LocalDateTime releasedDate) {
        this.releasedDate = releasedDate;
    }
    @JsonProperty("band")
    private String band;
    public String getBand() {
        return band;
    }
    public void setBand(String band) {
        this.band = band;
    }
    @JsonProperty("tracks")
    private List<track> tracks;
    public List<track> getTracks() {
        return tracks;
    }
    public void setTracks(List<track> tracks) {
        this.tracks = tracks;
    }
    @JsonProperty("id")
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @JsonCreator
    public album(String name, String image, LocalDateTime releasedDate, String band, List<track> tracks, String id) {
        this.name = name;
        this.image = image;
        this.releasedDate = releasedDate;
        this.band = band;
        this.tracks = tracks;
        this.id = id;
    }
}
