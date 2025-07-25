
# General Architecture

Having experience with projects featuring modular architecture and based on the MVC principles,
I decided to apply a similar approach in this project as well. Although the project is relatively simple,
I focused on clarity, separation of concerns, and extensibility.
The application is written in Java 21, using Maven for dependency management and build organization.

    Structure:
- AnagramFinderApplication - the application entry point.
- In the package com.globaldb.anagramfinder.service, I created the class AnagramImplementation, 
  which handles the main logic: processing the anagrams.
- In the package com.globaldb.anagramfinder.files, the class FileCreator is responsible for creating 
  the input file.
- The file sample.txt was generated using the createFile() method from FileCreator.

So, the structure is modular, meaning each class has a well-defined role, thus respecting 
the SOLID principles. I used a LinkedHashMap to preserve insertion order.

# Answers to questions:

1.      How will it work with 10 million words?
 
- Grouping anagrams is done via a HashMap<String, List<String>> where the key is the alphabetically sorted word.
  This implementation guarantees fast functionality up to several tens of millions of words in memory, obviously 
  if we have 8-16 GB of RAM.

2.      How will it work with 100 million words?

- First of all, working with such an amount of words only in memory is not possible.
- We will need to store the data in a database.
- Processing in batches.
- Parallel processing (multithreading).

# Conclusion
- I chose a modular structure, easy to maintain.
- Although the project is simple, I applied good practices that can be easily extended in more complex contexts.
- I addressed scalability requirements and justified the decisions made in the project.


 