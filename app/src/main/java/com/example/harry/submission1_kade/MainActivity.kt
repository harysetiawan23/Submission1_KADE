package com.example.harry.submission1_kade

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import com.example.harry.submission1_kade.Adapter.CompetitionsAdapter
import com.example.harry.submission1_kade.Api.ApiService
import com.example.harry.submission1_kade.Api.EndPoint
import com.example.harry.submission1_kade.Models.CompetitionsList
import com.example.harry.submission1_kade.Models.TeamList
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)


    }


    class MainActivityUI : AnkoComponent<MainActivity> {


        override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
            val progressDialog = indeterminateProgressDialog("Please wait...")

            linearLayout {
                orientation = LinearLayout.VERTICAL


                val competitionRV = recyclerView()
                competitionRV.layoutManager = LinearLayoutManager(ui.ctx)

                progressDialog.show()


                val apiInterface: EndPoint = ApiService.create()
                val call: Call<TeamList> = apiInterface.getAllCompetitions()
                call.enqueue(object : Callback<TeamList> {
                    override fun onFailure(call: Call<TeamList>?, t: Throwable?) {
                        progressDialog.dismiss()
                        toast("Request Failure")
                    }

                    override fun onResponse(call: Call<TeamList>?, response: Response<TeamList>?) {
                        progressDialog.dismiss()
                        competitionRV.adapter = CompetitionsAdapter(response!!.body(), ui.ctx)
                        toast("Request Success")
                    }

                })

            }


        }

    }

}

