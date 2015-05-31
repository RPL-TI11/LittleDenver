package com.example.lyan.littledenver;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by lyan on 29/05/15.
 */
public class TestFragment extends Fragment {
    public FragmentTransaction ft;
    public ViewGroup ctr;
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ctr = container;
        rootView = inflater.inflate(R.layout.fragment_test, container, false);
        TextView tv8 = (TextView) rootView.findViewById(R.id.textView8);

        tv8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                System.out.println("Bisaaaaaa");

                TestItemFragment testItemFragment = new TestItemFragment();

                    // Make new fragment to show this selection.
                    testItemFragment = TestItemFragment.newInstance(1);
                // Execute a transaction, replacing any existing
                    // fragment with this one inside the frame.
                    ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.cobaframe, testItemFragment, "detail");
                    ft.setTransition(
                            FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    FrameLayout frameLayout = (FrameLayout) ctr.findViewById(R.id.cobaframe);
                frameLayout.setAlpha(1);
                    ft.commit();

            }
        });

        return rootView;
    }




}
