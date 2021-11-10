package com.android.perros

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    private val _origenFinish = MutableLiveData<Boolean>(false)
    val origenFinish: LiveData<Boolean>
        get() = _origenFinish

    private val _view = MutableLiveData<Boolean>(false)
    val view: LiveData<Boolean>
        get() = _view

    private val _explicar = MutableLiveData<Boolean>(false)
    val explicar: LiveData<Boolean>
        get() = _explicar

    private val _rlReason = MutableLiveData<Boolean>(false)
    val rlReason: LiveData<Boolean>
        get() = _rlReason

    private val _reasons = MutableLiveData<Boolean>(false)
    val reasons: LiveData<Boolean>
        get() = _reasons

    private val _enviar = MutableLiveData<Boolean>(false)
    val enviar: LiveData<Boolean>
        get() = _enviar

    private val _contador = MutableLiveData<Boolean>(false)
    val contador: LiveData<Boolean>
        get() = _contador

    fun detalleTrue(){
        _view.postValue(true)
        _explicar.postValue(true)
        _rlReason.postValue(true)
        _reasons.postValue(true)
        _enviar.postValue(true)
        _contador.postValue(true)
    }

    fun detalleFalse(){
        _view.postValue(false)
        _explicar.postValue(false)
        _rlReason.postValue(false)
        _reasons.postValue(false)
        _enviar.postValue(false)
        _contador.postValue(false)
    }
}