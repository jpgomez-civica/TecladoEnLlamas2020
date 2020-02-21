# Advent of Code

**Teclado en llamas 2020**
María del Mar Cardona Aranda

**Índice**   
1. [Installation guide](#installation)
2. [Files and folders](#structure)
3. [Run](#run)
4. [Source code](#src)
5. [Documentation](#doc)

 - **Language:** Java 

## Installation guide <a name="installation"></a>
To run the program is necessary to have installed Java in the computer. 
Go to [Java Web Download](https://www.java.com/es/download/) to download and follow the instructions to install.

## Files and folders <a name="structure"></a>
Each day of the Advent of Code 2015 has two challenges, the second one is related with the first one. The directory Part1 contains the first challenge of the day and the directory Part2 contains the second challenge.

Each directory contains the same folders. In the folder executable we can find a jar file, this is the java executable file. The folder src contains the java source code of the project.

## Run <a name="run"></a>
When the jar file is opened the program start its execution. The user has to choose a file from the computer that it's going to be used as input file (the input file given). Finally, the solution is shown to the user.

## Source code <a name="src"></a>
# Part 1

To solve the first part of the problem it has been created a class named Santa to know in whitch floor is found Santa. Santa receives instructions in form of parenthesis, opened parenthesis '(' to up one floor and closed  parenthesis ')' to down one floor.

To manage the access to the input file with the instructions that must follow Santa, it has been created another class named AccessFile. With the component of Java JFileChooser it's possible to find a select a file from the computer and use it as a input file. Once this file is choosed by the user and opened the program starts and reads the file char by char. When the end of the file is reached it's possible to known because the readed char is -1.

With the Java componet JOptionPane we can show an alert message to the user with the solution to the challenge using the input file given at the beginning.

# Part 2
To solve this second part of the challenge, Santa needs to know more info about the moves he does, as the number of movements done and the number of movement done the first time Santa reaches the basement (floor -1).

So. after each movement Santa checks if has been before in the basement. If it's the first time that Santa is in the basement santa saves how many moves have been needed to reach this floor.

As in the part 1, to choose the input file is used JChooseFile and to show the solution to this second part of the challenge is use JOptionPane.

## Documentation <a name="doc"></a>
Components used to solve the challenge:

 - [JOptionPane](https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html): to show give a message with an alert window.
 - [JFileChooser](https://docs.oracle.com/javase/7/docs/api/javax/swing/JFileChooser.html): to choose a file or directory from the computer.
