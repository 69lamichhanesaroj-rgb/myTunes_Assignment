package easv.college.mytunesassignment.bll;

import easv.college.mytunesassignment.be.Music;
import easv.college.mytunesassignment.dal.MusicDAO;

import java.util.List;

public class Logic {
    MusicDAO mdao = new MusicDAO();

    public List<Music> getMusicList() {
        List<Music> musicList = mdao.getAllMusic();
        musicList = mdao.getAllMusic();
        if( musicList == null || musicList.size() == 0 ){
            throw new RuntimeException(" There is no music in the database");
        }
        return musicList;
    }



}
