package com.example.recylerviewvecardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recylerviewvecardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var ulkelerList: ArrayList<Ulkeler>
    private lateinit var adapter:RVAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)//listenin görünümü ile ilgili yapıyı belirtiğimiz kod satırı

         /*
         //farklı bir kullanımı daha göstermek içim yorum satırına alındı
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)//2.yöntem spantCount yan yana kaç veri ekleneceğini
        binding.rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZANTAL)//3.yöntem spantCount yan yana kaç veri ekleneceğini
          */
        val u1 = Ulkeler(1,"Türkiye")
        val u2 = Ulkeler(2,"Fransa")
        val u3 = Ulkeler(3,"Rusya")
        val u4 = Ulkeler(4,"Japonya")
        val u5 = Ulkeler(4,"italya")

        ulkelerList = ArrayList<Ulkeler>()

        ulkelerList.add(u1)
        ulkelerList.add(u2)
        ulkelerList.add(u3)
        ulkelerList.add(u4)
        ulkelerList.add(u5)

        adapter = RVAdapter(this,ulkelerList)
        binding.rv.adapter = adapter

    }

}