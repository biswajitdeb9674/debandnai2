package com.bis.Expence.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

import com.bis.Expence.R
import com.bis.Expence.data.network.viewModel.MistryViewModel
import com.bis.Expence.databinding.ActivityMainBinding
import com.bis.Expence.databinding.FragmentHomeBinding
import com.bis.Expence.ui.base.BaseFragment


class HomeFragment : BaseFragment(){
    lateinit var binding: FragmentHomeBinding
    private val mistryViewModel: MistryViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /*binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.lifecycleOwner = this*/

        binding= FragmentHomeBinding.inflate(layoutInflater)
        val view = binding.root

        viewOnClick()
        return view
    }

    private fun viewOnClick() {

    }



}