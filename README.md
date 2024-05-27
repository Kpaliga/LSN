# LSN

Wersja Javy: **17**

Użyte narzędzia: **Lombok**

# Szczegóły rozwiązania

Złożoność obliczeniowa: **O(n)**

Moim zdaniem niezbyt zrozumiały kod, ale to wydajność miała byc priorytetowa.

Zakładamy że inputem mogą być tylko liczby całkowitę od 0 do 13.
Zliczamy wystąpienia liczby n, **wpisując je w n-ty index tablicy wystąpień.**
Następnie uświadamiamy sobie, że po cyfrze "6" nie istnieje już para liczb dająca sumę "13".
Jeśli na miejscu [13 - n] (n = aktualnie sprawdzana liczba z przedziału od 0 do 6), występuje coś innego niż zero, oznacza to że powinniśmy tyle razy wyświetlić taką parę.
Wpisana w ten idex liczba, to w końcu ilość wystąpień.

**Proszę nie brać pod uwagę funkcji wczytującej, prawdziwy use case i tak korzystał by z pliku** 

