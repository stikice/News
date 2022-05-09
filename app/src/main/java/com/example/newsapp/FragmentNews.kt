package com.example.newsapp

import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.lang.reflect.Type

class FragmentNews : Fragment(R.layout.fragment_news)  {
    private val header1 = News("War in Ukraine: Zelensky WW2 speech accuses Russia of Nazi atrocities","BBC","""Ukrainian President Volodymyr Zelensky has accused Russia of implementing "a bloody reconstruction of Nazism".

In a speech commemorating World War Two, he said the Russian army was replicating Nazi "atrocities" during its invasion of his country.

"Darkness has returned to Ukraine and it has become black and white again," he said in his video address.

Footage in the video showed the Ukrainian leader against a backdrop of destroyed residential buildings. """)

    private val header2 = News("How fast food giants like McDonald's found their Indian soul", "BBC", """For decades, global fast food giants have been catering to Indians used to eating from local eateries. In recent years, they have moved towards fusion of regional flavours. The BBC's Zoya Mateen and Meryl Sebastian report.

Western fast-food was a novelty when McDonald's opened its first outlet in an upscale Delhi neighbourhood in 1996.

But the chain persisted, reinventing itself by tailoring its menu to local tastes.""")
    private val header3 = News("Ukraine war: Dozens feared dead after bomb hits school", "BBC", """Around 60 people were killed after a bomb hit a school in east Ukraine, President Volodymyr Zelensky has said.

Earlier, the governor of Luhansk region, Serhiy Haidai, said 90 people had been sheltering in the building in Bilohorivka, and 30 were rescued.

Mr Haidai said a Russian plane had dropped the bomb on Saturday - Russia has not commented.

Luhansk has seen fierce combat as Russian troops and separatist fighters seek to surround government forces.""")

    private val header4 = News("Philippines election: 'Politicians hire me to spread fake stories'", "Kayleen Devlin", """On Monday, voters in the Philippines will pick the nation's next president - amid a tide of falsehoods and social media lies.

"I consider myself a troll - or, politically speaking, I'm a social media marketing consultant."

Jon - not his real name - is part of an industry that could be crucial to the selection of the next president of the Philippines.

He says he's been working most days from 10:00 to 03:00, managing hundreds of Facebook pages and fake profiles for the benefit of his clients - politicians and their campaigns. """)
    private val header5 = News("Fergal Keane: How I found a way to live with PTSD", "Fergal Keane", """The horrific scenes of war emerging from Ukraine have raised fresh concerns about the trauma experienced by those who witness extreme violence. PTSD - Post Traumatic Stress Disorder - affects millions worldwide. The BBC's Fergal Keane, who was diagnosed in 2008, explores its effects and the potential for healing.

All day and much of the night I went back and forth in my mind. Do I stay, or go? It was around mid-February and I was certain that war was coming to Ukraine. From my hotel room in Kyiv I looked out on a skyline that might soon be lit by the fire of explosions.

The part of me that wanted to tell one of the biggest stories of my lifetime longed to stay. But it is also the part that is drawn to danger and has brought anguish into my personal life in the form of PTSD.""")
    private val header6 = News("John Lee: The ex-security chief who became Hong Kong's leader", "BBC", """John Lee has been named Hong Kong's new leader, after a closed voting process in which he was the sole candidate.

His appointment is being widely seen as a move by the Chinese government to tighten its grip on the city.

Known as a staunch Beijing supporter, Mr Lee oversaw the sometimes violent crackdowns on pro-democracy protestors in 2019.

Mr Lee replaces outgoing chief executive Carrie Lam, who had served since 2017.""")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title1 = view.findViewById<TextView>(R.id.header1)
        val title2 = view.findViewById<TextView>(R.id.header2)
        val title3 = view.findViewById<TextView>(R.id.header3)
        val title4 = view.findViewById<TextView>(R.id.header4)
        val title5 = view.findViewById<TextView>(R.id.header5)
        val title6 = view.findViewById<TextView>(R.id.header6)

        title1.text = header1.title
        title1.setOnClickListener {
            title1.setTypeface(null, Typeface.BOLD)
            title2.setTypeface(null, Typeface.NORMAL)
            title3.setTypeface(null, Typeface.NORMAL)
            title4.setTypeface(null, Typeface.NORMAL)
            title5.setTypeface(null, Typeface.NORMAL)
            title6.setTypeface(null, Typeface.NORMAL)
            parentFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fragment2Container,
                    FragmentDetail.newInstance(header1),
                    "FragmentDetail"
                )
                .addToBackStack(null)
                .commit()
        }

        title2.text = header2.title
        title2.setOnClickListener {
            title2.setTypeface(null, Typeface.BOLD)
            title1.setTypeface(null, Typeface.NORMAL)
            title3.setTypeface(null, Typeface.NORMAL)
            title4.setTypeface(null, Typeface.NORMAL)
            title5.setTypeface(null, Typeface.NORMAL)
            title6.setTypeface(null, Typeface.NORMAL)
            parentFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fragment2Container,
                    FragmentDetail.newInstance(header2),
                    "FragmentDetail"
                )
                .addToBackStack(null)
                .commit()
        }

        title3.text = header3.title
        title3.setOnClickListener {
            title3.setTypeface(null, Typeface.BOLD)
            title1.setTypeface(null, Typeface.NORMAL)
            title2.setTypeface(null, Typeface.NORMAL)
            title4.setTypeface(null, Typeface.NORMAL)
            title5.setTypeface(null, Typeface.NORMAL)
            title6.setTypeface(null, Typeface.NORMAL)
            parentFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fragment2Container,
                    FragmentDetail.newInstance(header3),
                    "FragmentDetail"
                )
                .addToBackStack(null)
                .commit()
        }

        title4.text = header4.title
        title4.setOnClickListener {
            title4.setTypeface(null, Typeface.BOLD)
            title1.setTypeface(null, Typeface.NORMAL)
            title2.setTypeface(null, Typeface.NORMAL)
            title3.setTypeface(null, Typeface.NORMAL)
            title5.setTypeface(null, Typeface.NORMAL)
            title6.setTypeface(null, Typeface.NORMAL)
            parentFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fragment2Container,
                    FragmentDetail.newInstance(header4),
                    "FragmentDetail"
                )
                .addToBackStack(null)
                .commit()
        }

        title5.text = header5.title
        title5.setOnClickListener {
            title5.setTypeface(null, Typeface.BOLD)
            title1.setTypeface(null, Typeface.NORMAL)
            title2.setTypeface(null, Typeface.NORMAL)
            title3.setTypeface(null, Typeface.NORMAL)
            title4.setTypeface(null, Typeface.NORMAL)
            title6.setTypeface(null, Typeface.NORMAL)
            parentFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fragment2Container,
                    FragmentDetail.newInstance(header5),
                    "FragmentDetail"
                )
                .addToBackStack(null)
                .commit()
        }

        title6.text = header6.title
        title6.setOnClickListener {
            title6.setTypeface(null, Typeface.BOLD)
            title1.setTypeface(null, Typeface.NORMAL)
            title2.setTypeface(null, Typeface.NORMAL)
            title3.setTypeface(null, Typeface.NORMAL)
            title4.setTypeface(null, Typeface.NORMAL)
            title5.setTypeface(null, Typeface.NORMAL)
            parentFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fragment2Container,
                    FragmentDetail.newInstance(header6),
                    "FragmentDetail"
                )
                .addToBackStack(null)
                .commit()
        }
    }
}