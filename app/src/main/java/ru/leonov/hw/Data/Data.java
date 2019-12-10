package ru.leonov.hw.Data;

import android.content.Context;

import java.util.List;

public abstract class Data {
    private Context context;
    List<CardProp> list;

    public Data(Context context) {
        this.context = context;
    }
    public List<CardProp> getList() { return list; }
}
