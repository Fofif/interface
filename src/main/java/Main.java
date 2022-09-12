public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.nameBook = "little prince";

        Magazine magazine1 = new Magazine();
        magazine1.nameMagazine = "Abc";
        Printable[] mas1 = {book1, magazine1};
        for(int i = 0; i<mas1.length; i++){
            mas1[i].print();
            if (mas1[i] instanceof Book){
                ((Book) mas1[i]).printBooks(mas1);
            }
            if (mas1[i] instanceof Magazine){
                ((Magazine) mas1[i]).printMagazines(mas1);
            }
        }
    }
}
