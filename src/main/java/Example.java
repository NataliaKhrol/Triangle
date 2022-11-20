// тренировочное по джаве..подготовка к собесу

public class Example {
    String bars;
    static int counter;
  /*  String bum;
    {
        int bra;
    }
       public void kirdyk (String[] args) {
        String student;


    }*/

    public static void main(String[] args) {
        Example a = new Example();
        Example b = new Example();

        System.out.println("a:" + a.bars);
        System.out.println("b:" + b.bars);
        a.bars = "A";
        b.bars = "B";
        System.out.println("a:" + a.bars);
        System.out.println("b:" + b.bars);

        a.counter = 1;
        b.counter = 3;
        System.out.println("a:" + a.counter);
        System.out.println("b:" + b.counter);
        System.out.println(Example.counter);

       a.brud(2);

    }

    public void brud(String b) {

    }

    public void brud() {

    }

    public int brud(double e) {
        return 0;
    }

    public int brud(int e) {
        return 0;
    }
}

