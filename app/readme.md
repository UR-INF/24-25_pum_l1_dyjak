
---

### README: **Joeks**

---

## **Opis Projektu**

**Joeks** to mobilna aplikacja na platformę Android, która łączy zabawę z funkcjonalnością geolokalizacyjną. Jej głównym celem jest zapewnienie rozrywki użytkownikom poprzez losowanie żartów ("sucharów") po dotarciu do wyznaczonych lokalizacji na mapie, nazywanych **"JoekStopami"**. Inspirując się mechaniką gry *Pokemon GO*, aplikacja zachęca użytkowników do odkrywania wyznaczonych punktów na mapie, gdzie mogą "odblokować" nowego żarta. Dodatkowo, aplikacja korzysta z systemu powiadomień, aby poinformować użytkownika o zbliżeniu się do najbliższego JoekStopu.

---

## **Funkcjonalności**

1. **Interaktywne punkty na mapie – JoekStopy**
    - Na mapie (wykorzystującej OpenStreetMap) znajdują się specjalnie oznaczone punkty – JoekStopy.
    - Gdy użytkownik znajdzie się w określonym promieniu od JoekStopu, aplikacja:
        - Powiadamia go o dostępności punktu (poprzez powiadomienie push).
        - Pozwala wylosować nowego żarta po kliknięciu w punkt na mapie.
    - Mechanizm może być rozszerzony o dodatkowe funkcjonalności, takie jak: zdobywanie punktów, odblokowywanie kolejnych żartów lub dzielenie się nimi w mediach społecznościowych.

2. **Losowanie żartów**
    - Użytkownik, będąc w JoekStopie, może losować zabawne suchary i wyświetlać je w dedykowanej sekcji.
    - Żarty nie są ograniczone do tematyki informatycznej – mogą dotyczyć różnych dziedzin, takich jak humor codzienny, dowcipy sytuacyjne, czy zagadki słowne.
    - Możliwość rozszerzenia o lokalne żarty specyficzne dla danego regionu.

3. **Mapa OpenStreetMap**
    - Interaktywna mapa pozwala na eksplorację terenu, przeglądanie lokalizacji JoekStopów oraz nawigację do wybranego punktu.
    - Obsługuje gesty takie jak zoom i przesuwanie mapy.

4. **Powiadomienia push**
    - Aplikacja wykorzystuje lokalizację GPS, aby:
        - Monitorować położenie użytkownika.
        - Wysyłać powiadomienia push, gdy użytkownik znajdzie się w pobliżu JoekStopu.
    - Powiadomienia działają w tle, co pozwala użytkownikowi na swobodne korzystanie z urządzenia, a aplikacja przypomina mu o JoekStopach.

5. **Minimalistyczny interfejs użytkownika**
    - Ekran główny zawiera:
        - Mapę z zaznaczonymi punktami JoekStopów.
        - Sekcję wyświetlania wylosowanego żartu.
        - Przycisk do odblokowania żartu w JoekStopie.

---

## **Moduły i Wykorzystane Technologie**

1. **Geolokalizacja**
    - Mechanizm GPS do monitorowania pozycji użytkownika w czasie rzeczywistym.
    - Wyznaczanie obszaru (promienia) wokół JoekStopów, w którym użytkownik może wchodzić w interakcję z punktami.
    - Możliwość przyszłego rozszerzenia o bardziej zaawansowaną analizę lokalizacji (np. geokodowanie adresów, trasy).

2. **OpenStreetMap (OSM)**
    - Otwarta i darmowa technologia mapowa do wyświetlania interaktywnych map.
    - Biblioteka `osmdroid` używana do renderowania map i obsługi punktów (JoekStopów).

3. **Powiadomienia push**
    - Wykorzystanie systemowych powiadomień Androida (np. poprzez **Firebase Cloud Messaging**) do przypominania o JoekStopach w pobliżu.

4. **Losowanie żartów**
    - Wbudowana lista żartów (lokalna baza danych).
    - Możliwość przyszłej integracji z API, które dostarcza nowe żarty w czasie rzeczywistym.

5. **Backend (opcjonalnie)**
    - Możliwość synchronizacji punktów JoekStopów z serwerem.
    - W przyszłości: dodawanie nowych JoekStopów przez administratora lub społeczność.

---

## **Przykładowy Scenariusz Działania**

1. Użytkownik uruchamia aplikację.
2. Na ekranie widzi mapę, na której oznaczone są JoekStopy.
3. Gdy użytkownik zbliża się do jednego z punktów, aplikacja wysyła powiadomienie:  
   _"Jesteś blisko JoekStopu! Odkryj nowy suchar!"_
4. Użytkownik otwiera aplikację, klika w JoekStop, a następnie wylosowany żart wyświetla się w dedykowanej sekcji.
5. Użytkownik może zapisać żart na później lub podzielić się nim ze znajomymi.

---

## **Cel Projektu**

**Joeks** ma za zadanie:
- Połączyć zabawę z aktywnością fizyczną i eksploracją przestrzeni.
- Promować interakcję z mapami oraz motywować użytkowników do wychodzenia z domu.
- Zapewnić użytkownikom dawkę humoru w każdej chwili i miejscu.

Projekt jest doskonałym przykładem aplikacji wykorzystującej geolokalizację, powiadomienia push oraz interaktywne mapy.

---

## **Potencjalny Rozwój**

1. **Personalizacja treści**
    - Możliwość wyboru kategorii żartów (np. rodzinne, sytuacyjne, czarny humor).
    - Dodawanie żartów przez użytkowników do wspólnej bazy.

2. **Gamifikacja**
    - Zdobywanie punktów za odwiedzanie JoekStopów.
    - Odblokowywanie kolejnych poziomów lub rzadkich żartów.

3. **Tryb offline**
    - Możliwość zapisywania map i JoekStopów na urządzeniu, aby działały bez połączenia z internetem.

4. **Społecznościowa mapa JoekStopów**
    - Użytkownicy mogą oznaczać nowe JoekStopy na mapie.
    - System głosowania nad nowymi punktami.

5. **Integracja z mediami społecznościowymi**
    - Dzielenie się żartami i osiągnięciami z aplikacji w mediach społecznościowych.

---

## **Wymagania Techniczne**

- **System operacyjny:** Android 7.0 (API level 24) lub nowszy
- **Biblioteki:**
    - `osmdroid` do obsługi map.
    - Firebase (opcjonalnie, dla powiadomień push).
- **Dostęp do internetu** dla aktualizacji JoekStopów i kafelków mapy.
- **GPS** w urządzeniu.

---

## **Jak Uruchomić Projekt**

1. Skonfiguruj środowisko Android Studio.
2. Dodaj bibliotekę `osmdroid` oraz inne wymagane zależności do pliku `build.gradle`.
3. Skonfiguruj dostęp do lokalizacji w aplikacji (upewnij się, że uprawnienia GPS są prawidłowo ustawione).
4. Uruchom aplikację na urządzeniu fizycznym lub emulatorze (w emulatorze konieczne jest ustawienie symulacji lokalizacji).
5. Eksploruj mapę i odkrywaj JoekStopy!

---

## **Autorzy**

Michał Dyjak