package com.example.navigationcomponent;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;


public class MainFragment extends Fragment {
    private ImageView ivDog, ivGorilla, ivHorse, ivTiger;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ivDog = view.findViewById(R.id.iv_dog);
        ivGorilla = view.findViewById(R.id.iv_gorilla);
        ivHorse = view.findViewById(R.id.iv_horse);
        ivTiger = view.findViewById(R.id.iv_tiger);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ivDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_detailFragment);
            }
        });

        ivGorilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("id", R.drawable.animal_2);
                Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_detailFragment, bundle);
            }
        });

        ivHorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections mainFragmentDirections = MainFragmentDirections.actionMainFragmentToDetailFragment(R.drawable.animal_3);
                Navigation.findNavController(v).navigate(mainFragmentDirections);
            }
        });

        ivTiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
