package cm.sigeris.sigeris1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bienvenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bienvenu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    window.setFlags(
        WindowManager. LayoutParams.FLAG_FULLSCREEN,
        WindowManager. LayoutParams.FLAG_FULLSCREEN

    )
        Handler().postDelayed({
        val login = Intent(this@Bienvenu, Login::class.java
               )
            startActivity(login)
            finish()
        },5000)
  }
}

