package com.saif.jetpacknavigationexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : Fragment(R.layout.fragment_settings){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        et_default_amount.setText(SampleData.defaultAmount.value.toString())

        btn_save_default_amount.setOnClickListener {
            val defaultAmount = et_default_amount.text.toString().toLong()
            SampleData.defaultAmount.value = defaultAmount
        }

        btn_about_app.setOnClickListener {
            val action = MainNavGraphDirections.actionGlobalAboutAppFragment()
            findNavController().navigate(action)
        }

    }

}