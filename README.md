Name : Hammad Uddin
Course Name : SOFTWARE DEVELOPMENT I
CRN : 15339

**Project Description**

This project demonstrates basic file handling operations in Java, such as creating a file, reading data from a file, sorting the data, and writing the sorted data to another file. The program reads a list of numbers from a text file, sorts them in ascending order, and then writes the sorted list to a new file.

**Project Functionality**

File Creation: The program first checks if a file named data.txt exists. If it does not exist, it creates the file.

Reading Data: It reads numerical data (doubles) from data.txt and stores them in a list.

Sorting Data: The list of numbers is sorted in ascending order.

Writing Data: The sorted list is written to a new file called data-sorted.txt.

**Important Programming Concepts and Tools**

File Handling: The program uses File, FileWriter, and Scanner classes to interact with files.

Exception Handling: try-catch blocks are used to handle potential exceptions, such as IOException and FileNotFoundException, ensuring the program runs smoothly even if errors occur.

Collection Framework: The program uses ArrayList from Java's Collection framework to store and manipulate the list of numbers.

Sorting: The program employs Collections.sort() to sort the list of numbers in ascending order.

**Expected Inputs and Outputs**

Input: The input file data.txt should contain a series of numbers, each on a new line or separated by spaces.

Output: The program outputs a new file data-sorted.txt containing the sorted list of numbers, with each number on a new line. Additionally, it prints the sorted numbers to the console and displays status messages about file creation, reading, and writing operations.
