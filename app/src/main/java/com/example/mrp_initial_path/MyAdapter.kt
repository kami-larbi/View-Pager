package com.example.mrp_initial_path
import android.view.LayoutInflater
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter


class MyAdapter(var layouts:IntArray,context: Context): PagerAdapter() {
    val context = context
    private  lateinit var inflater: LayoutInflater
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`

    }
    override fun getCount(): Int {
        return layouts.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = inflater.inflate(layouts[position],container,  false)
        container.addView(v)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val  v= `object` as View
        container.removeView(v)
    }
}