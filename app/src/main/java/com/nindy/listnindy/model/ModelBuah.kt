package com.nindy.listnindy.model

import com.nindy.listnindy.R

data class ModelBuah(
    val image : Int,
    val nama : String
)

//mock data

object MockList{

    fun getModel() : List<ModelBuah>{
        val  itemModel1 = ModelBuah(
            R.drawable.apple,
            nama = "apel"
        )

        val  itemModel2 = ModelBuah(
            R.drawable.grapes,
            nama = "anggur"
        )

        val  itemModel3 = ModelBuah(
            R.drawable.orange,
            nama = "jeruk"
        )

        val  itemModel4 = ModelBuah(
            R.drawable.pear,
            nama = "pear"
        )

        val  itemModel5 = ModelBuah(
            R.drawable.strawberry,
            nama = "strawbery"
        )

        val  itemModel6 = ModelBuah(
            R.drawable.orange,
            nama = "orange"
        )

        val itemList:ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList

    }
}
