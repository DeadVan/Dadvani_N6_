package com.example.dadvani_n6

import androidx.lifecycle.ViewModel
import com.example.dadvani_n6.Retrofit
import kotlinx.coroutines.flow.flow

class MainViewModel : ViewModel() {

    fun fetchData() = flow {
        val body = Retrofit.api.getData()
        if (body.isSuccessful) {
            val data = body.body()
            emit(data!!)
        } else {
            val errorBody = body.errorBody()
        }
    }

    fun fetchDataById(itemId: Int) = flow {
        val body = Retrofit.api.getDataById(itemId)
        if (body.isSuccessful) {
            val data = body.body()
            emit(data!!)
        } else {
            val errorBody = body.errorBody()
        }
    }
}