package ru.leonov.hw.Data;

import android.content.Context;

import java.util.ArrayList;

import ru.leonov.hw.R;

public class NatureData extends Data {
    public NatureData(Context context) {
        super(context);

        list = new ArrayList<>();
        list.add(new CardProp(R.drawable.field, "Поле", context.getString(R.string.field_desc)));
        list.add(new CardProp(R.drawable.mount, "Горы", context.getString(R.string.mount_desc)));
        list.add(new CardProp(R.drawable.lake, "Озеро", context.getString(R.string.lake_desc)));
        list.add(new CardProp(R.drawable.wood, "Лес", context.getString(R.string.wood_desc)));
    }
}
