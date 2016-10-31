package csi.myapplication.controllers.databasecontroller;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import csi.myapplication.models.applicationmodel.HospitalDetails;
import csi.myapplication.models.applicationmodel.PharmacyDetails;
import csi.myapplication.models.databasemodel.CreateDatabase;

/**
 * Created by Sachithra on 4/23/2015.
 */
public class DatabaseController  {


    private static final String LOGTAG = "SL MEDICARE";

    SQLiteOpenHelper createdb;
    SQLiteDatabase database;

    public static int rowCount = 0;




    private static final String[] hospitalDataColumns = {
            CreateDatabase.TABLE_HOSPITAL_COLUMN_ONE,
            CreateDatabase.TABLE_HOSPITAL_COLUMN_TWO,
            CreateDatabase.TABLE_HOSPITAL_COLUMN_THREE,
            CreateDatabase.TABLE_HOSPITAL_COLUMN_FOUR,
            CreateDatabase.TABLE_HOSPITAL_COLUMN_FIVE,
            CreateDatabase.TABLE_HOSPITAL_COLUMN_SIX,
            CreateDatabase.TABLE_HOSPITAL_COLUMN_SEVEN,
            CreateDatabase.TABLE_HOSPITAL_COLUMN_EIGHT,

    };

  private static final String[] pharmacyDataColumns = {
            CreateDatabase.TABLE_PHARMACY_COLUMN_ONE,
            CreateDatabase.TABLE_PHARMACY_COLUMN_TWO,
            CreateDatabase.TABLE_PHARMACY_COLUMN_THREE,
            CreateDatabase.TABLE_PHARMACY_COLUMN_FOUR,
            CreateDatabase.TABLE_PHARMACY_COLUMN_FIVE,
            CreateDatabase.TABLE_PHARMACY_COLUMN_SIX,
            CreateDatabase.TABLE_PHARMACY_COLUMN_SEVEN,
            CreateDatabase.TABLE_PHARMACY_COLUMN_EIGHT
   };




    public DatabaseController(Context context){

        createdb = new CreateDatabase(context);
    }

    public  void open(){
        Log.i(LOGTAG, "Database opened.");
        database = createdb.getWritableDatabase();
    }

    public  void  close(){
        Log.i(LOGTAG, "Database closed.");
        createdb.close();
    }



