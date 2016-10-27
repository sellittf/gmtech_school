package refactorings.replaceDataValueWithObject;

public class Customer {
   private String _name;

   public Customer(String name) {
       _name = name;
   }

   public String getName() {
       return _name;
   }
   public void setName(String name) {
       _name = name;
   }

}
