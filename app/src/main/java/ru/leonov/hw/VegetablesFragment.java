package ru.leonov.hw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class VegetablesFragment extends Fragment implements BottomNavigationView.OnNavigationItemSelectedListener{

    private Fragment allVegetablesFragment;
    private Fragment potatoFragment;
    private Fragment tomatoFragment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_vegetables, container, false);

        setCaption();
        setupBottomNavigationView(root);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initFragment();
    }

    private void setCaption() {
        CollapsingToolbarLayout ctl = Objects.requireNonNull(getActivity()).findViewById(R.id.collapsing_toolbar_layout);
        ctl.setTitle(getActivity().getString(R.string.menu_vegetables));
    }

    private void initFragment() {
        allVegetablesFragment = AllVegetablesFragment.newInstance(null);
        potatoFragment = PotatoFragment.newInstance(null);
        tomatoFragment = TomatoFragment.newInstance(null);

        setFragment(allVegetablesFragment);
    }

    private void setFragment(Fragment selectedFragment) {
        FragmentManager manager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
        FragmentTransaction fTrans = manager.beginTransaction();
        fTrans.replace(R.id.containerFrame, selectedFragment);
        fTrans.commit();
    }


    private void setupBottomNavigationView(View view) {
        BottomNavigationView navigation = view.findViewById(R.id.bnv);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment selectedFragment = null;

        switch (menuItem.getItemId()) {
            case R.id.action_vegetables_all:
                selectedFragment = allVegetablesFragment;
                break;
            case R.id.action_potato:
                selectedFragment = potatoFragment;
                break;
            case R.id.action_tomato:
                selectedFragment = tomatoFragment;
                break;
        }
        if (selectedFragment == null) return false;

        setFragment(selectedFragment);
        return true;
    }
}