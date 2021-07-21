package com.abdul.myfirsttap

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordsAdapter(private val data: Array<String>) : RecyclerView.Adapter<WordsAdapter.WordsViewHolder>() {
    var TAG = WordsAdapter::class.java.simpleName

    /**
     * inner class
     * box [arvind] holding the newly/recycled planks for data to be written
     */
    class WordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textview: TextView
       // Log.i(TAG,"WordsViewHolder")
        init {
            textview = itemView.findViewById(R.id.tv_listitem)
           var TAG = WordsAdapter::class.java.simpleName

           Log.i(TAG,"WordsViewHolder")

       }


    }

    /**
     * this guys [pritam] job is to buy new planks from market
     * inflate the list_item xml so that new data can be written on it and inserted at the bottom
     */
    override fun onCreateViewHolder(viewgroup: ViewGroup, viewType: Int): WordsViewHolder {
        Log.i(TAG,"onCreateViewHolder")
        var view = LayoutInflater.from(viewgroup.context).inflate(R.layout.list_item_plank,viewgroup,false)
        return WordsViewHolder(view)
    }

    /**
     * rahul --handwriting is good so he'll write dish name on the plank
     */
    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        Log.i(TAG,"onBindViewHolder")
        holder.textview.text = data[position]
    }

    /**
     * raju -- to keep a tab on no of items in the dataset
     */
    override fun getItemCount(): Int {
        Log.i(TAG,"getItemCount")

        return data.size
    }
}