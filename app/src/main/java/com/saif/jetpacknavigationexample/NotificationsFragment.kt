package com.saif.jetpacknavigationexample

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_notifications.*

class NotificationsFragment : Fragment(R.layout.fragment_notifications){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lv_notifications.adapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,getNotifications())

    }
    private fun getNotifications():List<String>{
        val notifications = mutableListOf<String>()

        for(i in 1..20){
            notifications.add("Notification # $i")
        }
        return notifications
    }
}