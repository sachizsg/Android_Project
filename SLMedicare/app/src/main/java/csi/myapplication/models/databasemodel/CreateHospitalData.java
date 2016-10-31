package csi.myapplication.models.databasemodel;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import csi.myapplication.models.applicationmodel.HospitalDetails;

/**
 * Created by Sachithra on 4/19/2015.
 */
public class CreateHospitalData {


    //create table data to insert into table
    public void createHospitalData(SQLiteDatabase db){
        HospitalDetails hospitalDetails = new HospitalDetails();

        hospitalDetails.setHospitalName("Central Hospital");

        hospitalDetails.setAddressLineOne("114");
        hospitalDetails.setAddressLineTwo("Norris Canal Road");
        hospitalDetails.setAddressLineThree("Colombo 10");
        hospitalDetails.setCity("Colombo 10");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0114665500");


        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Asiri Hospital");
        hospitalDetails.setAddressLineOne("181");
        hospitalDetails.setAddressLineTwo("Kirula Road");
        hospitalDetails.setAddressLineThree("Narahenpita");
        hospitalDetails.setCity("Colombo 05");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0114523300");



        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Asiri Surgical Hospital");
        hospitalDetails.setAddressLineOne("21");
        hospitalDetails.setAddressLineTwo("Kirimandala Mawatha");
        hospitalDetails.setAddressLineThree("Narahenpita");
        hospitalDetails.setCity("Colombo 05");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0114524400");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Asiri Hospital Matara");
        hospitalDetails.setAddressLineOne("191");
        hospitalDetails.setAddressLineTwo("Anagarika Dhamapala Mw");
        hospitalDetails.setAddressLineThree("Matara");
        hospitalDetails.setCity("Matara");
        hospitalDetails.setDistrict("Matara");
        hospitalDetails.setContactNumber("0414390900");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Lanka Hospital");
        hospitalDetails.setAddressLineOne("578");
        hospitalDetails.setAddressLineTwo("Elvitigala Mawatha");
        hospitalDetails.setAddressLineThree("Narahenpita");
        hospitalDetails.setCity("Colombo 05");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0115530000");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Durdans Hospital");
        hospitalDetails.setAddressLineOne("3");
        hospitalDetails.setAddressLineTwo("Alfred Place");
        hospitalDetails.setAddressLineThree("Colombo 03");
        hospitalDetails.setCity("Colombo 03");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0115410000");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Nawaloka Hospital");
        hospitalDetails.setAddressLineOne("23");
        hospitalDetails.setAddressLineTwo("Deshamanya H K Dharmadasa Mawatha");
        hospitalDetails.setAddressLineThree("Colombo 02");
        hospitalDetails.setCity("Colombo 02");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0115577111");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Nawaloka Medical center Kotte");
        hospitalDetails.setAddressLineOne("770");
        hospitalDetails.setAddressLineTwo("Pannipitiya Road");
        hospitalDetails.setAddressLineThree("Battaramulla");
        hospitalDetails.setCity("Battaramulla");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0115547755");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Nawaloka Medical Centre Dalugama");
        hospitalDetails.setAddressLineOne("286 ");
        hospitalDetails.setAddressLineTwo("Kandy Road");
        hospitalDetails.setAddressLineThree("Dalugama");
        hospitalDetails.setCity("Dalugama");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0115552244");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Blue Cross Medical Centre");
        hospitalDetails.setAddressLineOne("682");
        hospitalDetails.setAddressLineTwo("Borella Rajagiriya Rd");
        hospitalDetails.setAddressLineThree("Colombo 10");
        hospitalDetails.setCity("Colombo 10");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112876888");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Park Hospital");
        hospitalDetails.setAddressLineOne("186");
        hospitalDetails.setAddressLineTwo("Park Road");
        hospitalDetails.setAddressLineThree("Colombo 05");
        hospitalDetails.setCity("Colombo 05");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112590200");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("OASIS Hospital");
        hospitalDetails.setAddressLineOne("18/A");
        hospitalDetails.setAddressLineTwo("Muhandiram E D Dabare Mawatha");
        hospitalDetails.setAddressLineThree("Colombo 05");
        hospitalDetails.setCity("Colombo 05");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0115506000");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Royal Hospital");
        hospitalDetails.setAddressLineOne("62");
        hospitalDetails.setAddressLineTwo("W.A.Silva Mawatha");
        hospitalDetails.setAddressLineThree("Wellawatta");
        hospitalDetails.setCity("Colombo 06");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112559268");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Dr.Neville Fernando Hospital");
        hospitalDetails.setAddressLineOne("Millennium Drive");
        hospitalDetails.setAddressLineTwo("Off Chandrika Kumaratunga Mawatha");
        hospitalDetails.setAddressLineThree("Malabe 10115");
        hospitalDetails.setCity("Malabe");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112407600");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Arogya Hospital");
        hospitalDetails.setAddressLineOne("250");
        hospitalDetails.setAddressLineTwo("Minuwangoda-Gampaha-Miriswatta Rd");
        hospitalDetails.setAddressLineThree("Gampaha");
        hospitalDetails.setCity("Gampaha");
        hospitalDetails.setDistrict("Gampaha");
        hospitalDetails.setContactNumber("0332224592");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("New Philip Hospital");
        hospitalDetails.setAddressLineOne("225");
        hospitalDetails.setAddressLineTwo("Galle Road");
        hospitalDetails.setAddressLineThree("Kalutara South");
        hospitalDetails.setCity("Kalutara");
        hospitalDetails.setDistrict("Kalutara");
        hospitalDetails.setContactNumber("0342222888");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("MDK Hospital");
        hospitalDetails.setAddressLineOne("149");
        hospitalDetails.setAddressLineTwo("Sri Ariyavilasa Road");
        hospitalDetails.setAddressLineThree("Horana");
        hospitalDetails.setCity("Horana");
        hospitalDetails.setDistrict("Kalutara");
        hospitalDetails.setContactNumber("0347888888");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Borella Private Hospital");
        hospitalDetails.setAddressLineOne("75");
        hospitalDetails.setAddressLineTwo("Cotta Road");
        hospitalDetails.setAddressLineThree("Grenier Rd");
        hospitalDetails.setCity("Colombo 08");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112692753");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Sulaimans Hospital");

        hospitalDetails.setAddressLineOne("34-S4");
        hospitalDetails.setAddressLineTwo("Grandpass Road");
        hospitalDetails.setAddressLineThree("Colombo 14");
        hospitalDetails.setCity("Colombo 14");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112472754");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Ninewells Care");

        hospitalDetails.setAddressLineOne("55/1");
        hospitalDetails.setAddressLineTwo("Kirimandala Mawatha");
        hospitalDetails.setAddressLineThree("Colombo 05");
        hospitalDetails.setCity("Colombo 05");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0114520999");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("New Delmon Hospital");

        hospitalDetails.setAddressLineOne("258");
        hospitalDetails.setAddressLineTwo("Galle Road");
        hospitalDetails.setAddressLineThree("Wellawatte");
        hospitalDetails.setCity("Colombo 06");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112558800");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Ceymed Helthcare Service");

        hospitalDetails.setAddressLineOne("132");
        hospitalDetails.setAddressLineTwo("S.De.S.Jayasinghe Mawatha");
        hospitalDetails.setAddressLineThree("Nugegoda");
        hospitalDetails.setCity("Nugegoda");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0114308877");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Ceymed Healthcare Services");

        hospitalDetails.setAddressLineOne("370");
        hospitalDetails.setAddressLineTwo("Hospital Road");
        hospitalDetails.setAddressLineThree("Kalubowila");
        hospitalDetails.setCity("Nugegoda");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0114202588");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Hemas Hospital");

        hospitalDetails.setAddressLineOne("389");
        hospitalDetails.setAddressLineTwo("Negombo Road");
        hospitalDetails.setAddressLineThree("Wattala");
        hospitalDetails.setCity("Wattala");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0117888888");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Hemas Southern Hospital, Galle");

        hospitalDetails.setAddressLineOne("10");
        hospitalDetails.setAddressLineTwo("Wakwella Road");
        hospitalDetails.setAddressLineThree("Galle");
        hospitalDetails.setCity("Galle");
        hospitalDetails.setDistrict("Galle");
        hospitalDetails.setContactNumber("0914640640");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Golden Key Eye and ENT Hospital");
        hospitalDetails.setAddressLineOne("1175A");
        hospitalDetails.setAddressLineTwo("Cotta Road");
        hospitalDetails.setAddressLineThree("Rajagiriya");
        hospitalDetails.setCity("Rajagiriya");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112880288");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Sachitra Hospital");
        hospitalDetails.setAddressLineOne("76");
        hospitalDetails.setAddressLineTwo("Horana Rd");
        hospitalDetails.setAddressLineThree("Panadura");
        hospitalDetails.setCity("Panadura");
        hospitalDetails.setDistrict("Kalutara");
        hospitalDetails.setContactNumber("0382240425");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Medihelp Hospital");
        hospitalDetails.setAddressLineOne("172/3");
        hospitalDetails.setAddressLineTwo("Panadura road");
        hospitalDetails.setAddressLineThree("Horana");
        hospitalDetails.setCity("Horana");
        hospitalDetails.setDistrict("Kalutara");
        hospitalDetails.setContactNumber("0342261115");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Leesons Private Hospital");
        hospitalDetails.setAddressLineOne("33");
        hospitalDetails.setAddressLineTwo("Tewatte Road");
        hospitalDetails.setAddressLineThree("Ragama");
        hospitalDetails.setCity("Ragama");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112961300");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Holton Hospital");
        hospitalDetails.setAddressLineOne("135");
        hospitalDetails.setAddressLineTwo("Matara Road");
        hospitalDetails.setAddressLineThree("Walasmulla");
        hospitalDetails.setCity("Walasmulla");
        hospitalDetails.setDistrict("Hambantota");
        hospitalDetails.setContactNumber("0474650660");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Jeewaka Private Hospital");
        hospitalDetails.setAddressLineOne("37");
        hospitalDetails.setAddressLineTwo("Horana Road");
        hospitalDetails.setAddressLineThree("Padukka");
        hospitalDetails.setCity("Padukka");
        hospitalDetails.setDistrict("Kalutara");
        hospitalDetails.setContactNumber("0342859157");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Joseph Frazer Memorial Hospital");
        hospitalDetails.setAddressLineOne("23");
        hospitalDetails.setAddressLineTwo("Joseph Fraser Road");
        hospitalDetails.setAddressLineThree("Colombo 05");
        hospitalDetails.setCity("Colombo 05");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112588386");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Santa Dora Hospital");
        hospitalDetails.setAddressLineOne("173");
        hospitalDetails.setAddressLineTwo("Pannipitiya Rd");
        hospitalDetails.setAddressLineThree("Battaramulla");
        hospitalDetails.setCity("Battaramulla");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112874874");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Osro Hospital");
        hospitalDetails.setAddressLineOne("Kandy Road");
        hospitalDetails.setAddressLineTwo("Mawanella");
        hospitalDetails.setAddressLineThree("Kegalle");
        hospitalDetails.setCity("Mawanella");
        hospitalDetails.setDistrict("Kegalle");
        hospitalDetails.setContactNumber("0352246125");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Ceylinco Healthcare Centre");
        hospitalDetails.setAddressLineOne("60");
        hospitalDetails.setAddressLineTwo("Park Street");
        hospitalDetails.setAddressLineThree("Colombo 02");
        hospitalDetails.setCity("Colombo 02");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112490290");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Western Hospital");
        hospitalDetails.setAddressLineOne("218");
        hospitalDetails.setAddressLineTwo("Cotta Road");
        hospitalDetails.setAddressLineThree("Colombo 08");
        hospitalDetails.setCity("Colombo 08");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0117392260");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Mohotti Pvt Hospital");
        hospitalDetails.setAddressLineOne("08");
        hospitalDetails.setAddressLineTwo("Spencer Road");
        hospitalDetails.setAddressLineThree("Matara");
        hospitalDetails.setCity("Matara");
        hospitalDetails.setDistrict("Matara");
        hospitalDetails.setContactNumber("0412230737");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Sethma Hospital");
        hospitalDetails.setAddressLineOne("36");
        hospitalDetails.setAddressLineTwo("Queen Marys Road");
        hospitalDetails.setAddressLineThree("Gampaha");
        hospitalDetails.setCity("Gampaha");
        hospitalDetails.setDistrict("Gampaha");
        hospitalDetails.setContactNumber("0335626626");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Suwasewana Hospital");
        hospitalDetails.setAddressLineOne("532");
        hospitalDetails.setAddressLineTwo("Peradeniya Road");
        hospitalDetails.setAddressLineThree("Kandy");
        hospitalDetails.setCity("Kandy");
        hospitalDetails.setDistrict("Kandy");
        hospitalDetails.setContactNumber("0812222404");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Seth Sevana Hospital");
        hospitalDetails.setAddressLineOne("226");
        hospitalDetails.setAddressLineTwo("Colombo Road");
        hospitalDetails.setAddressLineThree("Kurunegala");
        hospitalDetails.setCity("Kurunegala");
        hospitalDetails.setDistrict("Kurunegala");
        hospitalDetails.setContactNumber("0372232365");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Kandy Private Hospital");
        hospitalDetails.setAddressLineOne("255/8");
        hospitalDetails.setAddressLineTwo("Katugastota Road");
        hospitalDetails.setAddressLineThree("Kandy");
        hospitalDetails.setCity("Kandy");
        hospitalDetails.setDistrict("Kandy");
        hospitalDetails.setContactNumber("0812225474");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Lakeside Adventists Hospital");
        hospitalDetails.setAddressLineOne("40");
        hospitalDetails.setAddressLineTwo("Sangaraja Mw");
        hospitalDetails.setAddressLineThree("Kandy");
        hospitalDetails.setCity("Kandy");
        hospitalDetails.setDistrict("Kandy");
        hospitalDetails.setContactNumber("0812223466");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Winserr Hospital");
        hospitalDetails.setAddressLineOne("129");
        hospitalDetails.setAddressLineTwo("S De S Jayasinghe Mawatha");
        hospitalDetails.setAddressLineThree("Kohuwala");
        hospitalDetails.setCity("Nugegoda");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0114341915");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Medicare Hospital Colombo");
        hospitalDetails.setAddressLineOne("55");
        hospitalDetails.setAddressLineTwo("Ananda Rajakaruna Mw");
        hospitalDetails.setAddressLineThree("Colombo 10");
        hospitalDetails.setCity("Colombo 10");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112697261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Rathnams Private Hospital");
        hospitalDetails.setAddressLineOne("227");
        hospitalDetails.setAddressLineTwo("Union Place");
        hospitalDetails.setAddressLineThree("Colombo 02");
        hospitalDetails.setCity("Colombo 02");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112327780");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Macarthy Private Hospital");
        hospitalDetails.setAddressLineOne("22");
        hospitalDetails.setAddressLineTwo("Wijerama Mawatha");
        hospitalDetails.setAddressLineThree("Colombo 07");
        hospitalDetails.setCity("Colombo 07");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112693953");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Aloka Private Hospital");
        hospitalDetails.setAddressLineOne("64");
        hospitalDetails.setAddressLineTwo("Goodshed Road");
        hospitalDetails.setAddressLineThree("Ratnapura");
        hospitalDetails.setCity("Ratnapura");
        hospitalDetails.setDistrict("Ratnapura");
        hospitalDetails.setContactNumber("0452223200");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Abisha Hospital");
        hospitalDetails.setAddressLineOne("24 A");
        hospitalDetails.setAddressLineTwo("Katkuli");
        hospitalDetails.setAddressLineThree("Vavuniya");
        hospitalDetails.setCity("Vavuniya");
        hospitalDetails.setDistrict("Vavuniya");
        hospitalDetails.setContactNumber("0242221474");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Balasooriya Hospital");
        hospitalDetails.setAddressLineOne("118");
        hospitalDetails.setAddressLineTwo("Kurunegala Road");
        hospitalDetails.setAddressLineThree("Puttalam");
        hospitalDetails.setCity("Puttalam");
        hospitalDetails.setDistrict("Puttalam");
        hospitalDetails.setContactNumber("0322266266");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Ave Maria Hospital");
        hospitalDetails.setAddressLineOne("01");
        hospitalDetails.setAddressLineTwo("Ave Maria Road");
        hospitalDetails.setAddressLineThree("Negombo");
        hospitalDetails.setCity("Negombo");
        hospitalDetails.setDistrict("Gampaha");
        hospitalDetails.setContactNumber("0315677506");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Galle Co-Op Hospital");
        hospitalDetails.setAddressLineOne("65");
        hospitalDetails.setAddressLineTwo("H.W.Amarasuriya Mw");
        hospitalDetails.setAddressLineThree("Galle");
        hospitalDetails.setCity("Galle");
        hospitalDetails.setDistrict("Galle");
        hospitalDetails.setContactNumber("0912234270");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("GV Hospital");
        hospitalDetails.setAddressLineOne("35–35/2");
        hospitalDetails.setAddressLineTwo("New Road");
        hospitalDetails.setAddressLineThree("Batticoloa");
        hospitalDetails.setCity("Batticoloa");
        hospitalDetails.setDistrict("Batticoloa");
        hospitalDetails.setContactNumber("0652225696");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Gamage Hospital");
        hospitalDetails.setAddressLineOne("121");
        hospitalDetails.setAddressLineTwo("Palegoda Road");
        hospitalDetails.setAddressLineThree("Beligammana");
        hospitalDetails.setCity("Mawanella");
        hospitalDetails.setDistrict("Kegalle");
        hospitalDetails.setContactNumber("0352246005");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Genius Hospital");
        hospitalDetails.setAddressLineOne("53");
        hospitalDetails.setAddressLineTwo("Avv Road");
        hospitalDetails.setAddressLineThree("Akkaraipattu");
        hospitalDetails.setCity("Akkaraipattu");
        hospitalDetails.setDistrict("Ampara");
        hospitalDetails.setContactNumber("0672277322");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Gomez Private Hospital");
        hospitalDetails.setAddressLineOne("63");
        hospitalDetails.setAddressLineTwo("Colombo Road");
        hospitalDetails.setAddressLineThree("Avissawella");
        hospitalDetails.setCity("Avissawella");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0362222324");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Lava Hospital");
        hospitalDetails.setAddressLineOne("75");
        hospitalDetails.setAddressLineTwo("Temple Road");
        hospitalDetails.setAddressLineThree("Jaffna");
        hospitalDetails.setCity("Jaffna");
        hospitalDetails.setDistrict("Jaffna");
        hospitalDetails.setContactNumber("0212224333");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Peoples Hospital Welisara");
        hospitalDetails.setAddressLineOne("499");
        hospitalDetails.setAddressLineTwo("Mahabage");
        hospitalDetails.setAddressLineThree("Ragama");
        hospitalDetails.setCity("Ragama");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112955031");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Kaleels Nursing Home");
        hospitalDetails.setAddressLineOne("193");
        hospitalDetails.setAddressLineTwo("1st Division");
        hospitalDetails.setAddressLineThree("Colombo 10");
        hospitalDetails.setCity("Colombo 10");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112432441");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Nugegoda Nursing Home");
        hospitalDetails.setAddressLineOne("182");
        hospitalDetails.setAddressLineTwo("High Level Road");
        hospitalDetails.setAddressLineThree("Nugegoda");
        hospitalDetails.setCity("Nugegoda");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112820184");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Pannipitiya Nursing Home");
        hospitalDetails.setAddressLineOne("334/4");
        hospitalDetails.setAddressLineTwo("Hokandara Road");
        hospitalDetails.setAddressLineThree("Pannipitiya");
        hospitalDetails.setCity("Pannipitiya");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112840065");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Suwa Medura");
        hospitalDetails.setAddressLineOne("35");
        hospitalDetails.setAddressLineTwo("Jayatillaka Mw");
        hospitalDetails.setAddressLineThree("Panadura");
        hospitalDetails.setCity("Panadura");
        hospitalDetails.setDistrict("Kalutara");
        hospitalDetails.setContactNumber("0382232307");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Vindana Reproductive Health Centre");
        hospitalDetails.setAddressLineOne("09");
        hospitalDetails.setAddressLineTwo("Barnes Place");
        hospitalDetails.setAddressLineThree("Colombo 07");
        hospitalDetails.setCity("Colombo 07");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112682102");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Central Hospital Badulla");
        hospitalDetails.setAddressLineOne("12");
        hospitalDetails.setAddressLineTwo("Ward Street");
        hospitalDetails.setAddressLineThree("Badulla");
        hospitalDetails.setCity("Badulla");
        hospitalDetails.setDistrict("Badulla");
        hospitalDetails.setContactNumber("0552222164");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Central Hospital Kurunegala");
        hospitalDetails.setAddressLineOne("28");
        hospitalDetails.setAddressLineTwo("South Circular Road");
        hospitalDetails.setAddressLineThree("Kurunegala");
        hospitalDetails.setCity("Kurunegala");
        hospitalDetails.setDistrict("Kurunegala");
        hospitalDetails.setContactNumber("0372223111");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Central Nursing Home,Negombo");
        hospitalDetails.setAddressLineOne("145");
        hospitalDetails.setAddressLineTwo("Sea Street");
        hospitalDetails.setAddressLineThree("Negombo");
        hospitalDetails.setCity("Negombo");
        hospitalDetails.setDistrict("Gampaha");
        hospitalDetails.setContactNumber("0312238166");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Central Nursing Home Jaffna");
        hospitalDetails.setAddressLineOne("350");
        hospitalDetails.setAddressLineTwo("Palali  Road");
        hospitalDetails.setAddressLineThree("Jaffna");
        hospitalDetails.setCity("Jaffna");
        hospitalDetails.setDistrict("Jaffna");
        hospitalDetails.setContactNumber("0212222263");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Kandy Nursing Home");
        hospitalDetails.setAddressLineOne("25");
        hospitalDetails.setAddressLineTwo("Anagarika Dharmapala Mw");
        hospitalDetails.setAddressLineThree("Kandy");
        hospitalDetails.setCity("Kandy");
        hospitalDetails.setDistrict("Kandy");
        hospitalDetails.setContactNumber("0812234282");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Kurunegala Co-op Hospital");
        hospitalDetails.setAddressLineOne("303");
        hospitalDetails.setAddressLineTwo("Colombo Road");
        hospitalDetails.setAddressLineThree("Kurunegala");
        hospitalDetails.setCity("Kurunegala");
        hospitalDetails.setDistrict("Kurunegala");
        hospitalDetails.setContactNumber("0372222464");

        this.createHospital(hospitalDetails, db);


        hospitalDetails.setHospitalName("Kumudu Hospital");
        hospitalDetails.setAddressLineOne("48");
        hospitalDetails.setAddressLineTwo("Kandy Road");
        hospitalDetails.setAddressLineThree("Matale");
        hospitalDetails.setCity("Matale");
        hospitalDetails.setDistrict("Matale");
        hospitalDetails.setContactNumber("0662222411");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Life Care Hospital");
        hospitalDetails.setAddressLineOne("199");
        hospitalDetails.setAddressLineTwo("Colombo Road");
        hospitalDetails.setAddressLineThree("Wennappuwa");
        hospitalDetails.setCity("Wennappuwa");
        hospitalDetails.setDistrict("Puttalam");
        hospitalDetails.setContactNumber("0312253107");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("M.K Hospital Gampola");
        hospitalDetails.setAddressLineOne("147/1");
        hospitalDetails.setAddressLineTwo("Kandy Road");
        hospitalDetails.setAddressLineThree("Gampola");
        hospitalDetails.setCity("Gampola");
        hospitalDetails.setDistrict("Kandy");
        hospitalDetails.setContactNumber("0814486028");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Royal Nursing Home");
        hospitalDetails.setAddressLineOne("35");
        hospitalDetails.setAddressLineTwo("Sri Devananda Road");
        hospitalDetails.setAddressLineThree("Maharagama");
        hospitalDetails.setCity("Maharagama");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112803563");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Suwa Shanthi Hospital");
        hospitalDetails.setAddressLineOne("11");
        hospitalDetails.setAddressLineTwo("Main Street");
        hospitalDetails.setAddressLineThree("Anuradhapura");
        hospitalDetails.setCity("Anuradhapura");
        hospitalDetails.setDistrict("Anuradhapura");
        hospitalDetails.setContactNumber("0252223636");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Singhe Hospitals");
        hospitalDetails.setAddressLineOne("362");
        hospitalDetails.setAddressLineTwo("Colombo Road");
        hospitalDetails.setAddressLineThree("Ratnapura");
        hospitalDetails.setCity("Ratnapura");
        hospitalDetails.setDistrict("Ratnapura");
        hospitalDetails.setContactNumber("0452232232");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("National Hospital of Sri Lanka");
        hospitalDetails.setAddressLineOne("E W Perera Mawatha");
        hospitalDetails.setAddressLineTwo("Colombo");
        hospitalDetails.setAddressLineThree("Colombo");
        hospitalDetails.setCity("Colombo");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112691111");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("National Eye Hospital");
        hospitalDetails.setAddressLineOne("National Eye Hospital");
        hospitalDetails.setAddressLineTwo("Rev. Baddegama Wimalawansa Thero Mawatha");
        hospitalDetails.setAddressLineThree("Colombo 10");
        hospitalDetails.setCity("Colombo 10");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112693911");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("De Soysa Hospital");
        hospitalDetails.setAddressLineOne("Kynsey Rd");
        hospitalDetails.setAddressLineTwo("Colombo 08");
        hospitalDetails.setAddressLineThree("Colombo");
        hospitalDetails.setCity("Colombo 08");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112696224");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Lady Ridgeway Hospital");
        hospitalDetails.setAddressLineOne("Dr Danister De Silva Mawatha");
        hospitalDetails.setAddressLineTwo("Colombo 08");
        hospitalDetails.setAddressLineThree("Colombo");
        hospitalDetails.setCity("Colombo 08");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112693711");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Sri Jayewardenepura General Hospital");
        hospitalDetails.setAddressLineOne("Thalapathpitiya");
        hospitalDetails.setAddressLineTwo("Nugegoda");
        hospitalDetails.setAddressLineThree("Nugegoda");
        hospitalDetails.setCity("Nugegoda");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112778610");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Kalubowila Teaching Hospital");
        hospitalDetails.setAddressLineOne("B229");
        hospitalDetails.setAddressLineTwo("Dehiwala");
        hospitalDetails.setAddressLineThree("Mount Lavinia");
        hospitalDetails.setCity("Mount Lavinia");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112765505");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Police Hospital");
        hospitalDetails.setAddressLineOne("Nawala Road");
        hospitalDetails.setAddressLineTwo("Narahenpita");
        hospitalDetails.setAddressLineThree("Colombo");
        hospitalDetails.setCity("Narahenpita");
        hospitalDetails.setDistrict("Colombo");
        hospitalDetails.setContactNumber("0112368242");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Gampaha District General Hospital");
        hospitalDetails.setAddressLineOne("Ja Ela-Ekala-Gampaha-Yakkala Hwy");
        hospitalDetails.setAddressLineTwo("Gampaha");
        hospitalDetails.setAddressLineThree("Gampaha");
        hospitalDetails.setCity("Gampaha");
        hospitalDetails.setDistrict("Gampaha");
        hospitalDetails.setContactNumber("0332222261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Kalutara General Hospital");
        hospitalDetails.setAddressLineOne("Kalutara");
        hospitalDetails.setAddressLineTwo("Kalutara South");
        hospitalDetails.setAddressLineThree("Kalutara");
        hospitalDetails.setCity("Kalutara");
        hospitalDetails.setDistrict("Kalutara");
        hospitalDetails.setContactNumber("0342222261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Panadura Base Hospital");
        hospitalDetails.setAddressLineOne("A2");
        hospitalDetails.setAddressLineTwo("Panadura");
        hospitalDetails.setAddressLineThree("Panadura");
        hospitalDetails.setCity("Panadura");
        hospitalDetails.setDistrict("Kalutara");
        hospitalDetails.setContactNumber("0382232261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Horana Base Hospital");
        hospitalDetails.setAddressLineOne("Horana Base Hospital");
        hospitalDetails.setAddressLineTwo("Hospital Lane");
        hospitalDetails.setAddressLineThree("Horana");
        hospitalDetails.setCity("Horana");
        hospitalDetails.setDistrict("Kalutara");
        hospitalDetails.setContactNumber("0342261261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Rathnapura General Hospital");
        hospitalDetails.setAddressLineOne("Panadura-Horana-Ratnapura Highway");
        hospitalDetails.setAddressLineTwo("Ratnapura");
        hospitalDetails.setAddressLineThree("Ratnapura");
        hospitalDetails.setCity("Ratnapura");
        hospitalDetails.setDistrict("Ratnapura");
        hospitalDetails.setContactNumber("0452226561");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Embilipitiya Base Hospital");
        hospitalDetails.setAddressLineOne("New Town");
        hospitalDetails.setAddressLineTwo("Embilipitiya");
        hospitalDetails.setAddressLineThree("Embilipitiya");
        hospitalDetails.setCity("Embilipitiya");
        hospitalDetails.setDistrict("Ratnapura");
        hospitalDetails.setContactNumber("0472230261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Balangoda Base Hospital");
        hospitalDetails.setAddressLineOne("New Town");
        hospitalDetails.setAddressLineTwo("Embilipitiya");
        hospitalDetails.setAddressLineThree("Embilipitiya");
        hospitalDetails.setCity("Embilipitiya");
        hospitalDetails.setDistrict("Ratnapura");
        hospitalDetails.setContactNumber("0452287261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Peradeniya General Hospital");
        hospitalDetails.setAddressLineOne("Teaching Hospital Peradeniya");
        hospitalDetails.setAddressLineTwo("Peradeniya");
        hospitalDetails.setAddressLineThree("Peradeniya");
        hospitalDetails.setCity("Peradeniya");
        hospitalDetails.setDistrict("Kandy");
        hospitalDetails.setContactNumber("0812388261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Alawwa Base Hospital");
        hospitalDetails.setAddressLineOne("Alawwa-Maharagama Road");
        hospitalDetails.setAddressLineTwo("Alawwa");
        hospitalDetails.setAddressLineThree("Alawwa");
        hospitalDetails.setCity("Alawwa");
        hospitalDetails.setDistrict("Kurunegala");
        hospitalDetails.setContactNumber("0372278161");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Galgamuwa Base Hospital");
        hospitalDetails.setAddressLineOne("Galgamuwa-Nikawewa Road");
        hospitalDetails.setAddressLineTwo("Galgamuwa");
        hospitalDetails.setAddressLineThree("Galgamuwa");
        hospitalDetails.setCity("Galgamuwa");
        hospitalDetails.setDistrict("Kurunegala");
        hospitalDetails.setContactNumber("0372253061");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Jaffna Teaching Hospital");
        hospitalDetails.setAddressLineOne("Hospital Street");
        hospitalDetails.setAddressLineTwo("Jaffna");
        hospitalDetails.setAddressLineThree("Jaffna");
        hospitalDetails.setCity("Jaffna");
        hospitalDetails.setDistrict("Jaffna");
        hospitalDetails.setContactNumber("0212223348");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Northern Central Hospital");
        hospitalDetails.setAddressLineOne("342");
        hospitalDetails.setAddressLineTwo("Palali Rd");
        hospitalDetails.setAddressLineThree("Thirunelvely");
        hospitalDetails.setCity("Thirunelvely");
        hospitalDetails.setDistrict("Jaffna");
        hospitalDetails.setContactNumber("0212219977");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Anuradhapura Teaching Hospital");
        hospitalDetails.setAddressLineOne("Bandaranayake Mawatha");
        hospitalDetails.setAddressLineTwo("Anuradhapura");
        hospitalDetails.setAddressLineThree("Anuradhapura");
        hospitalDetails.setCity("Anuradhapura");
        hospitalDetails.setDistrict("Anuradhapura");
        hospitalDetails.setContactNumber("0252222261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Karapitiya Teaching Hospital");
        hospitalDetails.setAddressLineOne("Hirimbura Cross Rd");
        hospitalDetails.setAddressLineTwo("Galle 80000");
        hospitalDetails.setAddressLineThree("Galle");
        hospitalDetails.setCity("Galle 80000");
        hospitalDetails.setDistrict("Galle");
        hospitalDetails.setContactNumber("0912232267");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Balapitiya Base Hospital");
        hospitalDetails.setAddressLineOne("Galle Road");
        hospitalDetails.setAddressLineTwo("Balapitiya");
        hospitalDetails.setAddressLineThree("Balapitiya");
        hospitalDetails.setCity("Balapitiya");
        hospitalDetails.setDistrict("Galle");
        hospitalDetails.setContactNumber("0912258261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Kamburupitiya Base Hospital");
        hospitalDetails.setAddressLineOne("Thihagoda-Kamburupitiya-Mawarala-Kotapola Rd");
        hospitalDetails.setAddressLineTwo("Kamburupitiya");
        hospitalDetails.setAddressLineThree("Kamburupitiya");
        hospitalDetails.setCity("Kamburupitiya");
        hospitalDetails.setDistrict("Matara");
        hospitalDetails.setContactNumber("0412292261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Matara General Hospital");
        hospitalDetails.setAddressLineOne("General Hospital");
        hospitalDetails.setAddressLineTwo("Dharmapala Mawatha");
        hospitalDetails.setAddressLineThree("Matara");
        hospitalDetails.setCity("Matara");
        hospitalDetails.setDistrict("Matara");
        hospitalDetails.setContactNumber("0412227821");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Tangalle Base Hospital");
        hospitalDetails.setAddressLineOne("Tangalle Road");
        hospitalDetails.setAddressLineTwo("Tangalle");
        hospitalDetails.setAddressLineThree("Tangalle");
        hospitalDetails.setCity("Tangalle");
        hospitalDetails.setDistrict("Hambantota");
        hospitalDetails.setContactNumber("0472240261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Hambantota General Hospital");
        hospitalDetails.setAddressLineOne("New Rd");
        hospitalDetails.setAddressLineTwo("Hambantota");
        hospitalDetails.setAddressLineThree("Hambantota");
        hospitalDetails.setCity("Hambantota");
        hospitalDetails.setDistrict("Hambantota");
        hospitalDetails.setContactNumber("0472220261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("Puttalam Base Hospital");
        hospitalDetails.setAddressLineOne("Kurunegala Road");
        hospitalDetails.setAddressLineTwo("Puttalam");
        hospitalDetails.setAddressLineThree("Puttalam");
        hospitalDetails.setCity("Puttalam");
        hospitalDetails.setDistrict("Puttalam");
        hospitalDetails.setContactNumber("0322265261");

        this.createHospital(hospitalDetails, db);

        hospitalDetails.setHospitalName("MHU General Hospital Trincomalee");
        hospitalDetails.setAddressLineOne("Hospital Ln");
        hospitalDetails.setAddressLineTwo("Trincomalee");
        hospitalDetails.setAddressLineThree("Trincomalee");
        hospitalDetails.setCity("Trincomalee");
        hospitalDetails.setDistrict("Trincomalee");
        hospitalDetails.setContactNumber("0262222261");

        this.createHospital(hospitalDetails, db);

    }

    //insert first table data to insert into table
    public HospitalDetails createHospital(HospitalDetails hospitalDetails,SQLiteDatabase db){
        ContentValues values = new ContentValues();
        values.put(CreateDatabase.TABLE_HOSPITAL_COLUMN_TWO, hospitalDetails.getHospitalName());
        values.put(CreateDatabase.TABLE_HOSPITAL_COLUMN_THREE, hospitalDetails.getAddressLineOne());
        values.put(CreateDatabase.TABLE_HOSPITAL_COLUMN_FOUR, hospitalDetails.getAddressLineTwo());
        values.put(CreateDatabase.TABLE_HOSPITAL_COLUMN_FIVE, hospitalDetails.getAddressLineThree());
        values.put(CreateDatabase.TABLE_HOSPITAL_COLUMN_SIX, hospitalDetails.getCity());
        values.put(CreateDatabase.TABLE_HOSPITAL_COLUMN_SEVEN, hospitalDetails.getDistrict());
        values.put(CreateDatabase.TABLE_HOSPITAL_COLUMN_EIGHT, hospitalDetails.getContactNumber());


        long insertID = db.insert(CreateDatabase.TABLE_HOSPITAL,null,values);

        hospitalDetails.setHospitalID(insertID);

        return hospitalDetails;
    }


}
