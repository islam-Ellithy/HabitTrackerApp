package lamaatech.com.habittracker.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import static lamaatech.com.habittracker.database.HabitContract.HabitEntry.TABLE_NAME;

/**
 * Created by MrHacker on 9/18/2017.
 */

public class DbModel implements IModel {

    private HabitDbHelper mDbHelper;
    private Context context;

    public DbModel(Context newContext) {
        context = newContext;
        mDbHelper = new HabitDbHelper(context);
    }


    @Override
    public Cursor getHabits() {

        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String[] columns = new String[]{HabitContract.HabitEntry.COLUMN_HABIT, HabitContract.HabitEntry.COLUMN_TIMES};

        Cursor cursor = db.query(HabitContract.HabitEntry.TABLE_NAME, columns, null,
                null, null, null, null);

        return cursor;
    }


    @Override
    public void insertHabit(Habit newHabit) {
        // Gets the database in write mode
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        // Create a ContentValues object where column names are the keys,
        ContentValues values = new ContentValues();

        values.put(HabitContract.HabitEntry.COLUMN_HABIT, newHabit.getHabit());
        values.put(HabitContract.HabitEntry.COLUMN_TIMES, newHabit.getTimes());

        long raws = db.insert(TABLE_NAME, null, values);

        showToast("Habit has been added successfully");

    }

    private void showToast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
