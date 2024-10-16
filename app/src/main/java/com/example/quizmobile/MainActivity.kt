package com.example.quizmobile

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.quizmobile.api.ApiService
import com.example.quizmobile.login.LoginResponse
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{
            val intent = Intent(this, FragmainActivity::class.java)
            startActivity(intent)
        }
    }
}

//            val username = "username"
//            val password = "password"

            // Inisialisasi Retrofit
//            val retrofit = Retrofit.Builder()
//                .baseUrl("http://10.0.2.2:8000/api/")
//                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
//                .build()


            // Membuat instance ApiService
//            val apiService = retrofit.create(ApiService::class.java)

            // Melakukan permintaan login
//            val call: Call<LoginResponse> = apiService.login(username, password)

//            call.enqueue(object : Callback<LoginResponse> {
//                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
//                    Log.d("Response", "Raw Response: ${response.raw().toString()}")
//                    if (response.isSuccessful) {
//                        val loginResponse: LoginResponse? = response.body()
//                        Log.d("Response", "Token: ${loginResponse?.token}")
//                        Log.e("Response", "Error: ${response.errorBody()?.string()}")

                        // Mendapatkan instance SharedPreferences
//                        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

                        // Menyimpan token ke SharedPreferences setelah login berhasil
//                        sharedPreferences.edit().putString("token", loginResponse?.token).apply()

                        // Mengambil token dari SharedPreferences
//                        val token = sharedPreferences.getString("token", "")

                        // Pindah ke activity selanjutnya (ganti dengan activity yang sesuai)
//                        val intent = Intent(this@MainActivity, FragmainActivity::class.java)
//                        startActivity(intent)
//                    } else {
                        // Tangani kesalahan saat respons tidak berhasil
//                        Log.e("Response", "Error: ${response.errorBody()?.string()}")
//                        Toast.makeText(this@MainActivity, "Login Gagal", Toast.LENGTH_SHORT).show()
//                    }
//                }

//                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    // Tangani kesalahan saat permintaan gagal
//                    Toast.makeText(this@MainActivity, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
//                }
//            })
