package com.blackcode.ru.boss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

public class Game2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Dialogs dialog = new Dialogs();
        setContentView(R.layout.activity_game2);

        TextView dialogView = (TextView) findViewById(R.id.txt_dialog);
        String message = dialog.showRandomDialog();
        dialogView.setText(message);
    }


}

