package com.cosmetics.mvvm_livedata.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ticket {
    @SerializedName("ticketid")
    @Expose
    private String ticketid;
    @SerializedName("ticketname")
    @Expose
    private String ticketname;
    @SerializedName("ticketdesc")
    @Expose
    private String ticketdesc;

    public Ticket() {
    }

    public String getTicketid() {
        return ticketid;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }

    public String getTicketname() {
        return ticketname;
    }

    public void setTicketname(String ticketname) {
        this.ticketname = ticketname;
    }

    public String getTicketdesc() {
        return ticketdesc;
    }

    public void setTicketdesc(String ticketdesc) {
        this.ticketdesc = ticketdesc;
    }
}
