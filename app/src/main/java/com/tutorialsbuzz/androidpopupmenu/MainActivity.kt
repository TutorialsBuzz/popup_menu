package com.tutorialsbuzz.androidpopupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener({ view ->
            showPopupMenu()
        })

    }


    private fun showPopupMenu() {
        val popupMenu = PopupMenu(this, btn)
        popupMenu.inflate(R.menu.popup_menu)
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item: MenuItem ->

            when (item.itemId) {

                R.id.action_item2 -> {
                    Toast.makeText(this@MainActivity, "action item2 clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.action_item3 -> {
                    Toast.makeText(this@MainActivity, "action item3 clicked", Toast.LENGTH_SHORT).show()
                }

                R.id.action_item4 -> {
                    Toast.makeText(this@MainActivity, "action item4 clicked", Toast.LENGTH_SHORT).show()
                }

                R.id.action_sub_item1 -> {
                    Toast.makeText(this@MainActivity, "action subitem1 clicked", Toast.LENGTH_SHORT).show()
                }

                R.id.action_sub_item2 -> {
                    Toast.makeText(this@MainActivity, "action subitem2 clicked", Toast.LENGTH_SHORT).show()
                }

            }

            true
        })

    }


}
