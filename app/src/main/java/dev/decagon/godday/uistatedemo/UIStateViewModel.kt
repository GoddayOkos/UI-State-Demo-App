package dev.decagon.godday.uistatedemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UIStateViewModel: ViewModel() {
    // LiveData holds state which is observed by the UI
    // (state flows down from ViewModel)
    private val _count = MutableLiveData(0)
    val count: LiveData<Int> = _count

    // updateCount is an event we're defining that the UI can invoke
    // (events flow up from UI)
    fun updateCount() {
        _count.value = _count.value!!.plus(1)
    }
}