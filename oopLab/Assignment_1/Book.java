class Book {
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private int count;

    public Book(int ISBN,String bookTitle,int numberOfPages){
        this.ISBN=ISBN;
        this.bookTitle=bookTitle;
        this.numberOfPages=numberOfPages;
        this.count=1;
    }
    public Book(){
        this(0,"",0);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public String toString(){
        return "ISBN Number is : "+ISBN+ ", The Title is: "+ bookTitle+ ", Pages Number : "+numberOfPages + ", Counting: "+count;
    }

    public int compareTo(Book other){
        if(this.numberOfPages>other.numberOfPages){
            return 1;
        }
        else if(this.numberOfPages==other.numberOfPages){
            return 0;
        }
        else{
            return -1;
        }
    }
}
