public class Util {
//    public  void sumNumber()
//    {
//        class Number{
//            public static int max(int a, int b)
//            {
//                return  Math.max(a,b);
//            }
//        }
//        Number number = new Number();
//        System.out.println(number.max(5,3));
//    }
    static class Outter{
        public void  dataFromOuterClass(){
            System.out.println("This is data from outer class");
        }
}
static class Implementor{
        public void  dataFromImplementor(){
            Outter outter = new Outter(){
                @Override
                public void dataFromOuterClass() {
                    System.out.println("This  is data anonymous class");
                }
            };
            outter.dataFromOuterClass();

        }
}

    public static void main(String[] args) {
//       Util util = new Util();
//       util.sumNumber();
        Outter outter = new Outter();
        outter.dataFromOuterClass();
        Implementor implementor = new Implementor();
        implementor.dataFromImplementor();
    }
}
