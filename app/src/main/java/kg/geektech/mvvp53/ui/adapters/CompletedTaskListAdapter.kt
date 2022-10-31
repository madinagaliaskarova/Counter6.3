package kg.geektech.mvvp53.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geektech.mvvp53.databinding.ItemTaskBinding

class CompletedTaskListAdapter(private var list: List<String> = listOf()) :
    RecyclerView.Adapter<CompletedTaskListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ListViewHolder(
        ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun addToList(newList: List<String>) {
        this.list = newList
        notifyDataSetChanged()
    }

    inner class ListViewHolder(private val binding: ItemTaskBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(operation: String) {
            binding.tvOperation.text = operation
        }
    }
}