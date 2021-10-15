package com.android.serkanozdemir_odev1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.android.serkanozdemir_odev1.ViewModel.LiveDataViewModel
import com.android.serkanozdemir_odev1.databinding.FragmentLiveDataBinding
import java.util.*


class LiveDataFragment : Fragment() {
    private val fruitList = listOf<String>("Apple","Pear","Banana","Peach","Cherry","Strawberry","Watermelon","Melon","Grape","Lemon","Orange")

    private var _binding: FragmentLiveDataBinding? = null
    private val binding get() = _binding!!
    lateinit var liveData:LiveDataViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLiveDataBinding.inflate(inflater,container,false)
        val view =binding.root
        liveData=ViewModelProvider(this).get(LiveDataViewModel::class.java)
        Click()

        liveData.text.observe(viewLifecycleOwner, {
            binding.textLiveData.text= it
        })



        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun Click(){
        val random =  Random()
        binding.btnLiveData.setOnClickListener{
            liveData.text.value=fruitList[random.nextInt(fruitList.size)]
        }
    }
}