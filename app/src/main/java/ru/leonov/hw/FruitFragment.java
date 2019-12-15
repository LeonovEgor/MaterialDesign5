package ru.leonov.hw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class FruitFragment extends Fragment {

    private CustomFPA pageAdapter;
    private ViewPager mViewPager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fruit, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setCaption();
        initTabs();
        //initRecyclerView(view);
    }

    private void setCaption() {
        CollapsingToolbarLayout ctl = Objects.requireNonNull(getActivity()).findViewById(R.id.collapsing_toolbar_layout);
        ctl.setTitle(getActivity().getString(R.string.menu_fruit));
    }

    private void initTabs() {
        AllFruitFragment fragment1 = AllFruitFragment.newInstance(null);
        AppleFragment fragment2 = AppleFragment.newInstance(null);
        PearFragment fragment3 = PearFragment.newInstance(null);

        CustomFPA pageAdapter= new CustomFPA(Objects.requireNonNull(getActivity()).getSupportFragmentManager());
        pageAdapter.addFragment(fragment1, "Фрукты");
        pageAdapter.addFragment(fragment2, "Яблоки");
        pageAdapter.addFragment(fragment3, "Груши");

        mViewPager = getActivity().findViewById(R.id.viewpager);
        mViewPager.setAdapter(pageAdapter);

        TabLayout tabLayout = getActivity().findViewById(R.id.tabContainer);
        tabLayout.setupWithViewPager(mViewPager);
    }
}