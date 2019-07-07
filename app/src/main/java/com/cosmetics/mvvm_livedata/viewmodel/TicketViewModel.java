package com.cosmetics.mvvm_livedata.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.cosmetics.mvvm_livedata.model.Ticket;
import com.cosmetics.mvvm_livedata.remote.RetroClass;

public class TicketViewModel extends ViewModel {
    //private Ticket ticket;
    private RetroClass retroClass=new RetroClass();
    private LiveData<Ticket> ticketLiveData;

    public LiveData<Ticket> getTicketLiveDataVal() {
        if (ticketLiveData==null)
        {
            ticketLiveData=retroClass.getTicketLiveData();
        }
        return ticketLiveData;
    }
}
