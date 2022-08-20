package com.vishal.vcrypt.loginactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.vishal.vcrypt.R
import com.vishal.vcrypt.databinding.FragmentForgotPasswordBinding
import com.vishal.vcrypt.databinding.FragmentSignupBinding

class ForgotPasswordFragment : Fragment() {
    private var _binding: FragmentForgotPasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentForgotPasswordBinding.inflate(inflater,container,false)
        binding

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.forgotpassword.setOnClickListener {
            val navigation = Navigation.findNavController(requireView())
            val action = ForgotPasswordFragmentDirections.actionForgotPasswordFragmentToSigninFragment()
            navigation.navigate(action)
        }
    }

}