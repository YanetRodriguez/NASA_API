package com.example.marsroverphotos.ui.rover_selection

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.marsroverphotos.models.Rover

class RoverSelectionAdapter(activity: AppCompatActivity) :
    FragmentStateAdapter(activity) {

    private var rovers: List<Rover> = arrayListOf()

    fun addRovers(rovers: List<Rover>) {
        this.rovers = rovers
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return rovers.size
    }

    override fun createFragment(position: Int): Fragment {
        return RoverSelectionFragment.getInstance(rovers[position])
    }
}
