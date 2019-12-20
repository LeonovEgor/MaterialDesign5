package ru.leonov.hw.Data;

import android.content.Context;

import java.util.ArrayList;

import ru.leonov.hw.R;

public class PotatoData extends Data {
    public PotatoData(Context context) {
        super(context);

        list = new ArrayList<>();
        list.add(new CardProp(R.drawable.potato, "Картофель 1", context.getString(R.string.potato_desc)));
        list.add(new CardProp(R.drawable.potato, "Картофель 2", context.getString(R.string.potato_desc)));
        list.add(new CardProp(R.drawable.potato, "Картофель 3", context.getString(R.string.potato_desc)));
        list.add(new CardProp(R.drawable.potato, "Картофель 4", context.getString(R.string.potato_desc)));
        list.add(new CardProp(R.drawable.potato, "Картофель 5", context.getString(R.string.potato_desc)));

    }
}
