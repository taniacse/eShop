package com.example.evan.eShop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class MainActivityKids extends Fragment {

    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandablelistView;

    // Assign Parent list items here.
    List<String> ParentList = new ArrayList<String>();
    {
        ParentList.add("Jean");
        ParentList.add("T-Shirts");
        ParentList.add("Shirt");
        ParentList.add("Jacket");
        ParentList.add("Ethinic & Indian Wear");
        ParentList.add("Footwear");
        ParentList.add("Accessories");
    }

    // Assign children list element using string array.

    String[] TShirt = { "T-Shirt" ,"Topless"};
    String[] footwear = { "Causual","Sport","Formal","FlipFlops" };
    String[] shirt = { "Causual T-Shirt","Polo T-Shirt" };
    String[] shirt1 = { "Saree & Blouse","Salwar & Kurtas","Dupatta & swats","Leggins" };
    String[] Accessories = { "Socks","Belt","Scarff","Headphone" };
    String[] Jeans = { "All Jeans" };
    String[] Jacket = { "All Jacket" };


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v =inflater.inflate(R.layout.fragment_main_activity_kids, container, false);

        ParentListItems = new LinkedHashMap<String, List<String>>();

        for ( String HoldItem : ParentList) {
            if (HoldItem.equals("T-Shirts")) {
                loadChild(TShirt);

            }
            else if (HoldItem.equals("Jean"))
                loadChild(Jeans);
            else if (HoldItem.equals("Ethinic & Indian Wear"))
                loadChild(shirt1);
            else if (HoldItem.equals("Jacket"))
                loadChild(Jacket);
            else if (HoldItem.equals("Shirt"))
                loadChild(shirt);


            else if (HoldItem.equals("Footwear"))
                loadChild(footwear);

            else if (HoldItem.equals("Accessories"))
                loadChild(Accessories);
            else
                loadChild(shirt1);

            ParentListItems.put(HoldItem, ChildList);
        }

        expandablelistView = (ExpandableListView) v.findViewById(R.id.expandableListView1);
        final ExpandableListAdapter expListAdapter = new com.example.evan.eShop.ListAdapter(
                getActivity(), ParentList, ParentListItems);
        expandablelistView.setAdapter(expListAdapter);

        expandablelistView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {


                final String selected = (String) expListAdapter.getChild(
                        groupPosition, childPosition);

                // Switch case to open selected child element activity on child element selection.

                Intent intent;
                switch(selected){
                    case "Causual":
                        intent = new Intent(getActivity(), com.example.evan.eShop.Android_Activity.class);
                        startActivity(intent);
                        break;

                    case "Sport":
                        intent = new Intent(getActivity(), com.example.evan.eShop.ANDROID_EXAMPLES_Activity.class);
                        startActivity(intent);
                        break;

                    case "Formal":
                        intent = new Intent(getActivity(), com.example.evan.eShop.ANDROID_TUTORIALS_Activity.class);
                        startActivity(intent);
                        break;

                    case "FlipFlops":
                        intent = new Intent(getActivity(), com.example.evan.eShop.XAMPPActivity.class);
                        startActivity(intent);
                        break;

                    case "Causual T-Shirt":
                        intent = new Intent(getActivity(), com.example.evan.eShop.PHPMYADMINActivity.class);
                        startActivity(intent);
                        break;

                    case "Polo T-Shirt":
                        intent = new Intent(getActivity(), com.example.evan.eShop.MYSQLActivity.class);
                        startActivity(intent);
                        break;

                }

                return true;
            }
        });
        return v;
    }

    private void loadChild(String[] ParentElementsName) {
        ChildList = new ArrayList<String>();
        for (String model : ParentElementsName)
            ChildList.add(model);
    }

}
