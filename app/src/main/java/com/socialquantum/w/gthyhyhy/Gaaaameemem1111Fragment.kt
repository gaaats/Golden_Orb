package com.socialquantum.w.gthyhyhy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.socialquantum.w.R
import com.socialquantum.w.databinding.FragmentGaaaameemem1111Binding


class Gaaaameemem1111Fragment : Fragment() {


    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentGaaaameemem1111Binding: FragmentGaaaameemem1111Binding? = null
    private val binding
        get() = fragmentGaaaameemem1111Binding
            ?: throw RuntimeException("FragmentGaaaameemem1111Binding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaaameemem1111Binding =
            FragmentGaaaameemem1111Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.bon1.setOnClickListener {
                Toast.makeText(requireContext(), "Get element and get bonus", Toast.LENGTH_SHORT)
                    .show()
            }
            binding.bon2.setOnClickListener {
                Toast.makeText(requireContext(), "Get element and get bonus", Toast.LENGTH_SHORT)
                    .show()
            }
            binding.questt.setOnClickListener {
                Toast.makeText(
                    requireContext(),
                    "Find smallest element and get bonus",
                    Toast.LENGTH_SHORT
                ).show()
            }
            binding.one.setOnClickListener {
                Toast.makeText(requireContext(), "No, no", Toast.LENGTH_SHORT).show()
            }
            binding.three.setOnClickListener {
                Toast.makeText(requireContext(), "No, no", Toast.LENGTH_SHORT).show()
            }
            binding.four.setOnClickListener {
                Toast.makeText(requireContext(), "No, no", Toast.LENGTH_SHORT).show()
            }
            binding.tvo.setOnClickListener {
                findNavController().navigate(R.id.action_gaaaameemem1111Fragment_to_gaaaaamemme222Fragment)
            }


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaaaameemem1111Binding = null
        super.onDestroy()
    }
}