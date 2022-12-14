package com.example.tibet_final

//*****************************
//****** Tibet Akyurekli ******
//***** December 6th 2022 *****
//*****************************


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tibet_final.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {

    //region Properties
    private lateinit var binding: ActivityWebViewBinding
    //endregion

    @SuppressLint("SetJavaScriptEnabled")
    //region onCreate Method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url =  intent.getStringExtra(getString(R.string.url_key))

        binding.webViewGitHub.settings.javaScriptEnabled = true
        binding.webViewGitHub.settings.loadWithOverviewMode = true
        binding.webViewGitHub.settings.useWideViewPort = true

        url?.let{
            binding.webViewGitHub.loadUrl(url)
        }
    }
    //endregion
}