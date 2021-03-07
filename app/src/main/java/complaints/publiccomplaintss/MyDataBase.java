package complaints.publiccomplaintss;
import java.util.LinkedList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class MyDataBase extends SQLiteOpenHelper 
{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "UsersList";
    public MyDataBase(Context context) 
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);  
    }
    public void onCreate(SQLiteDatabase db) 
    {
        String CREATE_USERS_TABLE = "CREATE TABLE IF NOT EXISTS users ( "+"id INTEGER PRIMARY KEY AUTOINCREMENT, "+"uname TEXT, "+"uphto TEXT,"+"upass TEXT,"+"uphon TEXT,"+"usex TEXT,"+"udstt TEXT,"+"uside TEXT)";
        
       
  
        String CREATE_ISSUE1_TABLE = "CREATE TABLE isue ( "+"issid INTEGER PRIMARY KEY AUTOINCREMENT, " +
        		                                                          ""+"issstp1 TEXT, "+"issstp2 TEXT,"+"issphto Text," +
        		                                                          ""+"issfldsc TEXT,"+"issusrpic TEXT,"+"issusrid TEXT,"+"issusrdate TEXT,"+"issusrdstt TEXT)";
        //creating table for patna issue
        
        String CREATE_PTNISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS ptnisue ( "+"ptnissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"ptnissstp1 TEXT, "+"ptnissstp2 TEXT,"+"ptnissphto Text," +
                ""+"ptnissfldsc TEXT,"+"ptnissusrpic TEXT,"+"ptnissusrid TEXT,"+"ptnissusrdate TEXT,"+"ptnissusrdstt)";
        
        String CREATE_ROHISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS rohisue ( "+"rohissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"rohissstp1 TEXT, "+"rohissstp2 TEXT,"+"rohissphto Text," +""+"rohissfldsc TEXT,"+"rohissusrpic TEXT,"+"rohissusrid TEXT,"+"rohissusrdate TEXT,"+"rohissusrdstt TEXT)";

        String CREATE_BGPRISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS bgprisue ( "+"bgprissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"bgprissstp1 TEXT, "+"bgprissstp2 TEXT,"+"bgprissphto Text," +
                ""+"bgprissfldsc TEXT,"+"bgprissusrpic TEXT,"+"bgprissusrid TEXT,"+"bgprissusrdate TEXT,"+"bgprissusrdstt TEXT)";
        
        String CREATE_MUNISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS munisue ( "+"munissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"munissstp1 TEXT, "+"munissstp2 TEXT,"+"munissphto Text," +
                ""+"munissfldsc TEXT,"+"munissusrpic TEXT,"+"munissusrid TEXT,"+"munissusrdate TEXT,"+"munissusrdstt TEXT)";
        
        String CREATE_BHPISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS bhpisue ( "+"bhpissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"bhpissstp1 TEXT, "+"bhpissstp2 TEXT,"+"bhpissphto Text," +
                ""+"bhpissfldsc TEXT,"+"bhpissusrpic TEXT,"+"bhpissusrid TEXT,"+"bhpissusrdate TEXT,"+"bhpissusrdstt TEXT)";
        
        String CREATE_MFPISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS mfpisue ( "+"mfpissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"mfpissstp1 TEXT, "+"mfpissstp2 TEXT,"+"mfpissphto Text," +
                ""+"mfpissfldsc TEXT,"+"mfpissusrpic TEXT,"+"mfpissusrid TEXT,"+"mfpissusrdate TEXT,"+"mfpissusrdstt TEXT)";
        
        String CREATE_SWNISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS swnisue ( "+"swnissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"swnissstp1 TEXT, "+"swnissstp2 TEXT,"+"swnissphto Text," +
                ""+"swnissfldsc TEXT,"+"swnissusrpic TEXT,"+"swnissusrid TEXT,"+"swnissusrdate TEXT,"+"swnissusrdstt TEXT)";
        
        String CREATE_GOPISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS gopisue ( "+"gopissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"gopissstp1 TEXT, "+"gopissstp2 TEXT,"+"gopissphto Text," +
                ""+"gopissfldsc TEXT,"+"gopissusrpic TEXT,"+"gopissusrid TEXT,"+"gopissusrdate TEXT,"+"gopissusrdstt TEXT)";
        
        String CREATE_SRNISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS srnisue ( "+"srnissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"srnissstp1 TEXT, "+"srnissstp2 TEXT,"+"srnissphto Text," +
                ""+"srnissfldsc TEXT,"+"srnissusrpic TEXT,"+"srnissusrid TEXT,"+"srnissusrdate TEXT,"+"srnissusrdstt TEXT)";
        
        String CREATE_ARBISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS arbisue ( "+"arbissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"arbissstp1 TEXT, "+"arbissstp2 TEXT,"+"arbissphto Text," +
                ""+"arbissfldsc TEXT,"+"arbissusrpic TEXT,"+"arbissusrid TEXT,"+"arbissusrdate TEXT,"+"arbissusrdstt TEXT)";
        
        String CREATE_VSLISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS vslisue ( "+"vslissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"vslissstp1 TEXT, "+"vslissstp2 TEXT,"+"vslissphto Text," +
                ""+"vslissfldsc TEXT,"+"vslissusrpic TEXT,"+"vslissusrid TEXT,"+"vslissusrdate TEXT,"+"vslissusrdstt TEXT)";
        
        String CREATE_BXRISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS bxrisue ( "+"bxrissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"bxrissstp1 TEXT, "+"bxrissstp2 TEXT,"+"bxrissphto Text," +
                ""+"bxrissfldsc TEXT,"+"bxrissusrpic TEXT,"+"bxrissusrid TEXT,"+"bxrissusrdate TEXT,"+"bxrissusrdstt TEXT)";
        
        String CREATE_BGSISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS bgsisue ( "+"bgsissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"bgsissstp1 TEXT, "+"bgsissstp2 TEXT,"+"bgsissphto Text," +
                ""+"bgsissfldsc TEXT,"+"bgsissusrpic TEXT,"+"bgsissusrid TEXT,"+"bgsissusrdate TEXT,"+"bgsissusrdstt TEXT)";
        
        String CREATE_DRBISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS drbisue ( "+"drbissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"drbissstp1 TEXT, "+"drbissstp2 TEXT,"+"drbissphto Text," +
                ""+"drbissfldsc TEXT,"+"drbissusrpic TEXT,"+"drbissusrid TEXT,"+"drbissusrdate TEXT,"+"drbissusrdstt TEXT)";
        
        String CREATE_JNBISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS jnbisue ( "+"jnbissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"jnbissstp1 TEXT, "+"jnbissstp2 TEXT,"+"jnbissphto Text," +
                ""+"jnbissfldsc TEXT,"+"jnbissusrpic TEXT,"+"jnbissusrid TEXT,"+"jnbissusrdate TEXT,"+"jnbissusrdstt TEXT)";
        
        String CREATE_NWAISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS nwaisue ( "+"nwaissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"nwaissstp1 TEXT, "+"nwaissstp2 TEXT,"+"nwaissphto Text," +
                ""+"nwaissfldsc TEXT,"+"nwaissusrpic TEXT,"+"nwaissusrid TEXT,"+"nwaissusrdate TEXT,"+"nwaissusrdstt TEXT)";
        
        String CREATE_SRAISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS sraisue ( "+"sraissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"sraissstp1 TEXT, "+"sraissstp2 TEXT,"+"sraissphto Text," +
                ""+"sraissfldsc TEXT,"+"sraissusrpic TEXT,"+"sraissusrid TEXT,"+"sraissusrdate TEXT,"+"sraissusrdstt TEXT)";
        
        String CREATE_KHGISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS khgisue ( "+"khgissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"khgissstp1 TEXT, "+"khgissstp2 TEXT,"+"khgissphto Text," +
                ""+"khgissfldsc TEXT,"+"khgissusrpic TEXT,"+"khgissusrid TEXT,"+"khgissusrdate TEXT,"+"khgissusrdstt TEXT)";
        
        String CREATE_STAISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS staisue ( "+"staissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"staissstp1 TEXT, "+"staissstp2 TEXT,"+"staissphto Text," +
                ""+"staissfldsc TEXT,"+"staissusrpic TEXT,"+"staissusrid TEXT,"+"staissusrdate TEXT,"+"staissusrdstt TEXT)";
        
        String CREATE_NLDISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS nldisue ( "+"nldissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"nldissstp1 TEXT, "+"nldissstp2 TEXT,"+"nldissphto Text," +
                ""+"nldissfldsc TEXT,"+"nldissusrpic TEXT,"+"nldissusrid TEXT,"+"nldissusrdate TEXT,"+"nldissusrdstt TEXT)";
        
        String CREATE_GYAISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS gyaisue ( "+"gyaissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"gyaissstp1 TEXT, "+"gyaissstp2 TEXT,"+"gyaissphto Text," +
                ""+"gyaissfldsc TEXT,"+"gyaissusrpic TEXT,"+"gyaissusrid TEXT,"+"gyaissusrdate TEXT,"+"gyaissusrdstt TEXT)";
        
        String CREATE_PRNISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS prnisue ( "+"prnissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"prnissstp1 TEXT, "+"prnissstp2 TEXT,"+"prnissphto Text," +
                ""+"prnissfldsc TEXT,"+"prnissusrpic TEXT,"+"prnissusrid TEXT,"+"prnissusrdate TEXT,"+"prnissusrdstt TEXT)";
        
        String CREATE_PRBCISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS prbcisue ( "+"prbcissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"prbcissstp1 TEXT, "+"prbcissstp2 TEXT,"+"prbcissphto Text," +
                ""+"prbcissfldsc TEXT,"+"prbcissusrpic TEXT,"+"prbcissusrid TEXT,"+"prbcissusrdate TEXT,"+"prbcissusrdstt TEXT)";
        
        String CREATE_LAKISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS lakisue ( "+"lakissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"issstp1 TEXT, "+"lakissstp2 TEXT,"+"lakissphto Text," +
                ""+"lakissfldsc TEXT,"+"lakissusrpic TEXT,"+"lakissusrid TEXT,"+"lakissusrdate TEXT,"+"lakissusrdstt TEXT)";
        
        String CREATE_MDBISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS mdbisue ( "+"mdbissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"mdbissstp1 TEXT, "+"mdbissstp2 TEXT,"+"mdbissphto Text," +
                ""+"mdbissfldsc TEXT,"+"mdbissusrpic TEXT,"+"mdbissusrid TEXT,"+"mdbissusrdate TEXT,"+"mdbissusrdstt TEXT)";
        
        String CREATE_KTRISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS ktrisue ( "+"ktrissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"ktrissstp1 TEXT, "+"ktrissstp2 TEXT,"+"ktrissphto Text," +
                ""+"ktrissfldsc TEXT,"+"ktrissusrpic TEXT,"+"ktrissusrid TEXT,"+"ktrissusrdate TEXT,"+"ktrissusrdstt TEXT)";
        
        String CREATE_MHPISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS mhpisue ( "+"mhpissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"mhpissstp1 TEXT, "+"mhpissstp2 TEXT,"+"mhpissphto Text," +
                ""+"mhpissfldsc TEXT,"+"mhpissusrpic TEXT,"+"mhpissusrid TEXT,"+"mhpissusrdate TEXT,"+"mhpissusrdstt TEXT)";
        
        String CREATE_BNKISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS bnkisue ( "+"bnkissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"bnkissstp1 TEXT, "+"bnkissstp2 TEXT,"+"bnkissphto Text," +
                ""+"bnkissfldsc TEXT,"+"bnkissusrpic TEXT,"+"bnkissusrid TEXT,"+"bnkissusrdate TEXT,"+"bnkissusrdstt TEXT)";
        
        String CREATE_SEOISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS seoisue ( "+"seoissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"seoissstp1 TEXT, "+"seoissstp2 TEXT,"+"seoissphto Text," +
                ""+"seoissfldsc TEXT,"+"seoissusrpic TEXT,"+"seoissusrid TEXT,"+"seoissusrdate TEXT,"+"seoissusrdstt TEXT)";
        
        String CREATE_SPLISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS splisue ( "+"splissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"splissstp1 TEXT, "+"splissstp2 TEXT,"+"splissphto Text," +
                ""+"splissfldsc TEXT,"+"splissusrpic TEXT,"+"splissusrid TEXT,"+"splissusrdate TEXT,"+"splissusrdstt TEXT)";
        
        String CREATE_PCMCISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS pcmcisue ( "+"pcmcissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"pcmcissstp1 TEXT, "+"pcmcissstp2 TEXT,"+"pcmcissphto Text," +
                ""+"pcmcissfldsc TEXT,"+"pcmcissusrpic TEXT,"+"pcmcissusrid TEXT,"+"pcmcissusrdate TEXT,"+"pcmcissusrdstt TEXT)";
        
        String CREATE_SKHISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS skhisue ( "+"skhissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"skhissstp1 TEXT, "+"skhissstp2 TEXT,"+"skhissphto Text," +
                ""+"skhissfldsc TEXT,"+"skhissusrpic TEXT,"+"skhissusrid TEXT,"+"skhissusrdate TEXT,"+"skhissusrdstt TEXT)";
        
        String CREATE_ARIISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS ariisue ( "+"ariissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"ariissstp1 TEXT, "+"ariissstp2 TEXT,"+"ariissphto Text," +
                ""+"ariissfldsc TEXT,"+"ariissusrpic TEXT,"+"ariissusrid TEXT,"+"ariissusrdate TEXT,"+"ariissusrdstt TEXT)";
        
        String CREATE_SMTPISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS smtpisue ( "+"smtpissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"smtpissstp1 TEXT, "+"smtpissstp2 TEXT,"+"smtpissphto Text," +
                ""+"smtpissfldsc TEXT,"+"smtpissusrpic TEXT,"+"smtpissusrid TEXT,"+"smtpissusrdate TEXT,"+"smtpissusrdstt TEXT)";
        
        String CREATE_JMIISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS jmiisue ( "+"jmiissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"jmiissstp1 TEXT, "+"jmiissstp2 TEXT,"+"jmiissphto Text," +
                ""+"jmiissfldsc TEXT,"+"jmiissusrpic TEXT,"+"jmiissusrid TEXT,"+"jmiissusrdate TEXT,"+"jmiissusrdstt TEXT)";
        
        String CREATE_KMRISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS kmrisue ( "+"kmrissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"kmrissstp1 TEXT, "+"kmrissstp2 TEXT,"+"kmrissphto Text," +
                ""+"kmrissfldsc TEXT,"+"kmrissusrpic TEXT,"+"kmrissusrid TEXT,"+"kmrissusrdate TEXT,"+"kmrissusrdstt TEXT)";
        
        String CREATE_KSNISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS ksnisue ( "+"ksnissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"ksnissstp1 TEXT, "+"ksnissstp2 TEXT,"+"ksnissphto Text," +
                ""+"ksnissfldsc TEXT,"+"ksnissusrpic TEXT,"+"ksnissusrid TEXT,"+"ksnissusrdate TEXT,"+"ksnissusrdstt TEXT)";
        
        String CREATE_AWLISSUE1_TABLE = "CREATE TABLE IF NOT EXISTS awlisue ( "+"awlissid INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ""+"awlissstp1 TEXT, "+"awlissstp2 TEXT,"+"awlissphto Text," +
                ""+"awlissfldsc TEXT,"+"awlissusrpic TEXT,"+"awlissusrid TEXT,"+"awlissusrdate TEXT,"+"awlissusrdstt TEXT)";
        
//        .......................................................................

        
        String CREATE_WPCMNTS_TABLE = "CREATE TABLE IF NOT EXISTS wpcmnt ( "+"wpid INTEGER PRIMARY KEY " +
        		                                                           "AUTOINCREMENT, "+"wpcmntid TEXT,"+"wpcmnttext TEXT,"+"blgrnm TEXT,"+"blgrpic TEXT)";
        
        String CREATE_EPCMNTS_TABLE = "CREATE TABLE IF NOT EXISTS epcmnt ( "+"epid INTEGER PRIMARY KEY " +
                                       "AUTOINCREMENT, "+"epcmntid TEXT,"+"epcmnttext TEXT,"+"epblgrnm TEXT,"+"epblgrpic TEXT)";
        
        String CREATE_CPCMNTS_TABLE = "CREATE TABLE IF NOT EXISTS cpcmnt ( "+"cpid INTEGER PRIMARY KEY " +
                "AUTOINCREMENT, "+"cpcmntid TEXT,"+"cpcmnttext TEXT,"+"cpblgrnm TEXT,"+"cpblgrpic TEXT)";
        
        String CREATE_TPCMNTS_TABLE = "CREATE TABLE IF NOT EXISTS tpcmnt ( "+"tpid INTEGER PRIMARY KEY " +
                "AUTOINCREMENT, "+"tpcmntid TEXT,"+"tpcmnttext TEXT,"+"tpblgrnm TEXT,"+"tpblgrpic TEXT)";
        
        String CREATE_SWPCMNTS_TABLE = "CREATE TABLE IF NOT EXISTS swpcmnt ( "+"swpid INTEGER PRIMARY KEY " +
                "AUTOINCREMENT, "+"swpcmntid TEXT,"+"swpcmnttext TEXT,"+"swpblgrnm TEXT,"+"swpblgrpic TEXT)";
        
        String CREATE_SPCMNTS_TABLE = "CREATE TABLE IF NOT EXISTS spcmnt ( "+"spid INTEGER PRIMARY KEY " +
                "AUTOINCREMENT, "+"spcmntid TEXT,"+"spcmnttext TEXT,"+"spblgrnm TEXT,"+"spblgrpic TEXT)";
        
        String CREATE_OTPCMNTS_TABLE = "CREATE TABLE IF NOT EXISTS otpcmnt ( "+"otpid INTEGER PRIMARY KEY " +
                "AUTOINCREMENT, "+"otpcmntid TEXT,"+"otpcmnttext TEXT,"+"otpblgrnm TEXT,"+"otpblgrpic TEXT)";
        
        String CREATE_DELAYY_TABLE = "CREATE TABLE IF NOT EXISTS delayy ( "+"dlid INTEGER PRIMARY KEY AUTOINCREMENT, "+"dlsub TEXT, "+"dlsubis TEXT,"+"dlupic TEXT,"+"dlfulldsc TEXT,"+"dlusid TEXT,"+"dldate TEXT,"+"dlnm TEXT,"+"dlcmppic TEXT)";
              
        String CREATE_SOLVEDD_TABLE = "CREATE TABLE IF NOT EXISTS solvedd ( "+"slid INTEGER PRIMARY KEY AUTOINCREMENT, "+"slsub TEXT, "+"slsubis TEXT,"+"slupic TEXT,"+"slfulldsc TEXT,"+"slusid TEXT,"+"sldate TEXT,"+"slnm TEXT,"+"slcmppic TEXT)";       
        
        String CREATE_OFFREG_TABLE = "CREATE TABLE IF NOT EXISTS ofrg ( "+"ofid INTEGER PRIMARY KEY AUTOINCREMENT,"+"ofdst TEXT,"+"ofphn TEXT,"+"ofpass TEXT)";
        
        
        
        
        db.execSQL(CREATE_USERS_TABLE);
        db.execSQL(CREATE_ISSUE1_TABLE);
        db.execSQL(CREATE_DELAYY_TABLE);
        db.execSQL(CREATE_SOLVEDD_TABLE);
        db.execSQL(CREATE_WPCMNTS_TABLE);
        db.execSQL(CREATE_EPCMNTS_TABLE);
        db.execSQL(CREATE_CPCMNTS_TABLE);
        db.execSQL(CREATE_TPCMNTS_TABLE);
        db.execSQL(CREATE_SWPCMNTS_TABLE);
        db.execSQL(CREATE_SPCMNTS_TABLE);
        db.execSQL(CREATE_OTPCMNTS_TABLE);
        db.execSQL(CREATE_OFFREG_TABLE);
        db.execSQL(CREATE_PTNISSUE1_TABLE);
        db.execSQL(CREATE_ROHISSUE1_TABLE);
        db.execSQL(CREATE_BGPRISSUE1_TABLE);
        db.execSQL(CREATE_MUNISSUE1_TABLE);
        db.execSQL(CREATE_BHPISSUE1_TABLE);
        db.execSQL(CREATE_MFPISSUE1_TABLE);
        db.execSQL(CREATE_SWNISSUE1_TABLE);
        db.execSQL(CREATE_GOPISSUE1_TABLE);
        db.execSQL(CREATE_SRNISSUE1_TABLE);
        db.execSQL(CREATE_ARBISSUE1_TABLE);
        db.execSQL(CREATE_VSLISSUE1_TABLE);
        db.execSQL(CREATE_BXRISSUE1_TABLE);
        db.execSQL(CREATE_BGSISSUE1_TABLE);
        db.execSQL(CREATE_DRBISSUE1_TABLE);
        db.execSQL(CREATE_JNBISSUE1_TABLE);
        db.execSQL(CREATE_NWAISSUE1_TABLE);
        db.execSQL(CREATE_SRAISSUE1_TABLE);
        db.execSQL(CREATE_KHGISSUE1_TABLE);
        db.execSQL(CREATE_STAISSUE1_TABLE);
        db.execSQL(CREATE_NLDISSUE1_TABLE);
        db.execSQL(CREATE_GYAISSUE1_TABLE);
        db.execSQL(CREATE_PRNISSUE1_TABLE);
        db.execSQL(CREATE_PRBCISSUE1_TABLE);
        db.execSQL(CREATE_LAKISSUE1_TABLE);
        db.execSQL(CREATE_MDBISSUE1_TABLE);
        db.execSQL(CREATE_KTRISSUE1_TABLE);
        db.execSQL(CREATE_MHPISSUE1_TABLE);
        db.execSQL(CREATE_BNKISSUE1_TABLE);
        db.execSQL(CREATE_SEOISSUE1_TABLE);
        db.execSQL(CREATE_SPLISSUE1_TABLE);
        db.execSQL(CREATE_PCMCISSUE1_TABLE);
        db.execSQL(CREATE_SKHISSUE1_TABLE);
        db.execSQL(CREATE_ARIISSUE1_TABLE);
        db.execSQL(CREATE_SMTPISSUE1_TABLE);
        db.execSQL(CREATE_JMIISSUE1_TABLE);
        db.execSQL(CREATE_KMRISSUE1_TABLE);
        db.execSQL(CREATE_KSNISSUE1_TABLE);
        db.execSQL(CREATE_AWLISSUE1_TABLE);
//    .....................................................
//        
        
       
        
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
    {
        db.execSQL("DROP TABLE IF EXISTS isue");
        this.onCreate(db);
    }
    private static final String TABLE_USERS = "users";
    private static final String KEY_ID = "id";
    private static final String KEY_UNAME = "uname";
    private static final String KEY_UPASS = "upass";
    private static final String KEY_UPHTO = "uphto";
    private static final String KEY_UPHON = "uphon";
    private static final String KEY_USEX = "usex";
    private static final String KEY_UDSTT = "udstt";
    private static final String KEY_UDIDE = "uside";
    
   
    
    private static final String TABLE_WPCMNT = "wpcmnt";
    private static final String KEY_WPID = "wpid";
    private static final String KEY_CMNTID = "wpcmntid";
    private static final String KEY_WPCMNTTXT = "wpcmnttext";
    private static final String KEY_WPNAME = "blgrnm";
    private static final String KEY_WPPIC = "blgrpic";
    
    
    private static final String TABLE_EPCMNT = "epcmnt";
    private static final String KEY_EPID = "epid";
    private static final String KEY_EPCMNTID = "epcmntid";
    private static final String KEY_EPCMNTTXT = "epcmnttext";
    private static final String KEY_EPNAME = "epblgrnm";
    private static final String KEY_EPPIC = "epblgrpic";
    
    private static final String TABLE_CPCMNT = "cpcmnt";
    private static final String KEY_CPID = "cpid";
    private static final String KEY_CPCMNTID = "cpcmntid";
    private static final String KEY_CPCMNTTXT = "cpcmnttext";
    private static final String KEY_CPNAME = "cpblgrnm";
    private static final String KEY_CPPIC = "cpblgrpic";
    
    private static final String TABLE_TPCMNT = "tpcmnt";
    private static final String KEY_TPID = "tpid";
    private static final String KEY_TPCMNTID = "tpcmntid";
    private static final String KEY_TPCMNTTXT = "tpcmnttext";
    private static final String KEY_TPNAME = "tpblgrnm";
    private static final String KEY_TPPIC = "tpblgrpic";
    
    private static final String TABLE_SWPCMNT = "swpcmnt";
    private static final String KEY_SWPID = "swpid";
    private static final String KEY_SWPCMNTID = "swpcmntid";
    private static final String KEY_SWPCMNTTXT = "swpcmnttext";
    private static final String KEY_SWPNAME = "swpblgrnm";
    private static final String KEY_SWPPIC = "swpblgrpic";
    
    private static final String TABLE_SPCMNT = "spcmnt";
    private static final String KEY_SPID = "spid";
    private static final String KEY_SPCMNTID = "spcmntid";
    private static final String KEY_SPCMNTTXT = "spcmnttext";
    private static final String KEY_SPNAME = "spblgrnm";
    private static final String KEY_SPPIC = "spblgrpic";
    
    private static final String TABLE_OTPCMNT = "otpcmnt";
    private static final String KEY_OTPID = "otpid";
    private static final String KEY_OTPCMNTID = "otpcmntid";
    private static final String KEY_OTPCMNTTXT = "otpcmnttext";
    private static final String KEY_OTPNAME = "otpblgrnm";
    private static final String KEY_OTPPIC = "otpblgrpic";

    
    private static final String TABLE_ISSU = "isue";
    private static final String KEY_ISSID = "issid";
    private static final String KEY_ISSSTP1 = "issstp1";
    private static final String KEY_ISSSTP2 = "issstp2";
    private static final String KEY_ISSPHOTO = "issphto";
    private static final String KEY_ISSFULLDISC = "issfldsc";
    private static final String KEY_ISSUSRPIC = "issusrpic";
    private static final String KEY_ISSIUSRID = "issusrid";
    private static final String KEY_ISSIUSRDATE = "issusrdate";
    private static final String KEY_ISSIUSRDSTT = "issusrdstt";
    
    //declaring string for patna isssue
    private static final String TABLE_PTNISSU = "ptnisue";
    private static final String KEY_PTNISSID = "ptnissid";
    private static final String KEY_PTNISSSTP1 = "ptnissstp1";
    private static final String KEY_PTNISSSTP2 = "ptnissstp2";
    private static final String KEY_PTNISSPHOTO = "ptnissphto";
    private static final String KEY_PTNISSFULLDISC = "ptnissfldsc";
    private static final String KEY_PTNISSUSRPIC = "ptnissusrpic";
    private static final String KEY_PTNISSIUSRID = "ptnissusrid";
    private static final String KEY_PTNISSIUSRDATE = "ptnissusrdate";
    private static final String KEY_PTNISSIUSRDSTT = "ptnissusrdstt";
    
    private static final String TABLE_ROHISSU = "rohisue";
    private static final String KEY_ROHISSID = "rohissid";
    private static final String KEY_ROHISSSTP1 = "rohissstp1";
    private static final String KEY_ROHISSSTP2 = "rohissstp2";
    private static final String KEY_ROHISSPHOTO = "rohissphto";
    private static final String KEY_ROHISSFULLDISC = "rohissfldsc";
    private static final String KEY_ROHISSUSRPIC = "rohissusrpic";
    private static final String KEY_ROHISSIUSRID = "rohissusrid";
    private static final String KEY_ROHISSIUSRDATE = "rohissusrdate";
    private static final String KEY_ROHISSIUSRDSTT = "rohissusrdstt";
    
    private static final String TABLE_BGPRISSU = "bgprisue";
    private static final String KEY_BGPRISSID = "bgprissid";
    private static final String KEY_BGPRISSSTP1 = "bgprissstp1";
    private static final String KEY_BGPRISSSTP2 = "bgprissstp2";
    private static final String KEY_BGPRISSPHOTO = "bgprissphto";
    private static final String KEY_BGPRISSFULLDISC = "bgprissfldsc";
    private static final String KEY_BGPRISSUSRPIC = "bgprissusrpic";
    private static final String KEY_BGPRISSIUSRID = "bgprissusrid";
    private static final String KEY_BGPRISSIUSRDATE = "bgprissusrdate";
    private static final String KEY_BGPRISSIUSRDSTT = "bgprissusrdstt";
    
    private static final String TABLE_MUNISSU = "munisue";
    private static final String KEY_MUNISSID = "munissid";
    private static final String KEY_MUNISSSTP1 = "munissstp1";
    private static final String KEY_MUNISSSTP2 = "munissstp2";
    private static final String KEY_MUNISSPHOTO = "munissphto";
    private static final String KEY_MUNISSFULLDISC = "munissfldsc";
    private static final String KEY_MUNISSUSRPIC = "munissusrpic";
    private static final String KEY_MUNISSIUSRID = "munissusrid";
    private static final String KEY_MUNISSIUSRDATE = "munissusrdate";
    private static final String KEY_MUNISSIUSRDSTT = "munissusrdstt";
    
    private static final String TABLE_BHPISSU = "bhpisue";
    private static final String KEY_BHPISSID = "bhpissid";
    private static final String KEY_BHPISSSTP1 = "bhpissstp1";
    private static final String KEY_BHPISSSTP2 = "bhpissstp2";
    private static final String KEY_BHPISSPHOTO = "bhpissphto";
    private static final String KEY_BHPISSFULLDISC = "bhpissfldsc";
    private static final String KEY_BHPISSUSRPIC = "bhpissusrpic";
    private static final String KEY_BHPISSIUSRID = "bhpissusrid";
    private static final String KEY_BHPISSIUSRDATE = "bhpissusrdate";
    private static final String KEY_BHPISSIUSRDSTT = "bhpissusrdstt";
    
    private static final String TABLE_MFPISSU = "mfpisue";
    private static final String KEY_MFPISSID = "mfpissid";
    private static final String KEY_MFPISSSTP1 = "mfpissstp1";
    private static final String KEY_MFPISSSTP2 = "mfpissstp2";
    private static final String KEY_MFPISSPHOTO = "mfpissphto";
    private static final String KEY_MFPISSFULLDISC = "mfpissfldsc";
    private static final String KEY_MFPISSUSRPIC = "mfpissusrpic";
    private static final String KEY_MFPISSIUSRID = "mfpissusrid";
    private static final String KEY_MFPISSIUSRDATE = "mfpissusrdate";
    private static final String KEY_MFPISSIUSRDSTT = "mfpissusrdstt";
    
    private static final String TABLE_SWNISSU = "swnisue";
    private static final String KEY_SWNISSID = "swnissid";
    private static final String KEY_SWNISSSTP1 = "swnissstp1";
    private static final String KEY_SWNISSSTP2 = "swnissstp2";
    private static final String KEY_SWNISSPHOTO = "swnissphto";
    private static final String KEY_SWNISSFULLDISC = "swnissfldsc";
    private static final String KEY_SWNISSUSRPIC = "swnissusrpic";
    private static final String KEY_SWNISSIUSRID = "swnissusrid";
    private static final String KEY_SWNISSIUSRDATE = "swnissusrdate";
    private static final String KEY_SWNISSIUSRDSTT = "swnissusrdstt";
    
    private static final String TABLE_GOPISSU = "gopisue";
    private static final String KEY_GOPISSID = "gopissid";
    private static final String KEY_GOPISSSTP1 = "gopissstp1";
    private static final String KEY_GOPISSSTP2 = "gopissstp2";
    private static final String KEY_GOPISSPHOTO = "gopissphto";
    private static final String KEY_GOPISSFULLDISC = "gopissfldsc";
    private static final String KEY_GOPISSUSRPIC = "gopissusrpic";
    private static final String KEY_GOPISSIUSRID = "gopissusrid";
    private static final String KEY_GOPISSIUSRDATE = "gopissusrdate";
    private static final String KEY_GOPISSIUSRDSTT = "gopissusrdstt";
    
    private static final String TABLE_SRNISSU = "srnisue";
    private static final String KEY_SRNISSID = "srnissid";
    private static final String KEY_SRNISSSTP1 = "srnissstp1";
    private static final String KEY_SRNISSSTP2 = "srnissstp2";
    private static final String KEY_SRNISSPHOTO = "srnissphto";
    private static final String KEY_SRNISSFULLDISC = "srnissfldsc";
    private static final String KEY_SRNISSUSRPIC = "srnissusrpic";
    private static final String KEY_SRNISSIUSRID = "srnissusrid";
    private static final String KEY_SRNISSIUSRDATE = "srnissusrdate";
    private static final String KEY_SRNISSIUSRDSTT = "srnissusrdstt";
    
    private static final String TABLE_ARBISSU = "arbisue";
    private static final String KEY_ARBISSID = "arbissid";
    private static final String KEY_ARBISSSTP1 = "arbissstp1";
    private static final String KEY_ARBISSSTP2 = "arbissstp2";
    private static final String KEY_ARBISSPHOTO = "arbissphto";
    private static final String KEY_ARBISSFULLDISC = "arbissfldsc";
    private static final String KEY_ARBISSUSRPIC = "arbissusrpic";
    private static final String KEY_ARBISSIUSRID = "arbissusrid";
    private static final String KEY_ARBISSIUSRDATE = "arbissusrdate";
    private static final String KEY_ARBISSIUSRDSTT = "arbissusrdstt";
    
    private static final String TABLE_VSLISSU = "vslisue";
    private static final String KEY_VSLISSID = "vslissid";
    private static final String KEY_VSLISSSTP1 = "vslissstp1";
    private static final String KEY_VSLISSSTP2 = "vslissstp2";
    private static final String KEY_VSLISSPHOTO = "vslissphto";
    private static final String KEY_VSLISSFULLDISC = "vslissfldsc";
    private static final String KEY_VSLISSUSRPIC = "vslissusrpic";
    private static final String KEY_VSLISSIUSRID = "vslissusrid";
    private static final String KEY_VSLISSIUSRDATE = "vslissusrdate";
    private static final String KEY_VSLISSIUSRDSTT = "vslissusrdstt";
    
    private static final String TABLE_BXRISSU = "bxrisue";
    private static final String KEY_BXRISSID = "bxrissid";
    private static final String KEY_BXRISSSTP1 = "bxrissstp1";
    private static final String KEY_BXRISSSTP2 = "bxrissstp2";
    private static final String KEY_BXRISSPHOTO = "bxrissphto";
    private static final String KEY_BXRISSFULLDISC = "bxrissfldsc";
    private static final String KEY_BXRISSUSRPIC = "bxrissusrpic";
    private static final String KEY_BXRISSIUSRID = "bxrissusrid";
    private static final String KEY_BXRISSIUSRDATE = "bxrissusrdate";
    private static final String KEY_BXRISSIUSRDSTT = "bxrissusrdstt";
    
    private static final String TABLE_BGSISSU = "bgsisue";
    private static final String KEY_BGSISSID = "bgsissid";
    private static final String KEY_BGSISSSTP1 = "bgsissstp1";
    private static final String KEY_BGSISSSTP2 = "bgsissstp2";
    private static final String KEY_BGSISSPHOTO = "bgsissphto";
    private static final String KEY_BGSISSFULLDISC = "bgsissfldsc";
    private static final String KEY_BGSISSUSRPIC = "bgsissusrpic";
    private static final String KEY_BGSISSIUSRID = "bgsissusrid";
    private static final String KEY_BGSISSIUSRDATE = "bgsissusrdate";
    private static final String KEY_BGSISSIUSRDSTT = "bgsissusrdstt";
    
   
    private static final String TABLE_DRBISSU = "drbisue";
    private static final String KEY_DRBISSID = "drbissid";
    private static final String KEY_DRBISSSTP1 = "drbissstp1";
    private static final String KEY_DRBISSSTP2 = "drbissstp2";
    private static final String KEY_DRBISSPHOTO = "drbissphto";
    private static final String KEY_DRBISSFULLDISC = "drbissfldsc";
    private static final String KEY_DRBISSUSRPIC = "drbissusrpic";
    private static final String KEY_DRBISSIUSRID = "drbissusrid";
    private static final String KEY_DRBISSIUSRDATE = "drbissusrdate";
    private static final String KEY_DRBISSIUSRDSTT = "drbissusrdstt";
    
    private static final String TABLE_JNBISSU = "jnbisue";
    private static final String KEY_JNBISSID = "jnbissid";
    private static final String KEY_JNBISSSTP1 = "jnbissstp1";
    private static final String KEY_JNBISSSTP2 = "jnbissstp2";
    private static final String KEY_JNBISSPHOTO = "jnbissphto";
    private static final String KEY_JNBISSFULLDISC = "jnbissfldsc";
    private static final String KEY_JNBISSUSRPIC = "jnbissusrpic";
    private static final String KEY_JNBISSIUSRID = "jnbissusrid";
    private static final String KEY_JNBISSIUSRDATE = "jnbissusrdate";
    private static final String KEY_JNBISSIUSRDSTT = "jnbissusrdstt";
    
    private static final String TABLE_NWAISSU = "nwaisue";
    private static final String KEY_NWAISSID = "nwaissid";
    private static final String KEY_NWAISSSTP1 = "nwaissstp1";
    private static final String KEY_NWAISSSTP2 = "nwaissstp2";
    private static final String KEY_NWAISSPHOTO = "nwaissphto";
    private static final String KEY_NWAISSFULLDISC = "nwaissfldsc";
    private static final String KEY_NWAISSUSRPIC = "nwaissusrpic";
    private static final String KEY_NWAISSIUSRID = "nwaissusrid";
    private static final String KEY_NWAISSIUSRDATE = "nwaissusrdate";
    private static final String KEY_NWAISSIUSRDSTT = "nwaissusrdstt";
    
    private static final String TABLE_SRAISSU = "sraisue";
    private static final String KEY_SRAISSID = "sraissid";
    private static final String KEY_SRAISSSTP1 = "sraissstp1";
    private static final String KEY_SRAISSSTP2 = "sraissstp2";
    private static final String KEY_SRAISSPHOTO = "sraissphto";
    private static final String KEY_SRAISSFULLDISC = "sraissfldsc";
    private static final String KEY_SRAISSUSRPIC = "sraissusrpic";
    private static final String KEY_SRAISSIUSRID = "sraissusrid";
    private static final String KEY_SRAISSIUSRDATE = "sraissusrdate";
    private static final String KEY_SRAISSIUSRDSTT = "sraissusrdstt";
    
    private static final String TABLE_KHGISSU = "khgisue";
    private static final String KEY_KHGISSID = "khgissid";
    private static final String KEY_KHGISSSTP1 = "khgissstp1";
    private static final String KEY_KHGISSSTP2 = "khgissstp2";
    private static final String KEY_KHGISSPHOTO = "khgissphto";
    private static final String KEY_KHGISSFULLDISC = "khgissfldsc";
    private static final String KEY_KHGISSUSRPIC = "khgissusrpic";
    private static final String KEY_KHGISSIUSRID = "khgissusrid";
    private static final String KEY_KHGISSIUSRDATE = "khgissusrdate";
    private static final String KEY_KHGISSIUSRDSTT = "khgissusrdstt";
    
    private static final String TABLE_STAISSU = "staisue";
    private static final String KEY_STAISSID = "staissid";
    private static final String KEY_STAISSSTP1 = "staissstp1";
    private static final String KEY_STAISSSTP2 = "staissstp2";
    private static final String KEY_STAISSPHOTO = "staissphto";
    private static final String KEY_STAISSFULLDISC = "staissfldsc";
    private static final String KEY_STAISSUSRPIC = "staissusrpic";
    private static final String KEY_STAISSIUSRID = "staissusrid";
    private static final String KEY_STAISSIUSRDATE = "staissusrdate";
    private static final String KEY_STAISSIUSRDSTT = "staissusrdstt";
    
    private static final String TABLE_NLDISSU = "nldisue";
    private static final String KEY_NLDISSID = "nldissid";
    private static final String KEY_NLDISSSTP1 = "nldissstp1";
    private static final String KEY_NLDISSSTP2 = "nldissstp2";
    private static final String KEY_NLDISSPHOTO = "nldissphto";
    private static final String KEY_NLDISSFULLDISC = "nldissfldsc";
    private static final String KEY_NLDISSUSRPIC = "nldissusrpic";
    private static final String KEY_NLDISSIUSRID = "nldissusrid";
    private static final String KEY_NLDISSIUSRDATE = "nldissusrdate";
    private static final String KEY_NLDISSIUSRDSTT = "nldissusrdstt";
    
    private static final String TABLE_GYAISSU = "gyaisue";
    private static final String KEY_GYAISSID = "gyaissid";
    private static final String KEY_GYAISSSTP1 = "gyaissstp1";
    private static final String KEY_GYAISSSTP2 = "gyaissstp2";
    private static final String KEY_GYAISSPHOTO = "gyaissphto";
    private static final String KEY_GYAISSFULLDISC = "gyaissfldsc";
    private static final String KEY_GYAISSUSRPIC = "gyaissusrpic";
    private static final String KEY_GYAISSIUSRID = "gyaissusrid";
    private static final String KEY_GYAISSIUSRDATE = "gyaissusrdate";
    private static final String KEY_GYAISSIUSRDSTT = "gyaissusrdstt";
    
    private static final String TABLE_PRNISSU = "prnisue";
    private static final String KEY_PRNISSID = "prnissid";
    private static final String KEY_PRNISSSTP1 = "prnissstp1";
    private static final String KEY_PRNISSSTP2 = "prnissstp2";
    private static final String KEY_PRNISSPHOTO = "prnissphto";
    private static final String KEY_PRNISSFULLDISC = "prnissfldsc";
    private static final String KEY_PRNISSUSRPIC = "prnissusrpic";
    private static final String KEY_PRNISSIUSRID = "prnissusrid";
    private static final String KEY_PRNISSIUSRDATE = "prnissusrdate";
    private static final String KEY_PRNISSIUSRDSTT = "prnissusrdstt";
    
    private static final String TABLE_PRBCISSU = "prbcisue";
    private static final String KEY_PRBCISSID = "prbcissid";
    private static final String KEY_PRBCISSSTP1 = "prbcissstp1";
    private static final String KEY_PRBCISSSTP2 = "prbcissstp2";
    private static final String KEY_PRBCISSPHOTO = "prbcissphto";
    private static final String KEY_PRBCISSFULLDISC = "prbcissfldsc";
    private static final String KEY_PRBCISSUSRPIC = "prbcissusrpic";
    private static final String KEY_PRBCISSIUSRID = "prbcissusrid";
    private static final String KEY_PRBCISSIUSRDATE = "prbcissusrdate";
    private static final String KEY_PRBCISSIUSRDSTT = "prbcissusrdstt";
    
    private static final String TABLE_LAKISSU = "lakisue";
    private static final String KEY_LAKISSID = "lakissid";
    private static final String KEY_LAKISSSTP1 = "lakissstp1";
    private static final String KEY_LAKISSSTP2 = "lakissstp2";
    private static final String KEY_LAKISSPHOTO = "lakissphto";
    private static final String KEY_LAKISSFULLDISC = "lakissfldsc";
    private static final String KEY_LAKISSUSRPIC = "lakissusrpic";
    private static final String KEY_LAKISSIUSRID = "lakissusrid";
    private static final String KEY_LAKISSIUSRDATE = "lakissusrdate";
    private static final String KEY_LAKISSIUSRDSTT = "lakissusrdstt";
    
    private static final String TABLE_MDBISSU = "mdbisue";
    private static final String KEY_MDBISSID = "mdbissid";
    private static final String KEY_MDBISSSTP1 = "mdbissstp1";
    private static final String KEY_MDBISSSTP2 = "mdbissstp2";
    private static final String KEY_MDBISSPHOTO = "mdbissphto";
    private static final String KEY_MDBISSFULLDISC = "mdbissfldsc";
    private static final String KEY_MDBISSUSRPIC = "mdbissusrpic";
    private static final String KEY_MDBISSIUSRID = "mdbissusrid";
    private static final String KEY_MDBISSIUSRDATE = "mdbissusrdate";
    private static final String KEY_MDBISSIUSRDSTT = "mdbissusrdstt";
    
    private static final String TABLE_KTRISSU = "ktrisue";
    private static final String KEY_KTRISSID = "ktrissid";
    private static final String KEY_KTRISSSTP1 = "ktrissstp1";
    private static final String KEY_KTRISSSTP2 = "ktrissstp2";
    private static final String KEY_KTRISSPHOTO = "ktrissphto";
    private static final String KEY_KTRISSFULLDISC = "ktrissfldsc";
    private static final String KEY_KTRISSUSRPIC = "ktrissusrpic";
    private static final String KEY_KTRISSIUSRID = "ktrissusrid";
    private static final String KEY_KTRISSIUSRDATE = "ktrissusrdate";
    private static final String KEY_KTRISSIUSRDSTT = "ktrissusrdstt";
    
    private static final String TABLE_MHPISSU = "mhpisue";
    private static final String KEY_MHPISSID = "mhpissid";
    private static final String KEY_MHPISSSTP1 = "mhpissstp1";
    private static final String KEY_MHPISSSTP2 = "mhpissstp2";
    private static final String KEY_MHPISSPHOTO = "mhpissphto";
    private static final String KEY_MHPISSFULLDISC = "mhpissfldsc";
    private static final String KEY_MHPISSUSRPIC = "mhpissusrpic";
    private static final String KEY_MHPISSIUSRID = "mhpissusrid";
    private static final String KEY_MHPISSIUSRDATE = "mhpissusrdate";
    private static final String KEY_MHPISSIUSRDSTT = "mhpissusrdstt";
    
    private static final String TABLE_BNKISSU = "bnkisue";
    private static final String KEY_BNKISSID = "bnkissid";
    private static final String KEY_BNKISSSTP1 = "bnkissstp1";
    private static final String KEY_BNKISSSTP2 = "bnkissstp2";
    private static final String KEY_BNKISSPHOTO = "bnkissphto";
    private static final String KEY_BNKISSFULLDISC = "bnkissfldsc";
    private static final String KEY_BNKISSUSRPIC = "bnkissusrpic";
    private static final String KEY_BNKISSIUSRID = "bnkissusrid";
    private static final String KEY_BNKISSIUSRDATE = "bnkissusrdate";
    private static final String KEY_BNKISSIUSRDSTT = "bnkissusrdstt";
    
    private static final String TABLE_SEOISSU = "seoisue";
    private static final String KEY_SEOISSID = "seoissid";
    private static final String KEY_SEOISSSTP1 = "seoissstp1";
    private static final String KEY_SEOISSSTP2 = "seoissstp2";
    private static final String KEY_SEOISSPHOTO = "seoissphto";
    private static final String KEY_SEOISSFULLDISC = "seoissfldsc";
    private static final String KEY_SEOISSUSRPIC = "seoissusrpic";
    private static final String KEY_SEOISSIUSRID = "seoissusrid";
    private static final String KEY_SEOISSIUSRDATE = "seoissusrdate";
    private static final String KEY_SEOISSIUSRDSTT = "seoissusrdstt";
    
  private static final String TABLE_SPLISSU = "splisue";
  private static final String KEY_SPLISSID = "splissid";
  private static final String KEY_SPLISSSTP1 = "splissstp1";
  private static final String KEY_SPLISSSTP2 = "splissstp2";
  private static final String KEY_SPLISSPHOTO = "splissphto";
  private static final String KEY_SPLISSFULLDISC = "splissfldsc";
  private static final String KEY_SPLISSUSRPIC = "splissusrpic";
  private static final String KEY_SPLISSIUSRID = "splissusrid";
  private static final String KEY_SPLISSIUSRDATE = "splissusrdate";
  private static final String KEY_SPLISSIUSRDSTT = "splissusrdstt";
    
  private static final String TABLE_PCMCISSU = "pcmcisue";
  private static final String KEY_PCMCISSID = "pcmcissid";
  private static final String KEY_PCMCISSSTP1 = "pcmcissstp1";
  private static final String KEY_PCMCISSSTP2 = "pcmcissstp2";
  private static final String KEY_PCMCISSPHOTO = "pcmcissphto";
  private static final String KEY_PCMCISSFULLDISC = "pcmcissfldsc";
  private static final String KEY_PCMCISSUSRPIC = "pcmcissusrpic";
  private static final String KEY_PCMCISSIUSRID = "pcmcissusrid";
  private static final String KEY_PCMCISSIUSRDATE = "pcmcissusrdate";
  private static final String KEY_PCMCISSIUSRDSTT = "pcmcissusrdstt";
    
  private static final String TABLE_SKHISSU = "skhisue";
  private static final String KEY_SKHISSID = "skhissid";
  private static final String KEY_SKHISSSTP1 = "skhissstp1";
  private static final String KEY_SKHISSSTP2 = "skhissstp2";
  private static final String KEY_SKHISSPHOTO = "skhissphto";
  private static final String KEY_SKHISSFULLDISC = "skhissfldsc";
  private static final String KEY_SKHISSUSRPIC = "skhissusrpic";
  private static final String KEY_SKHISSIUSRID = "skhissusrid";
  private static final String KEY_SKHISSIUSRDATE = "skhissusrdate";
  private static final String KEY_SKHISSIUSRDSTT = "skhissusrdstt";
    
  private static final String TABLE_ARIISSU = "ariisue";
  private static final String KEY_ARIISSID = "ariissid";
  private static final String KEY_ARIISSSTP1 = "ariissstp1";
  private static final String KEY_ARIISSSTP2 = "ariissstp2";
  private static final String KEY_ARIISSPHOTO = "ariissphto";
  private static final String KEY_ARIISSFULLDISC = "ariissfldsc";
  private static final String KEY_ARIISSUSRPIC = "ariissusrpic";
  private static final String KEY_ARIISSIUSRID = "ariissusrid";
  private static final String KEY_ARIISSIUSRDATE = "ariissusrdate";
  private static final String KEY_ARIISSIUSRDSTT = "ariissusrdstt";
    
  private static final String TABLE_SMTPISSU = "smtpisue";
  private static final String KEY_SMTPISSID = "smtpissid";
  private static final String KEY_SMTPISSSTP1 = "smtpissstp1";
  private static final String KEY_SMTPISSSTP2 = "smtpissstp2";
  private static final String KEY_SMTPISSPHOTO = "smtpissphto";
  private static final String KEY_SMTPISSFULLDISC = "smtpissfldsc";
  private static final String KEY_SMTPISSUSRPIC = "smtpissusrpic";
  private static final String KEY_SMTPISSIUSRID = "smtpissusrid";
  private static final String KEY_SMTPISSIUSRDATE = "smtpissusrdate";
  private static final String KEY_SMTPISSIUSRDSTT = "smtpissusrdstt";
    
  private static final String TABLE_JMIISSU = "jmiisue";
  private static final String KEY_JMIISSID = "jmiissid";
  private static final String KEY_JMIISSSTP1 = "jmiissstp1";
  private static final String KEY_JMIISSSTP2 = "jmiissstp2";
  private static final String KEY_JMIISSPHOTO = "jmiissphto";
  private static final String KEY_JMIISSFULLDISC = "jmiissfldsc";
  private static final String KEY_JMIISSUSRPIC = "jmiissusrpic";
  private static final String KEY_JMIISSIUSRID = "jmiissusrid";
  private static final String KEY_JMIISSIUSRDATE = "jmiissusrdate";
  private static final String KEY_JMIISSIUSRDSTT = "jmiissusrdstt";
    
  private static final String TABLE_KMRISSU = "kmrisue";
  private static final String KEY_KMRISSID = "kmrissid";
  private static final String KEY_KMRISSSTP1 = "kmrissstp1";
  private static final String KEY_KMRISSSTP2 = "kmrissstp2";
  private static final String KEY_KMRISSPHOTO = "kmrissphto";
  private static final String KEY_KMRISSFULLDISC = "kmrissfldsc";
  private static final String KEY_KMRISSUSRPIC = "kmrissusrpic";
  private static final String KEY_KMRISSIUSRID = "kmrissusrid";
  private static final String KEY_KMRISSIUSRDATE = "kmrissusrdate";
  private static final String KEY_KMRISSIUSRDSTT = "kmrissusrdstt";
    
  private static final String TABLE_KSNISSU = "ksnisue";
  private static final String KEY_KSNISSID = "ksnissid";
  private static final String KEY_KSNISSSTP1 = "ksnissstp1";
  private static final String KEY_KSNISSSTP2 = "ksnissstp2";
  private static final String KEY_KSNISSPHOTO = "ksnissphto";
  private static final String KEY_KSNISSFULLDISC = "ksnissfldsc";
  private static final String KEY_KSNISSUSRPIC = "ksnissusrpic";
  private static final String KEY_KSNISSIUSRID = "ksnissusrid";
  private static final String KEY_KSNISSIUSRDATE = "ksnissusrdate";
  private static final String KEY_KSNISSIUSRDSTT = "ksnissusrdstt";
    
  private static final String TABLE_AWLISSU = "awlisue";
  private static final String KEY_AWLISSID = "awlissid";
  private static final String KEY_AWLISSSTP1 = "awlissstp1";
  private static final String KEY_AWLISSSTP2 = "awlissstp2";
  private static final String KEY_AWLISSPHOTO = "awlissphto";
  private static final String KEY_AWLISSFULLDISC = "awlissfldsc";
  private static final String KEY_AWLISSUSRPIC = "awlissusrpic";
  private static final String KEY_AWLISSIUSRID = "awlissusrid";
  private static final String KEY_AWLISSIUSRDATE = "awlissusrdate";
  private static final String KEY_AWLISSIUSRDSTT = "awlissusrdstt";
    
// ..............................................................................................
    
  
    
    private static final String TABLE_DELAYY = "delayy";
    private static final String KEY_DLID = "dlid";
    private static final String KEY_DLSUB = "dlsub";
    private static final String KEY_DLSUBIS = "dlsubis";
    private static final String KEY_DLUSPIC = "dlupic";
    private static final String KEY_DLFULLDSC = "dlfulldsc";
    private static final String KEY_DLUSID = "dlusid";
    private static final String KEY_DLDATE = "dldate";
    private static final String KEY_DLNAME = "dlnm";
    private static final String KEY_DLCOMPPIC = "dlcmppic";
 
    
    private static final String TABLE_SOLVEDD = "solvedd";
    private static final String KEY_SLID = "slid";
    private static final String KEY_SLSUB = "slsub";
    private static final String KEY_SLSUBIS = "slsubis";
    private static final String KEY_SLUSPIC = "slupic";
    private static final String KEY_SLFULLDSC = "slfulldsc";
    private static final String KEY_SLUSID = "slusid";
    private static final String KEY_SLDATE = "sldate";
    private static final String KEY_SLNAME = "slnm";
    private static final String KEY_SLCOMPPIC = "slcmppic";
    
    private static final String TABLE_OFFREG = "ofrg";
    private static final String KEY_OFID = "ofid";
    
    
    private static final String KEY_OFDST = "ofdst";
    private static final String KEY_OFPHON = "ofphn";
    private static final String KEY_OFPASS = "ofpass";
    
    private static final String TABLE_PNOFFREG = "pnbeofrg";
    private static final String KEY_PNOFID = "pnofid";
    
    
    private static final String KEY_PNOFDST = "pnofdst";
    private static final String KEY_PNOFPHON = "pnofphn";
    private static final String KEY_PNOFPASS = "pnofpass";
    
   
    
    private static final String[] COLUMNS = {KEY_ID,KEY_UNAME,KEY_UPASS,KEY_UPHTO,KEY_UPHON,KEY_USEX,KEY_UDSTT,KEY_UDIDE};

    

    
    private static final String[] ISUECOLUMNS = {KEY_ISSID,KEY_ISSSTP1,KEY_ISSSTP2,KEY_ISSPHOTO,
    	                                          KEY_ISSFULLDISC,KEY_ISSUSRPIC,KEY_ISSIUSRID,KEY_ISSIUSRDATE,KEY_ISSIUSRDSTT};
  //declaring columns for patnaissue
    private static final String[] PTNISUECOLUMNS = {KEY_PTNISSID,KEY_PTNISSSTP1,KEY_PTNISSSTP2,KEY_PTNISSPHOTO,
                                                    KEY_PTNISSFULLDISC,KEY_PTNISSUSRPIC,KEY_PTNISSIUSRID,KEY_PTNISSIUSRDATE,KEY_PTNISSIUSRDSTT};
    
    private static final String[] ROHISUECOLUMNS = {KEY_ROHISSID,KEY_ROHISSSTP1,KEY_ROHISSSTP2,KEY_ROHISSPHOTO,
        KEY_ROHISSFULLDISC,KEY_ROHISSUSRPIC,KEY_ROHISSIUSRID,KEY_ROHISSIUSRDATE,KEY_ROHISSIUSRDSTT};
    
    private static final String[] BGPRISUECOLUMNS = {KEY_BGPRISSID,KEY_BGPRISSSTP1,KEY_BGPRISSSTP2,KEY_BGPRISSPHOTO,
        KEY_BGPRISSFULLDISC,KEY_BGPRISSUSRPIC,KEY_BGPRISSIUSRID,KEY_BGPRISSIUSRDATE,KEY_BGPRISSIUSRDSTT};
    
    private static final String[] MUNISUECOLUMNS = {KEY_MUNISSID,KEY_MUNISSSTP1,KEY_MUNISSSTP2,KEY_MUNISSPHOTO,
        KEY_MUNISSFULLDISC,KEY_MUNISSUSRPIC,KEY_MUNISSIUSRID,KEY_MUNISSIUSRDATE,KEY_MUNISSIUSRDSTT};
    
    private static final String[] BHPISUECOLUMNS = {KEY_BHPISSID,KEY_BHPISSSTP1,KEY_BHPISSSTP2,KEY_BHPISSPHOTO,
        KEY_BHPISSFULLDISC,KEY_BHPISSUSRPIC,KEY_BHPISSIUSRID,KEY_BHPISSIUSRDATE,KEY_BHPISSIUSRDSTT};
    
    private static final String[] MFPISUECOLUMNS = {KEY_MFPISSID,KEY_MFPISSSTP1,KEY_MFPISSSTP2,KEY_MFPISSPHOTO,
        KEY_MFPISSFULLDISC,KEY_MFPISSUSRPIC,KEY_MFPISSIUSRID,KEY_MFPISSIUSRDATE,KEY_MFPISSIUSRDSTT};
    
    private static final String[] SWNISUECOLUMNS = {KEY_SWNISSID,KEY_SWNISSSTP1,KEY_SWNISSSTP2,KEY_SWNISSPHOTO,
        KEY_SWNISSFULLDISC,KEY_SWNISSUSRPIC,KEY_SWNISSIUSRID,KEY_SWNISSIUSRDATE,KEY_SWNISSIUSRDSTT};
    
    private static final String[] GOPISUECOLUMNS = {KEY_GOPISSID,KEY_GOPISSSTP1,KEY_GOPISSSTP2,KEY_GOPISSPHOTO,
        KEY_GOPISSFULLDISC,KEY_GOPISSUSRPIC,KEY_GOPISSIUSRID,KEY_GOPISSIUSRDATE,KEY_GOPISSIUSRDSTT};
    
    private static final String[] SRNISUECOLUMNS = {KEY_SRNISSID,KEY_SRNISSSTP1,KEY_SRNISSSTP2,KEY_SRNISSPHOTO,
        KEY_SRNISSFULLDISC,KEY_SRNISSUSRPIC,KEY_SRNISSIUSRID,KEY_SRNISSIUSRDATE,KEY_SRNISSIUSRDSTT};
    
    private static final String[] ARBISUECOLUMNS = {KEY_ARBISSID,KEY_ARBISSSTP1,KEY_ARBISSSTP2,KEY_ARBISSPHOTO,
        KEY_ARBISSFULLDISC,KEY_ARBISSUSRPIC,KEY_ARBISSIUSRID,KEY_ARBISSIUSRDATE,KEY_ARBISSIUSRDSTT};
    
    private static final String[] VSLISUECOLUMNS = {KEY_VSLISSID,KEY_VSLISSSTP1,KEY_VSLISSSTP2,KEY_VSLISSPHOTO,
        KEY_VSLISSFULLDISC,KEY_VSLISSUSRPIC,KEY_VSLISSIUSRID,KEY_VSLISSIUSRDATE,KEY_VSLISSIUSRDSTT};
    
    private static final String[] BXRISUECOLUMNS = {KEY_BXRISSID,KEY_BXRISSSTP1,KEY_BXRISSSTP2,KEY_BXRISSPHOTO,
        KEY_BXRISSFULLDISC,KEY_BXRISSUSRPIC,KEY_BXRISSIUSRID,KEY_BXRISSIUSRDATE,KEY_BXRISSIUSRDSTT};
    
    private static final String[] BGSISUECOLUMNS = {KEY_BGSISSID,KEY_BGSISSSTP1,KEY_BGSISSSTP2,KEY_BGSISSPHOTO,
        KEY_BGSISSFULLDISC,KEY_BGSISSUSRPIC,KEY_BGSISSIUSRID,KEY_BGSISSIUSRDATE,KEY_BGSISSIUSRDSTT};
    
    private static final String[] DRBISUECOLUMNS = {KEY_DRBISSID,KEY_DRBISSSTP1,KEY_DRBISSSTP2,KEY_DRBISSPHOTO,
        KEY_DRBISSFULLDISC,KEY_DRBISSUSRPIC,KEY_DRBISSIUSRID,KEY_DRBISSIUSRDATE,KEY_DRBISSIUSRDSTT};
    
    private static final String[] JNBISUECOLUMNS = {KEY_JNBISSID,KEY_JNBISSSTP1,KEY_JNBISSSTP2,KEY_JNBISSPHOTO,
        KEY_JNBISSFULLDISC,KEY_JNBISSUSRPIC,KEY_JNBISSIUSRID,KEY_JNBISSIUSRDATE,KEY_JNBISSIUSRDSTT};
    
    private static final String[] NWAISUECOLUMNS = {KEY_NWAISSID,KEY_NWAISSSTP1,KEY_NWAISSSTP2,KEY_NWAISSPHOTO,
        KEY_NWAISSFULLDISC,KEY_NWAISSUSRPIC,KEY_NWAISSIUSRID,KEY_NWAISSIUSRDATE,KEY_NWAISSIUSRDSTT};
    
    private static final String[] SRAISUECOLUMNS = {KEY_SRAISSID,KEY_SRAISSSTP1,KEY_SRAISSSTP2,KEY_SRAISSPHOTO,
        KEY_SRAISSFULLDISC,KEY_SRAISSUSRPIC,KEY_SRAISSIUSRID,KEY_SRAISSIUSRDATE,KEY_SRAISSIUSRDSTT};
    
    private static final String[] KHGISUECOLUMNS = {KEY_KHGISSID,KEY_KHGISSSTP1,KEY_KHGISSSTP2,KEY_KHGISSPHOTO,
        KEY_KHGISSFULLDISC,KEY_KHGISSUSRPIC,KEY_KHGISSIUSRID,KEY_KHGISSIUSRDATE,KEY_KHGISSIUSRDSTT};
    
    private static final String[] STAISUECOLUMNS = {KEY_STAISSID,KEY_STAISSSTP1,KEY_STAISSSTP2,KEY_STAISSPHOTO,
        KEY_STAISSFULLDISC,KEY_STAISSUSRPIC,KEY_STAISSIUSRID,KEY_STAISSIUSRDATE,KEY_STAISSIUSRDSTT};
    
    private static final String[] NLDISUECOLUMNS = {KEY_NLDISSID,KEY_NLDISSSTP1,KEY_NLDISSSTP2,KEY_NLDISSPHOTO,
        KEY_NLDISSFULLDISC,KEY_NLDISSUSRPIC,KEY_NLDISSIUSRID,KEY_NLDISSIUSRDATE,KEY_NLDISSIUSRDSTT};
    
    private static final String[] GYAISUECOLUMNS = {KEY_GYAISSID,KEY_GYAISSSTP1,KEY_GYAISSSTP2,KEY_GYAISSPHOTO,
        KEY_GYAISSFULLDISC,KEY_GYAISSUSRPIC,KEY_GYAISSIUSRID,KEY_GYAISSIUSRDATE,KEY_GYAISSIUSRDSTT};
    
    private static final String[] PRNISUECOLUMNS = {KEY_PRNISSID,KEY_PRNISSSTP1,KEY_PRNISSSTP2,KEY_PRNISSPHOTO,
        KEY_PRNISSFULLDISC,KEY_PRNISSUSRPIC,KEY_PRNISSIUSRID,KEY_PRNISSIUSRDATE,KEY_PRNISSIUSRDSTT};
    
    private static final String[] PRBCISUECOLUMNS = {KEY_PRBCISSID,KEY_PRBCISSSTP1,KEY_PRBCISSSTP2,KEY_PRBCISSPHOTO,
        KEY_PRBCISSFULLDISC,KEY_PRBCISSUSRPIC,KEY_PRBCISSIUSRID,KEY_PRBCISSIUSRDATE,KEY_PRBCISSIUSRDSTT};
    
    private static final String[] LAKISUECOLUMNS = {KEY_LAKISSID,KEY_LAKISSSTP1,KEY_LAKISSSTP2,KEY_LAKISSPHOTO,
        KEY_LAKISSFULLDISC,KEY_LAKISSUSRPIC,KEY_LAKISSIUSRID,KEY_LAKISSIUSRDATE,KEY_LAKISSIUSRDSTT};
    
    private static final String[] MDBISUECOLUMNS = {KEY_MDBISSID,KEY_MDBISSSTP1,KEY_MDBISSSTP2,KEY_MDBISSPHOTO,
        KEY_MDBISSFULLDISC,KEY_MDBISSUSRPIC,KEY_MDBISSIUSRID,KEY_MDBISSIUSRDATE,KEY_MDBISSIUSRDSTT};
    
    private static final String[] KTRISUECOLUMNS = {KEY_KTRISSID,KEY_KTRISSSTP1,KEY_KTRISSSTP2,KEY_KTRISSPHOTO,
        KEY_KTRISSFULLDISC,KEY_KTRISSUSRPIC,KEY_KTRISSIUSRID,KEY_KTRISSIUSRDATE,KEY_KTRISSIUSRDSTT};
    
    private static final String[] MHPISUECOLUMNS = {KEY_MHPISSID,KEY_MHPISSSTP1,KEY_MHPISSSTP2,KEY_MHPISSPHOTO,
        KEY_MHPISSFULLDISC,KEY_MHPISSUSRPIC,KEY_MHPISSIUSRID,KEY_MHPISSIUSRDATE,KEY_MHPISSIUSRDSTT};
    
    private static final String[] BNKISUECOLUMNS = {KEY_BNKISSID,KEY_BNKISSSTP1,KEY_BNKISSSTP2,KEY_BNKISSPHOTO,
        KEY_BNKISSFULLDISC,KEY_BNKISSUSRPIC,KEY_BNKISSIUSRID,KEY_BNKISSIUSRDATE,KEY_BNKISSIUSRDSTT};
    
    private static final String[] SEOISUECOLUMNS = {KEY_SEOISSID,KEY_SEOISSSTP1,KEY_SEOISSSTP2,KEY_SEOISSPHOTO,
        KEY_SEOISSFULLDISC,KEY_SEOISSUSRPIC,KEY_SEOISSIUSRID,KEY_SEOISSIUSRDATE,KEY_SEOISSIUSRDSTT};
    
    private static final String[] SPLISUECOLUMNS = {KEY_SPLISSID,KEY_SPLISSSTP1,KEY_SPLISSSTP2,KEY_SPLISSPHOTO,
        KEY_SPLISSFULLDISC,KEY_SPLISSUSRPIC,KEY_SPLISSIUSRID,KEY_SPLISSIUSRDATE,KEY_SPLISSIUSRDSTT};
    
    private static final String[] PCMCISUECOLUMNS = {KEY_PCMCISSID,KEY_PCMCISSSTP1,KEY_PCMCISSSTP2,KEY_PCMCISSPHOTO,
        KEY_PCMCISSFULLDISC,KEY_PCMCISSUSRPIC,KEY_PCMCISSIUSRID,KEY_PCMCISSIUSRDATE,KEY_PCMCISSIUSRDSTT};
    
    private static final String[] SKHISUECOLUMNS = {KEY_SKHISSID,KEY_SKHISSSTP1,KEY_SKHISSSTP2,KEY_SKHISSPHOTO,
        KEY_SKHISSFULLDISC,KEY_SKHISSUSRPIC,KEY_SKHISSIUSRID,KEY_SKHISSIUSRDATE,KEY_SKHISSIUSRDSTT};
    
    private static final String[] ARIISUECOLUMNS = {KEY_ARIISSID,KEY_ARIISSSTP1,KEY_ARIISSSTP2,KEY_ARIISSPHOTO,
        KEY_ARIISSFULLDISC,KEY_ARIISSUSRPIC,KEY_ARIISSIUSRID,KEY_ARIISSIUSRDATE,KEY_ARIISSIUSRDSTT};
    
    private static final String[] SMTPISUECOLUMNS = {KEY_SMTPISSID,KEY_SMTPISSSTP1,KEY_SMTPISSSTP2,KEY_SMTPISSPHOTO,
        KEY_SMTPISSFULLDISC,KEY_SMTPISSUSRPIC,KEY_SMTPISSIUSRID,KEY_SMTPISSIUSRDATE,KEY_SMTPISSIUSRDSTT};
    
    private static final String[] JMIISUECOLUMNS = {KEY_JMIISSID,KEY_JMIISSSTP1,KEY_JMIISSSTP2,KEY_JMIISSPHOTO,
        KEY_JMIISSFULLDISC,KEY_JMIISSUSRPIC,KEY_JMIISSIUSRID,KEY_JMIISSIUSRDATE,KEY_JMIISSIUSRDSTT};
    
    private static final String[] KMRISUECOLUMNS = {KEY_KMRISSID,KEY_KMRISSSTP1,KEY_KMRISSSTP2,KEY_KMRISSPHOTO,
        KEY_KMRISSFULLDISC,KEY_KMRISSUSRPIC,KEY_KMRISSIUSRID,KEY_KMRISSIUSRDATE,KEY_KMRISSIUSRDSTT};
    
    
  private static final String[] AWLISUECOLUMNS = {KEY_AWLISSID,KEY_AWLISSSTP1,KEY_AWLISSSTP2,KEY_AWLISSPHOTO,
  KEY_AWLISSFULLDISC,KEY_AWLISSUSRPIC,KEY_AWLISSIUSRID,KEY_AWLISSIUSRDATE,KEY_AWLISSIUSRDSTT};

    
//............................................................................................
  
    private static final String[] DELAYYCOLUMNS = {KEY_DLID,KEY_DLSUB,KEY_DLSUBIS,KEY_DLUSPIC,KEY_DLFULLDSC,KEY_DLUSID,KEY_DLDATE,KEY_DLNAME,KEY_DLCOMPPIC};
    
    private static final String[] SOLVEDdCOLUMNS = {KEY_SLID,KEY_SLSUB,KEY_SLSUBIS,KEY_SLUSPIC,KEY_SLFULLDSC,KEY_SLUSID,KEY_SLDATE,KEY_SLNAME,KEY_SLCOMPPIC};
    
    private static final String[] WPCOLUMNS={KEY_WPID,KEY_CMNTID,KEY_WPCMNTTXT,KEY_WPNAME};
    
    private static final String[] EPCOLUMNS={KEY_EPID,KEY_EPCMNTID,KEY_EPCMNTTXT,KEY_EPNAME};
    
    private static final String[] CPCOLUMNS={KEY_CPID,KEY_CPCMNTID,KEY_CPCMNTTXT,KEY_CPNAME};
    
    private static final String[] TPCOLUMNS={KEY_TPID,KEY_TPCMNTID,KEY_TPCMNTTXT,KEY_TPNAME};
    
    private static final String[] SWPCOLUMNS={KEY_SWPID,KEY_SWPCMNTID,KEY_SWPCMNTTXT,KEY_SWPNAME};
    
    private static final String[] SPCOLUMNS={KEY_SPID,KEY_SPCMNTID,KEY_SPCMNTTXT,KEY_SPNAME};
    
    private static final String[] OTPCOLUMNS={KEY_OTPID,KEY_OTPCMNTID,KEY_OTPCMNTTXT,KEY_OTPNAME};
    
    private static final String[] OFFCOLUMNS = {KEY_OFID,KEY_OFDST,KEY_OFPHON,KEY_OFPASS};
    
    private static final String[] PNOFFCOLUMNS = {KEY_PNOFID,KEY_PNOFDST,KEY_PNOFPHON,KEY_PNOFPASS};
   
    
    public void addusers(Users us)
    {
        Log.i("addusers", us.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_UNAME, us.getunm());  
        values.put(KEY_UPASS, us.getups());
        values.put(KEY_UPHTO, us.getph());
        values.put(KEY_UPHON, us.getpn());
        values.put(KEY_USEX, us.getsx());
        values.put(KEY_UDSTT, us.getdst());
        values.put(KEY_UDIDE, us.getuside());
        db.insertOrThrow(TABLE_USERS,null,values);
        db.close(); 
    } 
    
    public void addoffusers(OffUsers ofs)
    {
        Log.i("addusers", ofs.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_OFDST, ofs.getofdst());  
        values.put(KEY_OFPHON, ofs.getofphn());
        values.put(KEY_OFPASS, ofs.getofpass());
        
        db.insertOrThrow(TABLE_OFFREG,null,values);
        db.close(); 
    } 
    public void addpnoffusers(OffUsers ofs)
    {
        Log.i("addpnoffusers", ofs.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_PNOFDST, ofs.getofdst());  
        values.put(KEY_PNOFPHON, ofs.getofphn());
        values.put(KEY_PNOFPASS, ofs.getofpass());
        
        db.insertOrThrow(TABLE_PNOFFREG,null,values);
        db.close(); 
    } 
   
    public String getOFFpassword(String ofphn)
    {
    	SQLiteDatabase db = this.getReadableDatabase();
    	Cursor cursor = db.query(TABLE_OFFREG, null, "ofphn=?", new String[]{ofphn},null, null, null);
    	if(cursor.getCount()<1)
    	{
    		cursor.close();
    		return"NOT EXISTS";
    	}
    	cursor.moveToFirst();
    	String upass = cursor.getString(cursor.getColumnIndex("ofpass"));
    	cursor.close();
    	return upass;
    }
    public String getOFFdstt(String ofphn)
    {
    	SQLiteDatabase db = this.getReadableDatabase();
    	Cursor cursor = db.query(TABLE_OFFREG, null, "ofphn=?", new String[]{ofphn},null, null, null);
    	if(cursor.getCount()<1)
    	{
    		cursor.close();
    		return"NOT EXISTS";
    	}
    	cursor.moveToFirst();
    	String udstt = cursor.getString(cursor.getColumnIndex("ofdst"));
    	cursor.close();
    	return udstt;
    }
    
    
    public void addwpcmnts(Comnts cmt)
    {
        Log.i("addwpcmnts", cmt.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_CMNTID, cmt.getcmntid());
        values.put(KEY_WPCMNTTXT, cmt.getcmnttext());  
        values.put(KEY_WPNAME, cmt.getblgrname());
        values.put(KEY_WPPIC, cmt.getblgrpic());
       
        db.insertOrThrow(TABLE_WPCMNT,null,values);
        db.close(); 
    } 
    
    public void addepcmnts(Comnts cmt)
    {
        Log.i("addepcmnts", cmt.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_EPCMNTID, cmt.getcmntid());
        values.put(KEY_EPCMNTTXT, cmt.getcmnttext());  
        values.put(KEY_EPNAME, cmt.getblgrname());
        values.put(KEY_EPPIC, cmt.getblgrpic());
        db.insertOrThrow(TABLE_EPCMNT,null,values);
        db.close(); 
    } 
    
    public void addcpcmnts(Comnts cmt)
    {
        Log.i("addcpcmnts", cmt.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_CPCMNTID, cmt.getcmntid());
        values.put(KEY_CPCMNTTXT, cmt.getcmnttext());  
        values.put(KEY_CPNAME, cmt.getblgrname());
        values.put(KEY_CPPIC, cmt.getblgrpic());
        db.insertOrThrow(TABLE_CPCMNT,null,values);
        db.close(); 
    } 
    
    public void addtpcmnts(Comnts cmt)
    {
        Log.i("addtpcmnts", cmt.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_TPCMNTID, cmt.getcmntid());
        values.put(KEY_TPCMNTTXT, cmt.getcmnttext());  
        values.put(KEY_TPNAME, cmt.getblgrname());
        values.put(KEY_TPPIC, cmt.getblgrpic());
        db.insertOrThrow(TABLE_TPCMNT,null,values);
        db.close(); 
    } 
    
    public void addswpcmnts(Comnts cmt)
    {
        Log.i("addswpcmnts", cmt.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SWPCMNTID, cmt.getcmntid());
        values.put(KEY_SWPCMNTTXT, cmt.getcmnttext());  
        values.put(KEY_SWPNAME, cmt.getblgrname());
        values.put(KEY_SWPPIC, cmt.getblgrpic());
        db.insertOrThrow(TABLE_SWPCMNT,null,values);
        db.close(); 
    } 
    
    public void addspcmnts(Comnts cmt)
    {
        Log.i("addspcmnts", cmt.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SPCMNTID, cmt.getcmntid());
        values.put(KEY_SPCMNTTXT, cmt.getcmnttext());  
        values.put(KEY_SPNAME, cmt.getblgrname());
        values.put(KEY_SPPIC, cmt.getblgrpic());
        db.insertOrThrow(TABLE_SPCMNT,null,values);
        db.close(); 
    } 
    
    public void addotpcmnts(Comnts cmt)
    {
        Log.i("addotpcmnts", cmt.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_OTPCMNTID, cmt.getcmntid());
        values.put(KEY_OTPCMNTTXT, cmt.getcmnttext());  
        values.put(KEY_OTPNAME, cmt.getblgrname());
        values.put(KEY_OTPPIC, cmt.getblgrpic());
        db.insertOrThrow(TABLE_OTPCMNT,null,values);
        db.close(); 
    } 
    
   
    
    
    public void addisue(Issue is)
    {
        Log.i("addisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ISSSTP1, is.getstp1());  
        values.put(KEY_ISSSTP2, is.getstp2());
        values.put(KEY_ISSPHOTO, is.getph());
        values.put(KEY_ISSFULLDISC, is.getfd());
        values.put(KEY_ISSUSRPIC, is.getusrpic());
        values.put(KEY_ISSIUSRID, is.getusrid());
        values.put(KEY_ISSIUSRDATE, is.getusrdate());
        values.put(KEY_ISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_ISSU,null,values);
        db.close(); 
    }
    
    //adding data to datbase of patna issue table
    public void addptnisue(Issue is)
    {
        Log.i("addptnisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_PTNISSSTP1, is.getstp1());  
        values.put(KEY_PTNISSSTP2, is.getstp2());
        values.put(KEY_PTNISSPHOTO, is.getph());
        values.put(KEY_PTNISSFULLDISC, is.getfd());
        values.put(KEY_PTNISSUSRPIC, is.getusrpic());
        values.put(KEY_PTNISSIUSRID, is.getusrid());
        values.put(KEY_PTNISSIUSRDATE, is.getusrdate());
        values.put(KEY_PTNISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_PTNISSU,null,values);
        db.close(); 
    }
    
    public void addrohisue(Issue is)
    {
        Log.i("addrohisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ROHISSSTP1, is.getstp1());  
        values.put(KEY_ROHISSSTP2, is.getstp2());
        values.put(KEY_ROHISSPHOTO, is.getph());
        values.put(KEY_ROHISSFULLDISC, is.getfd());
        values.put(KEY_ROHISSUSRPIC, is.getusrpic());
        values.put(KEY_ROHISSIUSRID, is.getusrid());
        values.put(KEY_ROHISSIUSRDATE, is.getusrdate());
        values.put(KEY_ROHISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_ROHISSU,null,values);
        db.close(); 
    }
    
    public void addbgprisue(Issue is)
    {
        Log.i("addbgprisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_BGPRISSSTP1, is.getstp1());  
        values.put(KEY_BGPRISSSTP2, is.getstp2());
        values.put(KEY_BGPRISSPHOTO, is.getph());
        values.put(KEY_BGPRISSFULLDISC, is.getfd());
        values.put(KEY_BGPRISSUSRPIC, is.getusrpic());
        values.put(KEY_BGPRISSIUSRID, is.getusrid());
        values.put(KEY_BGPRISSIUSRDATE, is.getusrdate());
        values.put(KEY_BGPRISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_BGPRISSU,null,values);
        db.close(); 
    }
    
    public void addmunisue(Issue is)
    {
        Log.i("addmunisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_MUNISSSTP1, is.getstp1());  
        values.put(KEY_MUNISSSTP2, is.getstp2());
        values.put(KEY_MUNISSPHOTO, is.getph());
        values.put(KEY_MUNISSFULLDISC, is.getfd());
        values.put(KEY_MUNISSUSRPIC, is.getusrpic());
        values.put(KEY_MUNISSIUSRID, is.getusrid());
        values.put(KEY_MUNISSIUSRDATE, is.getusrdate());
        values.put(KEY_MUNISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_MUNISSU,null,values);
        db.close(); 
    }
    
    public void addbhpisue(Issue is)
    {
        Log.i("addbhpisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_BHPISSSTP1, is.getstp1());  
        values.put(KEY_BHPISSSTP2, is.getstp2());
        values.put(KEY_BHPISSPHOTO, is.getph());
        values.put(KEY_BHPISSFULLDISC, is.getfd());
        values.put(KEY_BHPISSUSRPIC, is.getusrpic());
        values.put(KEY_BHPISSIUSRID, is.getusrid());
        values.put(KEY_BHPISSIUSRDATE, is.getusrdate());
        values.put(KEY_BHPISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_BHPISSU,null,values);
        db.close(); 
    }
    
    public void addmfpisue(Issue is)
    {
        Log.i("addmfpisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_MFPISSSTP1, is.getstp1());  
        values.put(KEY_MFPISSSTP2, is.getstp2());
        values.put(KEY_MFPISSPHOTO, is.getph());
        values.put(KEY_MFPISSFULLDISC, is.getfd());
        values.put(KEY_MFPISSUSRPIC, is.getusrpic());
        values.put(KEY_MFPISSIUSRID, is.getusrid());
        values.put(KEY_MFPISSIUSRDATE, is.getusrdate());
        values.put(KEY_MFPISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_MFPISSU,null,values);
        db.close(); 
    }
    
    public void addswnisue(Issue is)
    {
        Log.i("addswnisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SWNISSSTP1, is.getstp1());  
        values.put(KEY_SWNISSSTP2, is.getstp2());
        values.put(KEY_SWNISSPHOTO, is.getph());
        values.put(KEY_SWNISSFULLDISC, is.getfd());
        values.put(KEY_SWNISSUSRPIC, is.getusrpic());
        values.put(KEY_SWNISSIUSRID, is.getusrid());
        values.put(KEY_SWNISSIUSRDATE, is.getusrdate());
        values.put(KEY_SWNISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_SWNISSU,null,values);
        db.close(); 
    }
    
    public void addgopisue(Issue is)
    {
        Log.i("addgopisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_GOPISSSTP1, is.getstp1());  
        values.put(KEY_GOPISSSTP2, is.getstp2());
        values.put(KEY_GOPISSPHOTO, is.getph());
        values.put(KEY_GOPISSFULLDISC, is.getfd());
        values.put(KEY_GOPISSUSRPIC, is.getusrpic());
        values.put(KEY_GOPISSIUSRID, is.getusrid());
        values.put(KEY_GOPISSIUSRDATE, is.getusrdate());
        values.put(KEY_GOPISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_GOPISSU,null,values);
        db.close(); 
    }
    
    public void addsrnisue(Issue is)
    {
        Log.i("addsrnisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SRNISSSTP1, is.getstp1());  
        values.put(KEY_SRNISSSTP2, is.getstp2());
        values.put(KEY_SRNISSPHOTO, is.getph());
        values.put(KEY_SRNISSFULLDISC, is.getfd());
        values.put(KEY_SRNISSUSRPIC, is.getusrpic());
        values.put(KEY_SRNISSIUSRID, is.getusrid());
        values.put(KEY_SRNISSIUSRDATE, is.getusrdate());
        values.put(KEY_SRNISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_SRNISSU,null,values);
        db.close(); 
    }
    
    public void addarbisue(Issue is)
    {
        Log.i("addarbisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ARBISSSTP1, is.getstp1());  
        values.put(KEY_ARBISSSTP2, is.getstp2());
        values.put(KEY_ARBISSPHOTO, is.getph());
        values.put(KEY_ARBISSFULLDISC, is.getfd());
        values.put(KEY_ARBISSUSRPIC, is.getusrpic());
        values.put(KEY_ARBISSIUSRID, is.getusrid());
        values.put(KEY_ARBISSIUSRDATE, is.getusrdate());
        values.put(KEY_ARBISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_ARBISSU,null,values);
        db.close(); 
    }
    
    public void addvslisue(Issue is)
    {
        Log.i("addvslisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_VSLISSSTP1, is.getstp1());  
        values.put(KEY_VSLISSSTP2, is.getstp2());
        values.put(KEY_VSLISSPHOTO, is.getph());
        values.put(KEY_VSLISSFULLDISC, is.getfd());
        values.put(KEY_VSLISSUSRPIC, is.getusrpic());
        values.put(KEY_VSLISSIUSRID, is.getusrid());
        values.put(KEY_VSLISSIUSRDATE, is.getusrdate());
        values.put(KEY_VSLISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_VSLISSU,null,values);
        db.close(); 
    }
    
    public void addbxrisue(Issue is)
    {
        Log.i("addbxrisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_BXRISSSTP1, is.getstp1());  
        values.put(KEY_BXRISSSTP2, is.getstp2());
        values.put(KEY_BXRISSPHOTO, is.getph());
        values.put(KEY_BXRISSFULLDISC, is.getfd());
        values.put(KEY_BXRISSUSRPIC, is.getusrpic());
        values.put(KEY_BXRISSIUSRID, is.getusrid());
        values.put(KEY_BXRISSIUSRDATE, is.getusrdate());
        values.put(KEY_BXRISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_BXRISSU,null,values);
        db.close(); 
    }
    
    public void addbgsisue(Issue is)
    {
        Log.i("addbgsisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_BGSISSSTP1, is.getstp1());  
        values.put(KEY_BGSISSSTP2, is.getstp2());
        values.put(KEY_BGSISSPHOTO, is.getph());
        values.put(KEY_BGSISSFULLDISC, is.getfd());
        values.put(KEY_BGSISSUSRPIC, is.getusrpic());
        values.put(KEY_BGSISSIUSRID, is.getusrid());
        values.put(KEY_BGSISSIUSRDATE, is.getusrdate());
        values.put(KEY_BGSISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_BGSISSU,null,values);
        db.close(); 
    }
    
    public void adddrbisue(Issue is)
    {
        Log.i("adddrbisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_DRBISSSTP1, is.getstp1());  
        values.put(KEY_DRBISSSTP2, is.getstp2());
        values.put(KEY_DRBISSPHOTO, is.getph());
        values.put(KEY_DRBISSFULLDISC, is.getfd());
        values.put(KEY_DRBISSUSRPIC, is.getusrpic());
        values.put(KEY_DRBISSIUSRID, is.getusrid());
        values.put(KEY_DRBISSIUSRDATE, is.getusrdate());
        values.put(KEY_DRBISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_DRBISSU,null,values);
        db.close(); 
    }
    
    public void addjnbisue(Issue is)
    {
        Log.i("addjnbisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_JNBISSSTP1, is.getstp1());  
        values.put(KEY_JNBISSSTP2, is.getstp2());
        values.put(KEY_JNBISSPHOTO, is.getph());
        values.put(KEY_JNBISSFULLDISC, is.getfd());
        values.put(KEY_JNBISSUSRPIC, is.getusrpic());
        values.put(KEY_JNBISSIUSRID, is.getusrid());
        values.put(KEY_JNBISSIUSRDATE, is.getusrdate());
        values.put(KEY_JNBISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_JNBISSU,null,values);
        db.close(); 
    }
    
    public void addnwaisue(Issue is)
    {
        Log.i("addnwaisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NWAISSSTP1, is.getstp1());  
        values.put(KEY_NWAISSSTP2, is.getstp2());
        values.put(KEY_NWAISSPHOTO, is.getph());
        values.put(KEY_NWAISSFULLDISC, is.getfd());
        values.put(KEY_NWAISSUSRPIC, is.getusrpic());
        values.put(KEY_NWAISSIUSRID, is.getusrid());
        values.put(KEY_NWAISSIUSRDATE, is.getusrdate());
        values.put(KEY_NWAISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_NWAISSU,null,values);
        db.close(); 
    }
    
    public void addsraisue(Issue is)
    {
        Log.i("addsraisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SRAISSSTP1, is.getstp1());  
        values.put(KEY_SRAISSSTP2, is.getstp2());
        values.put(KEY_SRAISSPHOTO, is.getph());
        values.put(KEY_SRAISSFULLDISC, is.getfd());
        values.put(KEY_SRAISSUSRPIC, is.getusrpic());
        values.put(KEY_SRAISSIUSRID, is.getusrid());
        values.put(KEY_SRAISSIUSRDATE, is.getusrdate());
        values.put(KEY_SRAISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_SRAISSU,null,values);
        db.close(); 
    }
    
    public void addkhgisue(Issue is)
    {
        Log.i("addkhgisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_KHGISSSTP1, is.getstp1());  
        values.put(KEY_KHGISSSTP2, is.getstp2());
        values.put(KEY_KHGISSPHOTO, is.getph());
        values.put(KEY_KHGISSFULLDISC, is.getfd());
        values.put(KEY_KHGISSUSRPIC, is.getusrpic());
        values.put(KEY_KHGISSIUSRID, is.getusrid());
        values.put(KEY_KHGISSIUSRDATE, is.getusrdate());
        values.put(KEY_KHGISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_KHGISSU,null,values);
        db.close(); 
    }
    
    public void addstaisue(Issue is)
    {
        Log.i("addstaisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_STAISSSTP1, is.getstp1());  
        values.put(KEY_STAISSSTP2, is.getstp2());
        values.put(KEY_STAISSPHOTO, is.getph());
        values.put(KEY_STAISSFULLDISC, is.getfd());
        values.put(KEY_STAISSUSRPIC, is.getusrpic());
        values.put(KEY_STAISSIUSRID, is.getusrid());
        values.put(KEY_STAISSIUSRDATE, is.getusrdate());
        values.put(KEY_STAISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_STAISSU,null,values);
        db.close(); 
    }
    
    public void addnldisue(Issue is)
    {
        Log.i("addnldisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NLDISSSTP1, is.getstp1());  
        values.put(KEY_NLDISSSTP2, is.getstp2());
        values.put(KEY_NLDISSPHOTO, is.getph());
        values.put(KEY_NLDISSFULLDISC, is.getfd());
        values.put(KEY_NLDISSUSRPIC, is.getusrpic());
        values.put(KEY_NLDISSIUSRID, is.getusrid());
        values.put(KEY_NLDISSIUSRDATE, is.getusrdate());
        values.put(KEY_NLDISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_NLDISSU,null,values);
        db.close(); 
    }
    
    public void addgyaisue(Issue is)
    {
        Log.i("addgyaisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_GYAISSSTP1, is.getstp1());  
        values.put(KEY_GYAISSSTP2, is.getstp2());
        values.put(KEY_GYAISSPHOTO, is.getph());
        values.put(KEY_GYAISSFULLDISC, is.getfd());
        values.put(KEY_GYAISSUSRPIC, is.getusrpic());
        values.put(KEY_GYAISSIUSRID, is.getusrid());
        values.put(KEY_ISSIUSRDATE, is.getusrdate());
        values.put(KEY_GYAISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_GYAISSU,null,values);
        db.close(); 
    }
    
    public void addprnisue(Issue is)
    {
        Log.i("addprnisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_PRNISSSTP1, is.getstp1());  
        values.put(KEY_PRNISSSTP2, is.getstp2());
        values.put(KEY_PRNISSPHOTO, is.getph());
        values.put(KEY_PRNISSFULLDISC, is.getfd());
        values.put(KEY_PRNISSUSRPIC, is.getusrpic());
        values.put(KEY_PRNISSIUSRID, is.getusrid());
        values.put(KEY_PRNISSIUSRDATE, is.getusrdate());
        values.put(KEY_PRNISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_PRNISSU,null,values);
        db.close(); 
    }
    
    public void addprbcisue(Issue is)
    {
        Log.i("addprbcisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_PRBCISSSTP1, is.getstp1());  
        values.put(KEY_PRBCISSSTP2, is.getstp2());
        values.put(KEY_PRBCISSPHOTO, is.getph());
        values.put(KEY_PRBCISSFULLDISC, is.getfd());
        values.put(KEY_PRBCISSUSRPIC, is.getusrpic());
        values.put(KEY_PRBCISSIUSRID, is.getusrid());
        values.put(KEY_PRBCISSIUSRDATE, is.getusrdate());
        values.put(KEY_PRBCISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_PRBCISSU,null,values);
        db.close(); 
    }
    
    public void addlakisue(Issue is)
    {
        Log.i("addlakisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_LAKISSSTP1, is.getstp1());  
        values.put(KEY_LAKISSSTP2, is.getstp2());
        values.put(KEY_LAKISSPHOTO, is.getph());
        values.put(KEY_LAKISSFULLDISC, is.getfd());
        values.put(KEY_LAKISSUSRPIC, is.getusrpic());
        values.put(KEY_LAKISSIUSRID, is.getusrid());
        values.put(KEY_LAKISSIUSRDATE, is.getusrdate());
        values.put(KEY_LAKISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_LAKISSU,null,values);
        db.close(); 
    }
    
    public void addmdbisue(Issue is)
    {
        Log.i("addmdbisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_MDBISSSTP1, is.getstp1());  
        values.put(KEY_MDBISSSTP2, is.getstp2());
        values.put(KEY_MDBISSPHOTO, is.getph());
        values.put(KEY_MDBISSFULLDISC, is.getfd());
        values.put(KEY_MDBISSUSRPIC, is.getusrpic());
        values.put(KEY_MDBISSIUSRID, is.getusrid());
        values.put(KEY_MDBISSIUSRDATE, is.getusrdate());
        values.put(KEY_MDBISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_MDBISSU,null,values);
        db.close(); 
    }
    
    public void addktrisue(Issue is)
    {
        Log.i("addktrisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_KTRISSSTP1, is.getstp1());  
        values.put(KEY_KTRISSSTP2, is.getstp2());
        values.put(KEY_KTRISSPHOTO, is.getph());
        values.put(KEY_KTRISSFULLDISC, is.getfd());
        values.put(KEY_KTRISSUSRPIC, is.getusrpic());
        values.put(KEY_KTRISSIUSRID, is.getusrid());
        values.put(KEY_KTRISSIUSRDATE, is.getusrdate());
        values.put(KEY_KTRISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_KTRISSU,null,values);
        db.close(); 
    }
    
    public void addmhpisue(Issue is)
    {
        Log.i("addmhpisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_MHPISSSTP1, is.getstp1());  
        values.put(KEY_MHPISSSTP2, is.getstp2());
        values.put(KEY_MHPISSPHOTO, is.getph());
        values.put(KEY_MHPISSFULLDISC, is.getfd());
        values.put(KEY_MHPISSUSRPIC, is.getusrpic());
        values.put(KEY_MHPISSIUSRID, is.getusrid());
        values.put(KEY_MHPISSIUSRDATE, is.getusrdate());
        values.put(KEY_MHPISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_MHPISSU,null,values);
        db.close(); 
    }
    
    public void addbnkisue(Issue is)
    {
        Log.i("addbnkisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_BNKISSSTP1, is.getstp1());  
        values.put(KEY_BNKISSSTP2, is.getstp2());
        values.put(KEY_BNKISSPHOTO, is.getph());
        values.put(KEY_BNKISSFULLDISC, is.getfd());
        values.put(KEY_BNKISSUSRPIC, is.getusrpic());
        values.put(KEY_BNKISSIUSRID, is.getusrid());
        values.put(KEY_BNKISSIUSRDATE, is.getusrdate());
        values.put(KEY_BNKISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_BNKISSU,null,values);
        db.close(); 
    }
    
    public void addseoisue(Issue is)
    {
        Log.i("addseoisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SEOISSSTP1, is.getstp1());  
        values.put(KEY_SEOISSSTP2, is.getstp2());
        values.put(KEY_SEOISSPHOTO, is.getph());
        values.put(KEY_SEOISSFULLDISC, is.getfd());
        values.put(KEY_SEOISSUSRPIC, is.getusrpic());
        values.put(KEY_SEOISSIUSRID, is.getusrid());
        values.put(KEY_SEOISSIUSRDATE, is.getusrdate());
        values.put(KEY_SEOISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_SEOISSU,null,values);
        db.close(); 
    }
    
    public void addsplisue(Issue is)
    {
        Log.i("addsplisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SPLISSSTP1, is.getstp1());  
        values.put(KEY_SPLISSSTP2, is.getstp2());
        values.put(KEY_SPLISSPHOTO, is.getph());
        values.put(KEY_SPLISSFULLDISC, is.getfd());
        values.put(KEY_SPLISSUSRPIC, is.getusrpic());
        values.put(KEY_SPLISSIUSRID, is.getusrid());
        values.put(KEY_SPLISSIUSRDATE, is.getusrdate());
        values.put(KEY_SPLISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_SPLISSU,null,values);
        db.close(); 
    }
    
    public void addpcmcisue(Issue is)
    {
        Log.i("addpcmcisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_PCMCISSSTP1, is.getstp1());  
        values.put(KEY_PCMCISSSTP2, is.getstp2());
        values.put(KEY_PCMCISSPHOTO, is.getph());
        values.put(KEY_PCMCISSFULLDISC, is.getfd());
        values.put(KEY_PCMCISSUSRPIC, is.getusrpic());
        values.put(KEY_PCMCISSIUSRID, is.getusrid());
        values.put(KEY_PCMCISSIUSRDATE, is.getusrdate());
        values.put(KEY_PCMCISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_PCMCISSU,null,values);
        db.close(); 
    }
    
    public void addskhisue(Issue is)
    {
        Log.i("addskhisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SKHISSSTP1, is.getstp1());  
        values.put(KEY_SKHISSSTP2, is.getstp2());
        values.put(KEY_SKHISSPHOTO, is.getph());
        values.put(KEY_SKHISSFULLDISC, is.getfd());
        values.put(KEY_SKHISSUSRPIC, is.getusrpic());
        values.put(KEY_SKHISSIUSRID, is.getusrid());
        values.put(KEY_SKHISSIUSRDATE, is.getusrdate());
        values.put(KEY_SKHISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_SKHISSU,null,values);
        db.close(); 
    }
    
    public void addariisue(Issue is)
    {
        Log.i("addariisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ARIISSSTP1, is.getstp1());  
        values.put(KEY_ARIISSSTP2, is.getstp2());
        values.put(KEY_ARIISSPHOTO, is.getph());
        values.put(KEY_ARIISSFULLDISC, is.getfd());
        values.put(KEY_ARIISSUSRPIC, is.getusrpic());
        values.put(KEY_ARIISSIUSRID, is.getusrid());
        values.put(KEY_ARIISSIUSRDATE, is.getusrdate());
        values.put(KEY_ARIISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_ARIISSU,null,values);
        db.close(); 
    }
    
    public void addsmtpisue(Issue is)
    {
        Log.i("addsmtpisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SMTPISSSTP1, is.getstp1());  
        values.put(KEY_SMTPISSSTP2, is.getstp2());
        values.put(KEY_SMTPISSPHOTO, is.getph());
        values.put(KEY_SMTPISSFULLDISC, is.getfd());
        values.put(KEY_SMTPISSUSRPIC, is.getusrpic());
        values.put(KEY_SMTPISSIUSRID, is.getusrid());
        values.put(KEY_SMTPISSIUSRDATE, is.getusrdate());
        values.put(KEY_SMTPISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_SMTPISSU,null,values);
        db.close(); 
    }
    
    public void addjmiisue(Issue is)
    {
        Log.i("addjmiisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_JMIISSSTP1, is.getstp1());  
        values.put(KEY_JMIISSSTP2, is.getstp2());
        values.put(KEY_JMIISSPHOTO, is.getph());
        values.put(KEY_JMIISSFULLDISC, is.getfd());
        values.put(KEY_JMIISSUSRPIC, is.getusrpic());
        values.put(KEY_JMIISSIUSRID, is.getusrid());
        values.put(KEY_JMIISSIUSRDATE, is.getusrdate());
        values.put(KEY_JMIISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_JMIISSU,null,values);
        db.close(); 
    }
    
    public void addkmrisue(Issue is)
    {
        Log.i("addkmrisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_KMRISSSTP1, is.getstp1());  
        values.put(KEY_KMRISSSTP2, is.getstp2());
        values.put(KEY_KMRISSPHOTO, is.getph());
        values.put(KEY_KMRISSFULLDISC, is.getfd());
        values.put(KEY_KMRISSUSRPIC, is.getusrpic());
        values.put(KEY_KMRISSIUSRID, is.getusrid());
        values.put(KEY_KMRISSIUSRDATE, is.getusrdate());
        values.put(KEY_KMRISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_KMRISSU,null,values);
        db.close(); 
    }
    
    public void addksnisue(Issue is)
    {
        Log.i("addksnisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_KSNISSSTP1, is.getstp1());  
        values.put(KEY_KSNISSSTP2, is.getstp2());
        values.put(KEY_KSNISSPHOTO, is.getph());
        values.put(KEY_KSNISSFULLDISC, is.getfd());
        values.put(KEY_KSNISSUSRPIC, is.getusrpic());
        values.put(KEY_KSNISSIUSRID, is.getusrid());
        values.put(KEY_KSNISSIUSRDATE, is.getusrdate());
        values.put(KEY_KSNISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_KSNISSU,null,values);
        db.close(); 
    }
    
    public void addawlisue(Issue is)
    {
        Log.i("addawlisue", is.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_AWLISSSTP1, is.getstp1());  
        values.put(KEY_AWLISSSTP2, is.getstp2());
        values.put(KEY_AWLISSPHOTO, is.getph());
        values.put(KEY_AWLISSFULLDISC, is.getfd());
        values.put(KEY_AWLISSUSRPIC, is.getusrpic());
        values.put(KEY_AWLISSIUSRID, is.getusrid());
        values.put(KEY_AWLISSIUSRDATE, is.getusrdate());
        values.put(KEY_AWLISSIUSRDSTT, is.getusrdstt());
        db.insertOrThrow(TABLE_AWLISSU,null,values);
        db.close(); 
    }
//..............................................................
    
    
    
    public void adddelayy(Delay dl)
    {
        Log.i("adddelayy", dl.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_DLSUB, dl.getdlysub());  
        values.put(KEY_DLSUBIS, dl.getdlysubis());
        values.put(KEY_DLUSPIC, dl.getdlupic());
        values.put(KEY_DLFULLDSC, dl.getdlyfd());
        values.put(KEY_DLUSID, dl.getdlusid());
        values.put(KEY_DLDATE, dl.getdldate());
        values.put(KEY_DLNAME, dl.getdlnm());
        values.put(KEY_DLCOMPPIC, dl.getdlcmpimg());
        
        db.insertOrThrow(TABLE_DELAYY,null,values);
        db.close(); 
    }
    
    public void addsolvedd(Solvedc dl)
    {
        Log.i("addsolved", dl.toString());
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_SLSUB, dl.getslysub());  
        values.put(KEY_SLSUBIS, dl.getslysubis());
        values.put(KEY_SLUSPIC, dl.getdlupicc());
        values.put(KEY_SLFULLDSC, dl.getslyfd());
        values.put(KEY_SLUSID, dl.getslusid());
        values.put(KEY_SLDATE, dl.getsldate());
        values.put(KEY_SLNAME, dl.getdlnmcc());
        values.put(KEY_SLCOMPPIC, dl.getdlcmpimgcc());
        
        db.insertOrThrow(TABLE_SOLVEDD,null,values);
        db.close(); 
    }
    
   
    
    public List<Users> getAllContacts()
	{
		List<Users> dt = new LinkedList<Users>();
		String q = "SELECT * FROM " + TABLE_USERS;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(q, null);
		Users cnt =null;
		if (cursor.moveToFirst()){
			do{
				cnt=new Users();
				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_ID))));
				cnt.setunm(cursor.getString(cursor.getColumnIndex(KEY_UNAME)));
				dt.add(cnt);
				
			}while (cursor.moveToNext());
		}
		Log.i("getAllContacts()", dt.toString());
		return dt;
	}
    public List<Comnts> getAllWPComments()
	{
		List<Comnts> dt = new LinkedList<Comnts>();
		String q = "SELECT * FROM " + TABLE_WPCMNT;
		
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(q, null);
		Comnts cnt =null;
		if (cursor.moveToFirst()){
			do{
				cnt=new Comnts();
				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_WPID))));
				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_WPCMNTTXT)));
				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_WPNAME)));
				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_WPPIC)));
				dt.add(cnt);
				
			}while (cursor.moveToNext());
		}
		Log.i("getAllWPComments()", dt.toString());
		return dt;
	}
    public List<Comnts> getAllWPComments1(String usid)
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
//   		String q = "SELECT * FROM " + TABLE_WPCMNT;
   		String q = "SELECT * FROM " + TABLE_WPCMNT+" where wpcmntid='"+usid+"'";
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_WPID))));
   				cnt.setcmntid(cursor.getString(cursor.getColumnIndex(KEY_CMNTID)));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_WPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_WPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_WPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllWPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllEPComments()
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
   		String q = "SELECT * FROM " + TABLE_EPCMNT;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_EPID))));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_EPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_EPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_EPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllEPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllEPComments1(String usid)
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
//   		String q = "SELECT * FROM " + TABLE_EPCMNT;
   		String q = "SELECT * FROM " + TABLE_EPCMNT+" where epcmntid='"+usid+"'";
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_EPID))));
   				cnt.setcmntid(cursor.getString(cursor.getColumnIndex(KEY_EPCMNTID)));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_EPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_EPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_EPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllEPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllCPComments()
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
   		String q = "SELECT * FROM " + TABLE_CPCMNT;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_CPID))));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_CPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_CPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_CPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllCPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllCPComments1(String usid)
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
//   		String q = "SELECT * FROM " + TABLE_CPCMNT;
   		String q = "SELECT * FROM " + TABLE_CPCMNT+" where cpcmntid='"+usid+"'";
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_CPID))));
   				cnt.setcmntid(cursor.getString(cursor.getColumnIndex(KEY_CPCMNTID)));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_CPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_CPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_CPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllCPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllTPComments()
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
   		String q = "SELECT * FROM " + TABLE_TPCMNT;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_TPID))));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_TPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_TPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_TPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllTPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllTPComments1(String usid)
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
//   		String q = "SELECT * FROM " + TABLE_TPCMNT;
   		String q = "SELECT * FROM " + TABLE_TPCMNT+" where tpcmntid='"+usid+"'";
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_TPID))));
   				cnt.setcmntid(cursor.getString(cursor.getColumnIndex(KEY_TPCMNTID)));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_TPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_TPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_TPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllTPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllSWPComments()
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
   		String q = "SELECT * FROM " + TABLE_SWPCMNT;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SWPID))));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_SWPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_SWPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_SWPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSWPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllSWPComments1(String usid)
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
//   		String q = "SELECT * FROM " + TABLE_SWPCMNT;
   		String q = "SELECT * FROM " + TABLE_SWPCMNT+" where swpcmntid='"+usid+"'";
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SWPID))));
   				cnt.setcmntid(cursor.getString(cursor.getColumnIndex(KEY_SWPCMNTID)));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_SWPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_SWPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_SWPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSWPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllSPComments()
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
   		String q = "SELECT * FROM " + TABLE_SPCMNT;
   		
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SPID))));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_SPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_SPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_SPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllSPComments1(String usid)
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
//   		String q = "SELECT * FROM " + TABLE_SPCMNT;
   		String q = "SELECT * FROM " + TABLE_SPCMNT+" where spcmntid='"+usid+"'";
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SPID))));
   				cnt.setcmntid(cursor.getString(cursor.getColumnIndex(KEY_SPCMNTID)));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_SPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_SPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_SPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllOTPComments()
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
   		String q = "SELECT * FROM " + TABLE_OTPCMNT;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_OTPID))));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_OTPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_OTPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_OTPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllOTPComments()", dt.toString());
   		return dt;
   	}
    public List<Comnts> getAllOTPComments1(String usid)
   	{
   		List<Comnts> dt = new LinkedList<Comnts>();
//   		String q = "SELECT * FROM " + TABLE_OTPCMNT;
   		String q = "SELECT * FROM " + TABLE_OTPCMNT+" where otpcmntid='"+usid+"'";
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Comnts cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Comnts();
   				cnt.setcmid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_OTPID))));
   				cnt.setcmntid(cursor.getString(cursor.getColumnIndex(KEY_OTPCMNTID)));
   				cnt.setcmnttext(cursor.getString(cursor.getColumnIndex(KEY_OTPCMNTTXT)));
   				cnt.setblgrname(cursor.getString(cursor.getColumnIndex(KEY_OTPNAME)));
   				cnt.setblgrpic(cursor.getString(cursor.getColumnIndex(KEY_OTPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllOTPComments()", dt.toString());
   		return dt;
   	}
    public List<Delay> getAllDelay()
	{
		List<Delay> dt = new LinkedList<Delay>();
		String q = "SELECT * FROM " + TABLE_DELAYY;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(q, null);
		Delay cnt =null;
		if (cursor.moveToFirst()){
			do{
				cnt=new Delay();
				cnt.setdlyid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_DLID))));
				cnt.setdlysub(cursor.getString(cursor.getColumnIndex(KEY_DLSUB)));
				cnt.setdlysubis(cursor.getString(cursor.getColumnIndex(KEY_DLSUBIS)));
				cnt.setdlupic(cursor.getString(cursor.getColumnIndex(KEY_DLUSPIC)));
				cnt.setdlyfd(cursor.getString(cursor.getColumnIndex(KEY_DLFULLDSC)));
				cnt.setdlusid(cursor.getString(cursor.getColumnIndex(KEY_DLUSID)));
				cnt.setdldate(cursor.getString(cursor.getColumnIndex(KEY_DLDATE)));
				cnt.setdlnm(cursor.getString(cursor.getColumnIndex(KEY_DLNAME)));
				cnt.setdlcmpimg(cursor.getString(cursor.getColumnIndex(KEY_DLCOMPPIC)));
				dt.add(cnt);
				
			}while (cursor.moveToNext());
		}
		Log.i("getAllDelay()", dt.toString());
		return dt;
	}
    
    public List<Solvedc> getAllSolvedc()
   	{
   		List<Solvedc> dt = new LinkedList<Solvedc>();
   		String q = "SELECT * FROM " + TABLE_SOLVEDD;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Solvedc cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Solvedc();
   				cnt.setslyid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SLID))));
   				cnt.setslysub(cursor.getString(cursor.getColumnIndex(KEY_SLSUB)));
   				cnt.setslysubis(cursor.getString(cursor.getColumnIndex(KEY_SLSUBIS)));
   				cnt.setdlupicc(cursor.getString(cursor.getColumnIndex(KEY_SLUSPIC)));
   				cnt.setslyfd(cursor.getString(cursor.getColumnIndex(KEY_SLFULLDSC)));
   				cnt.setslusid(cursor.getString(cursor.getColumnIndex(KEY_SLUSID)));
   				cnt.setsldate(cursor.getString(cursor.getColumnIndex(KEY_SLDATE)));
   				cnt.setdlnmcc(cursor.getString(cursor.getColumnIndex(KEY_SLNAME)));
				cnt.setdlcmpimgcc(cursor.getString(cursor.getColumnIndex(KEY_SLCOMPPIC)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSolvedc()", dt.toString());
   		return dt;
   	}
    public List<Issue> getAllIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_ISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_ISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_ISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_ISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_ISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_ISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_ISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_ISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_ISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_ISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllIssues()", dt.toString());
   		return dt;
   	}
    public List<Issue> getAllIssues1(String usid)
   	{
   		List<Issue> dt = new LinkedList<Issue>();
//   		String q = "SELECT * FROM " + TABLE_ISSU;
   		String q = "SELECT * FROM " + TABLE_ISSU+" where issusrpic='"+usid+"'";
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_ISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_ISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_ISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_ISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_ISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_ISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_ISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_ISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_ISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllIssues()", dt.toString());
   		return dt;
   	}
    
    //retreivng patna issue in list
    public List<Issue> getAllPTNIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_PTNISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_PTNISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_PTNISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_PTNISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_PTNISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_PTNISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_PTNISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_PTNISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_PTNISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_PTNISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllPTNIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllROHIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_ROHISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_ROHISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_ROHISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_ROHISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_ROHISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_ROHISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_ROHISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_ROHISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_ROHISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_ROHISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllROHIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllBGPRIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_BGPRISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_BGPRISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_BGPRISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_BGPRISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_BGPRISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_BGPRISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_BGPRISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_BGPRISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_BGPRISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_BGPRISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllBGPRIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllMUNIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_MUNISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_MUNISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_MUNISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_MUNISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_MUNISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_MUNISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_MUNISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_MUNISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_MUNISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_MUNISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllMUNIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllBHPIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_BHPISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_BHPISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_BHPISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_BHPISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_BHPISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_BHPISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_BHPISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_BHPISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_BHPISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_BHPISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllBHPIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllMFPIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_MFPISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_MFPISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_MFPISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_MFPISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_MFPISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_MFPISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_MFPISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_MFPISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_MFPISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_MFPISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllMFPIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllSWNIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_SWNISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SWNISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_SWNISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_SWNISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_SWNISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_SWNISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_SWNISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_SWNISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_SWNISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_SWNISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSWNIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllGOPIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_GOPISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_GOPISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_GOPISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_GOPISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_GOPISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_GOPISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_GOPISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_GOPISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_GOPISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_GOPISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllGOPIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllSRNIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_SRNISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SRNISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_SRNISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_SRNISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_SRNISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_SRNISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_SRNISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_SRNISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_SRNISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_SRNISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSRNIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllARBIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_ARBISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_ARBISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_ARBISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_ARBISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_ARBISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_ARBISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_ARBISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_ARBISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_ARBISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_ARBISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllARBIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllVSLIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_VSLISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_VSLISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_VSLISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_VSLISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_VSLISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_VSLISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_VSLISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_VSLISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_VSLISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_VSLISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllVSLIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllBXRIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_BXRISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_BXRISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_BXRISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_BXRISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_BXRISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_BXRISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_BXRISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_BXRISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_BXRISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_BXRISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllBXRIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllBGSIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_BGSISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_BGSISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_BGSISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_BGSISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_BGSISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_BGSISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_BGSISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_BGSISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_BGSISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_BGSISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllBGSIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllDRBIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_DRBISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_DRBISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_DRBISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_DRBISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_DRBISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_DRBISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_DRBISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_DRBISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_DRBISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_DRBISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllDRBIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllJNBIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_JNBISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_JNBISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_JNBISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_JNBISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_JNBISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_JNBISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_JNBISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_JNBISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_JNBISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_JNBISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllJNBIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllNWAIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_NWAISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_NWAISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_NWAISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_NWAISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_NWAISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_NWAISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_NWAISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_NWAISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_NWAISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_NWAISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllNWAIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllSRAIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_SRAISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SRAISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_SRAISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_SRAISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_SRAISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_SRAISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_SRAISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_SRAISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_SRAISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_SRAISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSRAIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllKHGIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_KHGISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_KHGISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_KHGISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_KHGISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_KHGISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_KHGISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_KHGISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_KHGISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_KHGISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_KHGISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllKHGIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllSTAIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_STAISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_STAISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_STAISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_STAISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_STAISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_STAISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_STAISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_STAISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_STAISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_STAISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSTAIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllNLDIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_NLDISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_NLDISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_NLDISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_NLDISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_NLDISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_NLDISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_NLDISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_NLDISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_NLDISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_NLDISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllNLDIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllGYAIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_GYAISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_GYAISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_GYAISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_GYAISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_GYAISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_GYAISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_GYAISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_GYAISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_GYAISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_GYAISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllGYAIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllPRNIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_PRNISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_PRNISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_PRNISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_PRNISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_PRNISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_PRNISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_PRNISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_PRNISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_PRNISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_PRNISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllPRNIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllPRBCIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_PRBCISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_PRBCISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_PRBCISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_PRBCISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_PRBCISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_PRBCISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_PRBCISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_PRBCISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_PRBCISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_PRBCISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllPRBCIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllLAKIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_LAKISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_LAKISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_LAKISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_LAKISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_LAKISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_LAKISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_LAKISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_LAKISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_LAKISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_LAKISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllLAKIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllMDBIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_MDBISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_MDBISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_MDBISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_MDBISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_MDBISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_MDBISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_MDBISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_MDBISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_MDBISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_MDBISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllMDBIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllKTRIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_KTRISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_KTRISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_KTRISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_KTRISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_KTRISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_KTRISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_KTRISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_KTRISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_KTRISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_KTRISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllKTRIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllMHPIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_MHPISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_MHPISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_MHPISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_MHPISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_MHPISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_MHPISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_MHPISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_MHPISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_MHPISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_MHPISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllMHPIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllBNKIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_BNKISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_BNKISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_BNKISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_BNKISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_BNKISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_BNKISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_BNKISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_BNKISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_BNKISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_BNKISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllBNKIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllSEOIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_SEOISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SEOISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_SEOISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_SEOISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_SEOISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_SEOISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_SEOISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_SEOISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_SEOISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_SEOISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSEOIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllSPLIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_SPLISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SPLISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_SPLISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_SPLISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_SPLISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_SPLISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_SPLISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_SPLISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_SPLISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_SPLISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSPLIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllPCMCIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_PCMCISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_PCMCISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_PCMCISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_PCMCISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_PCMCISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_PCMCISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_PCMCISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_PCMCISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_PCMCISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_PCMCISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllPCMCIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllSKHIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_SKHISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SKHISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_SKHISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_SKHISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_SKHISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_SKHISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_SKHISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_SKHISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_SKHISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_SKHISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSKHIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllARIIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_ARIISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_ARIISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_ARIISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_ARIISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_ARIISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_ARIISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_ARIISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_ARIISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_ARIISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_ARIISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllARIIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllSMTPIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_SMTPISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_SMTPISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_SMTPISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_SMTPISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_SMTPISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_SMTPISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_SMTPISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_SMTPISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_SMTPISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_SMTPISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllSMTPIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllJMIIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_JMIISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_JMIISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_JMIISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_JMIISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_JMIISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_JMIISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_JMIISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_JMIISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_JMIISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_JMIISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllJMIIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllKMRIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_KMRISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_KMRISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_KMRISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_KMRISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_KMRISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_KMRISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_KMRISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_KMRISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_KMRISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_KMRISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllKMRIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllKSNIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_KSNISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_KSNISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_KSNISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_KSNISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_KSNISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_KSNISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_KSNISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_KSNISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_KSNISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_KSNISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllKSNIssues()", dt.toString());
   		return dt;
   	}
    
    public List<Issue> getAllAWLIssues()
   	{
   		List<Issue> dt = new LinkedList<Issue>();
   		String q = "SELECT * FROM " + TABLE_AWLISSU;
   		SQLiteDatabase db = this.getWritableDatabase();
   		Cursor cursor = db.rawQuery(q, null);
   		Issue cnt =null;
   		if (cursor.moveToFirst()){
   			do{
   				cnt=new Issue();
   				cnt.setid(Integer.parseInt(cursor.getString(cursor.getColumnIndex(KEY_AWLISSID))));
   				cnt.setstp1(cursor.getString(cursor.getColumnIndex(KEY_AWLISSSTP1)));
   				cnt.setstp2(cursor.getString(cursor.getColumnIndex(KEY_AWLISSSTP2)));
   				cnt.setfd(cursor.getString(cursor.getColumnIndex(KEY_AWLISSFULLDISC)));
   				cnt.setph(cursor.getString(cursor.getColumnIndex(KEY_AWLISSPHOTO)));
   				cnt.setusrid(cursor.getString(cursor.getColumnIndex(KEY_AWLISSIUSRID)));
   				cnt.setusrpic(cursor.getString(cursor.getColumnIndex(KEY_AWLISSUSRPIC)));
   				cnt.setusrdate(cursor.getString(cursor.getColumnIndex(KEY_AWLISSIUSRDATE)));
   				cnt.setusrdstt(cursor.getString(cursor.getColumnIndex(KEY_AWLISSIUSRDSTT)));
   				dt.add(cnt);
   				
   			}while (cursor.moveToNext());
   		}
   		Log.i("getAllAWLIssues()", dt.toString());
   		return dt;
   	}
    
