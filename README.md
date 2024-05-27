# LSN

Wersja Javy: **17**

Użyte narzędzia: **Lombok**

# Szczegóły rozwiązania

Złożoność obliczeniowa: **O(n log n)**

Strumienie w metodzie distinct() i tak zwykle używają HashSet.
Pozwalają nam również na użycie parallel() oraz sorted().
Dodatkowo są znacznie czytelniejsze.

Są sytuacje w których takie rozwiązanie byłoby bezsensowne.
Na dodatek nie możemy łatwo kontrolować szczegółów implementacji w strumieniu.
Natomiast jeśli input jest tak ogromny, to rozwiązanie zdaję się być w porządku.



