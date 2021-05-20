package com.example.miniscout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.match_input_activity.*

class MatchInputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.match_input_activity)
    }

    fun getTeamNumber() : String {
        return et_team_number.text.toString()
    }

    fun getMatchNumber() : String {
        return et_match_number.text.toString()
    }

    fun validateInput(vararg et : EditText) : Boolean {
        // return true or false based on if info
        for (e in et) {
            if (e.text.isEmpty()) {
                return false
            }
        }
        return true
    }

    fun startNextActivity(view : View) {
        if (validateInput(et_team_number, et_match_number)) {
            startActivity(Intent(this, ScoutingActivity::class.java))
        }
    }
}