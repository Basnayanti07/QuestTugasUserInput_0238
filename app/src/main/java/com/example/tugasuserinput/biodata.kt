package com.example.tugasuserinput

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource

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

    val daftarExperience = stringArrayResource(id = R.array.daftar_experience)
    val formatTanggal = stringResource(id = R.string.format_tanggal)
    val zonaWaktu = stringResource(id = R.string.zona_waktu)
    val bentukField = RoundedCornerShape(dimensionResource(id = R.dimen.radius_field))

    val teksAndroid = stringResource(id = R.string.skill_android)
    val teksUiux = stringResource(id = R.string.skill_uiux)
    val teksWeb = stringResource(id = R.string.skill_web)
    val spasi = stringResource(id = R.string.spasi)

    Box(modifier = modifier.fillMaxSize()){}
}