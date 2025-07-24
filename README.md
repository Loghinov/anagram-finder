                                         # Anagram Finder

Acesta e un mic proiect Java care citește un fișier text cu cuvinte și grupează anagramele.

# Tech stack folosit
- java 21
- Maven
- Spring Boot(optional pentru structura si extindere)
- Git

# Inainte de a porni aplicatia ne asiguram ca:

- Avem jdk 21 .
- Avem maven instalat.
- Proiectul clonat local cu `git clone`

# Compilarea proiectului

1. Direct din aplicatie
- In partea dreapta lateral avem o bara unde gasim Maven
- Selectam proiectul, in cazul nostru "anagram-finder"
- Deschidem LifeCycle
- Selectam Install.

2. Din terminal (bash)
- Introducem comanda in terminal (mvn clean install).

# Cum pornim aplicatia!
- Run -> Edit-> Program arguments -> Adaugam calea catre fisierul nostru " sample.txt" -> Apasam OK.
- Apasam Run la aplicatie.

# Fisierul de input va contine :
act
cat
tree
race
care
acre
bee

# Output va fi:
[act, cat]
[tree]
[race, care, acre]
[bee]

# Decizii privind proiectarea
 - Pentru aceasta informatie accesati  DESIGN.md


