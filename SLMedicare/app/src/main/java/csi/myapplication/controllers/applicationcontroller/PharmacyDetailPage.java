package csi.myapplication.controllers.applicationcontroller;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import csi.myapplication.R;
import csi.myapplication.models.applicationmodel.PharmacyDetails;


public class PharmacyDetailPage extends ActionBarActivity {
    PharmacyDetails pharmacyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy_detail_page);

        Intent in = getIntent();
        long PharmacyID  = in.getLongExtra("PharmacyID",0);

        pharmacyList = SplashScreen.databaseControl.getPharmacyDetails(Long.toString(PharmacyID));
        TextView PharmacyName = (TextView) findViewById(R.id.phyName);
        PharmacyName.setText(pharmacyList.getPharmacyName());
        TextView AddressLine1 = (TextView) findViewById(R.id.number);
        AddressLine1.setText(pharmacyList.getAddressLineOne() + ",");
        TextView AddressLine2 = (TextView) findViewById(R.id.addressLine1);
        AddressLine2.setText(pharmacyList.getAddressLineTwo()+ ",");
        TextView AddressLine3 = (TextView) findViewById(R.id.addressLine2);
        AddressLine3.setText(pharmacyList.getAddressLineThree()+ ". ");
        TextView ContactNumber = (TextView) findViewById(R.id.contactnum);
        ContactNumber.setText(pharmacyList.getContactNumber());


        ImageButton btn = (ImageButton)this.findViewById(R.id.makeCall);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent call = new Intent(Intent.ACTION_CALL);

                String number ="tel:"+pharmacyList.getContactNumber();
                call.setData(Uri.parse(number));

                startActivity(call);

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pharmacy_detail_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setPhyLocation(View view) {

        Intent in = new Intent(getApplicationContext(),MapDetails.class);
        in.putExtra("title",pharmacyList.getPharmacyName());
        startActivity(in);




    }




}
