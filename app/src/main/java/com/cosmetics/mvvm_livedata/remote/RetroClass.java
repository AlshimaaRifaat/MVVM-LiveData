package com.cosmetics.mvvm_livedata.remote;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.cosmetics.mvvm_livedata.model.Ticket;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//bmsabet presenter

public class RetroClass {
    private static final String ROOTURL ="https://api.myjson.com";

    private static Retrofit getRetroInstance()
    {

        return new Retrofit.Builder().baseUrl(ROOTURL).addConverterFactory(GsonConverterFactory.create()).build();
    }



    public static APIService getAPIService()
    {

        return getRetroInstance().create(APIService.class);

    }

    public LiveData<Ticket> getTicketLiveData()
    {
        final MutableLiveData<Ticket> ticketMutableLiveData =new MutableLiveData<>();
        APIService apiService=RetroClass.getAPIService();
        apiService.getTicketJSON().enqueue(new Callback<Ticket>() {
            @Override
            public void onResponse(Call<Ticket> call, Response<Ticket> response) {
                Ticket tic=response.body(); //.....................
                ticketMutableLiveData.setValue(tic);

            }

            @Override
            public void onFailure(Call<Ticket> call, Throwable t) {

            }
        });
        return  ticketMutableLiveData;
    }
}
