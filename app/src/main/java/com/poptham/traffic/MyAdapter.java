package com.poptham.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Pc on 21/9/2559.
 */
public class MyAdapter extends BaseAdapter {

    private Context objContext;
    private int[] trafficInts;
    private String[] trafficStrigs;

    public MyAdapter(Context objContext, int[] trafficInts, String[] trafficStrigs) {
        this.objContext = objContext;
        this.trafficInts = trafficInts;
        this.trafficStrigs = trafficStrigs;
    }

    @Override
    public int getCount() {
        return trafficStrigs.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.my_listview,viewGroup,false);

                //shoe icon
        ImageView iconImageView =(ImageView) view1.findViewById(R.id.imvShowIcon);
        iconImageView.setBackgroundResource(trafficInts[i]);

                //show Title
        TextView titleTextview = (TextView) view1.findViewById(R.id.txtShowTitle);
        titleTextview.setText(trafficStrigs[i]);

        return view1;
    } //getview
}//MainClass
