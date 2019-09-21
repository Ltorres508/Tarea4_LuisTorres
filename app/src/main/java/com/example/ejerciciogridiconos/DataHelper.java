package com.example.ejerciciogridiconos;

import java.util.ArrayList;

public class DataHelper {

public static ArrayList<ViewItem> provideItems(){
    ArrayList<ViewItem> list = new ArrayList<>();
    list.add(new ViewItem(R.drawable.android, "android"));
    list.add(new ViewItem(R.drawable.child, "child"));
    list.add(new ViewItem(R.drawable.bike, "bike"));
    list.add(new ViewItem(R.drawable.subway, "subway"));
    list.add(new ViewItem(R.drawable.airport, "airport"));
    list.add(new ViewItem(R.drawable.notification, "notification"));
    list.add(new ViewItem(R.drawable.pantool, "pantool"));
    list.add(new ViewItem(R.drawable.voz, "voz"));
    list.add(new ViewItem(R.drawable.sun, "sun"));
    return list;

}
}
