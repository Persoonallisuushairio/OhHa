Tuntikirjanpito
--

**31.07.2014 torstai**
2h: projektin alkuvalmistelut ja aihem��rittely

**02.07. lauantai**
0,5h: tehty luokkakaavio, mietitty tarkemmin mit� toiminnallisuutta ja millaisia metodeja halutaan

**03.08. sunnuntai**
3,5h: luotu yksinkertainen pohja k�ytt�liittym�lle, jolla testata toimintalogiikkaa
	lis�ksi luotu luokkia, hahmo luokkaan liikkumis-metodi

**11.08 maanantai**
3h: luotu luokka "NappaimistonKuuntelija", hahmo liikkuu nyt nuolin�pp�imist�
	pari testi�

**12.08. tiistai**
1h: pyrkimyst� ohjelman rakenteen j�rkev�itt�miseen

**14.08 torstai**
3h: hahmoPysyyRuudussa-metodi luotu, lis�� testej�

**24.08. sunnuntai**
1h: refaktorointia

**28.08. torstai**
1,5h: lis�� refaktorointia, paria metodia paranneltu

**29.08. perjantai**
0,5h: peli tunnistaa, kun pallo t�rm�� delfiiiniin

**31.08. sunnuntai**
4h: lis�� refaktorointia (luotu luokka "mallit"), tehty peliin ajastintoiminto (mm. luokka AjastimenKuuntelija) ja muuta pallojen
liikett� m��ritt�vi� metodeja

**1.09. maanantai**
4h: Luotu koko pelin peruspohja kuntoon: Oikeasta reunasta valuu nyt jatkuvalla sy�t�ll� sek� poimittavia, ett� v�istett�vi� palloja.
	Kun poimittavaan osuu, se "katoaa" (piirtyy uudestaan valumaan oikeasta reunasta), ja pelin pistelaskurin arvo lis��ntyy.
	Sek� punaiset, ett� siniset pallot piirtyv�t uudestaan oikeaan reunaan saavuttaessaan vasemman.
	Metodeina: Peli-luokkaan laajennettu pallojenLiike()-metodia ja lis�tty laskurinArvoKasvaa(). Peli luokalla on nyt muuttujina
	my�s Random ja pistelaskuri.
