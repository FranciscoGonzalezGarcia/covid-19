package com.example.covid_19

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_retro.*

class RetroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retro)

        btnRetro.setOnClickListener {
            if (radio_no.isChecked || radio_yes.isChecked)
                if (txtName.text.isNotEmpty())
                    AlertDialog.Builder(this).setTitle("Gracias por valorar esta App " + txtName.text.toString()).setPositiveButton("OK",
                        DialogInterface.OnClickListener { dialog, which ->
                            //botón OK pulsado
                        })
                        .show()
                else
                    Toast.makeText(this, getString(R.string.dialog_alert),Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, getString(R.string.dialog_alert),Toast.LENGTH_SHORT).show()

        }

        val actionbar = supportActionBar
        actionbar!!.title = getString(R.string.retro)
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
