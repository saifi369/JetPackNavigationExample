package com.saif.jetpacknavigationexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_send_cash.*

class SendCashFragment : Fragment(R.layout.fragment_send_cash){

    private val args : SendCashFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val receiverName = args.receiverName
        val amount = args.amount

        tv_receiver.text = "Send cash to $receiverName"
        et_amount.setText(amount.toString())

    }

}