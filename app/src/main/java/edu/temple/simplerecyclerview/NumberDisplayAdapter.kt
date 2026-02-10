package edu.temple.simplerecyclerview

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup


// Step 3: Complete adapter implementation



class NumberDisplayAdapter (private val numbers: Array<Int>)

/* Step 3a: Provide Adapter Parent */ : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    //  Step 3b: Complete function definitions for adapter

    // https://developer.android.com/develop/ui/views/layout/recyclerview

    //professor's code
//    override fun OncreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ) = NumberViewHolder (
//        TextView(parent.context).apply{
//
//        }
//    )
//
//    override fun onBindVIewHolder(
//        holder: NumberViewHolder,
//        position: Int
//    ){
//        holder.textView.text = ((position + 1) * 5).toString()
//    }
//
//    override fun getItemCount(): Int{
//
//    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(TextView(viewGroup.context))
    }

    //override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
    }

    override fun getItemCount(): Int = numbers.size


}