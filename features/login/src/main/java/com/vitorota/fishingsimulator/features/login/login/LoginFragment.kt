package com.vitorota.fishingsimulator.features.login.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vitorota.fishingsimulator.features.login.R

/**
 *
 * @author Vitor Ota
 * @since 15/05/2019
 */
internal class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
}