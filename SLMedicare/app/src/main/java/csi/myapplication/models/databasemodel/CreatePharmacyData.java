package csi.myapplication.models.databasemodel;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import csi.myapplication.models.applicationmodel.PharmacyDetails;

/**
 * Created by Sachithra on 4/28/2015.
 */
public class CreatePharmacyData {
    public void createPharmacyData(SQLiteDatabase db){

        PharmacyDetails pharmacyDetails = new PharmacyDetails();

        pharmacyDetails.setPharmacyName("Central Hospital");
        pharmacyDetails.setAddressLineOne("114");
        pharmacyDetails.setAddressLineTwo("Norris Canal Road");
        pharmacyDetails.setAddressLineThree("Colombo 10");
        pharmacyDetails.setCity("Colombo 10");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0114665500");

        this.createPharmacy(pharmacyDetails, db);



        pharmacyDetails.setPharmacyName("Healthguard Pharmacy");
        pharmacyDetails.setAddressLineOne("Healthguard Pharmacy");
        pharmacyDetails.setAddressLineTwo("Stanley Tillekerathne Mawatha");
        pharmacyDetails.setAddressLineThree("Nugegoda");
        pharmacyDetails.setCity("Nugegoda");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0114716471");

        this.createPharmacy(pharmacyDetails, db);


        pharmacyDetails.setPharmacyName("Healthguard Pharmacy");
        pharmacyDetails.setAddressLineOne("857/A,");
        pharmacyDetails.setAddressLineTwo("Kotte Road B120");
        pharmacyDetails.setAddressLineThree("Sri Jayawardenepura Kotte");
        pharmacyDetails.setCity("Kotte");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0114694854");

        this.createPharmacy(pharmacyDetails, db);


        pharmacyDetails.setPharmacyName("State Pharmaceutical Manufacturing Corporation");
        pharmacyDetails.setAddressLineOne("11");
        pharmacyDetails.setAddressLineTwo("Sir John Kotelawela Mw");
        pharmacyDetails.setAddressLineThree("Dehiwala-Mount Lavinia");
        pharmacyDetails.setCity("Mount Lavinia");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0112635353");

        this.createPharmacy(pharmacyDetails, db);


        pharmacyDetails.setPharmacyName("Rajya Osu Sala");
        pharmacyDetails.setAddressLineOne("71 A,");
        pharmacyDetails.setAddressLineTwo("Alwis Plaza, Old Road,B335");
        pharmacyDetails.setAddressLineThree("Maharagama");
        pharmacyDetails.setCity("Maharagama");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0112745640");

        this.createPharmacy(pharmacyDetails, db);


        pharmacyDetails.setPharmacyName("JN Pharmacy");
        pharmacyDetails.setAddressLineOne("JN Pharmacy");
        pharmacyDetails.setAddressLineTwo("Battaramulla Rd");
        pharmacyDetails.setAddressLineThree("Sri Jayawardenepura Kotte");
        pharmacyDetails.setCity("Kotte");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0114665500");

        this.createPharmacy(pharmacyDetails, db);


        pharmacyDetails.setPharmacyName("Aloka Whole Sale Pharmacy");
        pharmacyDetails.setAddressLineOne("45/B");
        pharmacyDetails.setAddressLineTwo("Cancer Hospital Rd");
        pharmacyDetails.setAddressLineThree("Maharagama");
        pharmacyDetails.setCity("Maharagama");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0112088824");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Sunethra Pharmacy");
        pharmacyDetails.setAddressLineOne("38/3,");
        pharmacyDetails.setAddressLineTwo("Pitipana Junction");
        pharmacyDetails.setAddressLineThree("Homagama Colombo-Batticaloa Hwy Homagama");
        pharmacyDetails.setCity("Colombo 10");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0114665500");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Omaya Pharmacy");
        pharmacyDetails.setAddressLineOne("No;292,");
        pharmacyDetails.setAddressLineTwo("Galle Road,");
        pharmacyDetails.setAddressLineThree("Ratmalana.");
        pharmacyDetails.setCity("Ratmalana");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0779303938");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Raj Pharmacy");
        pharmacyDetails.setAddressLineOne("189");
        pharmacyDetails.setAddressLineTwo("W A. Silva Mawatha");
        pharmacyDetails.setAddressLineThree("Colombo 00600");
        pharmacyDetails.setCity("Colombo");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0114665500");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Rex Pharmacy");
        pharmacyDetails.setAddressLineOne("61A");
        pharmacyDetails.setAddressLineTwo("St Joseph's St");
        pharmacyDetails.setAddressLineThree("Colombo");
        pharmacyDetails.setCity("Colombo");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0777201698");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("BioPlus Pharmacy (Pvt) Ltd");
        pharmacyDetails.setAddressLineOne("261,");
        pharmacyDetails.setAddressLineTwo("Matale Road");
        pharmacyDetails.setAddressLineThree("Akurana 20850");
        pharmacyDetails.setCity("Akurana");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0812305070");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Raj Medical (Pvt) Ltd");
        pharmacyDetails.setAddressLineOne("No:46");
        pharmacyDetails.setAddressLineTwo("Peradeniya road");
        pharmacyDetails.setAddressLineThree("Katukelle");
        pharmacyDetails.setCity("Katukelle");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0772346023");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Nuwara Osu-Kandy Ayurvedic Pharmacy Ltd");
        pharmacyDetails.setAddressLineOne("56");
        pharmacyDetails.setAddressLineTwo("Yatinuwara Veediya");
        pharmacyDetails.setAddressLineThree("Kandy 20000");
        pharmacyDetails.setCity("Kandy");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0812224025");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("State Pharmasutical Corporation");
        pharmacyDetails.setAddressLineOne("14 ");
        pharmacyDetails.setAddressLineTwo("Lamagaraya Rd");
        pharmacyDetails.setAddressLineThree("Kandy 20000");
        pharmacyDetails.setCity("Kandy");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0812225175");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Suwasewana Hospital");
        pharmacyDetails.setAddressLineOne("No: 532");
        pharmacyDetails.setAddressLineTwo("Siebel Pl");
        pharmacyDetails.setAddressLineThree("Kandy 20000");
        pharmacyDetails.setCity("Kandy");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0812222404");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Pinketha Ayurvedic Pharmacy");
        pharmacyDetails.setAddressLineOne("Pinketha Ayurvedic Pharmacy");
        pharmacyDetails.setAddressLineTwo("Kundasale");
        pharmacyDetails.setAddressLineThree("Digana");
        pharmacyDetails.setCity("Digana");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0779366071");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Nawamini Pharmacy & Channel Center");
        pharmacyDetails.setAddressLineOne("254/6 ");
        pharmacyDetails.setAddressLineTwo("Kandy-Mahiyangane-Padiyatalawa Highway");
        pharmacyDetails.setAddressLineThree("Karalliyadda");
        pharmacyDetails.setCity("Karalliyadda");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0812374515");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Wayamba Medicals");
        pharmacyDetails.setAddressLineOne("No:140,");
        pharmacyDetails.setAddressLineTwo("C.W.E.Building,Colombo Road");
        pharmacyDetails.setAddressLineThree("Kurunegala 60000");
        pharmacyDetails.setCity("Kurunegala");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0372222174");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Dr Pharma");
        pharmacyDetails.setAddressLineOne("372");
        pharmacyDetails.setAddressLineTwo("Matale Rd");
        pharmacyDetails.setAddressLineThree("Akurana");
        pharmacyDetails.setCity("Akurana");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0812051900");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Kumudu Hospital");
        pharmacyDetails.setAddressLineOne("48");
        pharmacyDetails.setAddressLineTwo("Kandy-Jaffna Hwy");
        pharmacyDetails.setAddressLineThree("Matale");
        pharmacyDetails.setCity("Matale");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0662222244");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Orchid Pharmacy");
        pharmacyDetails.setAddressLineOne("Orchid Pharmacy");
        pharmacyDetails.setAddressLineTwo("Colombo - Kandy Rd");
        pharmacyDetails.setAddressLineThree("Ambepussa");
        pharmacyDetails.setCity("Ambepussa");
        pharmacyDetails.setDistrict("Kandy");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Lolitha Pharmacy");
        pharmacyDetails.setAddressLineOne("Lolitha Pharmacy");
        pharmacyDetails.setAddressLineTwo("Hettipola Road");
        pharmacyDetails.setAddressLineThree("Kuliyapitiya");
        pharmacyDetails.setCity("Kuliyapitiya");
        pharmacyDetails.setDistrict("Kurunegala");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Asiri Pharmacy");
        pharmacyDetails.setAddressLineOne("Asiri Pharmacy");
        pharmacyDetails.setAddressLineTwo("Kurunegala-Narammala-Madampe Road");
        pharmacyDetails.setAddressLineThree("Kuliyapitiya");
        pharmacyDetails.setCity("Kuliyapitiya");
        pharmacyDetails.setDistrict("Kurunegala");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("CBL SUWANETH PHARMACY");
        pharmacyDetails.setAddressLineOne("CBL SUWANETH PHARMACY");
        pharmacyDetails.setAddressLineTwo("1st Ln");
        pharmacyDetails.setAddressLineThree("Kuliyapitiya");
        pharmacyDetails.setCity("Kuliyapitiya");
        pharmacyDetails.setDistrict("Kurunegala");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Desha Pharmacy");
        pharmacyDetails.setAddressLineOne("Desha Pharmacy");
        pharmacyDetails.setAddressLineTwo("Fort Rd");
        pharmacyDetails.setAddressLineThree("Chilaw");
        pharmacyDetails.setCity("Chilaw");
        pharmacyDetails.setDistrict("Puttalam");
        pharmacyDetails.setContactNumber("0322222143");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Royal Pharmacy");
        pharmacyDetails.setAddressLineOne("No 321/1");
        pharmacyDetails.setAddressLineTwo("Chilaw Road,Periyamulla");
        pharmacyDetails.setAddressLineThree("Negombo");
        pharmacyDetails.setCity("Negombo");
        pharmacyDetails.setDistrict("Gampaha");
        pharmacyDetails.setContactNumber("0315616222");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Unique Pharmacy");
        pharmacyDetails.setAddressLineOne("Unique Pharmacy");
        pharmacyDetails.setAddressLineTwo("Abesekara Ln");
        pharmacyDetails.setAddressLineThree("Negombo 11500");
        pharmacyDetails.setCity("Negombo");
        pharmacyDetails.setDistrict("Gampaha");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Robert Pharmacy");
        pharmacyDetails.setAddressLineOne("Robert Pharmacy");
        pharmacyDetails.setAddressLineTwo("Kimbulapitiya Rd");
        pharmacyDetails.setAddressLineThree("Negombo 11500");
        pharmacyDetails.setCity("Negombo");
        pharmacyDetails.setDistrict("Gampaha");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Supreme Pharmacy");
        pharmacyDetails.setAddressLineOne("Supreme Pharmacy");
        pharmacyDetails.setAddressLineTwo("Negombo - Giriulla Rd");
        pharmacyDetails.setAddressLineThree("Negombo");
        pharmacyDetails.setCity("Negombo");
        pharmacyDetails.setDistrict("Gampaha");
        pharmacyDetails.setContactNumber("0312220884");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Udaya Pharmacy & Grocery");
        pharmacyDetails.setAddressLineOne("Udaya Pharmacy & Grocery");
        pharmacyDetails.setAddressLineTwo("04 A2");
        pharmacyDetails.setAddressLineThree("Panadura");
        pharmacyDetails.setCity("Panadura");
        pharmacyDetails.setDistrict("Kalutara");
        pharmacyDetails.setContactNumber("0382234088");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Waruna Pharmacy");
        pharmacyDetails.setAddressLineOne("410");
        pharmacyDetails.setAddressLineTwo("Old Colombo - Galle Road");
        pharmacyDetails.setAddressLineThree("Panadura");
        pharmacyDetails.setCity("Panadura");
        pharmacyDetails.setDistrict("Kalutara");
        pharmacyDetails.setContactNumber("0382236328");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Bimka Pharmacy");
        pharmacyDetails.setAddressLineOne("Bimka Pharmacy");
        pharmacyDetails.setAddressLineTwo("Colombo - Horana Road");
        pharmacyDetails.setAddressLineThree("Piliyandala");
        pharmacyDetails.setCity("Piliyandala");
        pharmacyDetails.setDistrict("Colombo");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Get Well Pharmacy");
        pharmacyDetails.setAddressLineOne("No 886");
        pharmacyDetails.setAddressLineTwo("Jaffna-Kankesanturai Rd");
        pharmacyDetails.setAddressLineThree("Jaffna 40000");
        pharmacyDetails.setCity("Jaffna");
        pharmacyDetails.setDistrict("Jaffna");
        pharmacyDetails.setContactNumber("0212228851");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Prince Pharmacy");
        pharmacyDetails.setAddressLineOne("No:462D");
        pharmacyDetails.setAddressLineTwo("Hospital St");
        pharmacyDetails.setAddressLineThree("Jaffna 40000");
        pharmacyDetails.setCity("Jaffna");
        pharmacyDetails.setDistrict("Jaffna");
        pharmacyDetails.setContactNumber("0776252883");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Nadana Murugan Medical Hall");
        pharmacyDetails.setAddressLineOne("222");
        pharmacyDetails.setAddressLineTwo("Hospital Road, Jaffna");
        pharmacyDetails.setAddressLineThree("Jaffna 40000");
        pharmacyDetails.setCity("Jaffna");
        pharmacyDetails.setDistrict("Jaffna");
        pharmacyDetails.setContactNumber("0777667659");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Royal Plus");
        pharmacyDetails.setAddressLineOne("Royal Plus");
        pharmacyDetails.setAddressLineTwo("Wanigasinghe St");
        pharmacyDetails.setAddressLineThree("Batticaloa");
        pharmacyDetails.setCity("Batticaloa");
        pharmacyDetails.setDistrict("Batticaloa");
        pharmacyDetails.setContactNumber("0775003093");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Uthuman Son's Pharmacy");
        pharmacyDetails.setAddressLineOne("Uthuman Son's Pharmacy");
        pharmacyDetails.setAddressLineTwo("Colombo-Batticaloa Hwy");
        pharmacyDetails.setAddressLineThree("Maruthamunai");
        pharmacyDetails.setCity("Batticaloa");
        pharmacyDetails.setDistrict("Batticaloa");
        pharmacyDetails.setContactNumber("0672229238");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Crescent Pharmacy");
        pharmacyDetails.setAddressLineOne("Crescent Pharmacy");
        pharmacyDetails.setAddressLineTwo("Colombo-Batticaloa Hwy");
        pharmacyDetails.setAddressLineThree("Akkaraipattu 32400");
        pharmacyDetails.setCity("Akkaraipattu");
        pharmacyDetails.setDistrict("Ampara");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Akkaraipattu Nursing Home");
        pharmacyDetails.setAddressLineOne("Akkaraipattu Nursing Home");
        pharmacyDetails.setAddressLineTwo("Main Street");
        pharmacyDetails.setAddressLineThree("Akkaraipattu, Akkaraipattu");
        pharmacyDetails.setCity("Akkaraipattu");
        pharmacyDetails.setDistrict("Ampara");
        pharmacyDetails.setContactNumber("0672277426");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("New Monaragala Pharmacy");
        pharmacyDetails.setAddressLineOne("New Monaragala Pharmacy");
        pharmacyDetails.setAddressLineTwo("Colombo-Batticaloa Hwy");
        pharmacyDetails.setAddressLineThree("Siyambalanduwa");
        pharmacyDetails.setCity("Siyambalanduwa");
        pharmacyDetails.setDistrict("Moneragala");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Medisi Pharmacy");
        pharmacyDetails.setAddressLineOne("Medisi Pharmacy");
        pharmacyDetails.setAddressLineTwo("Sir Jayathilake Mawatha");
        pharmacyDetails.setAddressLineThree("Nuwara Eliya");
        pharmacyDetails.setCity("Nuwara Eliya");
        pharmacyDetails.setDistrict("Nuwara Eliya");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Pharmacy Hawaeliya");
        pharmacyDetails.setAddressLineOne("Pharmacy Hawaeliya");
        pharmacyDetails.setAddressLineTwo("Hawa Eliya");
        pharmacyDetails.setAddressLineThree("Nuwara Eliya");
        pharmacyDetails.setCity("Nuwara Eliya");
        pharmacyDetails.setDistrict("Nuwara Eliya");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Gavis Pharmacy");
        pharmacyDetails.setAddressLineOne("Gavis Pharmacy");
        pharmacyDetails.setAddressLineTwo("South Lane");
        pharmacyDetails.setAddressLineThree("Badulla");
        pharmacyDetails.setCity("Badulla");
        pharmacyDetails.setDistrict("Badulla");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("New City Pharmacy");
        pharmacyDetails.setAddressLineOne("3");
        pharmacyDetails.setAddressLineTwo("Udaya Raja Mawatha");
        pharmacyDetails.setAddressLineThree("Badulla");
        pharmacyDetails.setCity("Badulla");
        pharmacyDetails.setDistrict("Badulla");
        pharmacyDetails.setContactNumber("0554924204");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Vision Pharmacy");
        pharmacyDetails.setAddressLineOne("Vision Pharmacy");
        pharmacyDetails.setAddressLineTwo("Bandarawela Road");
        pharmacyDetails.setAddressLineThree("Badulla");
        pharmacyDetails.setCity("Badulla");
        pharmacyDetails.setDistrict("Badulla");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("City Pharmacy");
        pharmacyDetails.setAddressLineOne("City Pharmacy");
        pharmacyDetails.setAddressLineTwo("Bazaar Street");
        pharmacyDetails.setAddressLineThree("Badulla");
        pharmacyDetails.setCity("Badulla");
        pharmacyDetails.setDistrict("Badulla");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Sri Pharmacy");
        pharmacyDetails.setAddressLineOne("Sri Pharmacy");
        pharmacyDetails.setAddressLineTwo("Peradeniya-Badulla-Chenkaladi Highway");
        pharmacyDetails.setAddressLineThree("Hali-ela");
        pharmacyDetails.setCity("Hali-ela");
        pharmacyDetails.setDistrict("Badulla");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Kumara Pharmacy");
        pharmacyDetails.setAddressLineOne("Kumara Pharmacy");
        pharmacyDetails.setAddressLineTwo("Wiyalakumbura ");
        pharmacyDetails.setAddressLineThree("- Bogahakumbura Rd");
        pharmacyDetails.setCity("Ambegoda");
        pharmacyDetails.setDistrict("Badulla");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Godakawela Pharmacy");
        pharmacyDetails.setAddressLineOne("Godakawela Pharmacy");
        pharmacyDetails.setAddressLineTwo("Pelmadulla-Embilipitiya-Nonagama Highway");
        pharmacyDetails.setAddressLineThree("");
        pharmacyDetails.setCity("Madampe");
        pharmacyDetails.setDistrict("Puttalam");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("INDIKA PHARMACY");
        pharmacyDetails.setAddressLineOne("INDIKA PHARMACY");
        pharmacyDetails.setAddressLineTwo("Hospital Rd");
        pharmacyDetails.setAddressLineThree("Embilipitiya");
        pharmacyDetails.setCity("Embilipitiya");
        pharmacyDetails.setDistrict("Ratnapura");
        pharmacyDetails.setContactNumber("0777928655");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Holton Pharmacy");
        pharmacyDetails.setAddressLineOne("Holton Pharmacy");
        pharmacyDetails.setAddressLineTwo("Beliatta - Walasmulla Road");
        pharmacyDetails.setAddressLineThree("Walasmulla");
        pharmacyDetails.setCity("Walasmulla");
        pharmacyDetails.setDistrict("Hambantota");
        pharmacyDetails.setContactNumber("0355633009");

        this.createPharmacy(pharmacyDetails, db);

        pharmacyDetails.setPharmacyName("Wickramasekara Pharmacy");
        pharmacyDetails.setAddressLineOne("Wickramasekara Pharmacy");
        pharmacyDetails.setAddressLineTwo("Hakmana Mulatiyana Rd");
        pharmacyDetails.setAddressLineThree("Deyiyandara Town");
        pharmacyDetails.setCity("Deyiyandara");
        pharmacyDetails.setDistrict("Matara");
        pharmacyDetails.setContactNumber("0412268448");

        this.createPharmacy(pharmacyDetails, db);




    }

    public PharmacyDetails createPharmacy(PharmacyDetails pharmacyDetails , SQLiteDatabase db){

        ContentValues values = new ContentValues();
        values.put(CreateDatabase.TABLE_PHARMACY_COLUMN_TWO, pharmacyDetails.getPharmacyName());
        values.put(CreateDatabase.TABLE_PHARMACY_COLUMN_THREE, pharmacyDetails.getAddressLineOne());
        values.put(CreateDatabase.TABLE_PHARMACY_COLUMN_FOUR, pharmacyDetails.getAddressLineTwo());
        values.put(CreateDatabase.TABLE_PHARMACY_COLUMN_FIVE, pharmacyDetails.getAddressLineThree());
        values.put(CreateDatabase.TABLE_PHARMACY_COLUMN_SIX, pharmacyDetails.getCity());
        values.put(CreateDatabase.TABLE_PHARMACY_COLUMN_SEVEN, pharmacyDetails.getDistrict());
        values.put(CreateDatabase.TABLE_PHARMACY_COLUMN_EIGHT, pharmacyDetails.getContactNumber());

        long insertID = db.insert(CreateDatabase.TABLE_PHARMACY,null,values);

        pharmacyDetails.setPharmacyID(insertID);

        return pharmacyDetails;


    }
}
