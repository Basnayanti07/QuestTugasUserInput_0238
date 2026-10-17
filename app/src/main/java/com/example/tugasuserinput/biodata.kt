package com.example.tugasuserinput

import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormBiodata(modifier: Modifier = Modifier){
    var namaDepan = remember { mutableStateOf(value = "") }
    var namaBelakang = remember { mutableStateOf(value = "") }
    var email = remember { mutableStateOf(value = "") }
    var tglLahir = remember { mutableStateOf(value = "") }
    var experience = remember { mutableStateOf(value = "") }

    var skillAndroid = remember { mutableStateOf(value = false) }
    var skillUiux = remember { mutableStateOf(value = false) }
    var skillWeb = remember { mutableStateOf(value = false) }

    var bukaDialogTanggal = remember { mutableStateOf(value = false) }
    var menuTerbuka = remember { mutableStateOf(value = false) }
    val datePickerState = rememberDatePickerState()

    var hasilNama = remember { mutableStateOf(value = "") }
    var hasilEmail = remember { mutableStateOf(value = "") }
    var hasilTgl = remember { mutableStateOf(value = "") }
    var hasilExperience = remember { mutableStateOf(value = "") }
    var hasilSkill = remember { mutableStateOf(value = "") }
    var tampilHasil = remember { mutableStateOf(value = false) }
}