package cm.sigeris.sigeris1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cm.sigeris.sigeris1.databinding.ActivitySharesPreferencesBinding
import cm.sigeris.sigeris1.databinding.ActivityShimmerBinding

class Shimmer : AppCompatActivity() {
    private lateinit var binding : ActivityShimmerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityShimmerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        setContentView(R.layout.activity_shimmer)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnStart.setOnClickListener {
            binding.shimmerViewContainer.showShimmer(true)
            binding.shimmerViewContainer.startShimmer()
        }
        binding.btnStop.setOnClickListener {
            binding.shimmerViewContainer.stopShimmer()
            binding.shimmerViewContainer.hideShimmer()
        }
    }
}


