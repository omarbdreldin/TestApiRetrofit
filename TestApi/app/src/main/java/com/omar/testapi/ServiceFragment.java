package com.omar.testapi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.omar.testapi.pojos.Service;
import com.omar.testapi.retrofit.ApiClient;
import com.omar.testapi.retrofit.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class ServiceFragment extends Fragment {

    private TextView name;
    private TextView image;
    private TextView type;
    private TextView price;
    private TextView desc;
    private TextView avail;
    private Button button;

    public ServiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_service, container, false);

        name = view.findViewById(R.id.name);
        image = view.findViewById(R.id.image);
        type = view.findViewById(R.id.type);
        price = view.findViewById(R.id.price);
        desc = view.findViewById(R.id.desc);
        avail = view.findViewById(R.id.avail);
        button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namestr = name.getText().toString();
                String imagestr = image.getText().toString();
                String typestr = type.getText().toString();
                String descstr = desc.getText().toString();
                float priceval = Float.valueOf(price.getText().toString());
                int availval = Integer.valueOf(avail.getText().toString());
                Service service = new Service(0, namestr, imagestr, typestr, priceval, descstr, availval);
                ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
                apiInterface.postService(service).enqueue(new Callback<Service>() {
                    @Override
                    public void onResponse(Call<Service> call, Response<Service> response) {
                        Log.i("response", response.toString());
                    }

                    @Override
                    public void onFailure(Call<Service> call, Throwable t) {
                        Log.i("response failed", t.toString());
                    }
                });
            }
        });

        return view;
    }

}
