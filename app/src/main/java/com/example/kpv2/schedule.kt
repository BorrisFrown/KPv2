package com.example.kpv2

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_schedule.*

class schedulefragment:Fragment(R.layout.fragment_schedule) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tabLayout = tab_layout
        val pager2 = schedule_pager
        pager2.isSaveEnabled = false
        val fm = childFragmentManager   //May cause issues
        val adapter = FragmentAdapter(fm, lifecycle)
        pager2.adapter = adapter


        tabLayout.addTab(tabLayout.newTab().setText("Thursday"))
        tabLayout.addTab(tabLayout.newTab().setText("Friday"))
        tabLayout.addTab(tabLayout.newTab().setText("Saturday"))

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    pager2.setCurrentItem(tab.position)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

        pager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })
    }

}