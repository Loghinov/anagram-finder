
# Arhitectura generala

 Avand o experienta in proiecte cu arhitectura MVC, am decis la fel sa o implementez si aici pentru ca 
 ofera claritate si permite o extindere usoara a aplicatiei. Cred ca trebuie sa dau si o explicatie de
 ce am folosit Spring Boot aici, pentru ca inteleg proiectul este unul simplu si nu are nevoie de acest 
 Framework, dar totusi tinand cont ca este vorba de o extindere a proiectului el este necesar. Acest
 framework contine multimple biblioteci si tooluri pentru RestAPi, Hibernate. Anume in acest proiect el
se foloseste doar pentru organizarea codului, ne ofera perspectiva de a transforma rapid aplicatia 
 intr-un serviciu web, este o baza buna pentru scalare

    Structura:
- AnagramFinderApplication - punct de pornire  al aplicatiei.
- In pachetul service am creat clasa AnagramImplementation, care se ocupă de logica principală: procesarea 
  anagramelor.
- In pachetul files, clasa FileCreator este responsabilă de crearea fișierului de input.
- Fișierul sample.txt a fost generat cu ajutorul metodei createFile() din FileCreator.
 
Deci structura este modulara, adica fiecare clasa are un rol bine definit si astfel se respecta principiile 
"SOLID". Am folosit  LinkedHashMap pentru a pastra ordinea inserarii.

# Raspunsul la intrebari:

1.      Cum va functiona cu 10 milioane de cuvinte?
 
- Gruparea anagramelor se face prin "HashMap<String, List<String>>" in care cheia este cuvantul sortat
  alfabetic. Aceasta implimentare ne garanteaza o functionalitate rapida pana la cateva zeci de milioane de 
  cuvinte in memorie evident daca daca avem RAM de 8-16 GB.

2.      Cum va functiona cu 100 milioane de cuvinte?

- In primul rand cu asa cantitate de cuvinte doar in memorie nu este posibila functioarea.
- Vom avea nevoie de a stoca datele intr-o baza de date.
- Procesare pe blocuri.
- Procesare paralelă (multithreading).

# Concluzie
- Am ales o structură modulară, ușor de întreținut.
- Deși proiectul este simplu, am aplicat bune practici care pot fi extinse ușor în contexte mai complexe.
- Am răspuns cerințelor de scalabilitate și am justificat deciziile luate în proiect.


 