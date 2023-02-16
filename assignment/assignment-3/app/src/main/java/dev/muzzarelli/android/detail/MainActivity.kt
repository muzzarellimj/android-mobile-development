package dev.muzzarelli.android.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.muzzarelli.android.detail.request.PokeApiClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokeApiClient = PokeApiClient()
        pokeApiClient.requestRepository(10, 0)
    }
}