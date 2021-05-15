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

public class RecyclerViewAdapterDog extends RecyclerView.Adapter<RecyclerViewAdapterDog.MyDogHolder> {

    private Context dContext;
    private List<DogTipps> dData;

    public RecyclerViewAdapterDog(Context dContext, List<DogTipps> dData){
        this.dContext = dContext;
        this.dData = dData;
    }

    @NonNull
    @Override
    public MyDogHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(dContext);
        view = layoutInflater.inflate(R.layout.cardview_dogtipp,viewGroup,false);
        return  new MyDogHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyDogHolder myDogHolder, final int i) {

        myDogHolder.dogtippTitle.setText(dData.get(i).getDogTippName());
        myDogHolder.img_dogtipp_thumbnail.setImageResource(dData.get(i).getThumbnail());
        myDogHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dContext,DogTippActivity.class);

                intent.putExtra("DogTippName",dData.get(i).getDogTippName());
                intent.putExtra("DogTipp",dData.get(i).getDogTipp());
                intent.putExtra("Thumbnail",dData.get(i).getThumbnail());

                dContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dData.size();
    }

    public class MyDogHolder extends RecyclerView.ViewHolder {

        TextView dogtippTitle;
        CardView cardView;
        ImageView img_dogtipp_thumbnail;

        public MyDogHolder(@NonNull View itemView) {
            super(itemView);

            dogtippTitle = (TextView)itemView.findViewById(R.id.dogtipp_text);
            img_dogtipp_thumbnail = (ImageView)itemView.findViewById(R.id.dogtipp_img_id);
            cardView = (CardView)itemView.findViewById(R.id.dogcardview_id);


        }
    }
}