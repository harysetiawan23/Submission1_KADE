package com.example.harry.submission1_kade.Adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.*
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.harry.submission1_kade.Component.CompetitionItemUI
import com.example.harry.submission1_kade.Models.TeamList
import com.example.harry.submission1_kade.Models.TeamsItem
import com.example.harry.submission1_kade.SecondActivity
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.sdk25.coroutines.onClick


class CompetitionsAdapter(val competitonList: TeamList?, val context: Context)
    : RecyclerView.Adapter<CompetitionsAdapter.ViewHolder>() {

    var items = competitonList!!.teams

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(CompetitionItemUI().createView(AnkoContext.create(p0.context, p0)))
    }

    override fun getItemCount(): Int {
        return items!!.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val CompetitionsItem = items!![p1]
        p0.TeamName.text = CompetitionsItem!!.name
        p0.loadImage(context, CompetitionsItem.crestUrl)
        p0.TeamListItem.onClick {
            p0.gotoSecondActivity(CompetitionsItem)
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var TeamName: TextView
        var TeamBedge: ImageView
        var TeamListItem: LinearLayout


        init {
            TeamName = itemView.findViewById(CompetitionItemUI.TeamNameID)
            TeamListItem = itemView.findViewById(CompetitionItemUI.layoutID)
            TeamBedge = itemView.findViewById(CompetitionItemUI.TeamBedgeID)


        }


        fun loadImage(context: Context, url: String?) {
            GlideToVectorYou
                    .init()
                    .with(context as Activity?)
                    .load(Uri.parse(url), TeamBedge)

        }

        fun gotoSecondActivity(teams:TeamsItem){
            itemView.context.startActivity<SecondActivity>(
                    "name" to teams.name ,
                    "crestURL" to teams.crestUrl,
                    "email" to teams.email,
                    "area" to teams.area!!.name,
                    "venue" to teams.venue
            )
        }



    }


}

