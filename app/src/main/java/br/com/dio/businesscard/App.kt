package br.com.dio.businesscard

import android.app.Application

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this)}
}