    public List<HospitalDetails> getHospitalList(){

        List<HospitalDetails> hospitalList = new ArrayList<>();

        Cursor cursor = database.query(CreateDatabase.TABLE_HOSPITAL,hospitalDataColumns,null,null,null,null,null);


        rowCount = cursor.getCount();

        if (rowCount > 0){
            while (cursor.moveToNext()){
                HospitalDetails hospitalDetails = new HospitalDetails();

                hospitalDetails.setHospitalID(cursor.getLong(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_ONE)));
                hospitalDetails.setHospitalName(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_TWO)));
                hospitalDetails.setAddressLineOne(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_THREE)));
                hospitalDetails.setAddressLineTwo(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_FOUR)));
                hospitalDetails.setAddressLineThree(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_FIVE)));
                hospitalDetails.setCity(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_SIX)));
                hospitalDetails.setDistrict(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_SEVEN)));
                hospitalDetails.setContactNumber(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_EIGHT)));

                hospitalList.add(hospitalDetails);

            }
        }

        cursor.close();

        return hospitalList;
    }


    public List<HospitalDetails> getHospitalSearch(String nearByPlace) {

        List<HospitalDetails> hospitalSearchList = new ArrayList<>();
        String selectQuery = "SELECT * FROM "+CreateDatabase.TABLE_HOSPITAL+" WHERE "+CreateDatabase.TABLE_HOSPITAL_COLUMN_SIX+" LIKE '%"+nearByPlace+"%' OR "+CreateDatabase.TABLE_HOSPITAL_COLUMN_SEVEN+" LIKE '%"+nearByPlace+"%'";
        Cursor cursor = database.rawQuery(selectQuery,null);

        rowCount = cursor.getCount();

        if (rowCount > 0) {
            while (cursor.moveToNext()) {
                HospitalDetails hospitalDetails = new HospitalDetails();

                hospitalDetails.setHospitalID(cursor.getLong(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_ONE)));
                hospitalDetails.setHospitalName(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_TWO)));
                hospitalDetails.setAddressLineOne(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_THREE)));
                hospitalDetails.setAddressLineTwo(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_FOUR)));
                hospitalDetails.setAddressLineThree(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_FIVE)));
                hospitalDetails.setCity(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_SIX)));
                hospitalDetails.setDistrict(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_SEVEN)));
                hospitalDetails.setContactNumber(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_EIGHT)));

                hospitalSearchList.add(hospitalDetails);

            }
        }

        cursor.close();

        return hospitalSearchList;
    }



    public HospitalDetails getHospitalDetails(String ID) {

        HospitalDetails hospitalDetails = new HospitalDetails();
        String selectQuery = "SELECT * FROM "+CreateDatabase.TABLE_HOSPITAL+" WHERE "+CreateDatabase.TABLE_HOSPITAL_COLUMN_ONE +" = "+ID;;
        Cursor cursor = database.rawQuery(selectQuery,null);

        rowCount = cursor.getCount();

        if (rowCount > 0) {
            while (cursor.moveToNext()) {


                hospitalDetails.setHospitalID(cursor.getLong(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_ONE)));
                hospitalDetails.setHospitalName(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_TWO)));
                hospitalDetails.setAddressLineOne(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_THREE)));
                hospitalDetails.setAddressLineTwo(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_FOUR)));
                hospitalDetails.setAddressLineThree(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_FIVE)));
                hospitalDetails.setCity(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_SIX)));
                hospitalDetails.setDistrict(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_SEVEN)));
                hospitalDetails.setContactNumber(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_HOSPITAL_COLUMN_EIGHT)));



            }
        }

        cursor.close();

        return hospitalDetails;
    }

   // get pharmacy list

    public List<PharmacyDetails> getPharmacyList(){

        List<PharmacyDetails> pharmacylList = new ArrayList<>();

        Cursor cursor = database.query(CreateDatabase.TABLE_PHARMACY,pharmacyDataColumns,null,null,null,null,null);


        rowCount = cursor.getCount();

        if (rowCount > 0){
            while (cursor.moveToNext()){
                PharmacyDetails pharmacyDetails = new PharmacyDetails();

                pharmacyDetails.setPharmacyID(cursor.getLong(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_ONE)));
                pharmacyDetails.setPharmacyName(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_TWO)));
                pharmacyDetails.setAddressLineOne(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_THREE)));
                pharmacyDetails.setAddressLineTwo(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_FOUR)));
                pharmacyDetails.setAddressLineThree(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_FIVE)));
                pharmacyDetails.setCity(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_SIX)));
                pharmacyDetails.setDistrict(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_SEVEN)));
                pharmacyDetails.setContactNumber(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_EIGHT)));



                pharmacylList.add(pharmacyDetails);

            }
        }

        cursor.close();

        return pharmacylList;
    }

    public List<PharmacyDetails> getPharmacySearch(String nearByPlace) {

        List<PharmacyDetails> pharmacySearchList = new ArrayList<>();
        String selectQuery = "SELECT * FROM "+CreateDatabase.TABLE_PHARMACY+" WHERE "+CreateDatabase.TABLE_PHARMACY_COLUMN_SIX+" LIKE '%"+nearByPlace+"%' OR "+CreateDatabase.TABLE_HOSPITAL_COLUMN_SEVEN+" LIKE '%"+nearByPlace+"%'";
        Cursor cursor = database.rawQuery(selectQuery,null);

        rowCount = cursor.getCount();

        if (rowCount > 0) {
            while (cursor.moveToNext()) {
                PharmacyDetails pharmacyDetails = new PharmacyDetails();

                pharmacyDetails.setPharmacyID(cursor.getLong(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_ONE)));
                pharmacyDetails.setPharmacyName(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_TWO)));
                pharmacyDetails.setAddressLineOne(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_THREE)));
                pharmacyDetails.setAddressLineTwo(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_FOUR)));
                pharmacyDetails.setAddressLineThree(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_FIVE)));
                pharmacyDetails.setCity(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_SIX)));
                pharmacyDetails.setDistrict(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_SEVEN)));
                pharmacyDetails.setContactNumber(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_EIGHT)));



                pharmacySearchList.add(pharmacyDetails);

            }
        }

        cursor.close();

        return pharmacySearchList;
    }

    public PharmacyDetails getPharmacyDetails(String ID) {

        PharmacyDetails pharmacyDetails = new PharmacyDetails();
        String selectQuery = "SELECT * FROM "+CreateDatabase.TABLE_PHARMACY+" WHERE "+CreateDatabase.TABLE_PHARMACY_COLUMN_ONE +" = "+ID;;
        Cursor cursor = database.rawQuery(selectQuery,null);

        rowCount = cursor.getCount();

        if (rowCount > 0) {
            while (cursor.moveToNext()) {

                pharmacyDetails.setPharmacyID(cursor.getLong(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_ONE)));
                pharmacyDetails.setPharmacyName(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_TWO)));
                pharmacyDetails.setAddressLineOne(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_THREE)));
                pharmacyDetails.setAddressLineTwo(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_FOUR)));
                pharmacyDetails.setAddressLineThree(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_FIVE)));
                pharmacyDetails.setCity(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_SIX)));
                pharmacyDetails.setDistrict(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_SEVEN)));
                pharmacyDetails.setContactNumber(cursor.getString(cursor.getColumnIndex(CreateDatabase.TABLE_PHARMACY_COLUMN_EIGHT)));



            }
        }

        cursor.close();

        return pharmacyDetails;
    }




}
