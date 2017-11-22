package com.blackcode.ru.boss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

public class Game2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        TextView dialog = (TextView) findViewById(R.id.txt_dialog);
        String message = showRandomDialog();
        dialog.setText(message);
    }

    public String showRandomDialog(){
        Random random = new Random();
        int i = random.nextInt(5+1);
        String message=null;
        switch (i){
            case 1:
                message= showDialogIT();
                break;
            case 2:
                message= showDialogAD();
                break;
            case 3:
                message= showDialogEM();
                break;
            case 4:
                message= showDialogOF();
                break;
            case 5:
                message= showDialogPD();
        }
        return message;
    }

    public String showDialogIT() {
        Dialogs dialogs = new Dialogs();
        Random random = new Random();
        int i = random.nextInt(4 + 1);
        return dialogs.getIt(i);
    }

    public String showDialogAD() {
        Dialogs dialogs = new Dialogs();
        Random random = new Random();
        int i = random.nextInt(4 + 1);
        return dialogs.getAd(i);
    }

    public String showDialogEM() {
        Dialogs dialogs = new Dialogs();
        Random random = new Random();
        int i = random.nextInt(4 + 1);
        return dialogs.getEm(i);
    }

    public String showDialogOF() {
        Dialogs dialogs = new Dialogs();
        Random random = new Random();
        int i = random.nextInt(4 + 1);
        return dialogs.getOf(i);
    }

    public String showDialogPD() {
        Dialogs dialogs = new Dialogs();
        Random random = new Random();
        int i = random.nextInt(4 + 1);
        return dialogs.getPd(i);
    }


}

