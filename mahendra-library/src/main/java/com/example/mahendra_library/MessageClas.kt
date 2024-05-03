package com.example.mahendra_library

import android.content.Context
import android.widget.Toast

class MessageClas {
    companion object {
        fun showMSDMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}