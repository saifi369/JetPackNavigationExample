package com.saif.jetpacknavigationexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_view_transactions.*

class ViewTransactionsFragment : Fragment(R.layout.fragment_view_transactions){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_test.setOnClickListener {
            val action = ViewTransactionsFragmentDirections
                    .actionViewTransactionsFragmentToSendCashFragment(receiverName = "testname")
            findNavController().navigate(action)
        }

    }
}