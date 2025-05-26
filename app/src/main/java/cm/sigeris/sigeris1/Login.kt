package cm.sigeris.sigeris1

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cm.sigeris.sigeris1.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val sharedPref = getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnLog.setOnClickListener {
            val user = "admin"
            val pass = "admin"

            val inputUser = binding.edtUsername.text.toString().trim()
            val inputPass = binding.edtPassword.text.toString().trim()

            if (inputUser.isEmpty() || inputPass.isEmpty()) {
                Toast.makeText(
                    this@Login,
                    "Bien vouloir remplir tous les champs",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                if (inputUser == user && inputPass == pass) {
                    val intent = Intent(this@Login, Menu::class.java)
                    val editor = sharedPref.edit()
                    editor.putString("username", inputUser)
                    editor.putString("password", inputPass)
                    editor.putBoolean("est_connecte", true)
                    editor.apply()
                    startActivity(intent)
                } else {
                    Toast.makeText(this@Login, "Identifiant ou mot de passe invalide", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}