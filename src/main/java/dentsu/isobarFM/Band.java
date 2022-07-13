package dentsu.isobarFM;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Band {
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

    @JsonProperty("genre")
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @JsonProperty("biography")
    private String biography;

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    private int numPlays;

    public int getNumPlays() {
        return numPlays;
    }

    @JsonProperty("numPlays")
    public void setNumPlays(int numPlays) {
        this.numPlays = numPlays;
    }

    private List<String> albums;

    public List<String> getAlbums() {
        return albums;
    }

    public void setAlbums(List<String> albums) {
        this.albums = albums;
    }

    @JsonProperty("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("albums")
    private List<album> albumList;

    public List<album> getAlbumList() {
        return albumList;
    }

    @JsonProperty("albumList")
    public void setAlbumList(List<album> albumList) {
        this.albumList = albumList;
    }
    @JsonCreator
    public Band(String name, String image, String genre, String biography, int numPlays, List<String> albums, String id,
    List<album> albumList) {
    this.name = name;
    this.image = image;
    this.genre = genre;
    this.biography = biography;
    this.numPlays = numPlays;
    this.albums = albums;
    this.id = id;
    this.albumList = albumList;
    }

    // public Band(String name, String image, String genre, String biography, int numPlays, List<String> albums, String id,
    // List<album> albumList) {
    // this.name = name;
    // this.image = image;
    // this.genre = genre;
    // this.biography = biography;
    // this.numPlays = numPlays;
    // this.albums = albums;
    // this.id = id;
    // this.albumList = albumList;
    // }
}
