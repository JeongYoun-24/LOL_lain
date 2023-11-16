package com.example.lol_lain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lol_lain.databinding.ActivityLoLdetailBinding
import com.example.lol_lain.databinding.ActivityMyChampionBinding
import com.example.my_api2.ProfileAdapter
import org.json.JSONArray
import org.json.JSONObject

class My_Champion : AppCompatActivity() {
    private val binding by lazy { ActivityMyChampionBinding.inflate(layoutInflater) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        val json = assets.open("data.json").reader().readText()
//        val data = JSONObject(json).getJSONObject("data")


        val jsonString = assets.open("data.json").reader().readText()
//        Log.d("JSON파일데이터",jsonString)

        // JSON 파일에 접근해서 배열 형식으로 가져와보자!
        val jsonArray = JSONArray(jsonString)
//        Log.d("json str", jsonArray.toString())


        val textView = findViewById<TextView>(R.id.champion)

        for (i in 0 until jsonArray.length()) {
            val jsonObject = jsonArray.getJSONObject(i)

            textView.append("\n--------------------------\n")     // 경계선

            val id = jsonObject.getString("id")
            val name = jsonObject.getString("name")

            binding.champion.text = id

          /*  textView.append(
                """
                    $id
                """.trimIndent()
            )

            textView.append(
                """
                    $name
                """.trimIndent()
            )*/


        }



        /*binding.rvProfile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.rvProfile.setHasFixedSize(true)
        binding.rvProfile.adapter = ProfileAdapter(data)*/

    }

}