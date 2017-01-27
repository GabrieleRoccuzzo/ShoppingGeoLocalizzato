package android.vm.shopping;
import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;


/**
 * Created by Alessio-Valeria on 27/01/2017.
 */

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>{

    private ArrayList<Items> dataSet = new ArrayList<>();


    @Override
    public ItemsAdapter.ItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_myrec01,parent,false);

        ItemsViewHolder holder = new ItemsViewHolder(v);

        return holder;

    }

    public void setDataSet(ArrayList<Items> items) {
        this.dataSet = items;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(ItemsAdapter.ItemsViewHolder holder, int position) {
        Items currentItem = dataSet.get(position);
        holder.itemNameTv.setText(currentItem.getNome());

        holder.itemPriceTv.setText(currentItem.getPrezzo());

        holder.itemQuantityTV.setText(currentItem.getQuantita());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ItemsViewHolder extends RecyclerView.ViewHolder{
        public TextView itemNameTv;
        public TextView itemPriceTv;
        public TextView itemQuantityTV;
        public ItemsViewHolder(View itemView) {
            super(itemView);
            itemNameTv = (TextView) itemView.findViewById(R.id.nome_item);
            itemPriceTv = (TextView) itemView.findViewById(R.id.prezzo_item);
            itemQuantityTV = (TextView) itemView.findViewById(R.id.quantita_item);
        }
    }
}
