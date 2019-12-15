package ru.leonov.hw.Data;

import android.content.Context;

import java.util.ArrayList;

import ru.leonov.hw.R;

public class VegetablesData extends Data {
    public VegetablesData(Context context) {
        super(context);

        list = new ArrayList<>();
        list.add(new CardProp(R.drawable.cucumber, "Огурец", context.getString(R.string.cucumber_desc)));
        list.add(new CardProp(R.drawable.potato, "Картофель", context.getString(R.string.potato_desc)));
        list.add(new CardProp(R.drawable.pumpkin, "Тыква", context.getString(R.string.pumpkin_desc)));
        list.add(new CardProp(R.drawable.tomato, "Помидор", context.getString(R.string.tomato_desc)));

        list.add(new CardProp(R.drawable.cucumber, "Огурец", context.getString(R.string.cucumber_desc)));
        list.add(new CardProp(R.drawable.potato, "Картофель", context.getString(R.string.potato_desc)));
        list.add(new CardProp(R.drawable.pumpkin, "Тыква", context.getString(R.string.pumpkin_desc)));
        list.add(new CardProp(R.drawable.tomato, "Помидор", context.getString(R.string.tomato_desc)));
    }
}
