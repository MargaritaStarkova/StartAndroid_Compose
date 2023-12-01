package com.example.navigation_viewmodel

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

const val TAG = "MyLog"
@Composable
fun UserScreen(
    id: String,
    userViewModel: UserViewModel = viewModel(),
) {

    Text(text = "User $id")
    Log.d(TAG, "UserScreen: id = $id")
    Log.d(TAG, "viewModel ${Integer.toHexString(userViewModel.hashCode())}")
}
