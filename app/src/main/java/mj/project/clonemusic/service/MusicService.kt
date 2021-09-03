package mj.project.clonemusic.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/38f8d12b-fb8a-4277-b3ac-1c6a7fbec414")
    fun listMusics() : Call<MusicDto>
}