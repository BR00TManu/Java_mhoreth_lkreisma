public class lkreisma implements TellYourName extends Thread {

    public void tell(){
        System.out.println("LKreisma...");
    }

    public void NameofFather(){
        System.out.println("Markus");
    }

    public void IsGooning(){
        while (true) {
            try {
                System.out.println("Going...");
                Thread.sleep(1000);
            }
        }
    }

}