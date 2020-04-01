package id.iqbalalimirza.proyek.adapter;

import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.iqbalalimirza.proyek.R;
import id.iqbalalimirza.proyek.model.model_pemain;

public class ListPemainAdapter extends RecyclerView.Adapter<ListPemainAdapter.ViewHolder>{
    private ArrayList<model_pemain> list;
    private  OnItemListener listener;

    public ListPemainAdapter(ArrayList<model_pemain> list, OnItemListener listener) {
        this.list=list;
        this.listener=listener;
    }

    public ListPemainAdapter(ArrayList<model_pemain> list) {
        this.list=list;
        this.listener=listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new ViewHolder(view);
    }

    public interface OnItemListener{
        void onListClicked(int position, model_pemain item);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        model_pemain pemain = list.get(position);
        holder.name.setText(pemain.getNama());

        Glide.with(holder.itemView.getContext())
                .load(pemain.getFoto_pemain())
                .apply(new RequestOptions().override(350,550))
                .into(holder.image);
        holder.bind(position, pemain);
    }

    @Override
    public int getItemCount() { return list.size();}




    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_logo);
            name = itemView.findViewById(R.id.text_name);

        }

        public void bind(final int position, final model_pemain pemain) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onListClicked(position, pemain);
                }
            });
        }
    }

}
