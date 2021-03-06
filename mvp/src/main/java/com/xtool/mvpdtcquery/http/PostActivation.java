package com.xtool.mvpdtcquery.http;



import com.xtool.mvpdtcquery.bean.DtcCustom;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;


/**
 * Created by xtool on 2017/8/21.
 */

public interface PostActivation {

    String BASE_URL = "http://192.168.137.1:8080/DtcQuery/";

    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
    @POST("app/{action}")
    Observable<List<DtcCustom>> postActivation(@Body DtcCustom DtcCustom, @Path("action") String action);//传入的参数为RequestBody

}
