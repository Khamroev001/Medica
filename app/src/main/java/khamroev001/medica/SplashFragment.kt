package khamroev001.medica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import khamroev001.medica.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
     lateinit var binding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSplashBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }


}