package com.blackcode.ru.boss;

import java.util.Random;

    class Dialogs{
    /**
     * it = IT отдел
     * ad = финансовый отдел
     * ем = рабочий отдел
     * of = отдел кадров
     * pd = канцелярия*/
    private final String [] it = {"Диалоговое окно it_1","Диалоговое окно it_2","Диалоговое окно it_3","Диалоговое окно it_4"};
    private final String [] ad = {"Диалоговое окно ad_1","Диалоговое окно ad_2","Диалоговое окно ad_3","Диалоговое окно ad_4"};
    private final String [] em = {"Диалоговое окно em_1","Диалоговое окно em_2","Диалоговое окно em_3","Диалоговое окно em_4"};
    private final String [] of = {"Диалоговое окно of_1","Диалоговое окно of_2","Диалоговое окно of_3","Диалоговое окно of_4"};
    private final String [] pd = {"Диалоговое окно pd_1","Диалоговое окно pd_2","Диалоговое окно pd_3","Диалоговое окно pd_4"};


        /**
     * Вызов рандомного массива диалогов
     * @return возвращает рандомный диалог рандомного массива
     */
        String showRandomDialog(int i){
                switch (i) {
                    case 1:
                        return showDialog(it);
                    case 2:
                        return showDialog(ad);
                    case 3:
                        return showDialog(em);
                    case 4:
                        return showDialog(of);
                    case 5:
                        return showDialog(pd);
                }
            return "Error";
        }

    /**
     * Вызов рандомного диалога переданного отдела
     * @param args передается массив с диалогами
     * @return возвращается один рандомный диалог
     */
        private String showDialog(String [] args) {
        Random random = new Random();
        return args[random.nextInt(4)];
    }
}
