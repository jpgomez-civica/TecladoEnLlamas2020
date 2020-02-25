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
<li><a href="#cae">Clone and Equals</a></li>
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
<p>Santa receives instructions from an elf at the Pole North. This elf gives santa just the direction he has to move with special symbols:</p>
<ul>
<li>^  to go to the North</li>
<li>v  to go to the South</li>
<li><span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>&gt;</mo></mrow><annotation encoding="application/x-tex">&gt;</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.5782em; vertical-align: -0.0391em;"></span><span class="mrel">&gt;</span></span></span></span></span> to go to the East</li>
<li><span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>&lt;</mo></mrow><annotation encoding="application/x-tex">&lt;</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.5782em; vertical-align: -0.0391em;"></span><span class="mrel">&lt;</span></span></span></span></span> to go to the West</li>
</ul>
<p>As the connexion with the Pole North is bad Santa some times gives presents to the same house, and at the end of the night Santa wants to know how many houses have receipt presents. The solution is check the visited houses and count the different visited houses.</p>
<p>To solve this has been necessary the class <strong>AccessFile</strong> to choose a file from the computer (the given input) and read it character by character. To choose a file from the computer has been used the java component JFileChooser. It’s possible to know when the end of file is reached because when we try to read the ascii character reader is -1, as invalid character.</p>
<p>The class <strong>Location</strong> to create an object that allow us know the location of santa at any time, it’s a simple location given by 2-dimensional coordinates. The original position of santa (<span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>x</mi></mrow><annotation encoding="application/x-tex">x</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.43056em; vertical-align: 0em;"></span><span class="mord mathdefault">x</span></span></span></span></span>,<span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>y</mi></mrow><annotation encoding="application/x-tex">y</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.625em; vertical-align: -0.19444em;"></span><span class="mord mathdefault" style="margin-right: 0.03588em;">y</span></span></span></span></span>) is (0,0) because this position is arbitrary. Depending on the input read, the Santa’s location will change as follows:</p>
<ul>
<li>North: <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>y</mi><mo>−</mo><mn>1</mn></mrow><annotation encoding="application/x-tex">y-1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7777700000000001em; vertical-align: -0.19444em;"></span><span class="mord mathdefault" style="margin-right: 0.03588em;">y</span><span class="mspace" style="margin-right: 0.2222222222222222em;"></span><span class="mbin">−</span><span class="mspace" style="margin-right: 0.2222222222222222em;"></span></span><span class="base"><span class="strut" style="height: 0.64444em; vertical-align: 0em;"></span><span class="mord">1</span></span></span></span></span></li>
<li>South: <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>y</mi><mo>+</mo><mn>1</mn></mrow><annotation encoding="application/x-tex">y+1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.7777700000000001em; vertical-align: -0.19444em;"></span><span class="mord mathdefault" style="margin-right: 0.03588em;">y</span><span class="mspace" style="margin-right: 0.2222222222222222em;"></span><span class="mbin">+</span><span class="mspace" style="margin-right: 0.2222222222222222em;"></span></span><span class="base"><span class="strut" style="height: 0.64444em; vertical-align: 0em;"></span><span class="mord">1</span></span></span></span></span></li>
<li>East: <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>x</mi><mo>+</mo><mn>1</mn></mrow><annotation encoding="application/x-tex">x+1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.66666em; vertical-align: -0.08333em;"></span><span class="mord mathdefault">x</span><span class="mspace" style="margin-right: 0.2222222222222222em;"></span><span class="mbin">+</span><span class="mspace" style="margin-right: 0.2222222222222222em;"></span></span><span class="base"><span class="strut" style="height: 0.64444em; vertical-align: 0em;"></span><span class="mord">1</span></span></span></span></span></li>
<li>West: <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>x</mi><mo>−</mo><mn>1</mn></mrow><annotation encoding="application/x-tex">x-1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.66666em; vertical-align: -0.08333em;"></span><span class="mord mathdefault">x</span><span class="mspace" style="margin-right: 0.2222222222222222em;"></span><span class="mbin">−</span><span class="mspace" style="margin-right: 0.2222222222222222em;"></span></span><span class="base"><span class="strut" style="height: 0.64444em; vertical-align: 0em;"></span><span class="mord">1</span></span></span></span></span></li>
</ul>
<p>The class <strong>VisitedHouses</strong> creates a data structure to save all the different visited locations. It’s an <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>A</mi><mi>r</mi><mi>r</mi><mi>a</mi><mi>y</mi><mi>L</mi><mi>i</mi><mi>s</mi><mi>t</mi></mrow><annotation encoding="application/x-tex">ArrayList</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.8777699999999999em; vertical-align: -0.19444em;"></span><span class="mord mathdefault">A</span><span class="mord mathdefault" style="margin-right: 0.02778em;">r</span><span class="mord mathdefault" style="margin-right: 0.02778em;">r</span><span class="mord mathdefault">a</span><span class="mord mathdefault" style="margin-right: 0.03588em;">y</span><span class="mord mathdefault">L</span><span class="mord mathdefault">i</span><span class="mord mathdefault">s</span><span class="mord mathdefault">t</span></span></span></span></span> of locations, this means is an array that saves Location objects with no prefixed size and can grow as we need it.</p>
<p>So, knowing this, the main solution to this challenge is read the file character by character because each character is one direction. Santa visits the beginning location and then starts to move and add to the visited houses structure the new location if, and only if, this house in this location hasn’t been visited yet. At the end of the direction instructions, it’s possible to know the different visited locations with the size of the structure.</p>
<p><a></a></p>
<h3 id="part-2">Part 2</h3>
<p>Because the bad connexion, Santa repeats a lot of houses and to solve this problems now Santa uses a robot to deliver presents. Both starts at the same location but each one makes a move, they take turns. Santa makes the first move. It has been used the source code of the part 1 of the challenge and make some updates.</p>
<p>Now we have an enumerated <strong>Turn</strong> to indicate whose turn it is, if santa or robot. Then we have a new class <strong>ActiveCharacter</strong> to save the turn, Santa’s location and robot’s location. The main programs works exactly equals than in the previous part but now instead of move the Santa’s location we have to move the current character location. For this is necessary to know the location of each character (Santa or robot) and the current turn.</p>
<p>The idea is the same, count the different locations visited but now with two characters. We need to check if the location of the active character has been visited before or not so the little modification done at the VisitedHouse class is create a method to check the location of the current active character using the method to check the location used in the previous part.</p>
<p><a></a></p>
<h2 id="clone-and-equals">Clone and Equals</h2>
<p>Inside the class Location it can be found the methods <strong>equals</strong> and <strong>clone</strong> and both with the tag override. What does it mean? Well, Java it’s a high level language and needs a compiler to generate an executable file. The compilation process is a long process and much more longer to explain but it’s important to know something about how are stored the objects at runtime and how sending objects by parameter works. Every object, is an instance, the object has an space reserve inside the RAM memory of the computer and when we access to the object to read of modify data, the program really access to the position memory of the object. And when we send an object by parameter it’s sended the address memory of the object (there are other languages that sends a copy of the object or, in other words, make a new instance of the object).</p>
<p>How affect this to the program? Every time Santa has to move, we change the data of the object (the attribute <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>x</mi></mrow><annotation encoding="application/x-tex">x</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.43056em; vertical-align: 0em;"></span><span class="mord mathdefault">x</span></span></span></span></span> or <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>y</mi></mrow><annotation encoding="application/x-tex">y</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.625em; vertical-align: -0.19444em;"></span><span class="mord mathdefault" style="margin-right: 0.03588em;">y</span></span></span></span></span> depending on the direction). Now the next step is simple, if this new location isn’t saved in the VisitedHouses structure we add it. The problem is how we know if this object is inside this sctructure, easy, comparing two objects. Then, it’s not that easy. When we add this santa location to the structure what really happens is we add the location memory of the object inside the structure, that means that when we modify Santa’s location we are modifying the object addressed at the same address memory. So, when we try to compare two objects they will be always equals because both are at the same address memory.</p>
<p>Clone is used to save at the visited houses list a new instance of the object and preserve this way the coordinates of the visited location.</p>
<p>Equals is replaced to compare two objects as we want and in this case two locations are equals if their coordinates are equals. If we don’t create this method will be compared by their instance and we want to compare the data and not the address memory.</p>
<p><a></a></p>
<h2 id="documentation">Documentation</h2>
<p>Components used to solve the challenge:</p>
<ul>
<li><a href="https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html">JOptionPane</a>: to show give a message with an alert window.</li>
<li><a href="https://docs.oracle.com/javase/7/docs/api/javax/swing/JFileChooser.html">JFileChooser</a>: to choose a file or directory from the computer.</li>
</ul>

