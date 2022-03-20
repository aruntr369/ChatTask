package com.arun.chattask;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CallFragment extends Fragment {
    String namee[]={"Rachel Brown","Tracie Campbell","Elizabeth Rollins","Daryl Perez","Mr. Charles Mooney",
            "Angela Parker","Desiree Hughes","Amber Garcia","Ashley Gallegos","Robert Montgomery",
            "Cindy Landry","Michelle Tran","Brenda Hall","Lynn Kaufman","Jason White","Randall Jones"};
    int imagee[]={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,
            R.drawable.a8,R.drawable.a9,R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_call, container, false);

        ListView listView=(ListView) view.findViewById(R.id.ltv);

        //ArrayAdapter arrayAdapter=new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,imagee);
        CustomCall customCall=new CustomCall(getActivity(),namee,imagee);
        listView.setAdapter(customCall);





        return view;
    }
}