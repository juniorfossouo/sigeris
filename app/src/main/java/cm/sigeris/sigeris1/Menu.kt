package cm.sigeris.sigeris1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    private lateinit var btn_exo1 : Button;
    private lateinit var btn_exo2 : Button;
    private lateinit var btn_decision : Button;
    private lateinit var btn_boucle : Button;
    private lateinit var btn_fruits : Button;
    private lateinit var btn_devinette : Button;
    private lateinit var btn_nbr : Button;
    private lateinit var btn_fonction : Button;
    private lateinit var btn_compteur : Button;
    private lateinit var btn_convertisseur : Button;
    private lateinit var btn_jeux : Button;
    private lateinit var btn_conversation : Button;
    private lateinit var btn_calculatrice : Button;
    private lateinit var btn_SharedPreferences : Button;
    private lateinit var btn_login : Button;
    private lateinit var btn_roomdatabase : Button;
    private lateinit var btn_smsapp : Button;
    private lateinit var btn_shimmer : Button;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn_exo1 = findViewById(R.id.btn_exo1);
        btn_exo2 = findViewById(R.id.btn_exo2);
        btn_decision = findViewById(R.id.btn_decision);
        btn_boucle = findViewById(R.id.btn_boucle);
        btn_fruits = findViewById(R.id.btn_fruits);
        btn_devinette = findViewById(R.id.btn_devinette);
        btn_nbr = findViewById(R.id.btn_nbr);
        btn_fonction = findViewById(R.id.btn_fonction);
        btn_compteur = findViewById(R.id.btn_compteur);
        btn_convertisseur = findViewById(R.id.btn_convertisseur);
        btn_jeux = findViewById(R.id.btn_jeux);
        btn_conversation = findViewById(R.id.btn_conversation);
        btn_calculatrice = findViewById(R.id.btn_calculatrice);
        btn_SharedPreferences =findViewById(R.id.btn_SharedPreferences);
        btn_login =findViewById(R.id.btn_login);
        btn_smsapp =findViewById(/* id = */ R.id.btn_smsapp);
        btn_roomdatabase =findViewById(R.id.btn_roomdatabase);
        btn_shimmer =findViewById(R.id.btn_shimmer)
        btn_exo1.setOnClickListener {
            var exo1 = Intent(this, MainActivity::class.java);
            startActivity(exo1);
        }
        btn_exo2.setOnClickListener{
            var exo2 = Intent(this, Exo2::class.java);
            startActivity(exo2);
        }
       btn_decision.setOnClickListener {
           var decision =Intent (this, Decision::class.java)
           startActivity(decision)
       }
        btn_boucle.setOnClickListener {
           var boucle =Intent (this, boucle::class.java)
           startActivity(boucle)
       }
        btn_fruits.setOnClickListener {
            var fruits = Intent (this, Fruit::class.java)
            startActivity(fruits)
        }
        btn_devinette.setOnClickListener {
            var devinettes = Intent(this, devinettes::class.java)
            startActivity(devinettes)
        }
        btn_nbr.setOnClickListener {
            var nbr = Intent(this,nbr_suivent::class.java)
            startActivity(nbr)
        }
        btn_fonction.setOnClickListener {
            var fonction = Intent(this,Fonction::class.java)
            startActivity(fonction)
        }
        btn_compteur.setOnClickListener {
            var fonction = Intent(this,Compteur::class.java)
            startActivity(fonction)
        }
        btn_convertisseur.setOnClickListener {
            var fonction = Intent(this,Convertisseur::class.java)
            startActivity(fonction)
        }
        btn_jeux.setOnClickListener {
            var fonction = Intent(this,Jeux::class.java)
            startActivity(fonction)
        }
        btn_conversation.setOnClickListener {
            var fonction = Intent(this,Conversation::class.java)
            startActivity(fonction)
        }
        btn_calculatrice.setOnClickListener {
            var fonction = Intent(this,Calculatrice::class.java)
            startActivity(fonction)
        }
        btn_SharedPreferences.setOnClickListener {
            var fonction = Intent(this, SharesPreferences::class.java)
            startActivity(fonction)
        }
        btn_login.setOnClickListener {
            var fonction = Intent(this, Login::class.java)
            startActivity(fonction)
        }
        btn_roomdatabase.setOnClickListener {
            var fonction = Intent(this, RoomDataBase::class.java)
            startActivity(fonction)
        }
        btn_smsapp.setOnClickListener {
            var fonction = Intent(this, Sms_app::class.java)
            startActivity(fonction)
        }
        btn_shimmer.setOnClickListener {
            var fonction = Intent(this, Sms_app::class.java)
            startActivity(fonction)
        }
    }
}