package com.vitorota.fishingsimulator.libraries.actions

import android.content.Context
import android.content.Intent


/**
 *
 * @author Vitor Ota
 * @since 20/05/2019
 */

object Actions {
    private const val prefix = "com.vitorota.fishingsimulator.features"

    fun openLoginIntent(context: Context) = internalIntent(context, "$prefix.login.open").apply {
        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NO_ANIMATION
    }

    fun internalIntent(context: Context, action: String) = Intent(action).setPackage(context.packageName)
}