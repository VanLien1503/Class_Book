package Class_Book;

import java.util.Scanner;

public class ProgrammingBook extends Book {
    private String language;
    private String fameWork;
    private int amount;
    private int sell=0;
    //

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, String fameWork, int amount) {
        this.language = language;
        this.fameWork = fameWork;
        this.amount = amount;
    }

    public ProgrammingBook(int bookID, String name, int price, String author, String language, String fameWork, int amount) {
        super(bookID, name, price, author);
        this.language = language;
        this.fameWork = fameWork;
        this.amount = amount;
    }

    // getter&setter

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFameWork() {
        return fameWork;
    }

    public void setFameWork(String fameWork) {
        this.fameWork = fameWork;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public int isSell(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bạn mua bao nhiêu quấn sách: ");
        setSell(scanner.nextInt());
        int price=0;
        if (getSell()>amount){
            do {
                if (getSell()==0){
                    System.out.println(" Số Lượng cần mua >0");
                } else {
                    System.out.println("Số Lượng Cần Mua nhỏ hơn : "+this.amount);
                }
                System.out.println("Số Lượng Chỉ Còn : "+this.amount);
                setSell(scanner.nextInt());
            }
            while (getSell()>amount);
            price=this.getPrice()*getSell();
        }else {
            System.out.println(this.getSell());
            price= this.getPrice()*getSell();
        }
        return price;
    }

}
