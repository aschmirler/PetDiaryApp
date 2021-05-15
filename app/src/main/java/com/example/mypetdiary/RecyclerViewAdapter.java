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

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Trainings> mData;

    public RecyclerViewAdapter(Context mContext, List<Trainings> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview_training,viewGroup,false);
        return  new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, final int i) {

        myHolder.trainingTitle.setText(mData.get(i).getTrainingName());
        myHolder.img_training_thumbnail.setImageResource(mData.get(i).getThumbnail());
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,TrainingActivity.class);

                intent.putExtra("TrainingName",mData.get(i).getTrainingName());
                intent.putExtra("Prerequisites",mData.get(i).getPrerequisites());
                intent.putExtra("TrainingMethodTitle",mData.get(i).getTrainingMethodTitle());
                intent.putExtra("Training",mData.get(i).getTraining());
                intent.putExtra("Thumbnail",mData.get(i).getThumbnail());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView trainingTitle;
        CardView cardView;
        ImageView img_training_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            trainingTitle = (TextView)itemView.findViewById(R.id.training_text);
            img_training_thumbnail = (ImageView)itemView.findViewById(R.id.training_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);


        }
    }
}