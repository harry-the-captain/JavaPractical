import java.util.Scanner;

interface DataInput {
    void getData();
}

class Librarys {
    private String title;
    private String author;

    public Librarys(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Book extends Librarys {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}

class AudioBook extends Librarys {
    private int duration;

    public AudioBook(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

class LibraryUser {
    private String name;
    private int id;

    public LibraryUser(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Student extends LibraryUser {
    private int grade;

    public Student(String name, int id, int grade) {
        super(name, id);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

class Staff extends LibraryUser {
    private String department;

    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class LibraryManagementSystem implements DataInput {
    private static Book[] books;

    public LibraryManagementSystem() {
        books = new Book[2];
        books[0] = new Book("Java", "Harry", 100);
        books[1] = new Book("48 laws of power", "Jack", 1000);
    }

    public static void main(String[] args) {
        LibraryManagementSystem librarySystem = new LibraryManagementSystem();
        librarySystem.getData();
    }

    @Override
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title to search: ");
        String titleToSearch = scanner.nextLine();
        
        boolean bookFound = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(titleToSearch)) {
                System.out.println("Book Found: " + book.getTitle() + " by " + book.getAuthor() + ", Pages: " + book.getPageCount());
                bookFound = true;
                break;
            }
        }
        
        if (!bookFound) {
            System.out.println("Book not found.");
        }
    }

    public String toString() {
        return "LibraryManagementSystem []";
    }
}
