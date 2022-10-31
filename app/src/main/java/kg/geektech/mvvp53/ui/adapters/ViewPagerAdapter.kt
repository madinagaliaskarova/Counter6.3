package kg.geektech.mvvp53.ui.adapters

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.geektech.mvvp53.ui.fragments.CounterFragment
import kg.geektech.mvvp53.ui.fragments.CurrentCountFragment
import kg.geektech.mvvp53.ui.fragments.OperationListFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int) = when (position) {
        0 -> CounterFragment()
        1 -> CurrentCountFragment()
        else -> OperationListFragment()
    }

    override fun getItemCount() = 3
}