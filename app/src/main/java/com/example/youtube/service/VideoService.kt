package com.example.youtube.service

import com.example.youtube.dto.VideoDto
import retrofit2.http.GET

interface VideoService {

    @GET("/v3/81f0d2c5-576b-429a-a1fa-865fbdc1de72")
    fun listVideos(): retrofit2.Call<VideoDto>
}