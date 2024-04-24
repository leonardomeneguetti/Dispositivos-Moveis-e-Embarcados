package br.edu.ifsp.arq.ads.dmos5.ifitness

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.Observer
import br.edu.ifsp.arq.ads.dmos5.ifitness.viewmodel.UserViewModel
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView
    lateinit var txtTitle: TextView
    lateinit var txtLogin: TextView

    private val userViewModel by viewModels<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setToolbar()
        setDrawerLayout()
        setNavigationView()
        setTextLogin()
    }

    private fun setTextLogin() {
        txtLogin = navigationView.getHeaderView(0)
            .findViewById(R.id.header_profile_name)
        txtLogin.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                LoginActivity::class.java
            )
            startActivity(intent)
        }
    }

    private fun setNavigationView() {
        navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener { item ->
            var intent: Intent?
            when (item.itemId) {
                R.id.nav_home -> {
                    intent = Intent(this@MainActivity, MainActivity::class.java)
                    startActivity(intent)
                }

                R.id.nav_account -> {
                    intent = Intent(
                        this@MainActivity,
                        UserProfileActivity::class.java
                    )
                    startActivity(intent)
                }

                R.id.nav_activity -> {
                    intent = Intent(
                        this@MainActivity,
                        ActivityRegisterActivity::class.java
                    )
                    startActivity(intent)
                }

                R.id.nav_ranking -> Toast.makeText(
                    this@MainActivity,
                    "Classificação",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.nav_statistics -> Toast.makeText(
                    this@MainActivity,
                    "Estatísticas",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.nav_logout -> {
                    userViewModel.logout()
                    txtLogin.setText(R.string.enter)
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }

    private fun setDrawerLayout() {
        drawerLayout = findViewById(R.id.nav_drawer_layout)
        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.toggle_open,
            R.string.toggle_close
        )
        drawerLayout.addDrawerListener(toggle)

        toggle.syncState()
    }

    private fun setToolbar() {
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        txtTitle = findViewById<TextView>(R.id.toolbar_title)
        txtTitle.text = getString(R.string.app_name)
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onResume() {
        super.onResume()

        userViewModel.isLogged().observe(this, Observer {
            it?.let {
                txtLogin.text = "${it.name} ${it.surname}"
            }
        })
    }
}