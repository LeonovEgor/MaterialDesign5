package ru.leonov.hw.Data;

import android.content.Context;

import java.util.ArrayList;

import ru.leonov.hw.R;

public class TomatoData extends Data {
    public TomatoData(Context context) {
        super(context);

        list = new ArrayList<>();
        list.add(new CardProp(R.drawable.tomato, "Помидор 1", context.getString(R.string.tomato_desc)));
        list.add(new CardProp(R.drawable.tomato, "Помидор 2", context.getString(R.string.tomato_desc)));
        list.add(new CardProp(R.drawable.tomato, "Помидор 3", context.getString(R.string.tomato_desc)));
        list.add(new CardProp(R.drawable.tomato, "Помидор 4", context.getString(R.string.tomato_desc)));

    }
}
