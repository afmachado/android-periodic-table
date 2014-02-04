package com.frozendevs.periodictable.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.frozendevs.periodictable.R;
import com.frozendevs.periodictable.model.adapter.ElementListAdapter;

public class ElementListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.element_list_fragment, container, false);

        ListView listView = (ListView)rootView.findViewById(R.id.elementList);
        listView.setEmptyView(rootView.findViewById(R.id.progress_bar));
        listView.setAdapter(new ElementListAdapter(getActivity()));

        return rootView;
    }
}