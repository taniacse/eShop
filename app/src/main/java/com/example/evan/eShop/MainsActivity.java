package com.example.evan.eShop;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainsActivity extends Fragment {

    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandablelistView;

    // Assign Parent list items here.
    List<String> ParentList = new ArrayList<String>();
    { ParentList.add("T-Shirt");
        ParentList.add("Shirt");
        ParentList.add("Jacket");
        ParentList.add("Footwear");
        ParentList.add("Accessories");
    }

    // Assign children list element using string array.
    String[] footwear = { "Causual","Sport","Formal","FlipFlops" };
    String[] shirt = { "Causual T-Shirt","Polo T-Shirt" };
    String[] shirt1 = { "Causual-Shirt","Formal-Shirt" };
    String[] Accessories = { "Wallet","Belt","Ties","Headphone" };
    String[] Jeans = { "All Jeans" };
    String[] Jacket = { "All Jacket" };


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v =inflater.inflate(R.layout.activity_mains, container, false);

        ParentListItems = new LinkedHashMap<String, List<String>>();

        for ( String HoldItem : ParentList) {
            if (HoldItem.equals("T-Shirt")) {
                loadChild(shirt);

            }
            else if (HoldItem.equals("Jeans"))
                loadChild(Jeans);
            else if (HoldItem.equals("Jacket"))
                loadChild(Jacket);
            else if (HoldItem.equals("Shirt"))
                loadChild(shirt1);
            else if (HoldItem.equals("Footwear"))
                loadChild(footwear);

            else if (HoldItem.equals("Accessories"))
                loadChild(Accessories);
            else
                loadChild(shirt1);

            ParentListItems.put(HoldItem, ChildList);
        }

        expandablelistView = (ExpandableListView) v. findViewById(R.id.expandableListView1);
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
                        Android_Activity dashboard=new Android_Activity();
                        android.support.v4.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction().addToBackStack(null);
                        fragmentTransaction.replace(R.id.ab, dashboard);
                        fragmentTransaction.commit();
                        break;

                    case "Sport":
                        Android_Activity dashboards=new Android_Activity();
                        android.support.v4.app.FragmentTransaction fragmentTransactions=getFragmentManager().beginTransaction().addToBackStack(null);
                        fragmentTransactions.replace(R.id.ab, dashboards);
                        fragmentTransactions.commit();
                        break;

                    case "Formal":
                        Android_Activity dashboardaa=new Android_Activity();
                        android.support.v4.app.FragmentTransaction fragmentTransactionaa=getFragmentManager().beginTransaction().addToBackStack(null);
                        fragmentTransactionaa.replace(R.id.ab, dashboardaa);
                        fragmentTransactionaa.commit();
                        break;

                    case "FlipFlops":
                        Android_Activity dashboardflip=new Android_Activity();
                        android.support.v4.app.FragmentTransaction fragmentTransactionflip=getFragmentManager().beginTransaction().addToBackStack(null);
                        fragmentTransactionflip.replace(R.id.ab, dashboardflip);
                        fragmentTransactionflip.commit();
                        break;

                    case "Causual T-Shirt":
                        Android_Activity dashboardtshirt=new Android_Activity();
                        android.support.v4.app.FragmentTransaction fragmentTransactiontshirt=getFragmentManager().beginTransaction().addToBackStack(null);
                        fragmentTransactiontshirt.replace(R.id.ab, dashboardtshirt);
                        fragmentTransactiontshirt.commit();
                        break;

                    case "Polo T-Shirt":
                        Android_Activity dashboardpolotshirt=new Android_Activity();
                        android.support.v4.app.FragmentTransaction fragmentTransactionpolotshirtt=getFragmentManager().beginTransaction().addToBackStack(null);
                        fragmentTransactionpolotshirtt.replace(R.id.ab, dashboardpolotshirt);
                        fragmentTransactionpolotshirtt.commit();
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
