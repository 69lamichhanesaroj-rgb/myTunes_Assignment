package easv.college.mytunesassignment.dal;

import easv.college.mytunesassignment.be.Music;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MusicDAO {
    ConnectionManager cm = new ConnectionManager();

    public List<Music> getAllMusic(){
        List<Music> musicList = new ArrayList<>();


        try(Connection con = cm.getConnection()){
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MUSIC");
            while(rs.next()){
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String artist = rs.getString("artist");
                String genre = rs.getString("genre");
                int duration = rs.getInt("duration");
                Music music = new Music(id,title,artist,genre,duration);
                musicList.add(music);


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return musicList;
    }


}
