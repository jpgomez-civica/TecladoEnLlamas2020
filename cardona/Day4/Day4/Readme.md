---


---

<h1 id="advent-of-code">Advent of Code</h1>
<p><strong>Teclado en llamas 2020</strong><br>
María del Mar Cardona Aranda</p>
<h2 id="index">Index</h2>
<ol>
<li><a href="#installation">Installation guide</a></li>
<li><a href="#structure">Files and Folders</a></li>
<li><a href="#Run">Running</a></li>
<li><a href="#src">Source Code</a><br>
4.1. <a href="#src1">Part 1</a><br>
4.1. <a href="#src1">Part 2</a></li>
<li><a href="#doc">Documentation</a></li>
</ol>
<p><a></a></p>
<h2 id="installation-guide">Installation guide</h2>
<p>To run the program is necessary to have installed Java in the computer.<br>
Go to <a href="https://www.java.com/es/download/">Java Web Download</a> to download and follow the instructions to install.</p>
<p><a></a></p>
<h2 id="files-and-folders">Files and folders</h2>
<p>Each day of the Advent of Code 2015 has two challenges, the second one is related with the first one. The directory Part1 contains the first challenge of the day and the directory Part2 contains the second challenge.</p>
<p>Each directory contains the same folders. In the folder executable we can find a jar file, this is the java executable file. The folder src contains the java source code of the project.</p>
<p><a></a></p>
<h2 id="running">Running</h2>
<p>When the “jar” file is opened the program start its execution. The user has to choose a file from the computer that it’s going to be used as input file (the input file given). Finally, the solution is shown to the user.</p>
<p><a></a></p>
<h2 id="source-code">Source code</h2>
<p><a></a></p>
<h3 id="part-1">Part 1</h3>
<p>Santa needs to mine AdventCoins. For this uses an MD5 hash in hexadecimal to generate a key. This key is the key of a bit coin if starts with 5 zeroes.</p>
<p>The data given to generate an AdventCoin is a secret key that represents an hexadecimal number. To find the AdventCoin we have to find the lowest number that produce the MD5 hash that starts with 5 zeroes.</p>
<p>We have to process with MD5 hash the input key concatenated with the number. All the key is an <strong>hexadecimal</strong> number the number that we are treating to find is <strong>decimal</strong>.</p>
<p>The source code contains a Main class that asks to the user the input key, mine the AdventCoin with this given input and, finally, shows the output to the user.</p>
<p>The AdventCoin class creates AdventCoin objects. One advent coin contains the secret key (our input key) and the decimal number. The mining process is process every key (secret key concatenated by the decimal number) starting by the decimal number 1 and growing this number until find the MD5 hash that starts with 5 zeroes.</p>
<p>At the end is shown to the user the decimal number (the solution to this challenge), the MD5 hash generated with this key and the full secret key of the AdventCoin.</p>
<p>We use to generate the MD5 hash the Java object <strong>MessageDigest</strong> from the package <em>java.security</em>.</p>
<p><a></a></p>
<h3 id="part-2">Part 2</h3>
<p>This second part it’s simple, we just need to standardize our mining method inside the AdventCoin class. This way we can decide in the main constructor or the program how many zeroes we want at the beginning. Now, the mining method mines until find a MD5 hash that starts with <em>n</em> zeroes.</p>
<p>If at the main class we indicates we want to find 6 zeroes at the MD5 hash, we have solved the problem.</p>
<p><a></a></p>
<h2 id="documentation">Documentation</h2>
<p>Components used to solve the challenge:</p>
<ul>
<li><a href="https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html">JOptionPane</a>: to show give a message with an alert window.</li>
<li><a href="https://docs.oracle.com/javase/7/docs/api/javax/swing/JFileChooser.html">JFileChooser</a>: to choose a file or directory from the computer.</li>
<li><a href="https://docs.oracle.com/javase/7/docs/api/java/security/MessageDigest.html">MessageDigest</a>: to apply the MD5 hash to an hexadecimal value.</li>
</ul>

