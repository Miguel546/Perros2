package com.android.perros

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("visibilityView")
fun View.visibilityView(value: Boolean?){
    value?.let { visible ->
        visibility = if (visible) View.VISIBLE else View.GONE
    }
}


@BindingAdapter("visibilityExplicar")
fun View.visibilityExplicar(value: Boolean?){
    value?.let { visible ->
        visibility = if (visible) View.VISIBLE else View.GONE
    }
}

@BindingAdapter("visibilityRlReason")
fun View.visibilityRlReason(value: Boolean?){
    value?.let { visible ->
        visibility = if (visible) View.VISIBLE else View.GONE
    }
}

@BindingAdapter("visibilityReasons")
fun View.visibilityReasons(value: Boolean?){
    value?.let { visible ->
        visibility = if (visible) View.VISIBLE else View.GONE
    }
}

@BindingAdapter("visibilityEnviar")
fun View.visibilityEnviar(value: Boolean?){
    value?.let { visible ->
        visibility = if (visible) View.VISIBLE else View.GONE
    }
}

@BindingAdapter("visibilityContador")
fun View.visibilityContador(value: Boolean?){
    value?.let { visible ->
        visibility = if (visible) View.VISIBLE else View.GONE
    }
}

@BindingAdapter("visCont")
//fun AppCompatButton.setShowBtnContinue(value: Boolean?){
fun View.setShowBtnContinue(value: Boolean?){
    value?.let { visible ->
        visibility = if (visible) View.VISIBLE else View.GONE
    }
}