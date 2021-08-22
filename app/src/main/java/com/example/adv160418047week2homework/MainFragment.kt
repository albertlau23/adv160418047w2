package com.example.adv160418047week2homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    var val1=0;
    var val2=0;
    var poin=0;
    fun loadQuestion(){
        val1=(0..100).random()
        val2=(0..100).random()
        txtSoal.text="$val1 + $val2"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadQuestion()
        btnSubmit.setOnClickListener{
            if(txtJawaban.text.toString().toInt()==val1+val2){
                poin++;
                Toast.makeText(context,"poin saat ini $poin",Toast.LENGTH_SHORT).show()
                loadQuestion()
                txtJawaban.setText("")
            }else{
                val action=MainFragmentDirections.actionGameFragment(poin)
                Navigation.findNavController(it).navigate(action)

            }

        }
    }

}