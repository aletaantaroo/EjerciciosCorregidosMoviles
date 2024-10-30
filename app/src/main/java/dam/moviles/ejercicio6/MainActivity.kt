package dam.moviles.ejercicio6

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dam.moviles.ejercicio6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.inicializarEventos()
    }
    fun inicializarEventos(){
        binding.btnHola.setOnClickListener {
            Toast.makeText(this, binding.btnHola.text.toString(), Toast.LENGTH_LONG).show()
        }

        binding.btnAdios.setOnClickListener {
            Toast.makeText(this, binding.btnAdios.text.toString(), Toast.LENGTH_LONG).show()

        }
    }
}