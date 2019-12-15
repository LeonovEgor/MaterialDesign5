package ru.leonov.hw.Data;

import android.content.Context;

import java.util.ArrayList;

import ru.leonov.hw.R;

public class PearData extends Data {
    public PearData(Context context) {
        super(context);

        list = new ArrayList<>();
        list.add(new CardProp(R.drawable.pear, "Груша1", context.getString(R.string.pear_desc)));
        list.add(new CardProp(R.drawable.pear, "Груша2", context.getString(R.string.pear_desc)));
        list.add(new CardProp(R.drawable.pear, "Груша3", context.getString(R.string.pear_desc)));
        list.add(new CardProp(R.drawable.pear, "Груша4", context.getString(R.string.pear_desc)));
    }
}