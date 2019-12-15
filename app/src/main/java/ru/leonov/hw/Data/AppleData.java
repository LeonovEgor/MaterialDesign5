package ru.leonov.hw.Data;

import android.content.Context;

import java.util.ArrayList;

import ru.leonov.hw.R;

public class AppleData extends Data {
    public AppleData(Context context) {
        super(context);

        list = new ArrayList<>();
        list.add(new CardProp(R.drawable.apple, "Яблоко1", context.getString(R.string.apple_desc)));
        list.add(new CardProp(R.drawable.apple, "Яблоко2", context.getString(R.string.apple_desc)));
        list.add(new CardProp(R.drawable.apple, "Яблоко3", context.getString(R.string.apple_desc)));
        list.add(new CardProp(R.drawable.apple, "Яблоко4", context.getString(R.string.apple_desc)));
        list.add(new CardProp(R.drawable.apple, "Яблоко5", context.getString(R.string.apple_desc)));
        list.add(new CardProp(R.drawable.apple, "Яблоко6", context.getString(R.string.apple_desc)));
    }
}
