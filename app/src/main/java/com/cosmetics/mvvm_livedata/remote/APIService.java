package com.cosmetics.mvvm_livedata.remote;

import com.cosmetics.mvvm_livedata.model.Ticket;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("/bins/nolaz")
    Call<Ticket> getTicketJSON();
}
