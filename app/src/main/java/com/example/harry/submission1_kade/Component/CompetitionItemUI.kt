package com.example.harry.submission1_kade.Component

import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import com.example.harry.submission1_kade.R
import org.jetbrains.anko.*

class CompetitionItemUI : AnkoComponent<ViewGroup> {
    companion object {
        val TeamNameID = 1
        val layoutID = 3
        val TeamBedgeID = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {

        verticalLayout {
            id = layoutID


            linearLayout {

                imageView {
                    id = TeamBedgeID
                    padding = dip(8)

                }.lparams(width = dip(80)) {
                    rightMargin = dip(2)
                    height = dip(80)
                }

                textView {
                    text = "Hello"
                    textColor = Color.BLACK
                    id = TeamNameID
                    padding = dip(10)
//                textSize = dip(16).toFloat()
                }.lparams(width = wrapContent) {
                    margin = dip(3)
                }
            }





            view {
                backgroundColor = Color.BLACK
            }.lparams(width = matchParent) {
                height = dip(1)
            }
        }
    }

}