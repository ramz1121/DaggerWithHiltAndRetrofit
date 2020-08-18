package com.sample.daggerwithhiltandretrofit.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sample.daggerwithhiltandretrofit.model.Blog

@Database(entities = [BlogCacheEntity::class],version = 1)
abstract class BlogDatabase : RoomDatabase() {

    abstract fun blogDao(): BlogDao

    companion object{
        val DATABASE_NAME: String = "blog_db"
    }
}