package com.example.evan.eShop.Latest_product;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.evan.eShop.R;

import java.util.ArrayList;

/**
 * Created by EVAN on 1/11/2017.
 */

public class LatestAdapter  extends RecyclerView.Adapter<LatestAdapter.ViewHolder> {
    private ArrayList<LatestModel> android;


    public LatestAdapter(ArrayList<LatestModel> android) {
        this.android = android;
    }

    @Override
    public LatestAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.latest_product, parent, false);
        return new LatestAdapter.ViewHolder(view);
    }


    public void onBindViewHolder(LatestAdapter.ViewHolder holder, int i) {
        holder.tv_name.setText(android.get(i).getLoginDateTime());
       holder.tv_version.setText(android.get(i).getEmployeeCode());


        String image = android.get(i).getApplicantPicture();
        String imageDataBytes = "";
        int ii = 0;
        int ij = 0;
        if(image.length()>0)
        {
           Log.e("fg","dfvnbvnd");
            imageDataBytes = image.substring(image.indexOf(",")+1);
            if(imageDataBytes.length()>0)
            {
                Log.e("fg","dfvbnd");
                if(IsBase64Encoded(imageDataBytes))
                {
                    holder.a.setImageBitmap(stringToBitmap(imageDataBytes));
                }



            }


        }


    }

    @Override
    public int getItemCount() {
        return android.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name,tv_version;
        private ImageView a;
        public ViewHolder(View view) {
            super(view);

            tv_name = (TextView)view.findViewById(R.id.name);
            tv_version = (TextView)view.findViewById(R.id.id);

            a = (ImageView) view.findViewById(R.id.image);

        }
    }
    public static Bitmap stringToBitmap(String fileString) {

        byte[] valueDecoded = Base64.decode(fileString, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(valueDecoded, 0,
                valueDecoded.length);

    }
    private boolean IsBase64Encoded(String value)
    {
        try {
            byte[] decodedString = Base64.decode(value, Base64.DEFAULT);
            BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}