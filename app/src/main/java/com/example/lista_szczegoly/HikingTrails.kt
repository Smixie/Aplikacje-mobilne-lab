package com.example.lista_szczegoly

class HikingTrails(private val name: String, private val description: String) {
    companion object {
        val trails = arrayOf(
            HikingTrails(
                "Z Zakopanego Przez Dolinę Strążyską",
                "Będzie to nasza pierwsza propozycja wycieczki na Giewont, do której mamy ogromną słabość a trasa ma spory potencjał i zaskakujący finał. Zapraszamy zatem na wędrówkę, która ma tutaj wszystko, co w górach najpiękniejsze – czarującą dolinę, szumiący wodospad, magiczny szczyt oraz wyśmienity punkt widokowy na tenże wierzchołek. " +
                        "Samochód możemy zostawić na jednym z kilku parkingów u wylotu Doliny Strążyskiej. Warto rozeznać się w cenach, ponieważ różnią się od siebie. Do wylotu doliny dociera również zakopiańska komunikacja. \n\n" +
                        "Początek szlaku na Giewont wiedzie dnem uroczej Doliny Strążyskiej, skąd z pomiędzy listowia drzew przebija się wysoko cel wędrówki, nasz Śpiący Rycerz. Gdy osiągniemy Polanę Strążyską, na której znajduje się skałka Sfinks, kilka szałasów oraz czynna w sezonie herbaciarnia, szlak na Giewont odbija przez mostek nad Potokiem Strążyskim w prawo." +
                        " Natomiast warto podejść jeszcze prosto, wprost, pod Wodospad Siklawica (30 min do wodospadu i z powrotem)."
            ),
            HikingTrails(
                "Giewont przez Dolinę Małej Łąki",
                "Wejście na Giewont wariantem czwartym, czyli przez Dolinę Małej Łąki może okazać się opcją, która pozwoli uniknąć nam większych tłumów. Samochód możemy zostawić na płatnym parkingu przy kasie TPN w Groniku. A wybierając dojazd komunikacją publiczną, dotrzemy tutaj w 10 minut z centrum Zakopanego (kursują tutaj busy kierujące się w stronę Doliny Kościeliskiej oraz Chochołowskiej).\n" +
                        "\n" +
                        "Początkowo trasa na Giewont prowadzi w towarzystwie żółtych szlakówek prowadząc nas w otchłań Doliny Małej Łąki. Po godzinie spaceru dotrzemy do wybitnie czarującej i onieśmielającej Wielkiej Polany Małołąckiej. Będzie to idealne miejsce na chwilę odpoczynku przed dalszą wędrówką. Już tutaj będziemy mogli zerknąć na Giewont. " +
                        "O rozmiarach Wielkiej Polany Małołąckiej niechaj świadczy fakt, że spaceruje się nią aż 20 minut, nim znów zatopimy się leśnej głuszy. I wówczas rozpocznie się intensywna część wycieczki. Po drodze, ogromne wrażenia na tatrzańskich turystach robią ściany Wielkiej Turni, jak również wybornie prezentuje się  Mnich Małołącki. " +
                        "Wdrapując się Głazistym Żlebem dotrzemy na Kondracką Przełęcz."
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
}