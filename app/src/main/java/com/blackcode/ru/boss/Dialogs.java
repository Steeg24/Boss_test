package com.blackcode.ru.boss;

import android.util.Log;

import java.util.Random;
import java.util.logging.Logger;

final class Dialogs {
    private final String [] it = {"Диалоговое окно it_1","Диалоговое окно it_2","Диалоговое окно it_3","Диалоговое окно it_4"};
    private final String [] ad = {"Диалоговое окно ad_1","Диалоговое окно ad_2","Диалоговое окно ad_3","Диалоговое окно ad_4"};
    private final String [] em = {"Диалоговое окно em_1","Диалоговое окно em_2","Диалоговое окно em_3","Диалоговое окно em_4"};
    private final String [] of = {"Диалоговое окно of_1","Диалоговое окно of_2","Диалоговое окно of_3","Диалоговое окно of_4"};
    private final String [] pd = {"Диалоговое окно pd_1","Диалоговое окно pd_2","Диалоговое окно pd_3","Диалоговое окно pd_4"};



    public String showRandomDialog(){
        Random random = new Random();
        int i = random.nextInt(4 + 1);
        Logger.getLogger("sddsd");
        String message=null;
        switch (i){
            case 1:
                message= showDialog(it);
                break;
            case 2:
                message= showDialog(ad);
                break;
            case 3:
                message= showDialog(em);
                break;
            case 4:
                message= showDialog(of);
                break;
            case 5:
                message= showDialog(pd);
                break;

        }
        return message;
    }

        private String showDialog(String [] args) {
        Random random = new Random();
        return args[random.nextInt(4)];
    }


}
