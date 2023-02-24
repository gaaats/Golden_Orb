package com.socialquantum.w.gttgngtjngt

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.socialquantum.w.cvfvfgtgt.JOIFjrofjrfjoirf
import com.socialquantum.w.frfgrgtgt.Njfoirjrfjfrji
import com.socialquantum.w.gthyujuj.Jofirojrfjfrjirf
import com.socialquantum.w.gtjuikki.OKdoekeddekode
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.gtjjgtjgtjgtjt
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class NJnfdrfrfrf(


    private val gtgthtghiugth: OKdoekeddekode,
    private val gtgtgthyhy: Jofirojrfjfrjirf,
    private val gtgtgtgt: SharedPreferences,
    val gtgtuihgiuthugti: Application
) : ViewModel() {


    private val h5hyhy59hy5 = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val gtkkgtkg = data?.get("campaign").toString()
            gtjtgjoigtjgt.postValue(gtkkgtkg)

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun gthuigthgt() {
        val gkogkotgko = AdvertisingIdClient(gtgtuihgiuthugti)
        gkogkotgko.start()
        val gtjogtjiotgjiotg = gkogkotgko.info.id.toString()
        gtkogtkogtkogt.postValue(gtjogtjiotgjiotg)
    }


    init {
        viewModelScope.launch(Dispatchers.IO) {
            gthuigthgt()
        }
        viewModelScope.launch(Dispatchers.Main) {
            hgithgtuhgt()
        }
    }

    private val gthgtiugt = MutableLiveData<JOIFjrofjrfjoirf>()
    val nknvngthutghih: LiveData<JOIFjrofjrfjoirf>
        get() = gthgtiugt

    private val tgggtgt = MutableLiveData<Njfoirjrfjfrji>()
    val gtythyhyhy: LiveData<Njfoirjrfjfrji>
        get() = tgggtgt

    private val gtjtgjoigtjgt = MutableLiveData<String>()
    val gtgt5gt5gt: LiveData<String>
        get() = gtjtgjoigtjgt

    private val gtkogtkogtkogt = MutableLiveData<String?>()
    val mainId: LiveData<String?>
        get() = gtkogtkogtkogt


    suspend fun hgithgtuhgt() {
        gthgtiugt.postValue(gtgthtghiugth.gtjotgjgtjigtjitgji().body())
        gttgtgtgt()
    }

    suspend fun gttgtgtgt() {
        tgggtgt.postValue(gtgtgthyhy.gtjtgijgtigtijgt().body())
    }

    fun gtthyhyhy(gtgkogtkk: Context) {
        AppsFlyerLib.getInstance()
            .init(gtjjgtjgtjgtjt, h5hyhy59hy5, gtgtuihgiuthugti)
        AppsFlyerLib.getInstance().start(gtgkogtkk)
    }

    fun gttghyhyhy(gtjoigtoji: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            gtjoigtoji
        ) { data: AppLinkData? ->
            data?.let {
                val gtkogtko = data.targetUri?.host.toString()
                gtgtgtgt.edit().putString("deepSt", gtkogtko).apply()
            }
        }
    }


}