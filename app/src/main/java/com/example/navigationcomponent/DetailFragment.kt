package com.example.navigationcomponent


import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment() {
    private var ivAnimal: ImageView? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        ivAnimal = view.findViewById(R.id.iv_animal)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let{
            //Using SafeArgs
            val drawableId = DetailFragmentArgs.fromBundle(it).drawableId
            //Without SafeArgs
            //            int drawableId = getArguments().getInt("id");
            ivAnimal?.setImageResource(drawableId)
        }
    }
}
