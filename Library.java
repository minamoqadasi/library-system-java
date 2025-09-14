class Library<B,S> implements LibraryInterface<B,S> {

  private LinkedList<B> books;
  private LinkedList<S> students;

  // TODO

  public Library(){
    books = new LinkedList<>();
    students = new LinkedList<>();

  }



  // add a Book to the books list, hint: call newHead or newTail (doesn't matter)
  public void addBook(B book){
    books.newHead(book);
  }



  // hint: call the contains method of the linked list class
  public boolean searchForBook(B book){
    return books.contains(book);
  }



  // hint: using the books list, call the the print() method of the linked list class
  public void printAllBooks(){
    books.print();
  }



  // add a Student to the students list, hint: call newHead or newTail (doesn't matter)
  public void addStudent(S student){
    students.newHead(student);

  }



  // hint: call the contains method of the linked list class
  public boolean searchForStudent(S student){
    return students.contains(student);

  }



  // hint: using the students list, call the the print() method of the linked list
  public void printAllStudents(){
    students.print();
  }



  // check some basic information before we checkout a book
  // if the student doesnt exist, immediately return and print an error
  // if the student is added and has 3 checked out books, immediately return and print an error
  // if the Id does not exist in the books list, immediately return and print an error
  // if the Id exists, but all the books have been checked out (quantity == 0), immediately return and print an error

  // all tests passed, we are ready to checkout the book for this student
  // update checkedOutBooks field for this student by incrementing it by 1
  // update this book's quantity by subtracting 1

  // HINT: This method ends up calling getStudent and getBook methods in order to retrieve the book and student objects from the list
  //       Once the objects are retrieved, then one can update the quantities for those objects
  public void checkOutBook(B book, S student){
    // if the student doesnt exist, immediately return and print an error
    if(!students.contains(student)){
      System.out.println("Student doesn't exist!");
      return;
    }
    // if the student is added and has 3 checked out books, immediately return and print an error
    S isStudent = getStudent(student);

    if(isStudent.checkedOutBooks == 3){
      System.out.println("Student has 3 books, they can't check out another one!");
      return;
    }
    // if the Id does not exist in the books list, immediately return and print an error
    if(!books.contains(book)){
      System.out.println("Book doesn't exist!");
      return;
    }
    // if the Id exists, but all the books have been checked out (quantity == 0), immediately return and print an error
    S isBook = getBook(book);

    if(isBook.quantity == 0){
      System.out.println("Book has already been checked out!");
      return;
    }
    isStudent.checkedOutBooks++;
    isBook.quantity--;

  }



  // similar to checkOutBook, but here we are checking in a book for a student
  // perform the "safety checks" before starting the check-in process (i.e. student/book exists, not null, etc...)
  // update checkedOutBooks field for this student by decrementing it by 1
  // update this book's quantity by adding 1
  public void checkInBook(B book, S student){
    if(!students.contains(student)){
      System.out.println("Student doesn't exist!");
      return;
    }

    if(!books.contains(book)){
      System.out.println("Book doesn't exist!");
      return;
    }

    S isStudent = getStudent(student);
    B isBook = getBook(book);

    if(isStudent.checkedOutBooks == 0) {
      System.out.print.ln("The student has no books!");
      return;
    }

    isStudent.checkedOutBooks--;
    isBook.quantity++;

  }



  // print all check out books and the student that have them checked out
  // i.e. Book A is checkout by John...
  // i.e. Book B is checkout by Jane...
  public void printAllCheckedOutBooks(){
    Node<S> temp = students.head;

    while(temp != null){
      S student = temp.getItem();

      if(student.checkedOutBooks > 0){
        System.out.println(student.name + " has checked out " + student.checkedOutBooks + " book.");
      }
      temp = temp.getNext();
    }
  }



  // HINT: calls the getItem method of the linked list class and returns the item back to the caller
  public S getStudent(S student){
    return students.getItem(student);
  }



  // HINT: calls the getItem method of the linked list class and returns the item back to the caller
  public B getBook(B book){
    return books.getItem(book);
  }





}
