package cm.sigeris.sigeris1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cm.sigeris.sigeris1.databinding.ActivityCalculatriceBinding

class Calculatrice : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatriceBinding
    var nbre1: Int = 0;
    var nbre2: Int = 0;
    var add: Boolean = false
    var sub: Boolean = false
    var mult: Boolean = false
    var divi: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCalculatriceBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //setContentView(R.layout.activity_calculatrice)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btn0.setOnClickListener {
            binding.txtResultat.text = "0"
        }
        binding.btn1.setOnClickListener {
            binding.txtResultat.text = "1"
        }
        binding.btn2.setOnClickListener {
            binding.txtResultat.text = "2"
        }
        binding.btn3.setOnClickListener {
            binding.txtResultat.text = "3"
        }
        binding.btn4.setOnClickListener {
            binding.txtResultat.text = "4"
        }
        binding.btn5.setOnClickListener {
            binding.txtResultat.text = "5"
        }
        binding.btn6.setOnClickListener {
            binding.txtResultat.text = "6"
        }
        binding.btn7.setOnClickListener {
            binding.txtResultat.text = "7"
        }
        binding.btn8.setOnClickListener {
            binding.txtResultat.text = "8"
        }
        binding.btn9.setOnClickListener {
            binding.txtResultat.text = "9"
        }
        binding.btnCLR.setOnClickListener {
            nbre1 = 0
            nbre2 = 0
            binding.txtResultat.text = null
        }
            binding.btnPlus.setOnClickListener {
                nbre1 = binding.txtResultat.text.toString().toIntOrNull() ?:0
                add = true
                binding.txtResultat.text = null
            }

            binding.btnEgal.setOnClickListener {
            if (add||divi||mult||sub){
                nbre2 = binding.txtResultat.text.toString().toIntOrNull() ?:0
            }
                if (add){
                    binding.txtResultat.setText((nbre1+nbre2).toString())
                    add = false
                }
                if (mult){
                    binding.txtResultat.setText((nbre1*nbre2).toString())
                }
                if (sub){
                    binding.txtResultat.setText((nbre1-nbre2).toString())
                    sub = false
                }
                if (divi){
                    if (nbre2 !=0){
                        binding.txtResultat.setText((nbre1/nbre2).toString())
                        divi = false
                    } else{
                        binding.txtResultat.setText("error")
                        divi = false
                    }
                }
            }
            binding.btnDiv.setOnClickListener {
                nbre1 = binding.txtResultat.text.toString().toIntOrNull() ?:0
                divi= true
                binding.txtResultat.text = null
            }
            binding.btnMult.setOnClickListener {
                nbre1 = binding.txtResultat.text.toString().toIntOrNull() ?:0
                mult = true
                binding.txtResultat.text = null
            }
            binding.btnSoust.setOnClickListener {
                nbre1 = binding.txtResultat.text.toString().toIntOrNull() ?:0
                sub = true
                binding.txtResultat.text = null
            }
//        fun operationsNombre(btn : view) {
//            val button : Button = btn as Button
//            binding.txtResultat.append(button.text)
//        }
//        val sharedPref =getSharedPreferences("myPref", MODE_PRIVATE)
//        val editor = sharedPref.edit()
//        binding.apply {
//            btnSave.setOnClickListener{
//                val userId = edtEnterid.text.toString()
//                val name = edtEnterName.text.toString()
//                editor.apply {
//                    putString("userId",userId)
//                    putString("name",name)
//                    apply()
//                }
//            }
//            btnView.setOnClickListener {
//                val userId = sharedPref.getString("user-id" , null)
//                val name = sharedPref.getString("name", null)
//                txtId.text = userId
//                txtName.text = name
//            }
//            btnClear.setOnClickListener {
//                txtId.text =null
//                txtName.text = null
//                editor.clear()
//                editor.apply()
//            }
//        }
    }

}

