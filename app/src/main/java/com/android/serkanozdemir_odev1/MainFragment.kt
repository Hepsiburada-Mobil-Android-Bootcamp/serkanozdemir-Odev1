package com.android.serkanozdemir_odev1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import androidx.fragment.app.Fragment
import com.android.serkanozdemir_odev1.databinding.FragmentMainBinding


class MainFragment :Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val buttonClick = AlphaAnimation(1F, 0.6F);
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.btnSc1.setOnClickListener{
            it.startAnimation(buttonClick)
            openFragment(FirstFragment())
        }
        binding.btnSc2.setOnClickListener{
            it.startAnimation(buttonClick)
            openFragment(SecondFragment())
        }
        binding.btnLiveData.setOnClickListener{
            it.startAnimation(buttonClick)
            openFragment(LiveDataFragment())
        }
        return view
    }

    private fun openFragment(fragment: Fragment) {
        val manager = activity?.supportFragmentManager
        manager!!.beginTransaction().replace(R.id.main,fragment).addToBackStack(null).commit()
    }
}