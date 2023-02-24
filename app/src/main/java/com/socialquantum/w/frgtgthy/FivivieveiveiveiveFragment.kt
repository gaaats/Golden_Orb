package com.socialquantum.w.frgtgthy

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.socialquantum.w.rfgtgtgt.GaaammtmtmymyymActivity2
import com.socialquantum.w.R
import com.socialquantum.w.vgbbggbbg.VeeeevovovovoActivity2
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.hy59hy59hy59hy
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.bngjgthgthtghgt
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.hy5hy95h
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.codeCodegtgt
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.hy6hy59hy
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.gtgthtghgthugt
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.gt2hyhyhy
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.gthyhjyhyjuuj
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.gtitghugt
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.ghgtgt59
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.instIdgttg
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.nhyjiohyiohy5
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.onegtgt
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.trolologttggt
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.vbfbbrfgfrggrffr
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.vbfbfrrfhrfhfrhfrfr
import com.socialquantum.w.gtkpgtpkogtkpotg.KODokok.vfbhbfryurfgrfrf
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FivivieveiveiveiveFragment : Fragment() {


    override fun onStart() {
        super.onStart()


        val gtgtgt: String? = gy5hy59h5hy.getString(instIdgttg, null)
        val bgnbnbgnbguhbghg = gy5hy59h5hy.getString("deepSt", null)
        val hjoihhfrfrgfrrg = gy5hy59h5hy.getString(codeCodegtgt, null)
        val hihfhgtgthgt = gy5hy59h5hy.getString(nhyjiohyiohy5, null)
        val vbffrygfrrfgrfg = gy5hy59h5hy.getString(bngjgthgthtghgt, null)
        val gjgtojgt = gy5hy59h5hy.getString(gtgthtghgthugt, null)
        val gthgtigthgthgt = hy5hy95h
        val gtojigtjtgjgtjigtj = Build.VERSION.RELEASE
        val cdvdetfedfedffedfed = gy5hy59h5hy.getString(hy59hy59hy59hy, null)
        val gthutguhugthgtgtgt = gy5hy59h5hy.getString("appCamp", null)
        val bngngughgthugt = gy5hy59h5hy.getString("mainId", null)

        val fhrirfurfuhrf = Intent(activity, VeeeevovovovoActivity2::class.java)
        val vfbfryrfgfrgfgrgfrrfrf = Intent(activity, GaaammtmtmymyymActivity2::class.java)

        val afIdhyhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(gt5gt59gt59gt)
        rfhihfrhrfhfrhrfhihrf()

        gy5hy59h5hy.edit().putString(ghgtgt59, afIdhyhyhy).apply()

        val gngnufhhth = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$gthutguhugthgtgtgt&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gt2hyhyhy$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$hy6hy59hy$gthyhjyhyjuuj"
        val cdvedtdeffdeed = "$vbffrygfrrfgrfg$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$gtgtgt&$gt2hyhyhy$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$hy6hy59hy$gthyhjyhyjuuj"
        val vbyrfgrfrfg = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$bgnbnbgnbguhbghg&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gt2hyhyhy$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$hy6hy59hy$trolologttggt"
        val bmgjhyjhyjojihy = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$bgnbnbgnbguhbghg&$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$gtgtgt&$gt2hyhyhy$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$hy6hy59hy$trolologttggt"

        when(hihfhgtgthgt) {
            "1" ->
                if(gthutguhugthgtgtgt!="null") {
                    gy5hy59h5hy.edit().putString(gtitghugt, gngnufhhth).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "campaign").apply()
                    startActivity(fhrirfurfuhrf)
                    gtgtoijjjig()
                } else if (bgnbnbgnbguhbghg!=null||hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    gy5hy59h5hy.edit().putString(gtitghugt, vbyrfgrfrfg).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "deepLink").apply()
                    startActivity(fhrirfurfuhrf)
                    gtgtoijjjig()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    gtgtoijjjig()
                }
            "0" ->
                if(bgnbnbgnbguhbghg!=null) {
                    gy5hy59h5hy.edit().putString(gtitghugt, bmgjhyjhyjojihy).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(fhrirfurfuhrf)
                    gtgtoijjjig()
                } else if (hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    gy5hy59h5hy.edit().putString(gtitghugt, cdvedtdeffdeed).apply()
                    gy5hy59h5hy.edit().putString("WebInt", "geo").apply()
                    startActivity(fhrirfurfuhrf)
                    gtgtoijjjig()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    gtgtoijjjig()
                }
        }
    }

    private fun gtgtoijjjig() {
        activity?.finish()
    }

    private fun rfhihfrhrfhfrhrfhihrf() {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
    }

    private lateinit var gt5gt59gt59gt: Context
    val gy5hy59h5hy: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gt5gt59gt59gt = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fivivieveiveiveive, container, false)
    }

}