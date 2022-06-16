package kg.geektech.homework330;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MusicFragment extends Fragment {
    private ArrayList<Music> musics;
    private RecyclerView recyclerView;
    private MusicAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_music, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new MusicAdapter(musics);
        recyclerView = view.findViewById(R.id.music_recycler);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        musics = new ArrayList<>();
        musics.add(new Music("Levitating", "Dua Lipa", "03:24"));
        musics.add(new Music("needy", "Ariana Grande", "02:51"));
        musics.add(new Music("imagine", "Ariana Grande", "03:32"));
        musics.add(new Music("in my head", "Ariana Grande", "03:43"));
        musics.add(new Music("Cheap Thrills", "Sia", "03:31"));
        musics.add(new Music("Cry", "KAZKA", "03:43"));
        musics.add(new Music("HIP", "MAMAMOO", "03:18"));
        musics.add(new Music("gogobebe", "MAMAMOO", "03:16"));
        musics.add(new Music("Woman", "Doja Cat", "02:53"));
        musics.add(new Music("Enemy", "Imagine Dragons", "02:34"));
        musics.add(new Music("MONTERO", "Lil Nas X", "02:18"));
        musics.add(new Music("Focus", "Ariana Grande", "03:31"));
    }
}