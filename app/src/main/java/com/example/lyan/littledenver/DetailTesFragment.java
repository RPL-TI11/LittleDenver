package com.example.lyan.littledenver;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lyan on 29/05/15.
 */
public class DetailTesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail_tes, container, false);
        TextView tv27 = (TextView) rootView.findViewById(R.id.textView27);
        tv27.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
               MainActivity.actionBar.setSelectedNavigationItem(1);
            }
        });
        return rootView;
    }

    public static DetailTesFragment newInstance(int index) {
        DetailTesFragment f = new DetailTesFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);

        return f;
    }

    public int getShownIndex() {
        return getArguments().getInt("index", 0);
    }
}
