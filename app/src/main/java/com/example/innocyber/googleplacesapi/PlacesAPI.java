package com.example.innocyber.googleplacesapi;

import com.example.innocyber.googleplacesapi.pojos.Places;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PlacesAPI {

    @GET("maps/api/place/nearbysearch/json?location=6.6018,3.3515&radius=1900&types=atm&name=gtbank&key=AIzaSyBn1ChWZx-SVKNU1IpgBjUDlaHMbTet5EE")
    Call<Places> getPlaces();
}
