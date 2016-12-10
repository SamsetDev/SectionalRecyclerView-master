package com.samset.headerrecyclerviewsample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.samset.headerrecyclerviewsample.R;
import com.samset.headerrecyclerviewsample.model.model.CountryState;

import java.util.List;

public class SectionalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final int CITY_TYPE = 0;
    public final int COUNTRY_TYPE = 1;
    private List<CountryState> mList;

    public SectionalAdapter(List<CountryState> list) {
        this.mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        switch (viewType) {
            case COUNTRY_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.section, parent, false);
                return new CountryViewHolder(view);
            case CITY_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.section_child, parent, false);
                return new CityViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CountryState object = mList.get(position);
        if (object != null) {
            switch (object.getType()) {
                case COUNTRY_TYPE:
                    ((CountryViewHolder) holder).tvCountryName.setText(object.getName());
                    break;
                case CITY_TYPE:
                    ((CityViewHolder) holder).tvCityName.setText(object.getName());
                    //((CityViewHolder) holder).id.setText(object.getDescription());
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        if (mList == null)
            return 0;
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mList != null) {
            CountryState object = mList.get(position);
            if (object != null) {
                return object.getType();
            }
        }
        return 0;
    }

    public static class CountryViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCountryName;

        public CountryViewHolder(View itemView) {
            super(itemView);
            tvCountryName = (TextView) itemView.findViewById(R.id.titleTextView);
        }
    }

    public static class CityViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCityName;
        private TextView id;

        public CityViewHolder(View itemView) {
            super(itemView);
            tvCityName = (TextView) itemView.findViewById(R.id.titleTextView);

        }
    }
}