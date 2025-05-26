package cm.sigeris.sigeris1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Jeux : AppCompatActivity() {
    private lateinit var img_1 : ImageView;
    private lateinit var img_2 : ImageView;
    private lateinit var img_3 : ImageView;
    private lateinit var img_4 : ImageView;
    private lateinit var img_5 : ImageView;
    private lateinit var img_6 : ImageView;
    private lateinit var btn_jouer : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_jeux)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        img_1 = findViewById(R.id.img_1);
        img_2 = findViewById(R.id.img_2);
        img_3 = findViewById(R.id.img_3);
        img_4 = findViewById(R.id.img_4);
        img_5 = findViewById(R.id.img_5);
        img_6 = findViewById(R.id.img_6);
        btn_jouer = findViewById(R.id.btn_jouer)
        btn_jouer.setOnClickListener {
            val random =(1..6).random()
            when (random){
                1 -> img_1.setImageResource(R.drawable.one)
                2 -> img_1.setImageResource(R.drawable.two)
                3 -> img_1.setImageResource(R.drawable.three)
                4 -> img_1.setImageResource(R.drawable.four)
                5 -> img_1.setImageResource(R.drawable.five)
                6 -> img_1.setImageResource(R.drawable.six)
            }
        }
    }
}