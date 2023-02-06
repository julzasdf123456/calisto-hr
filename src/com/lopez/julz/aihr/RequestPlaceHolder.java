/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr;

import com.lopez.julz.aihr.pojos.AttendanceResponse;
import com.lopez.julz.aihr.pojos.BiometricUsersResponse;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 *
 * @author Julio Lopez
 */
public interface RequestPlaceHolder {
    @GET("get-users")
    Call<List<BiometricUsersResponse>> getUsers(@Query("Ip") String ip);
    
    @GET("get-attendance")
    Call<List<AttendanceResponse>> getAttendance(@Query("Ip") String ip);
}
