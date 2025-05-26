package cm.sigeris.sigeris1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cm.sigeris.sigeris1.R.id.txt_msg

class Conversation : AppCompatActivity() {
    private lateinit var txt_tel : EditText;
    private lateinit var txt_msg : EditText;
    private lateinit var btn_appel : Button;
    private lateinit var btn_sms : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_conversation)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txt_tel = findViewById (R.id.txt_tel);
        txt_msg = findViewById(R.id.txt_msg);
        btn_appel = findViewById(R.id.btn_appel);
        btn_sms = findViewById(R.id.btn_sms);
        btn_appel.setOnClickListener {
            val phoneNumber = txt_tel.text.toString()
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:$phoneNumber")
            startActivity(dialIntent)
        }
        btn_sms.setOnClickListener{
            val phoneNumber = txt_tel.text.toString()
            val message = txt_msg.text.toString()
            val smsIntent = Intent(Intent.ACTION_SENDTO)
            smsIntent.data = Uri.parse("smsto:$phoneNumber")
            smsIntent.putExtra("sms_body",message)
            smsIntent.putExtra(Intent.EXTRA_TEXT,message)
            startActivity(smsIntent)
        }
    }
}