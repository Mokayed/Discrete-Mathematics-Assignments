<h1>Assignment #3 - Sequences and recursion</h1>

<p>
1 Rational sequence
Create a class Rationals that implements the Sequence of Positive Rational
Numbers as discussed in class.
The class must implement a method String rational(long n) that returns
the rational number on the nth place in the sequence.
Also let the class implement Iterable (IEnumerable in C#)
</p>


<h1>What we created</h1>

<p>
The program first runs a metho called "generateList" which takes a number in the paramter for the size of the sequence.
  This method then starts from 1/1 and then auto generates up to the size the user wants.
  
  The way this method does it is by finding where the line starts at SN using this formal (sn = ln(ln+1)/2).
  
  When the counter is equal to the maximal count of denominator we substract the counter by one and at the same time we will add the numerator by 1. This is because we cannot go over the mentioned size given in the method (f.ex if you give 21 then the total amount of elements should be 21 in the list). Before we do a change on the numerator / denominator we add them to the list. When the counter reaches zero and the denominator is 1 then we break the loop and the list is complete. Then we return list.
  


The other method is rational. This method is given a line Lumber, and with this line number it then starts with the same as the other method: finding where the line starts at SN using this formal (sn = ln(ln+1)/2). Then it calculates the numerator: mn = (n − sn) + 1 and denominator: dn = ln − (n − sn) + 1 which both combined represent the rational number we are looking for in the list. In the last part we use iterable in order to look through the list and compare each rational number after ours. IF the rational number is found we then return the index and the rational number. If not then we return the rational number but no index.


</p>



<h1>Setup<h1>
  <p>Clone the project then, open it in a java ide</p>


