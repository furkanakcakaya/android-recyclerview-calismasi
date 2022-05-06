package com.example.trendyoltasarimi.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trendyoltasarimi.Item
import com.example.trendyoltasarimi.ItemAdapter
import com.example.trendyoltasarimi.R
import com.example.trendyoltasarimi.databinding.FragmentHomepageBinding

class HomepageFragment : Fragment() {
    private lateinit var binding:FragmentHomepageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomepageBinding.inflate(inflater,container,false)


        val itemList = ArrayList<Item>()
        val item1 = Item("AirPods Kılıf Çok Renkli", 59.99, R.drawable.airpods, false)
        val item2 = Item("Sneaker Unisex", 259.00, R.drawable.ayakkabi, true)
        val item3 = Item("Erkek Sneaker", 189.25, R.drawable.ayakkabi_2, false)
        val item4 = Item("Eşofman Takımı", 215.75, R.drawable.esofman, true)
        val item6 = Item("Oversize T-shirt Unisex", 82.99, R.drawable.tisort,  false)
        val item5 = Item("Lotto Sakaryaspor Forma", 199.99, R.drawable.lotto, true)
        val item7 = Item("Bahar Şapka", 39.99, R.drawable.sapka,  false)

        itemList.add(item1)
        itemList.add(item5)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item6)
        itemList.add(item7)

        binding.rvItems.adapter = ItemAdapter(requireContext(), itemList)
        binding.rvItems.setHasFixedSize(true)
        val layoutManager = androidx.recyclerview.widget.StaggeredGridLayoutManager(1, androidx.recyclerview.widget.StaggeredGridLayoutManager.HORIZONTAL)
        binding.rvItems.layoutManager = layoutManager



        return binding.root
    }


}