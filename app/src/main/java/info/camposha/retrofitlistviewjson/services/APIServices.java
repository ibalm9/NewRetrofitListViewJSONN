package info.camposha.retrofitlistviewjson.services;

import java.util.List;

import info.camposha.retrofitlistviewjson.models.Spacecraft;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface APIServices {
    String BASE_URL = "https://api.myjson.com/";
    @GET("bins/htq6f")
    Call<List<Spacecraft>> getSpacecrafts();



    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
            .build();
    APIServices service = retrofit.create(APIServices.class);
}
