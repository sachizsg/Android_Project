package csi.myapplication.controllers.applicationcontroller;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

import csi.myapplication.R;

import csi.myapplication.models.applicationmodel.PharmacyDetails;

/**
 * Created by Sachithra on 4/28/2015.
 */
public class CustomPhyListView extends BaseAdapter implements ListAdapter {

    Context context;
    private List<PharmacyDetails> list;


    CustomPhyListView(List<PharmacyDetails> list,Context d){
        context = d;
        this.list = list;


    }





    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup viewGroup) {

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.single_row_phymacy, null);



        }

        TextView listItemText = (TextView)view.findViewById(R.id.phynameView);
        listItemText.setText(list.get(position).getPharmacyName());

        String addressLine1 = list.get(position).getAddressLineOne();
        String addressLine2 = list.get(position).getAddressLineTwo();
        String addressLine3 = list.get(position).getAddressLineThree();




        String address = addressLine1 +","+ addressLine2+"," + addressLine3;

        TextView listItemText1 = (TextView)view.findViewById(R.id.addView);
        listItemText1.setText(address);


        ImageButton btn = (ImageButton)view.findViewById(R.id.nextButn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in  = new Intent(context,PharmacyDetailPage.class);
                in.putExtra("PharmacyID",list.get(position).getPharmacyID());
                context.startActivity(in);



            }
        });

       return view;
    }
}
