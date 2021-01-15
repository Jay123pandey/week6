package com.jaypandey.softuserclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.jaypandey.softuserclone.R

class AboutFragment : Fragment() {
    lateinit var webViewAboutUs:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_about, container, false)
        webViewAboutUs=view.findViewById(R.id.webViewAbout)
        webViewAboutUs.settings.javaScriptEnabled=true
        val webViewClient= WebViewClient()
        webViewAboutUs.webViewClient=webViewClient
        webViewAboutUs.loadUrl("https://softwarica.edu.np")
        return view
    }


}