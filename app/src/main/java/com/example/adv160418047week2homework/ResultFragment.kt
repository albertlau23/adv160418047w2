package com.example.adv160418047week2homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_result.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class ResultFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       btnBack.setOnClickListener {
           val action= ResultFragmentDirections.actionResultFragment()
           Navigation.findNavController(it).navigate(action)
       }
        arguments?.let {
            val score=ResultFragmentArgs.fromBundle(requireArguments()).score
            txtScore.text="Your score is $score"
        }
    }


}