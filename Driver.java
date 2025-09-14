class Driver {
	public static void main(String args[]) {

		// Declare and initialize a Library<Book,Student> object
		Library<Book, Student> library = new Library<>();

		// Declare and initialize 4 book objects
		Book b1 = new Book("1984", "George Orwell", 123, 1);
    Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 124, 2);
    Book b3 = new Book("The Handmaid's Tale", "Margaret Atwood", 125, 3);
    Book b4 = new Book("Anna Karenina", "Leo Tolstoy", 126, 4);

		// Declare and initialize 4 student objects
		Student s1 = new Student("Mina", 1);
    Student s2 = new Student("Lena", 2);
    Student s3 = new Student("Alex", 3);
    Student s4 = new Student("Lala", 4);

		// add 3 books to the library
		library.addBook(b1);
    library.addBook(b2);
    library.addBook(b3);

		// add 3 students to the library
		library.addStudent(s1);
    library.addStudent(s2);
    library.addStudent(s3);

		// print all books
		library.printAllBooks();

		// print all students
		library.printAllStudents();

		// have each student checkout a book
		library.checkOutBook(b1, s1);
    library.checkOutBook(b2, s2);
    library.checkOutBook(b3, s3);

		// search for a book to so if it exists, print answer
		System.out.println("Does the book " + b1 + " exists? " + library.searchForBook(b1));

		// search for a student to so if they exists, print answer
		System.out.println("Does the student " + s1 + " exists? " + library.searchForStudent(s1));

		// search for a book that should not exist, print answer
		System.out.println("Does the book " + b4 + " exists? " + library.searchForBook(b4));

		// search for a student that should not exist, print answer
		System.out.println("Does the student " + s4 + " exists? " + library.searchForStudent(s4));

		// printAllCheckedOutBooks
		library.printAllCheckedOutBooks();

		// have 2 students check in their books
		library.checkInBook(b1, s1);
    library.checkInBook(b2, s2);

		// printAllCheckedOutBooks
		library.printAllCheckedOutBooks();

	}
}
