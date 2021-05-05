package com.example.kpv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_thursday.*

//Lists of time and event values
val thursTimesStr = listOf(
        "3:00pm",
        "6:00pm",
        "6:30pm - 9:15pm")
val thursEventsStr = listOf(
        "Registration opens",
        "Auditorium opens",
        "Session 1:\n" + "BOB HAZLETT"
)


class ThursdayFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_thursday, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Lists of time and event views
        val thursTimes = listOf(
                thursTime1,
                thursTime2,
                thursTime3,
                thursTime4,
                thursTime5,
                thursTime6,
                thursTime7,
                thursTime8,
                thursTime9,
                thursTime10,
                thursTime11,
                thursTime12
        )
        val thursEvents = listOf(
                thursEvent1,
                thursEvent2,
                thursEvent3,
                thursEvent4,
                thursEvent5,
                thursEvent6,
                thursEvent7,
                thursEvent8,
                thursEvent9,
                thursEvent10,
                thursEvent11,
                thursEvent12
        )

        for (i in thursTimes.indices){
            if (i < thursTimesStr.size) {
                thursTimes[i].text = thursTimesStr[i]
                thursEvents[i].text = thursEventsStr[i]
            }
            else {
                thursTimes[i].text = ""
                thursEvents[i].text = ""
            }
        }
    }
}