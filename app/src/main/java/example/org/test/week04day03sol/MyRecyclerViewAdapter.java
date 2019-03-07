package example.org.test.week04day03sol;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

import example.org.test.week04day03sol.repository.Item;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    ArrayList<Item> repoArrayList;

    public MyRecyclerViewAdapter(ArrayList<Item> repoArrayList) {
        this.repoArrayList = repoArrayList;
    }


    @NonNull
    @Override
    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
