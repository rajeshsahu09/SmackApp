package com.example.smackapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.navigation.NavigationView
import androidx.navigation.ui.AppBarConfiguration
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
    }

    fun onLoginClickNavHeader(view: View) {
        val loginIntent = Intent(this, LoginActivity::class.java) // explicit intent
        startActivity((loginIntent))
    }

    fun onChannelBtnNavHeader(view: View) {

    }

    fun onSendMsgBtnClick(view: View) {

    }
}