package com.tuminh.kidfunny.data

import android.content.Context

class SharedPrefManager(private val context:Context) {
    private val sharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
    private val editor = sharedPreferences.edit()

    private val KEY_IMAGE_ID = "image_id"
    private val KEY_NICKNAME = "nickname"
    private val KEY_GENDER = "gender"
    private val KEY_BIRTH_DATE = "birth_date"
    private val KEY_FIRST_LAUNCH = "first_launch"

    fun isFirstLaunch(): Boolean {
        return sharedPreferences.getBoolean(KEY_FIRST_LAUNCH, true)
    }

    fun saveFirstLaunch(isFirstLaunch: Boolean) {
        editor.putBoolean(KEY_FIRST_LAUNCH, isFirstLaunch)
        editor.apply()
    }

    fun saveImageId(imageId: Int) {
        editor.putInt(KEY_IMAGE_ID, imageId)
        editor.apply()
    }

    fun getImageId(): Int? {
        return sharedPreferences.getInt(KEY_IMAGE_ID, -1)
    }

    fun saveNickname(nickname: String) {
        editor.putString(KEY_NICKNAME, nickname)
        editor.apply()
    }

    fun getNickname(): String? {
        return sharedPreferences.getString(KEY_NICKNAME, null)
    }

    fun saveGender(gender: Int) {
        editor.putInt(KEY_GENDER, gender)
        editor.apply()
    }

    fun getGender(): Int? {
        return sharedPreferences.getInt(KEY_GENDER, 0)
    }

    fun saveBirthDate(birthDate: String) {
        editor.putString(KEY_BIRTH_DATE, birthDate)
        editor.apply()
    }

    fun getBirthDate(): String? {
        return sharedPreferences.getString(KEY_BIRTH_DATE, null)
    }
}