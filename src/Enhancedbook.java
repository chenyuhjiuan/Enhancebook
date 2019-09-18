import java.util.ArrayList;
import java.util.Scanner;

public class Enhancedbook {

    public static void main(String args[]){
        BookDB book1=new BookDB();
        book1.setSku("Java1001");
        book1.setTitle("Head First Java");
        book1.setAuthor("Kathy Sierra and Bert Bates");
        book1.setDescription("Easy to read Java workbook");
        book1.setPrice(47.50);
        book1.getDisplayText();
        BookDB book2=new BookDB();
        book2.setSku("Java1002");
        book2.setTitle("Thinking in Java");
        book2.setAuthor("Bruce Eckel");
        book2.setDescription("Details about Java under the hood");
        book2.setPrice(20.00);
        book2.getDisplayText();
        BookDB book3=new BookDB();
        book3.setSku("Orcl1003");
        book3.setTitle("OCP: Oracle Certified Professional Java SE");
        book3.setAuthor("Jeanne Boyarsky");
        book3.setDescription("Everything you need to know in one place");
        book3.setPrice(45.00);
        book3.getDisplayText();
        BookDB book4=new BookDB();
        book4.setSku("Python1004");
        book4.setTitle("Automate the Boring Stuff with Python");
        book4.setAuthor("Al Sweigart");
        book4.setDescription("Fun with Python");
        book4.setPrice(10.50);
        book4.getDisplayText();
        BookDB book5=new BookDB();
        book5.setSku("Zombie1005");
        book5.setTitle("The Maker's Guide to the Zombie Apocalypse");
        book5.setAuthor("Simon Monk");
        book5.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
        book5.setPrice(16.50);
        book5.getDisplayText();
        BookDB book6=new BookDB();
        book6.setSku("Rasp1006");
        book6.setTitle("Raspberry Pi Projects for the Evil Genius");
        book6.setAuthor("Donald Norris");
        book6.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
        book6.setPrice(14.75);
        book6.getDisplayText();


    }
}
