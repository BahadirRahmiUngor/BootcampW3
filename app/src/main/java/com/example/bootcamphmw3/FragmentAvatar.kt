package com.example.bootcamphmw3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bootcamphmw3.databinding.FragmentAvatarBinding

class FragmentAvatar : Fragment() {

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentAvatarBinding.inflate(inflater)

        val dataList = ArrayList<AvatarModel>()
        dataList.add(AvatarModel(R.drawable.ic_avatar_1))
        dataList.add(AvatarModel(R.drawable.ic_avatar_2))
        dataList.add(AvatarModel(R.drawable.ic_avatar_3))
        dataList.add(AvatarModel(R.drawable.ic_avatar_4))
        dataList.add(AvatarModel(R.drawable.ic_avatar_5))
        dataList.add(AvatarModel(R.drawable.ic_avatar_6))
        dataList.add(AvatarModel(R.drawable.ic_avatar_7))
        dataList.add(AvatarModel(R.drawable.ic_avatar_8))
        dataList.add(AvatarModel(R.drawable.ic_avatar_9))

        binding.avatarList.adapter = AvatarAdapter(dataList)

        return binding.root
    }

}