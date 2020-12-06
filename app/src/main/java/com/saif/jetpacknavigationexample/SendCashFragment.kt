package com.saif.jetpacknavigationexample

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_send_cash.*
import kotlinx.android.synthetic.main.fragment_settings.*

class SendCashFragment : Fragment(R.layout.fragment_send_cash){

    private val args : SendCashFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        et_amount.setText(SampleData.defaultAmount.value.toString())
        SampleData.defaultAmount.observe(viewLifecycleOwner){
            et_amount.setText(it.toString())
        }

        val receiverName = args.receiverName

        tv_receiver.text = "Send cash to $receiverName"

        btn_send.setOnClickListener {

            if(et_amount.text.toString().isEmpty()) {
                Toast.makeText(requireContext(), "Enter some amount", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val amount = et_amount.text.toString().toLong()
            val action = SendCashFragmentDirections
                    .actionSendCashFragmentToConfirmDialogFragment(receiverName, amount)
            findNavController().navigate(action)
        }

        btn_done.setOnClickListener {
            val action = SendCashFragmentDirections.actionSendCashFragmentToHomeFragment()
            findNavController().navigate(action)
        }

        btn_cancel.setOnClickListener {
            findNavController().popBackStack(R.id.homeFragment,true)
        }

    }

}