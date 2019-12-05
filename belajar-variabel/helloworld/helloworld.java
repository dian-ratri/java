public class helloworld{
    public static void main (String [] args){
        System.out.println("Hello World!");
        // kita bangun object mobil
        mobil bmw = new mobil();
        bmw.merk = "BMW i3000";
        bmw.maju();

        mobil fordShelby = new mobil();
        fordShelby.merk = "Ford Mustang Shelby";
        fordShelby.maju();
    }
}

class mobil{
    //attribut
    public String merk;

    public void maju(){
        System.out.println("Mobil "+this.merk+" maju!! Brrmm..");
    }
}