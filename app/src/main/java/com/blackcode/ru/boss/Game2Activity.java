package com.blackcode.ru.boss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;
import java.util.Random;

public class Game2Activity extends AppCompatActivity {
 String message,check="null";
 int previous=-1,next;


    public void setPrevious(int previous) {
        this.previous = previous;
    }
    public void setNext(int next) {
        this.next = next;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView dialogView = findViewById(R.id.txt_dialog);
        dialogView.setText(showDialog());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    /**
     * Кнопка вызова текста диалого
     * В цикле реализован псевдорандом -
     * Не может быть два одинаковых диалога подряд
     */
    public void choose1(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
    public void choose2(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
    public void choose3(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
    private String showDialog(){
        Dialogs dialogs= new Dialogs();
            Random random = new Random();
            do {setNext(random.nextInt(5) + 1);
            Log.d("previous",String.valueOf(previous));
            }while (previous==next);
            setPrevious(next);

            do {setMessage(dialogs.showRandomDialog(next));
                Log.d("Check",check);
                if (!Objects.equals(message, check)){
                    setCheck(message);
                    return message;}
                else setCheck(message);}
            while (Objects.equals(message,check));
            return message;


    }
}



