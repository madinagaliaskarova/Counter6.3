package kg.geektech.mvvp53.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import kg.geektech.mvvp53.databinding.FragmentOperationListBinding
import kg.geektech.mvvp53.ui.adapters.CompletedTaskListAdapter

class OperationListFragment : Fragment() {
    private lateinit var binding: FragmentOperationListBinding
    private val viewModel by activityViewModels<ViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOperationListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = CompletedTaskListAdapter()
        viewModel.operationList.observe(viewLifecycleOwner) {
            adapter.addToList(it)
        }

        binding.recyclerview.adapter = adapter
    }
}