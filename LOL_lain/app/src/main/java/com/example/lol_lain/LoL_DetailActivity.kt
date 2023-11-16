package com.example.lol_lain


import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.lol_lain.databinding.ActivityLoLdetailBinding


class LoL_DetailActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityLoLdetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bitmap: Bitmap? = intent.getParcelableExtra("gender")

        Log.d("이미지값??",bitmap.toString())

//        older.gender.setImageResource(profileList.get(position).gender)
       binding.ivProfile.setImageBitmap(bitmap)
        binding.tvName.text = intent.getStringExtra("name")
        binding.tvLain.text = intent.getStringExtra("lain")
        binding.Detail.text = intent.getStringExtra("detail")

        binding.tvName.text = intent.getStringExtra("name")
        Log.d("전달 받은값 ","${binding.tvName.text}")
        Log.d("전달 받은값 ","${binding.tvLain.text}")
        Log.d("전달 받은값 ","${binding.Detail.text}")

        Log.d("이미지값 ","${intent.getIntArrayExtra("gender")}")




    }


    class CustemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gender = itemView.findViewById<ImageView>(R.id.iv_profile) // 성별
    }


}


