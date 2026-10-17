package com.example.tugasuserinput

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
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

    Box(modifier = modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = stringResource(id = R.string.desc_bg),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(dimensionResource(id = R.dimen.tinggi_header))
        )
        Scaffold(
            containerColor = colorResource(id = R.color.transparan)
        ) { innerPadding ->
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(top = dimensionResource(id = R.dimen.jarak_atas_kartu)),
                shape = RoundedCornerShape(
                    topStart = dimensionResource(id = R.dimen.radius_kartu),
                    topEnd = dimensionResource(id = R.dimen.radius_kartu)
                ),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.putih)
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(dimensionResource(id = R.dimen.padding_kartu)),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = stringResource(id = R.string.judul_form),
                        fontSize = integerResource(id = R.integer.font_judul).sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.ungu_judul)
                    )
                    Text(
                        text = stringResource(id = R.string.subjudul_form),
                        fontSize = integerResource(id = R.integer.font_subjudul).sp,
                        color = colorResource(id = R.color.abu_teks)
                    )
                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.jarak_besar)))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.jarak_kecil))
                    ){
                        OutlinedTextField(
                            value = namaDepan.value,
                            singleLine = true,
                            shape = bentukField,
                            modifier = Modifier.weight(1f),
                            label = {
                                Text(
                                    text = stringResource(id = R.string.label_nama_depan),
                                    fontSize = integerResource(id = R.integer.font_field).sp
                                )
                            },
                            onValueChange = { namaDepan.value = it }
                        )
                        OutlinedTextField(
                            value = namaBelakang.value,
                            singleLine = true,
                            shape = bentukField,
                            modifier = Modifier.weight(1f),
                            label = {
                                Text(
                                    text = stringResource(id = R.string.label_nama_belakang),
                                    fontSize = integerResource(id = R.integer.font_field).sp
                                )
                            },
                            onValueChange = { namaBelakang.value = it }
                        )
                    }
                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.jarak_sedang)))

                    OutlinedTextField(
                        value = email.value,
                        singleLine = true,
                        shape = bentukField,
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(
                                text = stringResource(id = R.string.label_email),
                                fontSize = integerResource(id = R.integer.font_field).sp
                            )
                        },
                        onValueChange = { email.value = it }
                    )
                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.jarak_sedang)))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.jarak_kecil))
                    ){
                        OutlinedTextField(
                            value = tglLahir.value,
                            singleLine = true,
                            readOnly = true,
                            shape = bentukField,
                            modifier = Modifier.weight(1f),
                            label = {
                                Text(
                                    text = stringResource(id = R.string.label_tgl_lahir),
                                    fontSize = integerResource(id = R.integer.font_field).sp
                                )
                            },
                            trailingIcon = {
                                IconButton(onClick = { bukaDialogTanggal.value = true }) {
                                    Icon(
                                        imageVector = Icons.Default.DateRange,
                                        contentDescription = stringResource(id = R.string.desc_kalender)
                                    )
                                }
                            },
                            onValueChange = { }
                        )
                        ExposedDropdownMenuBox(
                            expanded = menuTerbuka.value,
                            onExpandedChange = { menuTerbuka.value = it },
                            modifier = Modifier.weight(1f)
                        ){
                            OutlinedTextField(
                                value = experience.value,
                                singleLine = true,
                                readOnly = true,
                                shape = bentukField,
                                modifier = Modifier.menuAnchor(MenuAnchorType.PrimaryNotEditable),
                                label = {
                                    Text(
                                        text = stringResource(id = R.string.label_experience),
                                        fontSize = integerResource(id = R.integer.font_field).sp
                                    )
                                },
                                trailingIcon = {
                                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = menuTerbuka.value)
                                },
                                onValueChange = { }
                            )
                            ExposedDropdownMenu(
                                expanded = menuTerbuka.value,
                                onDismissRequest = { menuTerbuka.value = false }
                            ){
                                daftarExperience.forEach { item ->
                                    DropdownMenuItem(
                                        text = { Text(text = item) },
                                        onClick = {
                                            experience.value = item
                                            menuTerbuka.value = false
                                        }
                                    )
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.jarak_sedang)))

                    Text(
                        text = stringResource(id = R.string.judul_skill),
                        fontSize = integerResource(id = R.integer.font_label_skill).sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}