package easv.college.mytunesassignment.be;

public class Music {
    private int id;
    private String title;
    private String artist;
    private String genre;

    public Music (int id, String title, String artist, String genre) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return ("Music id=" + id + ", title=" + title + "artist=" + artist + "genre=" + genre);
    }
}
