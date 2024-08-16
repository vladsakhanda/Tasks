package task.T14;

public class Shop {
    public static void main(String[] args) throws Exception {
        try {
            books(6);
        } catch (Exception e) {
            int b = books.length;
            int c = b - 1;

            System.out.println("Такої книжки не існує, є книжки тільки з номером від 0 до " + c + " спробуйте ще раз");
        }


    }
   static String[] books = {"b1","b2","b3","b4"};



   static void books (int a) throws Exception {
       int b = books.length;
           if (a > b) {
               throw new Exception();
           } else {
               System.out.println(books[a]);
           }
       }
    }
}
