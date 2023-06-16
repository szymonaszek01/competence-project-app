package com.app.competence_project_app.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.app.competence_project_app.fragment.TemperatureChartFragment;

public class ChartSliderAdapter extends FragmentStateAdapter {

    private final Integer numOfPages;

    private final String macAddress;

    public ChartSliderAdapter(@NonNull FragmentActivity activity, Integer numOfPages, String macAddress) {
        super(activity);
        this.numOfPages = numOfPages;
        this.macAddress = macAddress;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return TemperatureChartFragment.newInstance(position, macAddress);
    }

    @Override
    public int getItemCount() {
        return numOfPages;
    }
}
