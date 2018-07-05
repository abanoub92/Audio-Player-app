package com.abanoub.unit.audioplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AudioAdapter extends ArrayAdapter<AudioInfo> {


    public AudioAdapter(@NonNull Context context, @NonNull List<AudioInfo> objects) {
        super(context, R.layout.list_item, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rootView  = convertView;

        if (rootView == null){
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        AudioInfo audioInfo = getItem(position);

        TextView audio_name = rootView.findViewById(R.id.audio_name);
        audio_name.setText(audioInfo.getmAudioName());

        TextView audio_artist = rootView.findViewById(R.id.audio_artist);
        audio_artist.setText(audioInfo.getmArtistName());

        TextView audio_album = rootView.findViewById(R.id.audio_album);
        audio_album.setText(audioInfo.getmAlbumName());

        return rootView;
    }
}
