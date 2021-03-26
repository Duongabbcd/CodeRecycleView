package com.example.coderecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List ;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coderecycleview.Model.Cat;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    private Context mContext;
    private List<Cat> mList;
    public CartAdapter(Context context){
        this.mContext=context;
    }
    public void setData(List<Cat> list){
        this.mList=list;
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card,parent,false);
        return new CartViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        Cat c=mList.get(position);
        if (c==null)
            return ;
        holder.img.setImageResource(c.getResouceImg());
        holder.txt.setText(c.getName());
    }

    @Override
    public int getItemCount() {
        if (mList!=null){
            return mList.size();
        }
        return 0;
    }

    //ViewHolder
    public class CartViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView txt;

        public CartViewHolder(@NonNull View view) {
            super(view);
            img=view.findViewById(R.id.img);
            txt=view.findViewById(R.id.tv);
        }
    }
}
