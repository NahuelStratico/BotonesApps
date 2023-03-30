package com.example.imcapp.firstapp.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("api/10227843731587042/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

    @GET("/api/10227843731587042/{id}")
    suspend fun getSuperHeroDetail(@Path("id") superheroId: String) : Response<SuperHeroDetailResponse>

}