package com.example.evan.eShop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Dashboard extends Fragment {

    private RecyclerView recyclerView;
    ImageView imageView,imageView1,imageView2;
    private  RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v =inflater.inflate(R.layout.fragment_dashboard, container, false);
        imageView = (ImageView) v.findViewById(R.id.image);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainsActivity dashboard=new MainsActivity();
                android.support.v4.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction().addToBackStack(null);
                fragmentTransaction.replace(R.id.ab, dashboard);
                fragmentTransaction.commit();
        }
        });
               imageView1 = (ImageView) v.findViewById(R.id.sample);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainsActivityWomen dashboard=new MainsActivityWomen();
                android.support.v4.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction().addToBackStack(null);
                fragmentTransaction.replace(R.id.ab, dashboard);
                fragmentTransaction.commit();
            }
        });
        imageView2 = (ImageView) v.findViewById(R.id.samples);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivityKids dashboard=new MainActivityKids();
                android.support.v4.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction().addToBackStack(null);
                fragmentTransaction.replace(R.id.ab, dashboard);
                fragmentTransaction.commit();
            }
        });

//        recyclerView = (RecyclerView) v.findViewById(R.id.latest1);
//        recyclerView.setHasFixedSize(true);
//        layoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager);



        return v;


    }


}
