package com.example.hr_network_library.data.dto.candidate

import com.example.hr_network_library.data.dto.vacancy.Vacancy
import com.google.gson.annotations.SerializedName

data class Expand(
    @SerializedName("candidate")
    val candidate: Candidate,
    @SerializedName("vacancy")
    val vacancy: Vacancy
)