package coding.withze.testingjunit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import coding.withze.testingjunit.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }





}