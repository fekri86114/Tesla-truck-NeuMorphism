package fekri.io

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import fekri.io.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* go to second activity when clicked on button */
        binding.btnGoToSecondActivity.setOnClickListener {
            startActivity(Intent(this@MainActivity, MainActivity2::class.java))
        }

    }
}