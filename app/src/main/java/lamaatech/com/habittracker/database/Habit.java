package lamaatech.com.habittracker.database;

import android.database.Cursor;

/**
 * Created by MrHacker on 9/18/2017.
 */

public class Habit {
    private String habit;
    private String Id;
    private Integer times ;

    public Habit(Cursor cursor) {

    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }
}