//    

	
    public String getpassword(String username)
    {
    	SQLiteDatabase db = this.getReadableDatabase();
    	Cursor cursor = db.query(TABLE_USERS, null, "uname=?", new String[]{username},null, null, null);
    	if(cursor.getCount()<1)
    	{
    		cursor.close();
    		return"NOT EXISTS";
    	}
    	cursor.moveToFirst();
    	String upass = cursor.getString(cursor.getColumnIndex("upass"));
    	cursor.close();
    	return upass;
    }
    
    public String getname(String uid)
    {
    	SQLiteDatabase db = this.getReadableDatabase();
    	Cursor cursor = db.query(TABLE_USERS, null, "uside=?", new String[]{uid},null, null, null);
    	if(cursor.getCount()<1)
    	{
    		cursor.close();
    		return"NOT EXISTS";
    	}
    	cursor.moveToFirst();
    	String uname= cursor.getString(cursor.getColumnIndex("uname"));
    	cursor.close();
    	return uname;
    }
    public String getnumber(String username)
    {
    	SQLiteDatabase db = this.getReadableDatabase();
    	Cursor cursor = db.query(TABLE_USERS, null, "uname=?", new String[]{username},null, null, null);
    	if(cursor.getCount()<1)
    	{
    		cursor.close();
    		return"NOT EXISTS";
    	}
    	cursor.moveToFirst();
    	String uphon= cursor.getString(cursor.getColumnIndex("uphon"));
    	cursor.close();
    	return uphon;
    }
    public String getsex(String username)
    {
    	SQLiteDatabase db = this.getReadableDatabase();
    	Cursor cursor = db.query(TABLE_USERS, null, "uname=?", new String[]{username},null, null, null);
    	if(cursor.getCount()<1)
    	{
    		cursor.close();
    		return"NOT EXISTS";
    	}
    	cursor.moveToFirst();
    	String usex = cursor.getString(cursor.getColumnIndex("usex"));
    	cursor.close();
    	return usex;
    }
    
    public String getdistrict(String username)
    {
    	SQLiteDatabase db = this.getReadableDatabase();
    	Cursor cursor = db.query(TABLE_USERS, null, "uname=?", new String[]{username},null, null, null);
    	if(cursor.getCount()<1)
    	{
    		cursor.close();
    		return"NOT EXISTS";
    	}
    	cursor.moveToFirst();
    	String udstt= cursor.getString(cursor.getColumnIndex("udstt"));
    	cursor.close();
    	return udstt;
    }
    public String getphoto(String username)
    {
    	SQLiteDatabase db = this.getReadableDatabase();
    	Cursor cursor = db.query(TABLE_USERS, null, "uname=?", new String[]{username},null, null, null);
    	if(cursor.getCount()<1)
    	{
    		cursor.close();
    		return"NOT EXISTS";
    	}
    	cursor.moveToFirst();
    	String uphoto= cursor.getString(cursor.getColumnIndex("uphto"));
    	cursor.close();
    	return uphoto;
    }
    
    
    public String getid(String username)
    {
    	SQLiteDatabase db = this.getReadableDatabase();
    	Cursor cursor = db.query(TABLE_USERS, null, "uname=?", new String[]{username},null, null, null);
    	if(cursor.getCount()<1)
    	{
    		cursor.close();
    		return"NOT EXISTS";
    	}
    	cursor.moveToFirst();
    	String id= cursor.getString(cursor.getColumnIndex("uside"));
    	cursor.close();
    	return id;
    }
    public String getissid(String usid)
    {
    	SQLiteDatabase db = this.getReadableDatabase();
    	Cursor cursor = db.query(TABLE_ISSU, null, "issusrpic=?", new String[]{usid},null, null, null);
    	if(cursor.getCount()<1)
    	{
    		cursor.close();
    		return"NOT EXISTS";
    	}
    	cursor.moveToFirst();
    	String usidd= cursor.getString(cursor.getColumnIndex("issusrpic"));
    	cursor.close();
    	return usidd;
    }
   


    
    
}