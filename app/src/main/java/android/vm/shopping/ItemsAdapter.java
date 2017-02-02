package android.vm.shopping;
import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;


/**
 * l'adapter è un software per la gestione della sistemazione degli elementi di una lista che voglio visualizzare
 */

// la recycleview ha un'attributo di tipo Adapter
public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>{

    // inizializzo il mio dataset
    private ArrayList<Items> dataSet = new ArrayList<>();

    // onCreateViewHolder è il primo metodo chiamato alla creazione di una riga (della lista)
    //crea una riga con un layout (item_myrec01) ed una classe che rappresenta la riga (ItemsViewHolder)
    @Override
    public ItemsAdapter.ItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_myrec01,parent,false);

        ItemsViewHolder holder = new ItemsViewHolder(v);

        return holder;

    }


    //
    public void setDataSet(ArrayList<Items> items) {
        this.dataSet = items;
        notifyDataSetChanged();
    }


    // onBindViewHolder è un metodo che posiziona la riga ad una determinata posizione (int position)
    // sto dicendo di "attaccare" ad una determinata riga un elemento del mio dataset
    @Override
    public void onBindViewHolder(ItemsAdapter.ItemsViewHolder holder, int position) {
        Items currentItem = dataSet.get(position);
        holder.itemNameTv.setText(currentItem.getNome());

        holder.itemPriceTv.setText(currentItem.getPrezzo());

        holder.itemQuantityTV.setText(currentItem.getQuantita());
    }


    // setta la grandezza della lista (vuole un'int e ritorna la grandezza tramite dataSet.size)
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
