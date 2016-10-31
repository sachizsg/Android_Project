package csi.myapplication.models.databasemodel;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Sachithra on 4/19/2015.
 */
public class CreateDatabase extends SQLiteOpenHelper {

    private static final String LOGTAG = "SLMEDICARE";

    private static final String DATABASE_NAME = "slmedicare.db";
    private static final int DATABASE_VERSION= 1;

    public static String TABLE_HOSPITAL =  "hospital_table";

    public static String TABLE_HOSPITAL_COLUMN_ONE    = "hospitalID";
    public static String TABLE_HOSPITAL_COLUMN_TWO    = "hospitalname";
    public static String TABLE_HOSPITAL_COLUMN_THREE  = "addressLineOne";
    public static String TABLE_HOSPITAL_COLUMN_FOUR   = "addressLineTwo";
    public static String TABLE_HOSPITAL_COLUMN_FIVE   = "addressLineThree";
    public static String TABLE_HOSPITAL_COLUMN_SIX    = "city";
    public static String TABLE_HOSPITAL_COLUMN_SEVEN  = "district";
    public static String TABLE_HOSPITAL_COLUMN_EIGHT  = "contactNumber";


    private static final String CREATE_HOSPITAL_TABLE_QUERY = "CREATE TABLE "+TABLE_HOSPITAL+" ("+ TABLE_HOSPITAL_COLUMN_ONE +" INTEGER PRIMARY KEY AUTOINCREMENT," +TABLE_HOSPITAL_COLUMN_TWO+" TEXT,"+TABLE_HOSPITAL_COLUMN_THREE+" TEXT,"+TABLE_HOSPITAL_COLUMN_FOUR+" TEXT,"+TABLE_HOSPITAL_COLUMN_FIVE+" TEXT,"+TABLE_HOSPITAL_COLUMN_SIX+" TEXT,"+TABLE_HOSPITAL_COLUMN_SEVEN+" TEXT,"+TABLE_HOSPITAL_COLUMN_EIGHT+" TEXT )";


    public static String TABLE_PHARMACY = "pharmacy_table";

    public static String TABLE_PHARMACY_COLUMN_ONE   = "pharmacyID";
    public static String TABLE_PHARMACY_COLUMN_TWO   = "pharmacyName";
    public static String TABLE_PHARMACY_COLUMN_THREE = "addressLineOne";
    public static String TABLE_PHARMACY_COLUMN_FOUR  = "addressLineTwo";
    public static String TABLE_PHARMACY_COLUMN_FIVE  = "addressLineThree";
    public static String TABLE_PHARMACY_COLUMN_SIX   = "city";
    public static String TABLE_PHARMACY_COLUMN_SEVEN = "district";
    public static String TABLE_PHARMACY_COLUMN_EIGHT = "contactNumber";

    private static final String CREATE_PHARMACY_TABLE_QUERY = "CREATE TABLE "+TABLE_PHARMACY+" ("+ TABLE_PHARMACY_COLUMN_ONE +" INTEGER PRIMARY KEY AUTOINCREMENT," +TABLE_PHARMACY_COLUMN_TWO+" TEXT,"+TABLE_PHARMACY_COLUMN_THREE+" TEXT,"+TABLE_PHARMACY_COLUMN_FOUR+" TEXT,"+TABLE_PHARMACY_COLUMN_FIVE+" TEXT,"+TABLE_PHARMACY_COLUMN_SIX+" TEXT,"+TABLE_PHARMACY_COLUMN_SEVEN+" TEXT,"+TABLE_PHARMACY_COLUMN_EIGHT+" TEXT )";






    public CreateDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_HOSPITAL_TABLE_QUERY);
        Log.i(LOGTAG, "Hospital Table has been created.");

        db.execSQL(CREATE_PHARMACY_TABLE_QUERY);
        Log.i(LOGTAG, "Pharmacy Table has been created.");


        CreateHospitalData createHospitalData = new CreateHospitalData();
        createHospitalData.createHospitalData(db);

        CreatePharmacyData createPharmacyData = new CreatePharmacyData();
        createPharmacyData.createPharmacyData(db);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HOSPITAL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PHARMACY);
        onCreate(db);

    }










    }
