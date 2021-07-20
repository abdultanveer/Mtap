package com.abdul.myfirsttap.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.abdul.myfirsttap.R

class SlideshowFragment : Fragment(), View.OnClickListener {

    private lateinit var slideshowViewModel: SlideshowViewModel
    lateinit var  textView: TextView
    lateinit var etName: EditText
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
         textView = root.findViewById(R.id.textViewSub)
         etName = root.findViewById(R.id.etFirst)
        val submitButton: Button = root.findViewById(R.id.btnSubmit)

        submitButton.setOnClickListener(this)

        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onClick(p0: View?) {
        textView.text = etName.text.toString()
    }
}