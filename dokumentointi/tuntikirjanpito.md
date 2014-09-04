Tuntikirjanpito
--

**31.07.2014 torstai**
2h: projektin alkuvalmistelut ja aihemäärittely

**02.07. lauantai**
0,5h: tehty luokkakaavio, mietitty tarkemmin mitä toiminnallisuutta ja millaisia metodeja halutaan

**03.08. sunnuntai**
3,5h: luotu yksinkertainen pohja käyttöliittymälle, jolla testata toimintalogiikkaa
	lisäksi luotu luokkia, hahmo luokkaan liikkumis-metodi

**11.08 maanantai**
3h: luotu luokka "NappaimistonKuuntelija", hahmo liikkuu nyt nuolinäppäimistä,
	pari testiä

**12.08. tiistai**
1h: pyrkimystä ohjelman rakenteen järkevöittämiseen

**14.08 torstai**
3h: hahmoPysyyRuudussa-metodi luotu, lisää testejä

**24.08. sunnuntai**
1h: refaktorointia

**28.08. torstai**
1,5h: lisää refaktorointia, paria metodia paranneltu

**29.08. perjantai**
0,5h: peli tunnistaa, kun pallo törmää delfiiiniin

**31.08. sunnuntai**
4h: lisää refaktorointia (luotu luokka "mallit"), tehty peliin ajastintoiminto (mm. luokka AjastimenKuuntelija) ja muuta pallojen
liikettä määrittäviä metodeja

**1.09. maanantai**
4h: Luotu koko pelin peruspohja kuntoon: Oikeasta reunasta valuu nyt jatkuvalla syötöllä sekä poimittavia, että väistettäviä palloja.
	Kun poimittavaan osuu, se "katoaa" (piirtyy uudestaan valumaan oikeasta reunasta), ja pelin pistelaskurin arvo lisääntyy.
	Sekä punaiset, että siniset pallot piirtyvät uudestaan oikeaan reunaan saavuttaessaan vasemman.
	Metodeina: Peli-luokkaan laajennettu pallojenLiike()-metodia ja lisätty laskurinArvoKasvaa(). Peli luokalla on nyt muuttujina
	myös Random ja pistelaskuri.

**2.09. tiistai**
2h: Hahmo-, delfiini-, Pistelaskuri- ja pallo-luokan junit-testit
0,5h: Pelihahmon (delfiinin) piirtäminen & skannaus tietokoneelle, jo olemassa olevan piirretyn taustan skannaus

**3.09. keskiviikko**
2h: testejä, pelin taustan skannaus koneelle

**4.09. torstai**
1,5h: refakrotointia, delfiinin ja osumatarkkuuden skaalaus
1,3h: Ajastin pysähtyy, kun delfiini osuu punaiseen palloo, delfiinin osumaa paranneltu (aiemmin peli loppui, vaikka
	punainen pallo ei ollut lähelläkään delfiiniä), lisätty peliin tausta
1,2h: taas refaktorointia, lopetusruutu & sen toiminnot, pistelaskuri nollaantuu ennen uuden pelin aloittamista	
3,5h: delfiinin liikkumista paranneltu, laitettu peli vaikeutumaan, paljon testejä
0,5h: dokumentaatiota
