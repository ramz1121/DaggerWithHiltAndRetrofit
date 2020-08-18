package com.sample.daggerwithhiltandretrofit.di

import com.sample.daggerwithhiltandretrofit.repository.MainRepository
import com.sample.daggerwithhiltandretrofit.retrofit.BlogRetrofit
import com.sample.daggerwithhiltandretrofit.retrofit.NetworkMapper
import com.sample.daggerwithhiltandretrofit.room.BlogDao
import com.sample.daggerwithhiltandretrofit.room.CacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {
    @Singleton
    @Provides
    fun provideMainRepository(
        blogDao: BlogDao,
        retrofit: BlogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): MainRepository {
        return MainRepository(blogDao, retrofit, cacheMapper, networkMapper)
    }
}