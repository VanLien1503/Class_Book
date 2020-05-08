package Class_Book;

public class Main {
    public static void main(String[] args) {
        // tạo 5 đối tượng thuộc lớp grammingBook;

        ProgrammingBook programmingBook1=new ProgrammingBook(1,"grammingBook1",21000, "CodeGym","Java","SpringMVC",100);
        ProgrammingBook programmingBook2=new ProgrammingBook(2,"grammingBook2",22000, "CodeGym","Java","SpringMVC",100);
        ProgrammingBook programmingBook3=new ProgrammingBook(3,"grammingBook3",23000, "CodeGym","Java","SpringMVC",100);
        ProgrammingBook programmingBook4=new ProgrammingBook(4,"grammingBook4",24000, "CodeGym","Java","SpringMVC",100);
        ProgrammingBook programmingBook5=new ProgrammingBook(5,"grammingBook5",25000, "CodeGym","Java","SpringMVC",100);

        ProgrammingBook[]programmingBooks={programmingBook1,programmingBook2};

        System.out.println(programmingBook1.getPrice());
        System.out.println(programmingBook1.isSell());

        for (ProgrammingBook a:programmingBooks) {
            System.out.println(a.getName());
        }
// taoj 5 doi tuong thuoc lop FictionBook
        FictionBook fictionBook1=new FictionBook(11,"fictionBook1",31000,"CodeGym","A",50);


        Book[]books={programmingBook1,programmingBook2};
        for (int i=0;i<books.length;i++){
            System.out.println(books[i].getPrice());
        }

        Book book=new ProgrammingBook();
    }
}
