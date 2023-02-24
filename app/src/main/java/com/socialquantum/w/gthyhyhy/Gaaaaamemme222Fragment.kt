package com.socialquantum.w.gthyhyhy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.socialquantum.w.R
import com.socialquantum.w.databinding.FragmentGaaaaamemme222Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class Gaaaaamemme222Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaaaamemme222Binding =
            FragmentGaaaaamemme222Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            lifecycleScope.launch {
                Toast.makeText(requireContext(), "2659 points!", Toast.LENGTH_SHORT).show()

                delay(2000)
                findNavController().navigate(R.id.action_gaaaaamemme222Fragment_to_gaaaameemem1111Fragment)
            }

        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentGaaaaamemme222Binding: FragmentGaaaaamemme222Binding? = null
    private val binding
        get() = fragmentGaaaaamemme222Binding
            ?: throw RuntimeException("FragmentGaaaaamemme222Binding = null")


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaaaaamemme222Binding = null
        super.onDestroy()
    }
}