package com.vitorota.fishingsimulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vitorota.fishingsimulator.libraries.actions.Actions

/**
 *
 * @author Vitor Ota
 * @since 14/05/2019
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Actions.openLoginIntent(this))
    }
}