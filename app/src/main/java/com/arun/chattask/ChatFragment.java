package com.arun.chattask;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChatFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        String chatss[]={"aaaaaaaaaaaaaaaaa","bbbbbbbbbbbbbbbbbb","cccccccccccccc","ddddddddddd","eeeeeeeeee"};

        ListView listView=(ListView) view.findViewById(R.id.chatList);
        ArrayAdapter adapter=new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,chatss);
        listView.setAdapter(adapter);


        return view;
    }
}