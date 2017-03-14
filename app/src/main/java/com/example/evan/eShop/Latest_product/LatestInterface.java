package com.example.evan.eShop.Latest_product;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by EVAN on 1/11/2017.
 */

public interface LatestInterface {
    String url = "http://192.168.1.244/ab/api/EmployeeManualLogins";

    @FormUrlEncoded

    @POST("/GetEmployeeManualabsentEmployeeList")

    void absent(@Field("CompanyId") int CompanyId,

                Callback<ArrayList<LatestModel>> cb);
}
