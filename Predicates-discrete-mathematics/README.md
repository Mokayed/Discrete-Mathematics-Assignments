<h1 align="center">Assignment 2 <br/>Discrete Mathematics: Student Calendar</h1>

 <h3>Programming in logic <img src="https://cdn2.iconfinder.com/data/icons/service-options-1/512/intellect_v4-512.png" alt="brain organ, brainstorm, genius, head, logic, memory, strategy icon" class="d-block mx-auto" height="auto" width="40"></h3>
 
<p>Create a program i Prolog.
You can either invent your own problem to solve or use one of the ideas
described below. The program should include facts and rules. Also a set of
meaningful questions to the program should be presented.
Please push to github and supply a README.md file.</p>

<h4>Student calendar <img src="https://image.flaticon.com/icons/svg/201/201818.svg" width="38" height="38" alt="Student free icon" title="Student free icon"></h4>
<p>Create a program that models students, classes, rooms, dates, and their
relations.</p>

<h3>First thing we did, was to come up with some data <g-emoji class="g-emoji" alias="clipboard" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f4cb.png">📋</g-emoji>:</h3>

```pl

class(a, mo).
class(a, hallur) .
class(b, lars).
class(b, jens).
class(c, ali).
class(d, tom).
class(a, kasper).

class_date(date(2019, 7, 30), a).
class_date(date(2019, 5, 30), b).
class_date(date(2019, 3, 30), c).
class_date(date(2019, 3, 30), d).

room(a).
room(b).
room(c).
room(d).

student(mo).
student(hallur).
student(jens).
student(lars).
student(kasper).
student(ali).
student(tom).

```
<h3>Secondly, we wrote down some ideas for methods, that had the requirement of including facts and rules <img width="30" height="30" src="https://hubsportsboston.com/wp-content/uploads/2016/12/hub-rules-icon.png" class="attachment-900x9999 size-900x9999" alt="" srcset="https://hubsportsboston.com/wp-content/uploads/2016/12/hub-rules-icon.png 272w, https://hubsportsboston.com/wp-content/uploads/2016/12/hub-rules-icon-100x100.png 100w, https://hubsportsboston.com/wp-content/uploads/2016/12/hub-rules-icon-150x150.png 150w, https://hubsportsboston.com/wp-content/uploads/2016/12/hub-rules-icon-60x60.png 60w, https://hubsportsboston.com/wp-content/uploads/2016/12/hub-rules-icon-43x43.png 43w, https://hubsportsboston.com/wp-content/uploads/2016/12/hub-rules-icon-262x262.png 262w, https://hubsportsboston.com/wp-content/uploads/2016/12/hub-rules-icon-100x100@2x.png 200w, https://hubsportsboston.com/wp-content/uploads/2016/12/hub-rules-icon-60x60@2x.png 120w, https://hubsportsboston.com/wp-content/uploads/2016/12/hub-rules-icon-43x43@2x.png 86w" sizes="(max-width: 272px) 100vw, 272px"></h3>

<ul>
  <li>get all information on a student</li>
  <li>does student a go in the same class as student b</li>
  <li>does student a go to class at the same date as student b</li>
  <li>get all students</li>
  <li>get all classes</li>
  <li>get all dates</li>
</ul>

<p>To see the original file, click <a href="/ass2.pl">here  <g-emoji class="g-emoji" alias="page_with_curl" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f4c3.png">📃</g-emoji> </a></p>

<h3>Commands in SWI-Prolog <img alt="" src="https://cdn.portableapps.com/SWI-PrologPortable_128.png" height="50" width="50" class="main-app-logo"></h3>
<p>Open the <a href="/ass2.pl">ass2.pl file </a> in SWI then run those commands <img src="https://image.flaticon.com/icons/svg/0/656.svg" width="20" height="20" alt="Command Window free icon" title="Command Window free icon"> :</p>
<ul>
  <li>getStudentInfo(hallur) .
    
  ```pl
  
  getStudentInfo(A):- 
      class(Class, A),
      writeln(Class),
      class_date(D, Class),
      writeln(D).

  ```
  </li>
  
  <li>
 
  sameClass(mo,hallur)
 
  ```pl
  
sameClass(A,B):-
     class(Class, A),
     class(Class,B),
     writeln(Class).
     
  ```

</li>
  <li>sameDate(ali, tom) .
  
  ```pl

sameDate(A,B):-
     class(ClassA, A),
     class(ClassB,B),
     class_date(StudentDate, ClassA),
     class_date(StudentDate, ClassB),
     writeln(StudentDate).
     
   ``` 

  </li>
  
  <li>getAllDates() .

  ```pl
getAllDates():-
     forall(class_date(ClassDates, S), writeln(ClassDates)) .
   ``` 

</li>
  <li>getAllStudents() .
  
  ```pl

getAllStudents():-
     forall(student(Student) ,
     writeln(Student)) .
     
   ``` 

</li>
  <li>getAllClasses() .

  ```pl
  
getAllClasses():-
     forall(room(Name), writeln(Name)) .

   ``` 
   
</li>
</ul>

