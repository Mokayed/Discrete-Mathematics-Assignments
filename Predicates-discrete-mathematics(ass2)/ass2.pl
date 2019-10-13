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

getStudentInfo(A):- 
      class(Class, A),
      writeln(Class),
      class_date(D, Class),
      writeln(D).

sameClass(A,B):-
     class(Class, A),
     class(Class,B),
     writeln(Class).


sameDate(A,B):-
     class(ClassA, A),
     class(ClassB,B),
     class_date(StudentDate, ClassA),
     class_date(StudentDate, ClassB),
     writeln(StudentDate).
     

getAllStudents():-
     forall(student(Student) ,
     writeln(Student)) .

getAllClasses():-
     forall(room(Name), writeln(Name)) .

getAllDates():-
     forall(class_date(ClassDates, S), writeln(ClassDates)) .