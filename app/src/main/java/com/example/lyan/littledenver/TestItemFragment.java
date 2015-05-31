package com.example.lyan.littledenver;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by lyan on 29/05/15.
 */
public class TestItemFragment extends Fragment {
    public FragmentTransaction ft;
    public ViewGroup ctr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ctr = container;
        View rootView = inflater.inflate(R.layout.test_item_fragment, container, false);

        TextView tv2 = (TextView) rootView.findViewById(R.id.textView2);

        tv2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                System.out.println("Bisaaaaaa di item");

                DetailTesFragment detailTesFragment= new DetailTesFragment();

                // Make new fragment to show this selection.
                detailTesFragment= DetailTesFragment.newInstance(1);
                // Execute a transaction, replacing any existing
                // fragment with this one inside the frame.
                ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.cobaframe, detailTesFragment, "detail");
                ft.setTransition(
                        FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();

            }
        });
        return rootView;
    }

    public static TestItemFragment newInstance(int index) {
        TestItemFragment f = new TestItemFragment();

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
