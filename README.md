# Wzorce projektowe 2024
## 1.
Proszę wybrać sobie jeden wzorzec kreacyjny napisać jego kod oraz opisać jakie
zastosowanie ma to co Państwo napisali (np. dealer samochodowy ma dostęp do fabryki, w
tej sytuacji fabryka do interfejs a dealer samochodowy to klasa do której się przekazuje
wybraną implementację).
<hr>
Fabryka abstakcyjna - jest jednym z wzorców projektowych, który ma na celu dostarczenie interfejsu do tworzenia 
rodziny powiązanych ze sobą obiektów, bez konieczności ujawniania konkretnych
klas tych obiektów. Zaletą jest łatwa rozrzerzalność o nowe produkty/klasy oraz
dodawanie nowych funkcjonalności.


## 2.
Proszę wybrać sobie jeden wzorzec strukturalny napisać jego kod oraz opisać jakie
zastosowanie ma to co Państwo napisali (np. korzystamy z jednego API XML a potem
odsyłamy te dane w inne miejsce za pomocą JSON to wykorzystany zostanie adapter aby
przekonwertować jeden format na drugi).
<hr>
Adapter - Adapter jest wzorcem struturalnym, który na przykład umożliwia integrację 
istniejącego kodu z nowym kodem bez konieczności modyfikacji istniejącej struktury. 
Dzięki temu, można dostosować różne interfejsy do współpracy ze sobą.

## 3.
Proszę wybrać sobie jeden wzorzec czynnościowy (behawioralny) napisać jego kod
oraz opisać jakie zastosowanie ma to co Państwo napisali (np. zmienił się adres
użytkownika to trzeba powiadomić dział kard aby zmieniły u siebie dane zastosowanie ma tu
wzorzec Visitor).
<hr>
Iterator - jest wzorcem, który pozwala przechodzić po kolejnych elementach zbioru, bezwzględu
na to w jaki sposób zbiór został zapisany (na przykład lista, tablica, hashmap itd.) 
Ułatwia dostęp do zbiorów/kolekcji oraz przez to, że nie trzeba znać szczegółów implementacyjnych 
struktury kolekcji, jest bardziej elastyczny i łatwiejszy do utrzymania.

## 4.
Proszę wybrać sobie jeden anty wzorzec projektowy i opisać go czemu jest
antywzorcem.
<hr>
Jako przykład mogę podać boski obiekt, z którym chyba każdy początkujący programista ma styczność. Na drugim roku studiów na przedmiocie podstawy Javy, mieliśmy napisać prostą grę w kółko i krzyżyk o dowolnym rozmiarze X na X(większym niż 3 na 3). 
Jedną z klasy była logika gry, która miała tylko pilnować nad stanami gry (kolejność wykonywania ruchów i sprawdzanie warunku końcowego). 
W tej klasie "udało" mi się stworzyć całą logikę ruchu komputera, który oceniał wszystkie pola, przypisywał im różne wartości i na tej podstawie umieszczał w odpowiednim miejscu znak. Było to zdecydowanie za dużo metod jak na jeden obiekt. 
W dodatku same metody miały kilkadziesiąt linijek kodu i w dodatku nazwy zmiennych był dobrane bez żadnej logiki.
Efekt końcowy był taki, że gra działała ostatecznie całkiem dobrze, ale gdy zorientowałem się, że komputer w pewnej rzadkiej sytuacji podejmuje złe decyzje. 
Gdy chciałem to naprawić, okazało się, że przestałem się orientować co gdzie jest i dokładnie robi. 
Dlatego uważam, że tworzenie boskich obiektów utrudnia dodawanie nowych funkcjonalności aplikacji.


## 5.
Proszę napisać przynajmniej 5 przykładów dobrych praktych.
<hr>
Dobrymi praktykami są:

- znajomość IDE w którym pracujemy,
- kod "samo-komentujący" czyli nazwy klas i metod powinny odzwierciedlać to co reprezentują, komentarze powinny być używane tylko w ostateczności
- jeżeli funkcja ma więcej niż 7 linijek to znaczy, że można ją rozbić na dwie funkcje (będzie czytelniej)
- można zostawić w kodzie za komentowane metody które w najbliższym czasie wyjdą z użycia,
- pisanie kodu według standardów ogólnie zaproponowanych Python -> PEP, oraz na przykład tych obowiązujących w danej firmie,
- umiejętność używania skrótów klawiszowych,
- przeprowadzanie testów,
- optymalizacja kodu.

