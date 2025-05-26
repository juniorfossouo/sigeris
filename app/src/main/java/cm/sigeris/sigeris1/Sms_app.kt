package cm.sigeris.sigeris1

import android.os.Build
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cm.sigeris.sigeris1.databinding.ActivityCalculatriceBinding
import cm.sigeris.sigeris1.databinding.ActivitySmsAppBinding

class Sms_app : AppCompatActivity() {
    private lateinit var binding : ActivitySmsAppBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding =ActivitySmsAppBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnSend.setOnClickListener {
            try {
                val smsManager: SmsManager;
                smsManager = this.getSystemService(SmsManager::class.java)
                smsManager.sendTextMessage(binding.edtNumber.text.toString().trim(),null,binding.edtMessage.text.toString().trim(),null,null)
                Toast.makeText(this@Sms_app,"message sent",Toast.LENGTH_LONG).show()
            }catch (e : Exception){
                Toast.makeText(this@Sms_app,"pleace enter all the data..."+e.message.toString(),
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}