import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper {

}
class DBhelper extends SQLiteOpenHelper
{
    public static final String DB_NAME = "felhasznalo.db";
    public static final  int DB_VERSION = 1;

    public static final String FELHASZNALO_TABLE = "felhasznalo";

    public static final String COL_ID = "id";
    public static final String COL_EMAIL = "email";
    public static final String COL_FELHNEV = "felhnev";
    public static final String COL_JELSZO = "jelszo";
    public static final String COL_TELJESNEV = "teljesnev";


    public DBhelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION); }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS " + FELHASZNALO_TABLE;
        db.execSQL(sql);
        onCreate(db);
    }
}