package ru.leonov.hw.Data;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.leonov.hw.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<CardProp> list;

    public MyAdapter(List<CardProp> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView captionText;
        private ImageView imageView;
        private TextView descriptionText;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            captionText = itemView.findViewById(R.id.caption_text);
            imageView = itemView.findViewById(R.id.image_view);
            descriptionText = itemView.findViewById(R.id.description_text);
        }

        void bind(int position) {
            captionText.setText(list.get(position).caption);
            descriptionText.setText(list.get(position).description);
            imageView.setImageResource(list.get(position).pictureId);
        }
    }
}