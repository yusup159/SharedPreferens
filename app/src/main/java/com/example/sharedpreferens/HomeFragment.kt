package com.example.sharedpreferens


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.sharedpreferens.recycle.Adapter

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        val imageList = listOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img1,
            R.drawable.img2,
        )

        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager

        val adapter = Adapter(imageList)
        recyclerView.adapter = adapter

        return view
    }
}
