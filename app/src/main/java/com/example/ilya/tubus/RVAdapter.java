package com.example.ilya.tubus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.LessonsViewHolder> {
    protected List<Stroke> strokes;
    private Context context;
    public int position;

    public RVAdapter(List<Stroke> strokes, Context context) {
        this.strokes = strokes;
        this.context = context;

    }

    @Override
    public LessonsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_rv, parent, false);
        return new LessonsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final LessonsViewHolder holder, int position) {
        final Stroke stroke = strokes.get(position);

        holder.txtReady.setText(String.valueOf(stroke.getReady()));
        holder.txtName.setText(stroke.getName());
        holder.cvListener.setRecord(stroke);

    }

    @Override
    public int getItemCount() {
        return strokes.size();
    }


    class LessonsViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtReady;

        CardView cv;


        CardViewClickListener cvListener = new CardViewClickListener();

        LessonsViewHolder(View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txt_rv_name);
            txtReady = itemView.findViewById(R.id.txt_rv_ready);
            cv = itemView.findViewById(R.id.cv_rv);
            cv.setOnClickListener(cvListener);


        }
    }

    class CardViewClickListener implements View.OnClickListener {

        private Stroke stroke;

        public void onClick(View v) {
            Intent intent = new Intent(context,Lessons.class);
            intent.putExtra("test", stroke.getPosition());
            (context).startActivity(intent);
        }

        void setRecord(Stroke stroke) {
            this.stroke = stroke;
            position = strokes.indexOf(stroke);
        }
    }


}
