package com.kardelenapp.matematikformulleri;

import android.support.v4.app.Fragment;;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.graphics.Color;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.View;
import android.widget.LinearLayout;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.holder.BadgeStyle;
import com.mikepenz.materialdrawer.model.ExpandableBadgeDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
LinearLayout layout;

AdsController adsController;

    final AnaSayfaFragment newFragment = new AnaSayfaFragment();
    final HakkindaFragment hakkindaFragment = new HakkindaFragment();

    final KumelerFragment kumelerFragment = new KumelerFragment();
    final ArdisikSayilarFragment ardisikSayilarFragment = new ArdisikSayilarFragment();
    final CarpanlaraAyirmaFragment carpanlaraAyirmaFragment = new CarpanlaraAyirmaFragment();
    final CiftAciFragment ciftAciFragment = new CiftAciFragment();
    final CokgenFragment cokgenFragment = new CokgenFragment();
    final CosinusFragment cosinusFragment = new CosinusFragment();
    final DaireFragment daireFragment = new DaireFragment();
    final DevirliFragment devirliFragment = new DevirliFragment();
    final DikdortgenFragment dikdortgenFragment = new DikdortgenFragment();
    final ElipsFragment elipsFragment = new ElipsFragment();
    final ElipsoidFragment elipsoidFragment = new ElipsoidFragment();
    final FaizFragment faizFragment = new FaizFragment();
    final FaktoriyelFragment faktoriyelFragment = new FaktoriyelFragment();
    final KokluSayilarFragment kokluSayilarFragment = new KokluSayilarFragment();
    final KombinasyonFragment kombinasyonFragment = new KombinasyonFragment();
    final KoniFragment koniFragment = new KoniFragment();
    final KosekantFragment kosekantFragment = new KosekantFragment();
    final KotanjantFragment kotanjantFragment = new KotanjantFragment();
    final KureFragment kureFragment = new KureFragment();
    final MerkeziEgilimFragment merkeziEgilimFragment = new MerkeziEgilimFragment();
    final MutlakDegerFragment mutlakDegerFragment = new MutlakDegerFragment();
    final OlasilikFragment olasilikFragment = new OlasilikFragment();
    final OranOrantiFragment oranOrantiFragment = new OranOrantiFragment();
    final OrtalamaCesitleriFragment ortalamaCesitleriFragment = new OrtalamaCesitleriFragment();
    final ParaboidFragment paraboidFragment = new ParaboidFragment();
    final ParabolFragment parabolFragment = new ParabolFragment();
    final ParalelKenarFragment paralelKenarFragment = new ParalelKenarFragment();
    final PermutasyonFragment permutasyonFragment = new PermutasyonFragment();
    final PiramidFragment piramidFragment = new PiramidFragment();
    final PrizmalarFragment prizmalarFragment = new PrizmalarFragment();
    final RadyantFragment radyantFragment = new RadyantFragment();
    final SekantFragment sekantFragment = new SekantFragment();
    final SilidirFragment silidirFragment = new SilidirFragment();
    final SimitFragment simitFragment = new SimitFragment();
    final SinusFragment sinusFragment = new SinusFragment();
    final TamBolenlerFragment tamBolenlerFragment = new TamBolenlerFragment();
    final TanjantFragment tanjantFragment = new TanjantFragment();
    final TrigonometriFragment trigonometriFragment = new TrigonometriFragment();
    final TrigonometrikDegerFragment trigonometrikDegerFragment = new TrigonometrikDegerFragment();
    final TrigonometrikFarkFragment trigonometrikFarkFragment = new TrigonometrikFarkFragment();
    final UsluSayilarFragment usluSayilarFragment = new UsluSayilarFragment();
    final YamukFragment yamukFragment = new YamukFragment();
    final YayFragment yayFragment = new YayFragment();
    final UcgenFragment ucgenFragment = new UcgenFragment();
    final OndalikFragment ondalikFragment = new OndalikFragment();
    final IrrasyonelFragment irrasyonelFragment = new IrrasyonelFragment();
    final KarmasikFragment karmasikFragment = new KarmasikFragment();

    final FragmentManager fragmentManager = this.getSupportFragmentManager();
    final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


    final PrimaryDrawerItem home = new PrimaryDrawerItem().withIdentifier(1).withName("Ana Sayfa");
    final PrimaryDrawerItem hakkinda = new PrimaryDrawerItem().withIdentifier(1).withName("Hakkında");
    final SecondaryDrawerItem kumeler = new SecondaryDrawerItem().withIdentifier(1).withName("Kümeler").withIcon(R.drawable.kumeler_icon);
    final SecondaryDrawerItem ardisikSayilar = new SecondaryDrawerItem().withIdentifier(1).withName("Ardışık Sayılar");
    final SecondaryDrawerItem carpanlaraAyirma = new SecondaryDrawerItem().withIdentifier(1).withName("Çarpanlara Ayırma");
    final SecondaryDrawerItem ciftAci = new SecondaryDrawerItem().withIdentifier(1).withName("Çift Açı Formülleri");
    final SecondaryDrawerItem cokgen = new SecondaryDrawerItem().withIdentifier(1).withName("Çokgen");
    final SecondaryDrawerItem cos = new SecondaryDrawerItem().withIdentifier(1).withName("Kosinüs Fonksiyonu");
    final SecondaryDrawerItem daire = new SecondaryDrawerItem().withIdentifier(1).withName("Daire");
    final SecondaryDrawerItem devirli = new SecondaryDrawerItem().withIdentifier(1).withName("Devirli Sayılar");
    final SecondaryDrawerItem dikdortgen = new SecondaryDrawerItem().withIdentifier(1).withName("Dikdörtgen");
    final SecondaryDrawerItem elips = new SecondaryDrawerItem().withIdentifier(1).withName("Elips");
    final SecondaryDrawerItem elipsoid = new SecondaryDrawerItem().withIdentifier(1).withName("Elipsoid");
    final SecondaryDrawerItem faiz = new SecondaryDrawerItem().withIdentifier(1).withName("Faiz Hesaplama");
    final SecondaryDrawerItem faktoriyel = new SecondaryDrawerItem().withIdentifier(1).withName("Faktöriyel");
    final SecondaryDrawerItem kokluSayilar = new SecondaryDrawerItem().withIdentifier(1).withName("Köklü Sayılar");
    final SecondaryDrawerItem kombinasyon = new SecondaryDrawerItem().withIdentifier(1).withName("Kombinasyon");
    final SecondaryDrawerItem koni = new SecondaryDrawerItem().withIdentifier(1).withName("Koni");
    final SecondaryDrawerItem kosekant = new SecondaryDrawerItem().withIdentifier(1).withName("Kosekant Fonksiyonu");
    final SecondaryDrawerItem kotanjant = new SecondaryDrawerItem().withIdentifier(1).withName("Kotanjant Fonksiyonu");
    final SecondaryDrawerItem kure = new SecondaryDrawerItem().withIdentifier(1).withName("Küre");
    final SecondaryDrawerItem merkeziEgilim = new SecondaryDrawerItem().withIdentifier(1).withName("Merkezi Eğilim ve Yayılım Ölçüleri");
    final SecondaryDrawerItem mutlakDeger = new SecondaryDrawerItem().withIdentifier(1).withName("Mutlak Değer");
    final SecondaryDrawerItem olasilik = new SecondaryDrawerItem().withIdentifier(1).withName("Olasılık");
    final SecondaryDrawerItem oranOranti = new SecondaryDrawerItem().withIdentifier(1).withName("Oran - Orantı");
    final SecondaryDrawerItem ortalamaCesitleri = new SecondaryDrawerItem().withIdentifier(1).withName("Ortalama Çeşitleri");
    final SecondaryDrawerItem paraboid = new SecondaryDrawerItem().withIdentifier(1).withName("Paraboid");
    final SecondaryDrawerItem parabol = new SecondaryDrawerItem().withIdentifier(1).withName("Parabol");
    final SecondaryDrawerItem paralelKenar = new SecondaryDrawerItem().withIdentifier(1).withName("Paralel Kenar");
    final SecondaryDrawerItem permutasyon = new SecondaryDrawerItem().withIdentifier(1).withName("Permütasyon");
    final SecondaryDrawerItem piramid = new SecondaryDrawerItem().withIdentifier(1).withName("Piramid");
    final SecondaryDrawerItem prizmalar = new SecondaryDrawerItem().withIdentifier(1).withName("Prizmalar");
    final SecondaryDrawerItem radyant = new SecondaryDrawerItem().withIdentifier(1).withName("Radyant");
    final SecondaryDrawerItem sekant = new SecondaryDrawerItem().withIdentifier(1).withName("Sekant Fonksiyonu");
    final SecondaryDrawerItem silindir = new SecondaryDrawerItem().withIdentifier(1).withName("Silindir");
    final SecondaryDrawerItem simit = new SecondaryDrawerItem().withIdentifier(1).withName("Simit");
    final SecondaryDrawerItem sinus = new SecondaryDrawerItem().withIdentifier(1).withName("Sinüs Fonksiyonu");
    final SecondaryDrawerItem tamBoleneler = new SecondaryDrawerItem().withIdentifier(1).withName("Tam Bölenler");
    final SecondaryDrawerItem tanjant = new SecondaryDrawerItem().withIdentifier(1).withName("Tanjant");
    final SecondaryDrawerItem trigonometri = new SecondaryDrawerItem().withIdentifier(1).withName("Trigonometri");
    final SecondaryDrawerItem usluSayilar = new SecondaryDrawerItem().withIdentifier(1).withName("Üsli Sayılar");
    final SecondaryDrawerItem trigonometrikDeger = new SecondaryDrawerItem().withIdentifier(1).withName("Trigonometrik Fonksiyonları Değerleri");
    final SecondaryDrawerItem trigonometrikFark = new SecondaryDrawerItem().withIdentifier(1).withName("Trigonometrik Farklar");
    final SecondaryDrawerItem yamuk = new SecondaryDrawerItem().withIdentifier(1).withName("Yamuk");
    final SecondaryDrawerItem yay = new SecondaryDrawerItem().withIdentifier(1).withName("Yay");
    final SecondaryDrawerItem ucgen = new SecondaryDrawerItem().withIdentifier(1).withName("Üçgen");
    final SecondaryDrawerItem ondalik_sayilar = new SecondaryDrawerItem().withIdentifier(1).withName("Ondalık Sayılar");
    final SecondaryDrawerItem irrasyonel_sayilar = new SecondaryDrawerItem().withIdentifier(1).withName("İrrasyönel Sayılar");
    final SecondaryDrawerItem karmasik_sayilar = new SecondaryDrawerItem().withIdentifier(1).withName("Karmaşık Sayılar");

    ExpandableBadgeDrawerItem geometriGrup =  new ExpandableBadgeDrawerItem().withName("Geometri").withIdentifier(1).withSelectable(false).withBadgeStyle(new BadgeStyle().withTextColor(Color.WHITE).withColorRes(R.color.md_red_700)).withBadge("18").withIcon(R.drawable.geo_icon);
    final ExpandableBadgeDrawerItem trigonometriGrup =  new ExpandableBadgeDrawerItem().withName("Trigonometri").withIdentifier(1).withSelectable(false).withBadgeStyle(new BadgeStyle().withTextColor(Color.WHITE).withColorRes(R.color.md_red_700)).withBadge("10").withIcon(R.drawable.tri_icon);
    ExpandableBadgeDrawerItem sayilarGrup =  new ExpandableBadgeDrawerItem().withName("Sayilar").withIdentifier(1).withSelectable(false).withBadgeStyle(new BadgeStyle().withTextColor(Color.WHITE).withColorRes(R.color.md_red_700)).withBadge("14").withIcon(R.drawable.sayilar_icon);
    ExpandableBadgeDrawerItem olasilikGrup =  new ExpandableBadgeDrawerItem().withName("Olasılık").withIdentifier(1).withSelectable(false).withBadgeStyle(new BadgeStyle().withTextColor(Color.WHITE).withColorRes(R.color.md_red_700)).withBadge("4").withIcon(R.drawable.olasilik_icon);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.fragment) != null) {
            if(savedInstanceState == null) {




                fragmentTransaction.add(R.id.fragment, newFragment, "Ana Sayfa");
                fragmentTransaction.commit();




            } else {

            }



        }



        adsController = new AdsController(this);
        layout = (LinearLayout) findViewById(R.id.adsContainer);
        adsController.loadBanner(layout);
        toolbar = (Toolbar) findViewById(R.id.toolbar_item);
        toolbar.setTitleTextColor(Color.WHITE);

        createDrawer();







    }

    public void sayfayaGec(Drawer drawer, Fragment newfragment, String string ){
        toolbar.setTitle(string);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.fragment, newfragment, string);
        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
        drawer.closeDrawer();
    }

    public void createDrawer(){
        final DrawerBuilder result = new DrawerBuilder();
        final Drawer drawer = result.withActivity(this)
                .withToolbar(toolbar)
                .withTranslucentStatusBar(false)
                .withActionBarDrawerToggle(true)
                .withActionBarDrawerToggleAnimated(true)
                .withFullscreen(false)
                .withHeaderPadding(true)
                .withCloseOnClick(true)
                .withRootView(R.id.relative)
                .withDrawerLayout(R.layout.material_drawer_fits_not)
                .withDisplayBelowStatusBar(false).build();

        result.addDrawerItems(
                home,
                kumeler,
                sayilarGrup.withSubItems(
                        ardisikSayilar,
                        ondalik_sayilar,
                        devirli,
                        irrasyonel_sayilar,
                        kokluSayilar,
                        usluSayilar,
                        karmasik_sayilar,
                        oranOranti,
                        tamBoleneler,
                        ortalamaCesitleri,
                        mutlakDeger,
                        merkeziEgilim,
                        carpanlaraAyirma,
                        faiz
                ),
                olasilikGrup.withSubItems(
                        faktoriyel,
                        permutasyon,
                        kombinasyon,
                        olasilik
                ),
                geometriGrup.withSubItems(
                        dikdortgen,
                        ucgen,
                        cokgen,
                        yay,
                        daire,
                        yamuk,
                        silindir,
                        simit,
                        radyant,
                        prizmalar,
                        piramid,
                        paralelKenar,
                        parabol,
                        paraboid,
                        kure,
                        koni,
                        elips,
                        elipsoid

                ),
                trigonometriGrup.withSubItems(
                        ciftAci,
                        trigonometri,
                        trigonometrikFark,
                        trigonometrikDeger,
                        sinus,
                        sekant,
                        tanjant,
                        kotanjant,
                        kosekant,
                        cos
                ),
                hakkinda)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        if (drawerItem == home) {
                            sayfayaGec(drawer, newFragment,"Ana Sayfa");
                        }else if (drawerItem == hakkinda ){
                            sayfayaGec(drawer, hakkindaFragment,"Hakkında");
                        }else if (drawerItem == kumeler ){
                            sayfayaGec(drawer, kumelerFragment,"Kümeler");
                        }else if (drawerItem == ardisikSayilar ){
                            sayfayaGec(drawer, ardisikSayilarFragment,"Ardışık sayılar");
                        }else if (drawerItem == carpanlaraAyirma ){
                            sayfayaGec(drawer, carpanlaraAyirmaFragment,"Çarpanlara Ayırma");
                        }else if (drawerItem == ciftAci ){
                            sayfayaGec(drawer, ciftAciFragment,"Çift Açı Formülleri");
                        }else if (drawerItem == cokgen ){
                            sayfayaGec(drawer, cokgenFragment,"Çokgen");
                        }else if (drawerItem == cos ){
                            sayfayaGec(drawer, cosinusFragment,"Kosinüs");
                        }else if (drawerItem == daire ){
                            sayfayaGec(drawer, daireFragment,"Daire");
                        }else if (drawerItem == devirli ){
                            sayfayaGec(drawer, devirliFragment,"Devirli Sayılar");
                        }else if (drawerItem == dikdortgen ){
                            sayfayaGec(drawer, dikdortgenFragment,"Dikdörtgen");
                        }else if (drawerItem == elips ){
                            sayfayaGec(drawer, elipsFragment,"Elips");
                        }else if (drawerItem == elipsoid ){
                            sayfayaGec(drawer, elipsoidFragment,"Elipsoid");
                        }else if (drawerItem == faiz ){
                            sayfayaGec(drawer, faizFragment,"Faiz Problemleri");
                        }else if (drawerItem == faktoriyel ){
                            sayfayaGec(drawer, faktoriyelFragment,"Faktöriyel");
                        }else if (drawerItem == kokluSayilar ){
                            sayfayaGec(drawer, kokluSayilarFragment,"Köklü Sayılar");
                        }else if (drawerItem == kombinasyon ){
                            sayfayaGec(drawer, kombinasyonFragment,"Kombinasyon");
                        }else if (drawerItem == koni ){
                            sayfayaGec(drawer, koniFragment,"Koni");
                        }else if (drawerItem == kosekant ){
                            sayfayaGec(drawer, kosekantFragment,"Kosekant");
                        }else if (drawerItem == kotanjant ){
                            sayfayaGec(drawer, kotanjantFragment,"Kotanjant");
                        }else if (drawerItem == kure ){
                            sayfayaGec(drawer, kureFragment,"Küre");
                        }else if (drawerItem == merkeziEgilim ){
                            sayfayaGec(drawer, merkeziEgilimFragment,"Merkezi Eğilim ve Yayılım Ölçüleri");
                        }else if (drawerItem == mutlakDeger ){
                            sayfayaGec(drawer, mutlakDegerFragment,"Mutlak Değer");
                        }
                        else if (drawerItem == olasilik ){
                            sayfayaGec(drawer, olasilikFragment,"Olasılık");
                        }else if (drawerItem == oranOranti ){
                            sayfayaGec(drawer, oranOrantiFragment,"Oran - Orantı");
                        }else if (drawerItem == ortalamaCesitleri ){
                            sayfayaGec(drawer, ortalamaCesitleriFragment,"Ortalama Çeşitleri");
                        }else if (drawerItem == paraboid ){
                            sayfayaGec(drawer, paraboidFragment,"Paraboid");
                        }else if (drawerItem == parabol ){
                            sayfayaGec(drawer, parabolFragment,"Parabol");
                        }else if (drawerItem == paralelKenar ){
                            sayfayaGec(drawer, paralelKenarFragment,"Paralel Kenar");
                        }else if (drawerItem == permutasyon ){
                            sayfayaGec(drawer, permutasyonFragment,"Parmütasyon");
                        }else if (drawerItem == piramid ){
                            sayfayaGec(drawer, piramidFragment,"Piramid ");
                        }else if (drawerItem == prizmalar ){
                            sayfayaGec(drawer, prizmalarFragment,"Prizmalar");
                        }else if (drawerItem == radyant ){
                            sayfayaGec(drawer, radyantFragment,"Radyant");
                        }else if (drawerItem == sekant ){
                            sayfayaGec(drawer, sekantFragment,"Sekant");
                        }else if (drawerItem == silindir ){
                            sayfayaGec(drawer, silidirFragment,"Silindir");
                        }else if (drawerItem == simit ){
                            sayfayaGec(drawer, simitFragment,"Simit");
                        }else if (drawerItem == sinus ){
                            sayfayaGec(drawer, sinusFragment,"Sinüs");
                        }else if (drawerItem == tamBoleneler ){
                            sayfayaGec(drawer, tamBolenlerFragment,"Tam Bölenler");
                        }else if (drawerItem == tanjant ){
                            sayfayaGec(drawer, tanjantFragment,"Tanjant");
                        }else if (drawerItem == trigonometri ){
                            sayfayaGec(drawer, trigonometriFragment,"Trigonometri");
                        }else if (drawerItem == trigonometrikDeger ){
                            sayfayaGec(drawer, trigonometrikDegerFragment,"Trigonometrik Değerler");
                        }else if (drawerItem == trigonometrikFark ){
                            sayfayaGec(drawer, trigonometrikFarkFragment,"Trigonometrik Farklar");
                        }else if (drawerItem == ucgen ){
                            sayfayaGec(drawer, ucgenFragment,"Üçgen");
                        }else if (drawerItem == usluSayilar ){
                            sayfayaGec(drawer, usluSayilarFragment,"Üslü Sayılar");
                        }else if (drawerItem == yamuk ){
                            sayfayaGec(drawer, yamukFragment,"Yamuk");
                        }else if (drawerItem == yay ){
                            sayfayaGec(drawer, yayFragment,"Yay");
                        }else if (drawerItem == ondalik_sayilar ){
                            sayfayaGec(drawer, ondalikFragment,"Ondalık Sayılar");
                        }else if (drawerItem == irrasyonel_sayilar ){
                            sayfayaGec(drawer, irrasyonelFragment,"İrrasyönel Sayılar");
                        }else if (drawerItem == karmasik_sayilar  ){
                            sayfayaGec(drawer, karmasikFragment,"Karmaşık Sayılar");
                        }


                        return true;
                    }});
    }

}


