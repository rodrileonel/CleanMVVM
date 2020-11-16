package com.appstuddio.cleanmvvm.features

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appstuddio.cleanmvvm.R
import com.appstuddio.cleanmvvm.core.platform.BaseActivity
import com.appstuddio.cleanmvvm.features.movies.MoviesFragment

class MainActivity : BaseActivity() {

    companion object {
        fun callingIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun showToolbar() = false

    override fun fragment() = MoviesFragment()
}