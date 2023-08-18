package com.mutsuddi_s.myhilt.vision

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object HiltAModules {

    @Provides
    fun provideEngine(piston: Piston): Engine{
        return Engine(piston)
    }

    @Provides
    fun provideCar(engine: Engine): Car{
        return Car(engine)
    }
    @Provides
    fun providePiston(NumberOfPiston: NumberOfPiston): Piston{
        return Piston(NumberOfPiston)
    }

    @Provides
    fun provideNumberofPiston(): NumberOfPiston{
        return NumberOfPistonImpl()
    }


}