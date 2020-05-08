package Class_Book;

import java.util.Scanner;

public class FictionBook extends Book{
    private String category;
    private int amount;
    private int sell=0;
    //


    public FictionBook() {
    }

    public FictionBook(String category, int amount, int sell) {
        this.category = category;
        this.amount = amount;
        this.sell = sell;
    }

    public FictionBook(int bookID, String name, int price, String author, String category, int amount) {
        super(bookID, name, price, author);
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
