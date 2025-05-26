package cm.sigeris.sigeris1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class boucle : AppCompatActivity() {
    private lateinit var txt_debut : EditText;
    private lateinit var txt_fin : EditText;
    private lateinit var txt_resultat : TextView;
    private lateinit var btn_afficher : Button;
    private lateinit var btn_afficherwhile : Button;
    private lateinit var btn_afficherdowhile : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_boucle)
        txt_debut = findViewById(R.id.txt_debut)
        txt_fin = findViewById(R.id.txt_fin)
        txt_resultat = findViewById(R.id.txt_resultat)
        btn_afficher = findViewById(R.id.btn_afficher)
        btn_afficherwhile = findViewById(R.id.btn_afficherwhile)
        btn_afficherdowhile = findViewById(R.id.btn_afficherdowhile)
        btn_afficher.setOnClickListener {
            txt_resultat.text = null
            val debut = txt_debut.text.toString().toInt()
            val fin = txt_fin.text.toString().toInt()
            val i = 0
            //txt_resultat.text = "$debut , $fin"
            for (i in debut..fin) {
                txt_resultat.text = "${txt_resultat.text.toString()} ,$i"
                // txt_resultat.text ="$0"
            }
        }

        btn_afficherwhile.setOnClickListener {
            txt_resultat.text = ""
            val debut = txt_debut.text.toString().toInt()
            val fin = txt_fin.text.toString().toInt()
            var i = debut
            while (i <= fin) {
                txt_resultat.text = "${txt_resultat.text.toString()},$i"
                i++
            }
        }
        btn_afficherdowhile.setOnClickListener {
            txt_resultat.text =""
            val debut = txt_debut.text.toString().toInt()
            val fin = txt_fin.text.toString().toInt()
            var i = debut
            do{
                txt_resultat.text = "${txt_resultat.text.toString()},$i"
                i++
            } while (i <= fin)
        }
     }
    }
