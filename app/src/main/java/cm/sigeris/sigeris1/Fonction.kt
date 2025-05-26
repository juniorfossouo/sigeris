package cm.sigeris.sigeris1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Fonction : AppCompatActivity() {
    private lateinit var txt_nom : EditText;
    private lateinit var txt_niveau : EditText;
    private lateinit var txt_matricule : EditText;
    private lateinit var txt_resul : TextView;
    private lateinit var btn_ok : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fonction)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txt_nom = findViewById(R.id.txt_nom);
        txt_niveau = findViewById(R.id.txt_niveau);
        txt_matricule = findViewById(R.id.txt_matricule);
        txt_resul = findViewById(R.id.txt_resul);
        btn_ok = findViewById(R.id.btn_ok)
        btn_ok.setOnClickListener {
//            txt_resul.text = null
            val nom = txt_nom.text.toString()
            val niveaustring = txt_niveau.text.toString()
            val matriculestring = txt_matricule.text.toString()
                  val niveau = niveaustring.toInt()
                  val matricule = matriculestring.toInt()
                  val result = main(nom, niveau, matricule)
            txt_resul.text = result
        }
    }

    private fun main(nom: String, niveau: Int, matricule: Int): String {
        return "Nom: $nom , Niveau: $niveau ,Matricule: $matricule"

    }
}