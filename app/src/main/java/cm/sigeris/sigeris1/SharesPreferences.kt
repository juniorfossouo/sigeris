package cm.sigeris.sigeris1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cm.sigeris.sigeris1.databinding.ActivitySharesPreferencesBinding

class SharesPreferences : AppCompatActivity() {

    private lateinit var binding: ActivitySharesPreferencesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySharesPreferencesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
            val editor = sharedPref.edit()
            binding.btnSave.setOnClickListener {
                val userId = binding.edtEnterid.text.toString()
                val name = binding.edtEnterName.text.toString()
                editor.apply {
                    putString("userId", userId)
                    putString("name", name)
                    apply()
                }
            }
            binding.btnView.setOnClickListener {
                val userId = sharedPref.getString("userId", null)    
                val name = sharedPref.getString("name", null)
                binding.txtId.text = userId
                binding.txtName.text = name
            }
            binding.btnClear.setOnClickListener {
                binding.txtId.text = null
                binding.txtName.text = null
                editor.clear()
                editor.apply()
            }
        }
    }
