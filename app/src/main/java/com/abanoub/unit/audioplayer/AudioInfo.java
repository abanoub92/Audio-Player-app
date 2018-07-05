package com.abanoub.unit.audioplayer;

/**
 *This class responsible of all audio file info
 */
public class AudioInfo {

    /** path of audio file in device */
    private String mPath;

    /** name of audio file */
    private String mAudioName;

    /** album of audio file */
    private String mAlbumName;

    /** the artist of audio file */
    private String mArtistName;


    public AudioInfo(String path, String audioName, String albumName, String artistName){
        this.mPath = path;
        this.mAudioName = audioName;
        this.mAlbumName = albumName;
        this.mArtistName = artistName;
    }


    public String getmPath() {
        return mPath;
    }

    public String getmAudioName() {
        return mAudioName;
    }

    public String getmAlbumName() {
        return mAlbumName;
    }

    public String getmArtistName() {
        return mArtistName;
    }
}
