package easv.college.mytunesassignment.be;

public class Playlist {

    private int id;
    private String name;
    private int duration;

    public Playlist(int id, String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public int getDuration() {
        return duration;
    }

}
