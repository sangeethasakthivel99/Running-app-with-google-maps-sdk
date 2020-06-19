package com.sangeetha.runningapp.di

import android.content.Context
import androidx.room.Room
import com.sangeetha.runningapp.RUNNING_DATABASE
import com.sangeetha.runningapp.db.RunDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDataBase(@ApplicationContext context: Context) = Room.databaseBuilder(context, RunDatabase::class.java, RUNNING_DATABASE)

    @Singleton
    @Provides
    fun provideRunDAO(runDatabase: RunDatabase) = runDatabase.getRunDAO()
}