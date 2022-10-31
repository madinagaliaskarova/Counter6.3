package kg.geektech.mvvp53.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kg.geektech.mvvp53.databinding.ActivityMainBinding
import kg.geektech.mvvp53.ui.adapters.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewPagerAdapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = viewPagerAdapter
        binding.viewPager.offscreenPageLimit = 3
    }
}