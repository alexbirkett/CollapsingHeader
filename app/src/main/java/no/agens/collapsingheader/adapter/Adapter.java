package no.agens.collapsingheader.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import no.agens.collapsingheader.R;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private static final int COLOR_COUNT = 5;
    private static final String LOG_TAG = "Adapter";

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View v) {
            super(v);
        }
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setBackgroundResource(getColorFromIndex(position % COLOR_COUNT));
    }

    private static int getColorFromIndex(int index) {
        Log.d(LOG_TAG, "getColorFromIndex(" + index + ")");
        int colorId = 0;
        switch (index) {
            case 0:
                colorId = R.color.green;
                break;
            case 1:
                colorId = R.color.orange;
                break;
            case 2:
                colorId = R.color.pink;
                break;
            case 3:
                colorId = R.color.purple;
                break;
            case 4:
                colorId = R.color.yellow;
                break;
        }
        return colorId;
    }
    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}

