package cm.sigeris.sigeris1.appClient

import cm.sigeris.sigeris1.helpers.Constants
import cm.sigeris.sigeris1.helpers.SharedPrefs
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AppClientInstance {
    private lateinit var s: SharedPrefs
    private val interceptor : HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        this.level = HttpLoggingInterceptor.Level.BODY
    }
    private val client : OkHttpClient = OkHttpClient.Builder().apply {
        this.addInterceptor(interceptor)
        this.addNetworkInterceptor(interceptor)
    }.build()

    private  val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .baseUrl(Constants.BASE_URL)
        .build()
    val api: AppApi by lazy {
        retrofit.create(AppApi::class.java)
    }
}