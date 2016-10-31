package csi.myapplication.controllers.applicationcontroller;



import android.app.Activity;
import android.app.Dialog;
import android.app.TabActivity;
import android.content.Context;
import android.graphics.Color;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

import csi.myapplication.R;
import csi.myapplication.models.applicationmodel.HospitalDetails;
import csi.myapplication.models.applicationmodel.PharmacyDetails;


public class MainPage extends TabActivity  implements GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener{


    public static CustomListView adapter;
    public static CustomPhyListView adapters;
    public EditText editText;

    private static final int GPS_ERRORDIALOG_REQUEST = 9001;
    GoogleMap mMap;
    GoogleApiClient mLocationClient;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       if(servicesOK()){
            setContentView(R.layout.activity_main_page);
           //connect to the location service
             mLocationClient = new GoogleApiClient.Builder(this).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
             mLocationClient.connect();


            TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
            tabHost.setup();

            TabHost.TabSpec tabSpec = tabHost.newTabSpec("hospital");
            tabSpec.setContent(R.id.hosListView);
            tabSpec.setIndicator("Hospital");
            tabHost.addTab(tabSpec);


            tabSpec = tabHost.newTabSpec("pharmacy");
            tabSpec.setContent(R.id.phyListView);
            tabSpec.setIndicator("Pharmacy");
            tabHost.addTab(tabSpec);


            List<HospitalDetails> hospitalList = SplashScreen.databaseControl.getHospitalList();

            //instantiate custom adapter
            adapter = new CustomListView(hospitalList, this);

            //handle listview and assign adapter
            ListView lView = (ListView)findViewById(R.id.hosListView);
            lView.setAdapter(adapter);



            List<PharmacyDetails> pharmacyList = SplashScreen.databaseControl.getPharmacyList();

            //instantiate custom adapter
            adapters = new CustomPhyListView(pharmacyList, this);

            //handle listview and assign adapter
            ListView PView = (ListView)findViewById(R.id.phyListView);
            PView.setAdapter(adapters);

            editText = (EditText)findViewById(R.id.searchText);


            editText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText("");
                    editText.setCursorVisible(true);

                }
            });
        }
        else{
           Toast.makeText(this, "Services is not available", Toast.LENGTH_SHORT).show();
        }


     }

    public boolean servicesOK() {
        int isAvaliable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if (isAvaliable == ConnectionResult.SUCCESS) {
            return true;
        } else if (GooglePlayServicesUtil.isUserRecoverableError(isAvaliable)) {
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(isAvaliable, this, GPS_ERRORDIALOG_REQUEST);
            dialog.show();
        } else {
            Toast.makeText(this, "Can't connect to Google Play services", Toast.LENGTH_SHORT).show();
        }
        return false;
    }



    private void loadData(String nearByPlace){

        List<HospitalDetails> hospitalList = SplashScreen.databaseControl.getHospitalSearch(nearByPlace);

        //instantiate custom adapter
        adapter = new CustomListView(hospitalList,this);

        //handle listview and assign adapter
        ListView lView = (ListView)findViewById(R.id.hosListView);
        lView.setAdapter(adapter);



        List<PharmacyDetails> pharmacyList = SplashScreen.databaseControl.getPharmacySearch(nearByPlace);
        //instantiate custom adapter
        adapters = new CustomPhyListView(pharmacyList,this);
        //handle listview and assign adapter
        ListView PView = (ListView)findViewById(R.id.phyListView);
        PView.setAdapter(adapters);

      }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
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


   public void searchLocation(View view) {

        //view.setBackgroundColor(Color.GRAY);

        editText = (EditText)findViewById(R.id.searchText);
        String nearByPlace = editText.getText().toString();

        loadData(nearByPlace);

       //hide keyboard
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(),0);

        editText.setCursorVisible(false);


    }


    public void setListView(View view) {

        List<HospitalDetails> hospitalList = SplashScreen.databaseControl.getHospitalList();

        //instantiate custom adapter
        adapter = new CustomListView(hospitalList, this);

        //handle listview and assign adapter
        ListView lView = (ListView)findViewById(R.id.hosListView);
        lView.setAdapter(adapter);


        List<PharmacyDetails> pharmacyList = SplashScreen.databaseControl.getPharmacyList();

        //instantiate custom adapter
        adapters = new CustomPhyListView(pharmacyList, this);

        //handle listview and assign adapter
        ListView PView = (ListView)findViewById(R.id.phyListView);
        PView.setAdapter(adapters);


    }

    @Override
    public void onConnected(Bundle bundle) {
        //Toast.makeText(this,"Connected to location service",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    //get current location

    public void setCurrentLocation(View view) throws IOException {

        Location currentLocation = LocationServices.FusedLocationApi.getLastLocation(mLocationClient);

        if (currentLocation == null) {
            Toast.makeText(this, "Current location is not available", Toast.LENGTH_SHORT).show();
        } else {



            Geocoder gc = new Geocoder(this);
            //get one single address
            List<Address> list = gc.getFromLocation(currentLocation.getLatitude(), currentLocation.getLongitude(),1);
            Address add = list.get(0);

            String locality = add.getLocality();

            editText = (EditText)findViewById(R.id.searchText);
            editText.setText(locality);

            loadData(locality);

            Toast.makeText(this,"Current location is  " + locality, Toast.LENGTH_SHORT).show();
        }

    }
}
