public class NestedClass {
    static class Outter{
        public static class   MathHelper{
            public int sub(int a, int b){
                return a - b;
            }
            public int mul(int a, int b){
                return a * b;
            }
        }
        public class Change{
            public int changeFromDollarToRiel(int riel){
                return  riel/ 4000;
            }
            public int changeFromRielToDollar(int dollar){
                return dollar * 4000;
            }
        }

    }




    public static void main(String[] args) {
        Outter.MathHelper  mathHelper= new Outter.MathHelper();
        System.out.println(mathHelper.sub(2, 3));
        System.out.println(mathHelper.mul(2, 3));
        Outter outter = new Outter();
        Outter.Change change = outter.new Change();
        System.out.println(change.changeFromDollarToRiel(1200));
        change.changeFromRielToDollar(change.changeFromDollarToRiel(1200));
    }
}
