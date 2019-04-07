package com.example.navigationcomponent;


import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {
    private ImageView ivAnimal;

    public DetailFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        ivAnimal = view.findViewById(R.id.iv_animal);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            //Using SafeArgs
            int drawableId = DetailFragmentArgs.fromBundle(getArguments()).getDrawableId();
            //Without SafeArgs
//            int drawableId = getArguments().getInt("id");
            ivAnimal.setImageResource(drawableId);
        }
    }
}
