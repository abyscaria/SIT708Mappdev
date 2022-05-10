package com.examples.appbasics

class Friends{
    //var friendName: String? = null
   // var fstate: String? = null
    //var imgeURL: String? = null

   fun loadFriends() : List<Fdata> {
       return listOf<Fdata>(Fdata(
           R.string.friend1,R.string.state1,R.drawable.image1_foreground),
           Fdata(R.string.friend2,R.string.state2,R.drawable.image2_foreground),
           Fdata(R.string.friend3,R.string.state3,R.drawable.image3_foreground))
   }

 /*   fun getNames(): String {
        return friendName.toString()
    }

    fun setNames(name: String) {
        this.friendName = name
    }

    fun getstate(): String {
        return fstate.toString()
    }

    fun setstate(state: String) {
        this.fstate = state
    }

    fun getimgURLs(): String {
        return imgeURL.toString()
    }

    fun setimgURLs(imgURL: String) {
        this.imgeURL = imgURL
    }*/

}