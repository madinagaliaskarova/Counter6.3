package kg.geektech.mvvp53.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import kg.geektech.mvvp53.databinding.FragmentCurrentCountBinding

class CurrentCountFragment : Fragment() {
    private lateinit var binding: FragmentCurrentCountBinding
    private val viewModel by activityViewModels<ViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCurrentCountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCurrentCount.text = it.toString()
        }
    }
    /*
    onAttach() - привязка к активити
    onCreateView() - создние интерфейса фрагмента
    onViewCreated() - создание интерфейса фрагмента закончилось
    onStart() - фрагмент готовится к взаимодействию с юзером
    onResume() - юзер взаимодействует с фрагментом
    onPause() - интерфейс фрагмента виден, но не может быть использован
    onStop() - интерфейс фрагмента не виден и не может быть использован
    onDestroyView() - интерфейс фрагмент уничтожен
    onDestroy() - фрагмент уничтожен из-за нехватки памяти
    onDetach() - фрагмент отвязан от активити
     */
}