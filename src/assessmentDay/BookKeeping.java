package assessmentDay;
//
//You are given a class that handles operations with books, however it is not complete and might have some issues, your task is to refactor it, fix the issues and add the missing parts.
//
//        RULES
//
//        Each book is described by 2 fields: id and title
//
//        README
//
//        The methods that should be supported are listed below:
//
//        createBook (id, title) - creates new book. Returns false if the book with such id already exists, and true otherwise;
//
//        SETTINGS
//
//        updateBook (id, title) - updates provided book. Returns false if the book with such id does not exist, and true otherwise.
//
//        deleteBook (id) - deletes provided book. Returns false if
//
//        the book with such id does not exist, and true otherwise. .findBookById(id) find book by id. Returns the book, if the book with such id exists, and null otherwise.
//
//        findBookByTitle(title) find book by title. Returns the book, if the book with such title exists, and null otherwise. It is guaranteed that at any time there are no two books with the same title.
//
//        Implement all these methods.

import java.util.List;

public class BookKeeping {
    class Book {
        private int id;
        private String title;

        public Book(int id, String title) {
            this.id = id;
            this.title = title;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }
    }

    class BookManager {
        private List<Book> books;

        public boolean createBook(int id, String title) {
            for (Book book : books) {
                if (book.getId() == id) {
                    return false;
                }
            }
            books.add(new Book(id, title));
            return true;
        }

        public boolean updateBook(int id, String title) {
            for (Book book : books) {
                if (book.getId() == id) {
                    book = new Book(id, title);
                    return true;
                }
            }
            return false;
        }

        public boolean deleteBook(int id) {
            for (Book book : books) {
                if (book.getId() == id) {
                    books.remove(book);
                    return true;
                }
            }
            return false;
        }

        public Book findBookById(int id) {
            for (Book book : books) {
                if (book.getId() == id) {
                    return book;
                }
            }
            return null;
        }

        public Book findBookByTitle(String title) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    return book;
                }
            }
            return null;
        }


    }
}
