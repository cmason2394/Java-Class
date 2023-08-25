public class Encyclopedia extends Book {
    /*
     * Derived class from Book class
     * Additional data members of encyclopedia edition and number of volumes
     * sets and gets edition and number of volumes
     * Overrides book print method to also print the edition and number of volumes
     */
   // DONE: Declare private fields: edition, numVolumes
   private String edition;
   private int numVolumes;
  
   
   // DONE: Define mutator methods - 
   //       setEdition(), setNumVolumes()
   public void setEdition(String userEdition) {
    edition = userEdition;
   }

   public void setNumVolumes(int userNumVolumes) {
    numVolumes = userNumVolumes;
   }
   
  
   // DONE: Define accessor methods -
   //       getEdition(), getNumVolumes()
   public String getEdition() {
        return edition;
   }

   public int getNumVolumes () {
        return numVolumes;
   }
   
   // DONE: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
   @Override
   public void printInfo() {
        super.printInfo();
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Volumes: " + numVolumes);
   }
}
