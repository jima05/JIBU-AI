package com.majibu.chatai.data.repository

import android.app.Application
import android.content.SharedPreferences
import com.majibu.chatai.common.Constants
import com.majibu.chatai.common.Constants.Preferences.FREE_MESSAGE_COUNT_DEFAULT
import com.majibu.chatai.domain.repository.PreferenceRepository
import java.util.*
import javax.inject.Inject

class PreferenceRepositoryImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences,
    private val app: Application
) : PreferenceRepository {
    override fun setDarkMode(isDarkMode: Boolean) {
        sharedPreferences.edit().putBoolean(Constants.Preferences.DARK_MODE, isDarkMode).apply()
    }

    override fun getDarkMode(): Boolean {
        return sharedPreferences.getBoolean(
            Constants.Preferences.DARK_MODE,
            true
        )
    }


    override fun setCurrentLanguage(language: String) {
        sharedPreferences.edit().putString(Constants.Preferences.LANGUAGE_NAME, language).apply()
    }

    override fun getCurrentLanguage(): String =
        sharedPreferences.getString(
            Constants.Preferences.LANGUAGE_NAME,
            Locale.getDefault().displayLanguage
        ) ?: Locale.getDefault().displayLanguage

    override fun setCurrentLanguageCode(language: String) {
        sharedPreferences.edit().putString(Constants.Preferences.LANGUAGE_CODE, language).apply()
    }

    override fun getCurrentLanguageCode(): String =
        sharedPreferences.getString(
            Constants.Preferences.LANGUAGE_CODE,
            Locale.getDefault().language
        ) ?: Locale.getDefault().language

    override fun isProVersion(): Boolean =
        sharedPreferences.getBoolean(
            Constants.Preferences.PRO_VERSION,
            false
        )


    override fun setProVersion(isProVersion: Boolean) {
        sharedPreferences.edit().putBoolean(Constants.Preferences.PRO_VERSION, isProVersion)
            .apply()
    }

    override fun isFirstTime(): Boolean =
        sharedPreferences.getBoolean(
            Constants.Preferences.FIRST_TIME,
            true
        )

    override fun setFirstTime(isFirstTime: Boolean) {
        sharedPreferences.edit().putBoolean(Constants.Preferences.FIRST_TIME, isFirstTime)
            .apply()
    }

    override fun getFreeMessageCount(): Int {
        // Get the saved free message count and last checked time from SharedPreferences.
        val savedCount = sharedPreferences.getInt(
            Constants.Preferences.FREE_MESSAGE_COUNT,
            FREE_MESSAGE_COUNT_DEFAULT
        )

        return savedCount
    }


    override fun setFreeMessageCount(count: Int) {
        sharedPreferences.edit().putInt(Constants.Preferences.FREE_MESSAGE_COUNT, count)
            .apply()
    }

}