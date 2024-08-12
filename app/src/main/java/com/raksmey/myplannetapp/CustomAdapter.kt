package com.raksmey.myplannetapp

import android.content.Context
import android.widget.ArrayAdapter


class CustomAdapter(
    plannedArrayList: ArrayList<Planned>,
    context: Context
) : ArrayAdapter<Planned>(context, R.layout.item_list_layout, plannedArrayList) {
    // No need to explicitly declare the context field if it's used in the superclass
    // It will be automatically managed by the ArrayAdapter class.
}
