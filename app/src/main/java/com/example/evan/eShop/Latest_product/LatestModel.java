package com.example.evan.eShop.Latest_product;

/**
 * Created by EVAN on 1/11/2017.
 */

public class LatestModel {
    private String EmployeeCode;
    private String EmployeeName;



    public String getApplicantPicture() {
        return ApplicantPicture;
    }

    public void setApplicantPicture(String applicantPicture) {
        ApplicantPicture = applicantPicture;

    }

    private String ApplicantPicture;

    public String getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeCode = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }


    public String getLoginDate() {
        return LoginDate;
    }

    public void setLoginDate(String loginDate) {
        LoginDate = loginDate;
    }

    public String getLoginDateTime() {
        return LoginDateTime;
    }

    public void setLoginDateTime(String loginDateTime) {
        LoginDateTime = loginDateTime;
    }

    private String LoginDate ;

    private String LoginDateTime ;
}
