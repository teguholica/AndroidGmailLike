package com.teguholica.gmaillike.network;

import com.teguholica.gmaillike.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by teguholica on 6/2/17.
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();

}
