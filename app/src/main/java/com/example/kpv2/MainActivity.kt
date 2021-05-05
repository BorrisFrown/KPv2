package com.example.kpv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_breakouts.*

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
val breakoutScheduleFragment = BreakoutScheduleFragment()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homefragment = homefragment()
        val speakersfragment = speakersfragment()
        val worshipfragment = worshipfragment()
        val schedulefragment = schedulefragment()
        val breakoutsfragment = breakoutsfragment()

        setCurrentFragment(homefragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    setCurrentFragment(homefragment)
                    title_text.setText("Home")
                }
                R.id.speakers -> {
                    setCurrentFragment(speakersfragment)
                    title_text.setText("Speakers")
                }
                R.id.worship -> {
                    setCurrentFragment(worshipfragment)
                    title_text.setText("Worship Leaders")
                }
                R.id.schedule -> {
                    setCurrentFragment(schedulefragment)
                    title_text.setText("Schedule")
                }
                R.id.breakouts -> {
                    setCurrentFragment(breakoutsfragment)
                    title_text.setText("Breakouts")
                }
            }
            true
        }
    }



    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
    private fun showDesc(view: View, string: String) {
        val intent = Intent(this, present_speaker::class.java).apply {
            putExtra(EXTRA_MESSAGE, string)
        }
        startActivity(intent)
    }

    fun showBreakoutSchedule(view: View) {
        breakoutScheduleFragment.show(supportFragmentManager, "BreakoutDialog")
    }

    
    fun showVanDesc(view: View) {
        showDesc(view, resources.getString(R.string.van_desc))
    }

    fun showBobDesc(view: View) {
        showDesc(view, resources.getString(R.string.bob_desc))
    }

    fun showPuttyDesc(view: View) {
        showDesc(view, resources.getString(R.string.putty_desc))
    }

    fun showWendyDesc(view: View) {
        showDesc(view, resources.getString(R.string.putty_desc))
    }

    fun showClayDesc(view: View) {
        showDesc(view, resources.getString(R.string.putty_desc))
    }
}