package lamaatech.com.habittracker.database;

import android.database.Cursor;

/**
 * Created by MrHacker on 9/18/2017.
 */

public interface IModel {

    Cursor getHabits();

    void insertHabit(Habit newHabit);
}

