import java.util.Scanner;

public class BookInformation {
    /*
     * Program that calls on the base class "Book" and derived class "Encyclopedia"
     * Creates book and encyclopedia objects
     */
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Book myBook = new Book();
      Encyclopedia myEncyclopedia = new Encyclopedia();

      String title, author, publisher, publicationDate;
      String eTitle, eAuthor, ePublisher, ePublicationDate, edition;
      int numVolumes;

      System.out.print("Enter title: ");
      title = scnr.nextLine();
      System.out.print("\nEnter author: ");
      author = scnr.nextLine();
      System.out.print("\nEnter publishing company: ");
      publisher = scnr.nextLine();
      System.out.print("\nEnter publication date: ");
      publicationDate = scnr.nextLine();

      System.out.print("\nEnter title: ");
      eTitle = scnr.nextLine();
      System.out.print("\nEnter author: ");
      eAuthor = scnr.nextLine();
      System.out.print("\nEnter publishing company: ");
      ePublisher = scnr.nextLine();
      System.out.print("\nEnter publication date: ");
      ePublicationDate = scnr.nextLine();
      System.out.print("\nEnter edition: ");
      edition = scnr.nextLine();
      System.out.print("\nEnter number of volumes: ");
      numVolumes = scnr.nextInt();

      System.out.println();
      scnr.close();

      myBook.setTitle(title);
      myBook.setAuthor(author);
      myBook.setPublisher(publisher);
      myBook.setPublicationDate(publicationDate);
      myBook.printInfo();

      myEncyclopedia.setTitle(eTitle);
      myEncyclopedia.setAuthor(eAuthor);
      myEncyclopedia.setPublisher(ePublisher);
      myEncyclopedia.setPublicationDate(ePublicationDate);
      myEncyclopedia.setEdition(edition);
      myEncyclopedia.setNumVolumes(numVolumes);
      myEncyclopedia.printInfo();

    }
}