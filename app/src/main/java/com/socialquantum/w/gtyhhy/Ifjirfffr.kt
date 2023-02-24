package com.socialquantum.w.gtyhhy

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.socialquantum.w.frfgrgtgt.Njkfjrrfjffr
import com.socialquantum.w.frgtgtgt.Jforjrfjifrij
import com.socialquantum.w.gthyujuj.Jofirojrfjfrjirf
import com.socialquantum.w.gtjuikki.OKdoekeddekode
import com.socialquantum.w.gttgngtjngt.NJnfdrfrfrf
import com.socialquantum.w.hyjuuj.Gygfrgygrfrfrf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun hyhy5hy59hy5(): Gson {
    return GsonBuilder().create()
}



val bgbgnhhy5995uj5ju = module {
    viewModel (named("MainModel")){
        NJnfdrfrfrf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Gygfrgygrfrfrf(get())
    }
}

val hhy5hy595hy95hy = module {

    single  <Jforjrfjifrij> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Jforjrfjifrij::class.java)
    }

    single <Njkfjrrfjffr> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Njkfjrrfjffr::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://goldenorb.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        OKdoekeddekode(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Jofirojrfjfrjirf(get(named("HostInter")))
    }
    single{
        hyhy5hy59hy5()
    }
    single (named("SharedPreferences")) {
        h26hyhyhy6(androidApplication())
    }
}

fun h26hyhyhy6(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


