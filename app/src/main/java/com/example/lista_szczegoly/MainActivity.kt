package com.example.lista_szczegoly

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ShareActionProvider
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.core.view.MenuItemCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity(), ListDetailsListFragment.Listener, NavigationView.OnNavigationItemSelectedListener {

    private var shareActionProvider: ShareActionProvider? = null
    private fun tabletView(id: Int) {
        val details = TrailsListDetailFragment()
        val ft = supportFragmentManager.beginTransaction()
        details.setTrailsId(id)
        ft.replace(R.id.fragment_container, details)
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        ft.addToBackStack(null)
        ft.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
        val toggle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.open_drawer,
            R.string.close_drawer
        )
        drawer.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        val fragmentManager = supportFragmentManager
        val fragmentContainer = findViewById<View>(R.id.fragment_container)
        if (fragmentContainer != null && HikingTrails.trails.isNotEmpty() && fragmentManager.backStackEntryCount == 0) {
            tabletView(0)
        }
        else {
            val fragment = ListDetailsListFragment()
            supportFragmentManager.beginTransaction().apply {
                add(R.id.content_frame, fragment)
                commit()
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        var fragment: Fragment? = null
        var intent: Intent? = null
        when (id) {
            R.id.drawer_list -> fragment = ListDetailsListFragment()
            R.id.drawer_gallery -> fragment = Tab1Fragment()
            R.id.drawer_sun-> fragment = SunsetFragment()
            // Add other cases as needed
            else -> fragment = ListDetailsListFragment()
        }

        if (fragment != null) {
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.content_frame, fragment)
            ft.commit()
        } else {
            startActivity(intent)
        }

        val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
        drawer.closeDrawer(GravityCompat.START)

        return true
    }

    override fun onBackPressed() {
        val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        val menuItem = menu.findItem(R.id.action_share)
        shareActionProvider = MenuItemCompat.getActionProvider(menuItem) as ShareActionProvider
        setShareActionIntent("Blablablablablla")

        return super.onCreateOptionsMenu(menu)
    }

    private fun setShareActionIntent(text: String) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, text)
        shareActionProvider?.setShareIntent(intent)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.list_details -> {
                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }


    override fun itemClicked(id: Int) {
        val fragmentContainer = findViewById<View>(R.id.fragment_container)
        if (fragmentContainer != null) {
            tabletView(id)
        } else {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_TRAILS_ID, id)
            startActivity(intent)
        }
    }

//    fun onClickDone(view: View) {
//        val text = "To jest prosty pasek snackbar."
//        val duration = Snackbar.LENGTH_SHORT
//        val snackbar = Snackbar.make(findViewById(R.id.coordinator), text, duration)
//        snackbar.setAction("Cofnij") {
//            val toast = Toast.makeText(this@MainActivity, "Cofnięto!", Toast.LENGTH_SHORT)
//            toast.show()
//        }
//        snackbar.show()
//    }
}