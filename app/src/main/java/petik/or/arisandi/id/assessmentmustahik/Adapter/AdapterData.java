package petik.or.arisandi.id.assessmentmustahik.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import petik.or.arisandi.id.assessmentmustahik.Model.ModelData;
import petik.or.arisandi.id.assessmentmustahik.R;

/**
 * Created by PeTIK on 02/07/2018.
 */

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {
    private List<ModelData>mItems;
    private Context context;

    public AdapterData (Context context, List<ModelData> items)
    {
        this.mItems = items;
        this.context =context;
    }

    @Override
    public HolderData onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.showpribadi,parent,false);
        HolderData holderData = new HolderData(layout);
        return holderData;
    }

    @Override
    public void onBindViewHolder(HolderData holder, int position) {
        ModelData md = mItems.get(position);
        holder.tvno_identitas.setText(md.getNo_identitas());
        holder.tvnama.setText(md.getNama());

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class HolderData extends RecyclerView.ViewHolder{
        TextView tvno_identitas, tvnama;

        public HolderData (View view){
            super(view);

            tvno_identitas =(TextView) view.findViewById(R.id.nomor_identitas);
            tvnama = (TextView) view.findViewById(R.id.nama);

        }

    }
}
