package com.example.navigationcomponent


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast

import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment


class MainFragment : Fragment() {
    private var ivDog: ImageView? = null
    private var ivGorilla: ImageView? = null
    private var ivHorse: ImageView? = null
    private var ivTiger: ImageView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        ivDog = view.findViewById(R.id.iv_dog)
        ivGorilla = view.findViewById(R.id.iv_gorilla)
        ivHorse = view.findViewById(R.id.iv_horse)
        ivTiger = view.findViewById(R.id.iv_tiger)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ivDog?.setOnClickListener { v -> Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_detailFragment) }

        ivGorilla?.setOnClickListener { v ->
            val bundle = Bundle()
            bundle.putInt("drawable_id", R.drawable.animal_2)
            Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_detailFragment, bundle)
        }

        ivHorse?.setOnClickListener { v ->
            val mainFragmentDirections = MainFragmentDirections.actionMainFragmentToDetailFragment(R.drawable.animal_3)
            Navigation.findNavController(v).navigate(mainFragmentDirections)
        }

        ivTiger?.setOnClickListener { }

    }
}
