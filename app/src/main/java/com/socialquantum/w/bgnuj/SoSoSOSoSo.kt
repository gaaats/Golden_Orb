package com.socialquantum.w.bgnuj

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.hy59hy59hy59hy
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.bngjgtitghgtg
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.instIdgttg
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.vfbrfgfrgrfgrfgyrfgy
import com.socialquantum.w.gtyhhy.bgbgnhhy5995uj5ju
import com.socialquantum.w.gtyhhy.hhy5hy595hy95hy
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class SoSoSOSoSo:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        gtjogtjogtjgtjiogt()

        val gtkotgjgt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val bhyhjyujujuj = getSharedPreferences("PREFS_NAME", 0)

        val gthgtiuhtghuh = MyTracker.getTrackerParams()
        val gtngtgtjiogtji = MyTracker.getTrackerConfig()
        val gfgkgtkogtk = MyTracker.getInstanceId(this)
        gtngtgtjiogtji.isTrackingLaunchEnabled = true
        val IDINgtgtgt = UUID.randomUUID().toString()

        if (bhyhjyujujuj.getBoolean("my_first_time", true)) {
            gthgtiuhtghuh.setCustomUserId(IDINgtgtgt)
            gtkotgjgt.edit().putString(hy59hy59hy59hy, IDINgtgtgt).apply()
            gtkotgjgt.edit().putString(instIdgttg, gfgkgtkogtk).apply()
            bhyhjyujujuj.edit().putBoolean("my_first_time", false).apply()
        } else {
            val nrfedfrerfrf = gtkotgjgt.getString(hy59hy59hy59hy, IDINgtgtgt)
            gthgtiuhtghuh.setCustomUserId(nrfedfrerfrf)
        }
        MyTracker.initTracker(bngjgtitghgtg, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@SoSoSOSoSo)
            modules(
                listOf(
                    bgbgnhhy5995uj5ju, hhy5hy595hy95hy
                )
            )
        }
    }

    private fun gtjogtjogtjgtjiogt() {
        OneSignal.setAppId(vfbrfgfrgrfgrfgyrfgy)
    }

}