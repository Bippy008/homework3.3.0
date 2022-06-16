package kg.geektech.homework330;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {
    private ArrayList<Music> musics;

    public MusicAdapter(ArrayList<Music> musics) {
        this.musics = musics;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.music_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        holder.bind(musics.get(position));
    }

    @Override
    public int getItemCount() {
        return musics.size();
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder {
        private TextView songNameTv;
        private TextView singerNameTv;
        private TextView timestampTv;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            songNameTv = itemView.findViewById(R.id.song_name_tv);
            singerNameTv = itemView.findViewById(R.id.singer_name_tv);
            timestampTv = itemView.findViewById(R.id.time_tv);
        }


        public void bind(Music music) {
            songNameTv.setText(music.getSongName());
            singerNameTv.setText(music.getSingerName());
            timestampTv.setText(music.getTimestamp());
        }
    }
}
