package com.example.kpv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_friday.*

//Lists of time and event values
val friTimesStr = listOf(
        "8:00am",
        "8:30am",
        "9:00am - 10:45am",
        "11:00am - 12:00pm",
        "12:15am - 1:30pm",
        "1:30pm",
        "2:00pm - 3:00pm",
        "3:15pm - 4:15pm",
        "4:15pm - 6:30pm",
        "5:30pm",
        "6:00pm",
        "6:30pm - 9:00pm"
)
val friEventsStr = listOf(
        "Atrium opens",
        "Auditorium opens",
        "Session 2:\n" + "BOB HAZLETT",
        "Session 3:\n" + "VAN COCHRANE",
        "Prophetic Panel Lunch",
        "Atrium opens",
        "Breakout 1",
        "Breakout 2",
        "Dinner Break",
        "Atrium opens",
        "Auditorium opens",
        "Session 4:\n" + "WENDY BACKLUND"
)

class FridayFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_friday, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Lists of time and event views
        val friTimes = listOf(
                friTime1,
                friTime2,
                friTime3,
                friTime4,
                friTime5,
                friTime6,
                friTime7,
                friTime8,
                friTime9,
                friTime10,
                friTime11,
                friTime12
        )
        val friEvents = listOf(
                friEvent1,
                friEvent2,
                friEvent3,
                friEvent4,
                friEvent5,
                friEvent6,
                friEvent7,
                friEvent8,
                friEvent9,
                friEvent10,
                friEvent11,
                friEvent12
        )

        for (i in friTimes.indices){
            if (i < friTimesStr.size) {
                friTimes[i].text = friTimesStr[i]
                friEvents[i].text = friEventsStr[i]
            }
            else {
                friTimes[i].text = ""
                friEvents[i].text = ""
            }
        }
    }
}