package exception;
public class MyException {
    public static void getinformation(String  data) throws Exception
    {
        System.out.println("Information");
        if(data.isEmpty())
        {
            throw new Exception("load");
        }
    }
    public static void main(String[] args) throws Exception {
        try {
          getinformation("");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
