package com.example.sharedpreferens

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.sharedpreferens.session.SessionActivity

class SettingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_setting, container, false)

        val btnlog: Button = view.findViewById(R.id.btnLogout)
        val sessionActivity = SessionActivity(requireActivity())

        btnlog.setOnClickListener {
            sessionActivity.sessionLogout()
            val intent = Intent(requireActivity(), LoginActivity::class.java)
            requireActivity().startActivity(intent)
            requireActivity().finish()
        }

        return view
    }
}
