package com.blackcode.ru.boss;

final class Dialogs {
    private final String [] it = {"Диалоговое окно it_1","Диалоговое окно it_2","Диалоговое окно it_3","Диалоговое окно it_4"};
    private final String [] ad = {"Диалоговое окно ad_1","Диалоговое окно ad_2","Диалоговое окно ad_3","Диалоговое окно ad_4"};
    private final String [] em = {"Диалоговое окно em_1","Диалоговое окно em_2","Диалоговое окно em_3","Диалоговое окно em_4"};
    private final String [] of = {"Диалоговое окно of_1","Диалоговое окно of_2","Диалоговое окно of_3","Диалоговое окно of_4"};
    private final String [] pd = {"Диалоговое окно pd_1","Диалоговое окно pd_2","Диалоговое окно pd_3","Диалоговое окно pd_4"};

    String getIt(int id) {
        return it[id];
    }

    String getAd(int id) {
        return ad[id];
    }

    String getEm(int id) {
        return em[id];
    }

    String getOf(int id) {
        return of[id];
    }

    String getPd(int id) {
        return pd[id];
    }
}
