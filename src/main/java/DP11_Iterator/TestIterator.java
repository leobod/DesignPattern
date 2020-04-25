package DP11_Iterator;

/**
 * Iterator设计模式
 *
 * 将遍历和实现分开
 */

public class TestIterator {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("倚天屠龙记"));
        bookShelf.appendBook(new Book("葵花宝典"));
        bookShelf.appendBook(new Book("九阳真经"));
        bookShelf.appendBook(new Book("神雕侠侣"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
