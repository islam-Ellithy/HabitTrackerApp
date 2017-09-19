package lamaatech.com.habittracker.database;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by MrHacker on 9/18/2017.
 */

public class HabitContract {

    public static final String CONTENT_AUTHORITY = "lamaatech.com.inventory";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PRODUCT = "habit";


    public static final class HabitEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PRODUCT);

        public static final String _ID = BaseColumns._ID;
        public static final String TABLE_NAME = "habit";
        public static final String COLUMN_HABIT = "habit_subject";
        public static final String COLUMN_TIMES = "habit_times";
    }
}
