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

        if(args.length == 0){
            System.out.println("No launch option");
        }
        else{
            System.out.println(args[1]+args[0]);
        }
    }
}

class mobil{
    //attribut
    public String merk;

    public void maju(){
        System.out.println("Mobil "+this.merk+" maju!! Brrmm..");
    }
}