package dentsu.isobarFM;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class track {
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("duration")
    private int duration;

    @JsonProperty("id")
    private String id;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @JsonCreator
    public track( String name, int duration,  String id) {
        this.name = name;
        this.duration = duration;
        this.id = id;
    }
}
