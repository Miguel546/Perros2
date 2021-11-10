package com.android.perros.beans

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Perro(
    @SerializedName("idSplaft")
    var idSplaft: Int? = null,
    @SerializedName("codeTI")
    var codeTI: Int? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("state")
    var state: Int? = null
) : Serializable