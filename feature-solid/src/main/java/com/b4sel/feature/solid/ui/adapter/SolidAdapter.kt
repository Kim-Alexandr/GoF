package com.b4sel.feature.solid.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.b4sel.feature.solid.databinding.SolidItemBinding
import com.b4sel.shared.solid.domain.model.SolidItem

// TODO: pls refactor this later
class SolidAdapter(
    private val items: List<SolidItem>,
    private val onItemClick: (item: SolidItem) -> Unit
) : RecyclerView.Adapter<SolidAdapter.SolidViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SolidViewHolder =
        SolidViewHolder(
            SolidItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: SolidViewHolder, position: Int) {
        holder.onBind(items[position])
    }

    override fun getItemCount(): Int =
        items.size

    inner class SolidViewHolder(
        private val layout: SolidItemBinding
    ) : RecyclerView.ViewHolder(layout.root) {
        fun onBind(solidItem: SolidItem) {
            with(layout.principalButton) {
                text = solidItem.principalName
                setOnClickListener { onItemClick(solidItem) }
            }
        }
    }
}