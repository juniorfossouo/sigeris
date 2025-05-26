package cm.sigeris.sigeris1

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Decision : AppCompatActivity() {
    private lateinit var txt_nb1 : EditText;
    private lateinit var txt_nb2 : EditText;
    private lateinit var txt_resultat : TextView;
    private lateinit var cb_add : CheckBox;
    private lateinit var cb_moins : CheckBox;
    private lateinit var cb_div : CheckBox;
    private lateinit var cb_mult : CheckBox;
    private lateinit var cb_modulo : CheckBox;
    private lateinit var cb_puissance : CheckBox;
    private lateinit var btn_calculer : Button;
    private lateinit var btn_reset : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_decision)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txt_nb1 = findViewById(R.id.txt_nb1)
        txt_nb2 = findViewById(R.id.txt_nb2)
        txt_resultat = findViewById(R.id.txt_resultat)
        cb_add = findViewById(R.id.cb_add)
        cb_moins = findViewById(R.id.cb_moins)
        cb_div = findViewById(R.id.cb_div)
        cb_mult = findViewById(R.id.cb_mult)
        cb_modulo = findViewById(R.id.cb_modulo)
        cb_puissance = findViewById(R.id.cb_puissance)
        btn_calculer = findViewById(R.id.btn_calculer)
        btn_reset = findViewById(R.id.btn_reset)
        cb_add.setOnClickListener {
            cb_moins.isChecked = false;
            cb_div.isChecked = false;
            cb_mult.isChecked = false;
            cb_modulo.isChecked = false;
            cb_puissance.isChecked = false;
        }
        cb_moins.setOnClickListener {
            cb_add.isChecked = false;
            cb_div.isChecked = false;
            cb_mult.isChecked = false;
            cb_modulo.isChecked = false;
            cb_puissance.isChecked = false;
        }
        cb_div.setOnClickListener {
            cb_add.isChecked = false;
            cb_moins.isChecked = false;
            cb_mult.isChecked = false;
            cb_modulo.isChecked = false;
            cb_puissance.isChecked = false;
        }
        cb_mult.setOnClickListener {
            cb_add.isChecked = false;
            cb_moins.isChecked = false;
            cb_div.isChecked = false;
            cb_modulo.isChecked = false;
            cb_puissance.isChecked = false;
        }
        cb_modulo.setOnClickListener {
            cb_add.isChecked = false;
            cb_moins.isChecked = false;
            cb_div.isChecked = false;
            cb_mult.isChecked = false;
            cb_puissance.isChecked = false;
        }
        cb_puissance.setOnClickListener {
            cb_add.isChecked = false;
            cb_moins.isChecked = false;
            cb_div.isChecked = false;
            cb_mult.isChecked = false;
            cb_modulo.isChecked = false;
        }

        btn_calculer.setOnClickListener {
            if (cb_add.isChecked) {
                txt_resultat.setText(
                    (txt_nb1.text.toString().toInt() + txt_nb2.text.toString().toInt()).toString()
                )
//                Toast.makeText(this, "${ txt_nb1.text.toString().toInt() } ${ txt_nb2.text.toString().toInt() }", Toast.LENGTH_SHORT).show()
            }
            if (cb_moins.isChecked) {
                txt_resultat.setText(
                    (txt_nb1.text.toString().toInt() - txt_nb2.text.toString().toInt()).toString()
                )
            }
            if (cb_div.isChecked) {
                txt_resultat.setText(
                    (txt_nb1.text.toString().toInt() / txt_nb2.text.toString().toInt()).toString()
                )
            }
            if (cb_mult.isChecked) {
                txt_resultat.setText(
                    (txt_nb1.text.toString().toInt() * txt_nb2.text.toString().toInt()).toString()
                )
            }
            if (cb_modulo.isChecked) {
                txt_resultat.setText(
                    (txt_nb1.text.toString().toInt() % txt_nb2.text.toString().toInt()).toString()
                )
            }
            if (cb_puissance.isChecked) {
                val result =
                    Math.pow(txt_nb1.text.toString().toDouble(), txt_nb2.text.toString().toDouble())
                txt_resultat.setText(result.toString())
            }
            btn_reset.setOnClickListener {
                txt_nb1.text.clear()
                txt_nb2.text.clear()
                txt_resultat.text = "0"
            }

        }
    }
}