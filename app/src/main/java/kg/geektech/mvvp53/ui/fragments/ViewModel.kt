package kg.geektech.mvvp53.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {
    private var currentCount = 0
    private val _counter = MutableLiveData(0)
    val counter: LiveData<Int> = _counter

    private val operations = arrayListOf<String>()
    private val _operationList = MutableLiveData<List<String>>(emptyList())
    val operationList: LiveData<List<String>> = _operationList

    fun onIncrementClick() {
        currentCount++
        operations.add("+")
        _operationList.value = operations
        _counter.value = currentCount
    }

    fun onDecrementClick() {
        currentCount--
        operations.add("-")
        _operationList.value = operations
        _counter.value = currentCount
    }
}