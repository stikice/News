package com.example.newsapp

import android.content.Context
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

private const val ARG_NEWS = "news"
class FragmentDetail : Fragment(R.layout.fragment_detail) {
    companion object {
        fun newInstance(news: News): FragmentDetail {
            val args = Bundle()
            args.putSerializable(ARG_NEWS, news as News)

            val fragment = FragmentDetail()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val title = view.findViewById<TextView>(R.id.titled)
        val author = view.findViewById<TextView>(R.id.authord)
        val content = view.findViewById<TextView>(R.id.contentd)

        val newss: News = arguments?.getSerializable(ARG_NEWS) as News
        title.text = newss.title
        author.text = newss.author
        content.text = newss.content

    }

}