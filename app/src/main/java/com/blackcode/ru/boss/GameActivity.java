package com.blackcode.ru.boss;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameActivity extends AppCompatActivity {
    private static  final int REQUEST_ACCESS_TYPE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        AboutDialogFragment dialogFragment = new AboutDialogFragment();
        dialogFragment.show(getFragmentManager(),"Tip1");

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void startDay(View view) {
        Intent intent = new Intent(this,Game2Activity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivityForResult(intent,REQUEST_ACCESS_TYPE);

    }


    public static class AboutDialogFragment extends DialogFragment {

        @NonNull
        public Dialog onCreateDialog(Bundle savedInstanceState){
            AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
            return builder
                    .setTitle("Ваш первый день") //Шапка диалогового окна
                    .setMessage(getResources().getString(R.string.congratulations)) //Сообщение в окне
                    .setPositiveButton("Ok",null) //Кнопка положительного ответа, null
                    .create();
        }
    }
}
