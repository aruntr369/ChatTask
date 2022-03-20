package com.arun.chattask;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

public class CustomCall extends BaseAdapter {
    Context context;
    String namee[];
    int imagee[];
    int ii;
    int callIv=R.drawable.phonecall;
    int call=33333;
    ImageView imageView;
    LayoutInflater inflater;
    public CustomCall(FragmentActivity callFragment, String[] namee, int[] imagee) {
        this.context=callFragment.getApplicationContext();
        this.namee=namee;
        this.imagee=imagee;
    }

    @Override
    public int getCount() {
        return namee.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int ii, View view, ViewGroup viewGroup) {
        inflater = LayoutInflater.from(context);
        view =inflater.inflate(R.layout.custom_layout,null);
        ImageView imageView=(ImageView) view.findViewById(R.id.ivc);
        TextView textView=(TextView) view.findViewById(R.id.tvc);
        imageView.setImageResource(imagee[ii]);
        textView.setText(namee[ii]);
        ImageView calllIV=(ImageView) view.findViewById(R.id.ivCall);
        calllIV.setImageResource(callIv);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context.getApplicationContext(), "clicked  "+namee[ii], Toast.LENGTH_SHORT).show();
            }
        });

        //for call that person
        calllIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(context.getApplicationContext(), "Calling "+namee[ii], Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+call));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getContext().startActivity(intent);

            }
        });
        return view;
    }

}
