package ru.leonov.hw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.Objects;

import ru.leonov.hw.Data.Data;
import ru.leonov.hw.Data.FruitData;
import ru.leonov.hw.Data.MyAdapter;

public class FruitFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fruit, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setCaption();
        initRecyclerView(view);
    }

    private void setCaption() {
        CollapsingToolbarLayout ctl = Objects.requireNonNull(getActivity()).findViewById(R.id.collapsing_toolbar_layout);
        ctl.setTitle(getActivity().getString(R.string.menu_fruit));
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        Data data = new FruitData(getContext());
        MyAdapter myAdapter = new MyAdapter(data.getList());
        recyclerView.setAdapter(myAdapter);
    }
}