package com.blackcode.ru.boss;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    /**============================================================
     * Подклсс создающий диалоговое окно после нажатия кнопки About
     * Кнопка - bt_about
     * Источник:
     * https://metanit.com/java/android/18.2.php
     * =============================================================*/
    public static class AboutDialogFragment extends DialogFragment{

        @NonNull
        public Dialog onCreateDialog(Bundle savedInstanceState){
            AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
            return builder
                    .setTitle("About") //Шапка диалогового окна
                    .setMessage("Something about this game") //Сообщение в окне
                    .setPositiveButton("Ok",null) //Кнопка положительного ответа, null
                    .create();
        }
    }
    //Метод activity, вызывает первый экран activity_main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT);
    }


    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    /**=======================================================
     *
     * Кнопки на главном экране...
     *
     * startGame - Начало игры, запускает следующий экран activity_game
     * about - О программе, краткое описание, авторы
     * settings - Настройки игры, звук
     * Источник:
     * https://metanit.com/java/android/4.9.php
     =======================================================*/

    public void startGame(View view) {
        setContentView(R.layout.activity_game);
    }

    public void about(View view) {
        AboutDialogFragment dialog = new AboutDialogFragment();
        dialog.show(getFragmentManager(),"About");
    }

    public void settings(View view) {
    }

}

