package ru.leonov.hw.Data;

import android.content.Context;

import java.util.ArrayList;

import ru.leonov.hw.R;

public class FruitData extends Data {
    public FruitData(Context context) {
        super(context);

        list = new ArrayList<>();
        list.add(new CardProp(R.drawable.apple, "Яблоко", context.getString(R.string.apple_desc)));
        list.add(new CardProp(R.drawable.pine_apple, "Ананас", context.getString(R.string.pineapple_desc)));
        list.add(new CardProp(R.drawable.watermelon, "Арбуз", context.getString(R.string.watermelon)));
        list.add(new CardProp(R.drawable.pear, "Груша", context.getString(R.string.pear_desc)));

        list.add(new CardProp(R.drawable.apple, "Яблоко", context.getString(R.string.apple_desc)));
        list.add(new CardProp(R.drawable.pine_apple, "Ананас", context.getString(R.string.pineapple_desc)));
        list.add(new CardProp(R.drawable.watermelon, "Арбуз", context.getString(R.string.watermelon)));
        list.add(new CardProp(R.drawable.pear, "Груша", context.getString(R.string.pear_desc)));

    }
}
