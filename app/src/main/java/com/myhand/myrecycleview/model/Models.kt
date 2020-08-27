package com.myhand.myrecycleview.model

class Models {
    var bgCard:Int ?= 0
    var iconImage:Int ?= 0
    var titleCard:String ?= null

    constructor(bgCard: Int?, iconImage: Int?, titleCard: String?) {
        this.bgCard = bgCard
        this.iconImage = iconImage
        this.titleCard = titleCard
    }
}