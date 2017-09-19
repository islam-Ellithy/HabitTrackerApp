package lamaatech.com.habittracker;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import lamaatech.com.habittracker.database.DbModel;
import lamaatech.com.habittracker.database.Habit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Habit h = new Habit("Playing Football", 1);
        DbModel db = new DbModel(this);
        db.insertHabit(h);

        Cursor cursor = db.getHabits();
    }
}
