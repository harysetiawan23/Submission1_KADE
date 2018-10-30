package com.example.harry.submission1_kade

import android.app.Activity
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import kotlinx.android.synthetic.main.activity_second.*
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val intent = intent
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val crestUrl = intent.getStringExtra("crestURL")
        val area = intent.getStringExtra("area")
        val venue = intent.getStringExtra("venue")


        club_name.text = name
        club_email_nation.text = "${email} - ${area}"
        club_home.text = venue


        club_crest.let{
            GlideToVectorYou
                    .init()
                    .with(ctx as Activity?)
                    .load(Uri.parse(crestUrl), club_crest)
        }

    }


}
