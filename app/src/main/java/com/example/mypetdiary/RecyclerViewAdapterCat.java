package com.example.mypetdiary;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import androidx.annotation.NonNull;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Intent;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.widget.ImageView;
import java.util.List;

public class RecyclerViewAdapterCat extends RecyclerView.Adapter<RecyclerViewAdapterCat.MyCatHolder> {

    private Context cContext;
    private List<CatTipps> cData;


    public RecyclerViewAdapterCat(Context cContext, List<CatTipps> cData){
        this.cContext = cContext;
        this.cData = cData;
    }

    @NonNull
    @Override
    public MyCatHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(cContext);
        view = layoutInflater.inflate(R.layout.cardview_cattipp,viewGroup,false);
        return  new MyCatHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyCatHolder myCatHolder, final int i) {

        myCatHolder.cattippTitle.setText(cData.get(i).getCatTippName());
        myCatHolder.img_cattipp_thumbnail.setImageResource(cData.get(i).getThumbnail());
        myCatHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cContext,CatTippActivity.class);

                intent.putExtra("CatTippName",cData.get(i).getCatTippName());
                intent.putExtra("CatTipp",cData.get(i).getCatTipp());
                intent.putExtra("Thumbnail",cData.get(i).getThumbnail());

                cContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return cData.size();
    }

    public class MyCatHolder extends RecyclerView.ViewHolder {

        TextView cattippTitle;
        CardView cardView;
        ImageView img_cattipp_thumbnail;

        public MyCatHolder(@NonNull View itemView) {
            super(itemView);

            cattippTitle = (TextView)itemView.findViewById(R.id.cattipp_text);
            img_cattipp_thumbnail = (ImageView)itemView.findViewById(R.id.cattipp_img_id);
            cardView = (CardView)itemView.findViewById(R.id.catcardview_id);


        }
    }
}