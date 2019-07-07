package com.cosmetics.mvvm_livedata;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cosmetics.mvvm_livedata.model.Ticket;
import com.cosmetics.mvvm_livedata.viewmodel.TicketViewModel;

public class MainActivity extends AppCompatActivity {
private TicketViewModel ticketViewModel;
    private TextView ticketid,ticketname,ticketdesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ticketViewModel= ViewModelProviders.of(this).get(TicketViewModel.class);
        ticketViewModel.getTicketLiveDataVal();
    }

    private void init() {
        ticketid = (TextView)findViewById(R.id.ticketid);
        ticketname = (TextView)findViewById(R.id.ticketname);
        ticketdesc = (TextView)findViewById(R.id.ticketdesc);
    }

    public void getTokenView(View view) {
        String ticketidval=ticketViewModel.getTicketLiveDataVal().getValue().getTicketid().toString();
        ticketid.setText(ticketidval);

        String ticketnameval=ticketViewModel.getTicketLiveDataVal().getValue().getTicketname().toString();
        ticketname.setText(ticketnameval);

        String ticketdescval=ticketViewModel.getTicketLiveDataVal().getValue().getTicketdesc().toString();
        ticketdesc.setText(ticketdescval);


    }
}
