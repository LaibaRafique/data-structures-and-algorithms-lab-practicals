
package librarymanagement;
import java.util.Scanner;
class Book{
    String title;
    int BN;
    public Book(String tilte, int BN){
        this.title=title;
        this.BN=BN;
    }
}
class Library{
    Book[] books;
    int size;
    public Library(int capacity){
        books= new Book[capacity];
        size=0;
    }
    public void addBook(String title, int BN){
        if(size<books.length){
            books[size++]= new Book(title,BN);
        }
    }
    public void sortByTitle(){
        for (int i=0; i<size -1;i++){
            for (int j=0; j<size -i -1;j++){
                if(compareTitles(books[j].title,books[j+1].title)>0){
                    Book temp=books[j];
                    books[j]=books[j+1];
                    books[j+1]=temp;
                }
            }
        }
    }
    public int searchByTitle(String title){
        for (int i=0; i<size;i++){
            if (compareTitles(books[i].title,title)==0){
                return i;
            }
        }
        return -1;
    }
    
    private int compareTitles(String title1, String title2){
        int minLength=Math.min(title1.length(), title2.length());
        for (int i=0; i<minLength;i++){
            if (title1.charAt(i) != title2.charAt(i)){
                return title1.charAt(i) - title2.charAt(i);
            }
        }
        return title1.length() - title2.length();
    }
    public void displayBooks(){
        for (int i=0; i<size;i++){
            System.out.println("Title: "+books[i].title+", Book Number: "+books[i].BN);
        }
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of books: ");
        int booksNum=inp.nextInt();
        Library library= new Library(booksNum);
        
        for(int i=0; i<booksNum;i++){
            
            System.out.println("Enter book"+ (i+1) +"title: ");
            String title=inp.nextLine();
            System.out.println("Enter book"+ (i+1) +"number: ");
            int bn=inp.nextInt();
            
            library.addBook(title,bn);
            
        }
        
        System.out.println("Books (Unosorted):");
        library.displayBooks();
        
        library.sortByTitle();
        
        System.out.println("Books (Sorted by Title):");
        library.displayBooks();
        
        System.out.println("Enter Book to search: ");
        String searchTitle=inp.nextLine();
        int index=library.searchByTitle(searchTitle);
        
        if (index != -1){
            System.out.println("\n Book found at index"+index+": "+searchTitle);
        }
        else{
            System.out.println("\n Book not found: "+searchTitle);
        }
    }
}
