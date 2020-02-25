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
<p>The elves must calculate the wrapping paper that their need to wrap all the presents with exact quantity of wrapping paper. The presents are given in the input file and thay are expressed with their dimensions:</p>
<blockquote>
<p><em>length x width x height</em></p>
</blockquote>
<p>So, each line give us the dimensions of one present. If we split this line by the symbol “x” we always found in the first place the length of the present, then the width and finally the height.</p>
<p>To calculate the total wrapping paper the elves need it’s necessary to calculate the wrapping paper of every present and add it to all the presents. The wrapping paper of each present is calculated by:</p>
<ul>
<li>
<p>The surface area of the gift box</p>
<blockquote>
<p><img src="https://render.githubusercontent.com/render/math?math=2*length*width"> + <img src="https://render.githubusercontent.com/render/math?math=2*width*height"> + <img src="https://render.githubusercontent.com/render/math?math=2*height*length"></p>
</blockquote>
</li>
<li>
<p>The area of the smallest side of the gift box</p>
<blockquote>
<p>The multiply of the two smallest sides</p>
</blockquote>
</li>
</ul>
<p>If we calculate the wrapping paper necessary for each present we will know the square feet of wrapping paper that the elves need to order to wrap all the presents.</p>
<p><a></a></p>
<h3 id="part-2">Part 2</h3>
<p>Now the elves have all the presents wrapped they want to put a ribbon to make them pretty. They need to calculate the ribbon necessary for all the wrapped presents and they know that for each present they need to calculate:</p>
<ul>
<li>
<p>The smallest perimeter of any one face</p>
<blockquote>
<p>Two times the sum of the two smallest sides</p>
</blockquote>
</li>
<li>
<p>The cubic volume</p>
<blockquote>
<img src="https://render.githubusercontent.com/render/math?math=length * width * height">
</blockquote>
</li>
</ul>
<p>So, making this calculations for every wrapped present and putting all together, the elves will exactly know the feet of ribbon they should order.</p>
<p><a></a></p>
<h2 id="documentation">Documentation</h2>
<p>Components used to solve the challenge:</p>
<ul>
<li><a href="https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html">JOptionPane</a>: to show give a message with an alert window.</li>
<li><a href="https://docs.oracle.com/javase/7/docs/api/javax/swing/JFileChooser.html">JFileChooser</a>: to choose a file or directory from the computer.</li>
</ul>

