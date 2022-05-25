package pyroman.karmanniyzhirinovskiy

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var mediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFullScreen()

        val buttonJetoRossija = findViewById<Button>(R.id.buttonJetoRossija)
        buttonJetoRossija.setOnClickListener {
            playAudio(R.raw.jeto_rossija)
        }

        val buttonShizoid = findViewById<Button>(R.id.buttonShizoid)
        buttonShizoid.setOnClickListener {
            playAudio(R.raw.shizoid)
        }

        val buttonMolchat = findViewById<Button>(R.id.buttonMolchat)
        buttonMolchat.setOnClickListener {
            playAudio(R.raw.molchat)
        }

        val buttonIdiUchi = findViewById<Button>(R.id.buttonYaVedu)
        buttonIdiUchi.setOnClickListener {
            playAudio(R.raw.ya_vedu_sebya_tak)
        }

        val buttonRasstreliaj = findViewById<Button>(R.id.buttonRasstreliaj)
        buttonRasstreliaj.setOnClickListener {
            playAudio(R.raw.rastreljaj)
        }

        val buttonYaOtvechayu = findViewById<Button>(R.id.buttonYaOtvechayu)
        buttonYaOtvechayu.setOnClickListener {
            playAudio(R.raw.ya_otvechayu_zdes)
        }

        val buttonSmekh = findViewById<Button>(R.id.buttonSmekh)
        buttonSmekh.setOnClickListener {
            playAudio(R.raw.smeh_zhirinovskogo)
        }

        val buttonKhvatit = findViewById<Button>(R.id.buttonKhvatit)
        buttonKhvatit.setOnClickListener {
            playAudio(R.raw.hvatit_jeto_terpet)
        }

        val buttonAChe = findViewById<Button>(R.id.buttonACheUNego)
        buttonAChe.setOnClickListener {
            playAudio(R.raw.a_che_u_nego_tak_vse_poluchaetsya_horosho)
        }

        val buttonJetoLdpr = findViewById<Button>(R.id.buttonJetoLdpr)
        buttonJetoLdpr.setOnClickListener {
            playAudio(R.raw.eto_ldpr)
        }

        val buttonKhvatitKormit = findViewById<Button>(R.id.buttonKhvatitKormit)
        buttonKhvatitKormit.setOnClickListener {
            playAudio(R.raw.hvatit_kormit_kavkaz)
        }

        val buttonINiktoNePomozhet = findViewById<Button>(R.id.buttonINiktoNePomozhet)
        buttonINiktoNePomozhet.setOnClickListener {
            playAudio(R.raw.i_nikto_vam_ne_pomozhet)
        }

        val buttonKtoTiTakoy = findViewById<Button>(R.id.buttonKtoTiTakoy)
        buttonKtoTiTakoy.setOnClickListener {
            playAudio(R.raw.kto_ty_takoy_voobsche)
        }

        val buttonMyVanKhrebetPerelomim = findViewById<Button>(R.id.buttonMyVanKhrebetPerelomim)
        buttonMyVanKhrebetPerelomim.setOnClickListener {
            playAudio(R.raw.my_vam_hrebet_perelomim_vsem)
        }

        val buttonPodlostGadost = findViewById<Button>(R.id.buttonPodlostGadost)
        buttonPodlostGadost.setOnClickListener {
            playAudio(R.raw.podlost_gadost_prestupniki)
        }

        val buttonLuchshePomolchite = findViewById<Button>(R.id.buttonLuchshePomolchite)
        buttonLuchshePomolchite.setOnClickListener {
            playAudio(R.raw.poetomu_luchshe_pomolchite)
        }

        val buttonProstoyVopros = findViewById<Button>(R.id.buttonProstoyVopros)
        buttonProstoyVopros.setOnClickListener {
            playAudio(R.raw.prostoy_vopros)
        }

        val buttonPuskayKommunisti = findViewById<Button>(R.id.buttonPuskayKommunisti)
        buttonPuskayKommunisti.setOnClickListener {
            playAudio(R.raw.puskay_za_eto_kommunisty_otvetyat)
        }

        val buttonSlushayte = findViewById<Button>(R.id.buttonSlushayte)
        buttonSlushayte.setOnClickListener {
            playAudio(R.raw.slushayte_chto_ya_vam_govoryu)
        }

        val buttonSovestEstUvAS = findViewById<Button>(R.id.buttonSovestEstUVas)
        buttonSovestEstUvAS.setOnClickListener {
            playAudio(R.raw.sovest_est_u_vas)
        }

        val buttonSumashedshiy = findViewById<Button>(R.id.buttonSumasshedshiy)
        buttonSumashedshiy.setOnClickListener {
            playAudio(R.raw.sumasshedshiy_bolnoy_chelovek)
        }

        val buttonTyPochemu = findViewById<Button>(R.id.buttonTyPochemu)
        buttonTyPochemu.setOnClickListener {
            playAudio(R.raw.ty_pochemu_ne_lyubish_zhenschin)
        }

        val buttonVasVsekh = findViewById<Button>(R.id.buttonVasVsekh)
        buttonVasVsekh.setOnClickListener {
            playAudio(R.raw.vas_vseh_pod_sud)
        }

        val buttonVotTak = findViewById<Button>(R.id.buttonVotTak)
        buttonVotTak.setOnClickListener {
            playAudio(R.raw.vot_tak_nas_posylayut)
        }

        val buttonVsemDetyam = findViewById<Button>(R.id.buttonVsemDetyam)
        buttonVsemDetyam.setOnClickListener {
            playAudio(R.raw.vsem_detyam_rossii_5_yagodok)
        }

        val buttonVyChtoSUmaSoshli = findViewById<Button>(R.id.buttonVyChtoSUmaSoshli)
        buttonVyChtoSUmaSoshli.setOnClickListener {
            playAudio(R.raw.vy_chto_s_uma_soshli_vse)
        }

        val buttonVyOskorblyaete = findViewById<Button>(R.id.buttonVyOskorblyaete)
        buttonVyOskorblyaete.setOnClickListener {
            playAudio(R.raw.vy_oskorblyaete_ves_narod)
        }

        val buttonVySouchastniki = findViewById<Button>(R.id.buttonVySouchastniki)
        buttonVySouchastniki.setOnClickListener {
            playAudio(R.raw.vy_souchastniki)
        }

        val buttonVyVseBessovestniye = findViewById<Button>(R.id.buttonVyVseBessovesyniye)
        buttonVyVseBessovestniye.setOnClickListener {
            playAudio(R.raw.vy_vse_bezsovestnye)
        }

        val buttonVyyditeVon = findViewById<Button>(R.id.buttonVyyditeVon)
        buttonVyyditeVon.setOnClickListener {
            playAudio(R.raw.vyydite_von_otsyuda)
        }

        val buttonYaGovoruZamolchite = findViewById<Button>(R.id.buttonYaGovoruZamolchite)
        buttonYaGovoruZamolchite.setOnClickListener {
            playAudio(R.raw.ya_govoryu_zamolchite)
        }

        val buttonYaProtiv = findViewById<Button>(R.id.buttonYaProtiv)
        buttonYaProtiv.setOnClickListener {
            playAudio(R.raw.ya_protiv)
        }

        val buttonYaTakoy = findViewById<Button>(R.id.buttonYaTakoy)
        buttonYaTakoy.setOnClickListener {
            playAudio(R.raw.ya_takoy_kakoy_est)
        }

        val buttonYaVykinu = findViewById<Button>(R.id.buttonYaVykinu)
        buttonYaVykinu.setOnClickListener {
            playAudio(R.raw.ya_vykinu_vas_iz_moskvy)
        }

        val buttonYaZanyat = findViewById<Button>(R.id.buttonYaZanyat)
        buttonYaZanyat.setOnClickListener {
            playAudio(R.raw.ya_zanyat)
        }

        val buttonZaMenya = findViewById<Button>(R.id.buttonZaMenya)
        buttonZaMenya.setOnClickListener {
            playAudio(R.raw.za_menya)
        }

        val buttonZvonok = findViewById<Button>(R.id.buttonZvonok)
        buttonZvonok.setOnClickListener {
            playAudio(R.raw.zvonok_osoboy_gosudarstvennoy_vazhnosti)
        }
    }

    private fun playAudio(audioId : Int) {
        if (mediaPlayer.isPlaying) {
            mediaPlayer.stop()
        }
        mediaPlayer = MediaPlayer.create(this, audioId)
        mediaPlayer.start()
    }

    private fun setFullScreen() {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
    }
}