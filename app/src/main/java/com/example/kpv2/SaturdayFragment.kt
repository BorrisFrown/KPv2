package com.example.kpv2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_saturday.*

//Lists of time and event values
val satTimesStr = listOf(
        "8:00am",
        "8:30am",
        "9:00am - 10:45am",
        "11:00am - 12:00pm",
        "12:00am - 2:00pm",
        "1:30pm",
        "2:00pm - 3:00pm",
        "3:15pm - 4:15pm",
        "4:15pm - 6:30pm",
        "5:30pm",
        "6:00pm",
        "6:30pm - 9:00pm"
)
val satEventsStr = listOf(
        "Atrium opens",
        "Auditorium opens",
        "Session 5:\n" + "PUTTY PUTMAN",
        "Session 6:\n" + "CLAY HARRINGTON",
        "Lunch Break",
        "Atrium opens",
        "Breakout 1",
        "Breakout 2",
        "Dinner Break",
        "Atrium opens",
        "Auditorium opens",
        "Session 7:\n" + "PUTTY PUTMAN"
)

class SaturdayFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_saturday, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Lists of time and event views
        val satTimes = listOf(
                satTime1,
                satTime2,
                satTime3,
                satTime4,
                satTime5,
                satTime6,
                satTime7,
                satTime8,
                satTime9,
                satTime10,
                satTime11,
                satTime12
        )
        val satEvents = listOf(
                satEvent1,
                satEvent2,
                satEvent3,
                satEvent4,
                satEvent5,
                satEvent6,
                satEvent7,
                satEvent8,
                satEvent9,
                satEvent10,
                satEvent11,
                satEvent12
        )

        for (i in satTimes.indices){
            if (i < satTimesStr.size) {
                satTimes[i].text = satTimesStr[i]
                satEvents[i].text = satEventsStr[i]
            }
            else {
                satTimes[i].text = ""
                satEvents[i].text = ""
            }
        }
    }
}