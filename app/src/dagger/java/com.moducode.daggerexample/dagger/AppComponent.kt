package com.moducode.daggerexample.dagger


import dagger.Component

@AppScope
@Component(modules = [SchedulerModule::class, DatabaseModule::class, RetrofitModule::class])
interface AppComponent {

    fun buildPresenterComponent(): PresenterComponent

}
