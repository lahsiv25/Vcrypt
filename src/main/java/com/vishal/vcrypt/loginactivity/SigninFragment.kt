package com.vishal.vcrypt.loginactivity

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.vishal.vcrypt.R
import com.vishal.vcrypt.dashboardactivity.DashboardActivity
import com.vishal.vcrypt.databinding.FragmentSigninBinding

/*class SigninFragment : Fragment() {

    private var _binding: FragmentSigninBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSigninBinding.inflate(inflater, container, false)
        binding

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navigation = Navigation.findNavController(requireView())

        binding.signin.setOnClickListener {

            val intent = Intent(requireContext(),DashboardActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }

        binding.signup.setOnClickListener {
            val actiontosignup = SigninFragmentDirections.actionSigninFragmentToSignupFragment()
            navigation.navigate(actiontosignup)
        }

        binding.forgotpswd.setOnClickListener {
            val actiontoforgotpswd = SigninFragmentDirections.actionSigninFragmentToForgotPasswordFragment()
            navigation.navigate(actiontoforgotpswd)
        }
    }

}*/
class SigninFragment:Fragment(){

    private var _binding:FragmentSigninBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater:LayoutInflater,
                              container:ViewGroup?,savedInstanceState:Bundle?):View?{
        _binding = FragmentSigninBinding.inflate(inflater,container,false)
        binding

        return binding.root
    }

    override fun onViewCreated(view:View,savedInstanceState:Bundle?){
        super.onViewCreated(view,savedInstanceState)

        val navigation = Navigation.findNavController(requireView())

        binding.signup.setOnClickListener{
            val actionsignup = SigninFragmentDirections.actionSigninFragmentToSignupFragment()
            navigation.navigate(actionsignup)
        }

        binding.signin.setOnClickListener {

            val intent = Intent(requireContext(),DashboardActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }

        binding.forgotpswd.setOnClickListener {
            val actiontoforgotpswd = SigninFragmentDirections.actionSigninFragmentToForgotPasswordFragment()
            navigation.navigate(actiontoforgotpswd)
        }
    }
}