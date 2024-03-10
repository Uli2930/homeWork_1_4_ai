package com.geeks.homework_1_4_ai

import android.content.Context
import android.widget.Toast

fun Context.makeToast(text: String){
Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
}