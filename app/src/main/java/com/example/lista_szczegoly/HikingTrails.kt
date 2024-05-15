package com.example.lista_szczegoly

class HikingTrails(private val name: String, private val description: String, private val image: Int) {
    companion object {
        val trails = arrayOf(
            HikingTrails(
                "Z Zakopanego Przez Dolinę Strążyską",
                "Będzie to nasza pierwsza propozycja wycieczki na Giewont, do której mamy ogromną słabość a trasa ma spory potencjał i zaskakujący finał. Zapraszamy zatem na wędrówkę, która ma tutaj wszystko, co w górach najpiękniejsze – czarującą dolinę, szumiący wodospad, magiczny szczyt oraz wyśmienity punkt widokowy na tenże wierzchołek. " +
                        "Samochód możemy zostawić na jednym z kilku parkingów u wylotu Doliny Strążyskiej. Warto rozeznać się w cenach, ponieważ różnią się od siebie. Do wylotu doliny dociera również zakopiańska komunikacja. \n\n" +
                        "Początek szlaku na Giewont wiedzie dnem uroczej Doliny Strążyskiej, skąd z pomiędzy listowia drzew przebija się wysoko cel wędrówki, nasz Śpiący Rycerz. Gdy osiągniemy Polanę Strążyską, na której znajduje się skałka Sfinks, kilka szałasów oraz czynna w sezonie herbaciarnia, szlak na Giewont odbija przez mostek nad Potokiem Strążyskim w prawo." +
                        " Natomiast warto podejść jeszcze prosto, wprost, pod Wodospad Siklawica (30 min do wodospadu i z powrotem). \n",
                R.drawable.image1_zakopane,
            ),
            HikingTrails(
                "Giewont przez Dolinę Małej Łąki",
                "Wejście na Giewont wariantem czwartym, czyli przez Dolinę Małej Łąki może okazać się opcją, która pozwoli uniknąć nam większych tłumów. Samochód możemy zostawić na płatnym parkingu przy kasie TPN w Groniku. A wybierając dojazd komunikacją publiczną, dotrzemy tutaj w 10 minut z centrum Zakopanego (kursują tutaj busy kierujące się w stronę Doliny Kościeliskiej oraz Chochołowskiej).\n" +
                        "\n" +
                        "Początkowo trasa na Giewont prowadzi w towarzystwie żółtych szlakówek prowadząc nas w otchłań Doliny Małej Łąki. Po godzinie spaceru dotrzemy do wybitnie czarującej i onieśmielającej Wielkiej Polany Małołąckiej. Będzie to idealne miejsce na chwilę odpoczynku przed dalszą wędrówką. Już tutaj będziemy mogli zerknąć na Giewont. " +
                        "O rozmiarach Wielkiej Polany Małołąckiej niechaj świadczy fakt, że spaceruje się nią aż 20 minut, nim znów zatopimy się leśnej głuszy. I wówczas rozpocznie się intensywna część wycieczki. Po drodze, ogromne wrażenia na tatrzańskich turystach robią ściany Wielkiej Turni, jak również wybornie prezentuje się  Mnich Małołącki. " +
                        "Wdrapując się Głazistym Żlebem dotrzemy na Kondracką Przełęcz. \n",
                R.drawable.image2_giewont,
            ),
            HikingTrails(
                "Giewont i Kasprowy w jeden dzień",
                "Jeśli tylko mamy czas i siły, to szlak z Kasprowego Wierchu na Giewont to doskonały wybór. Lepszej opcji dotarcia na Śpiącego Rycerza nie znajdziemy! Jest to fantastyczna trasa, która wiedzie granią, miejscami nieco eksponowanymi odcinkami. Jest pięknie, widokowo i szalenie czarująco. I nieco zaskakująco, ponieważ na szlaku bywa relatywnie pusto. W pierwszej kolejności musimy dotrzeć z Kuźnic na Kasprowy Wierch. \n\n" +
                        "Szlak z Kasprowego Wierchu na Giewont zajmie nam około 3h. Część trasy widzie odrobinę eksponowany terenem z dwoma nieco bardziej czujnymi miejscami. Szlak aż na Kopę Kondracką prowadzi w asyście czerwonych szlakówek, a trasa jakby faluje. Nie ma tutaj mocnych podejść ani zejść, więc można skupić się na widokach. Niesamowicie wygląda Cicha Dolina po słowackiej stronie oraz górujące nad nią Liptowskie Kopy. \n" +
                        "\n" +
                        "Warto co jakiś czas przystanąć i spojrzeć za siebie, gdzie zmieniająca się perspektywa uwypukla Świnicę oraz Walentkową Dolinę. A na wprost mienią się Czerwone Wierchy i nasz Giewont! Prawdziwe mocniejsze podejście pojawia się dopiero od Przełęczy pod Kopą Kondracką (tutaj dociera również wariant numer dwa z Kuźnic). Na szczycie Kopy Kondrackiej, będącej jednym z czterech muszkieterów – Czerwonych Wierchów, " +
                        "pojawimy się po 1 h 40 min od Kasprowego Wierchu. Przed nami jedynie zejście na Kondracką Przełęcz (tutaj spotykamy wariant 1 i 4) i atak szczytowy na sam Giewont.\n",
                R.drawable.image3_giewont2,
            ),
            HikingTrails(
                "Giewont z Kuźnic",
                "Śmiało można rzec, że niebieski szlak z Kuźnic na Giewont jest najpopularniejszą opcją wejścia na szczyt Śpiącego Rycerza. W sezonie bywa tutaj tłoczno i gwarno. Głównie dlatego, że do Kuźnic można bardzo łatwo dostać się z centrum Zakopanego (regularnie kursują busy, jak również  można ten odcinek pokonać pieszo). Początek szlaku na Giewont zaczyna się zaraz za kolejką linową na Kasprowy Wierch i następnie przez kocie łby mija klasztor albertynek na Kalatówkach. Tutaj też są kasy Tatrzańskiego Parki Narodowego i od tej pory ścieżka staje się dużo bardziej przyjemna.\n" +
                        "\n" +
                        "Szlak po niespełna godzinie wyprowadzi nas piękną Polanę Kalatówki (ach te widoki na Kasprowy Wierch i wiosenne dywany krokusów). Możemy tutaj przysiąść na ławach oraz stolikach i skorzystać z dobrodziejstwa niewielkiego, hotelowego baru. Będzie to przyjemna przerwa w drodze na Giewont wśród pięknej panoramy. Jednak to najwięcej ochów i achów zgarnia oddalona o godzinę drogi stąd Polana Kondratowa, bo to właśnie tutaj odnajdziemy urocze i kameralne tatrzańskie schronisko na Hali Kondratowej (w remoncie do końca 2025 roku). Trzeba przyznać, że pięknie wkomponowało się w otoczenie ,a dodatkowo imponująco wygląda tutaj Polana Kondratowa oraz leżący za nią Długi Żleb Kondratowy. \n",
                R.drawable.image4_giewont3,
            ),
            HikingTrails(
                "Szlak przez Kopę Kondracką na Giewont",
                "Druga opcja dotarcia na Giewont jest rozwinięciem tej pierwszej. Często obie trasy są łączone w całość, tworząc bardzo przyjemną pętlę. Trasa z Kuźnic przez Kalatówki aż do schroniska na Hali Kondratowej jest tożsama i dopiero tutaj ścieżki rozdzielają się. Wspomniany wcześniej niebieski szlak gna po skosie w prawo w stronę Giewontu, natomiast zielony szlak, kieruje się na przełęcz pod Kopą Kondracką po skosie w lewo.\n" +
                        "\n" +
                        "Jest to ciekawa opcja, która wydłuża trasę o 1h 15 min, ale pozwala spojrzeć na Giewont z nieco innej perspektywy. Sami przyznajemy, że już kilkukrotnie daliśmy się skusić na ten wariant, gdyż jest on przepyszny widokowo! Taka pętla zajmie nam nieco ponad 7h. \n",
                R.drawable.image5_giewont4,
            )
        )
    }

    fun getName(): String {
        return name
    }

    fun getDescription(): String {
        return description
    }

    override fun toString(): String {
        return name
    }

    fun getImage(): Int {
        return image
    }
}