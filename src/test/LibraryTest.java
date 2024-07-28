package test;

import main.classes.Book;
import main.classes.Library;
import main.classes.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {

    @Test
    void checkStudentExistence() {
        Library library = new Library();
        Book book = new Book("Book-2", "Author-1", 11);
        Student student = new Student("Not-registered-student", 13);
        library.addBook(book);
        boolean expected = false;
        boolean actual = library.lendBook(book, student);
        assertEquals(expected, actual);
    }

    @Test
    void checkBookRemove(){
        Library library = new Library();
        Book book = new Book("Book-1", "Author-1", 1);
        Student student = new Student("student-1", 13);

        library.addBook(book);
        library.addStudent(student);
        library.lendBook(book,student);
        library.returnBook(book,student);

        boolean actual = student.hasBook(book);
        boolean expected = false;

        assertEquals(expected, actual);
    }

}