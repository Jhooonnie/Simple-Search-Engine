Let's implement the simplest search engine possible. 
It should search for a specific word from the line containing different words.
The first line contains several words separated by a space. 
The words are numbered according to their order, with the first word having index 1. 
Consider that all the words in the first line are unique, so there can be no repetitions.
Write a small program that reads a single line and then another line. 
The program must search in the first line for a word specified in the second line. 
The program should output the index of the specified word. 
If there is no such word in the first line, the program should print. 
Please remember that indexes start from 1!
You should output exactly one line.

Examples
The lines that start with <code class="java">&gt; </code> represent the user input. 
Note that these symbols are not part of the input.

Example 1:

<pre><code class="language-no-highlight">&gt; first second third fourth
&gt; third
3</code></pre>

<p><strong>Example 2:</strong></p>

<pre><code class="language-no-highlight">&gt; cat dog and mouse
&gt; elephant
Not found</code></pre>
