package com.company;

public class Main {

    public static void main(String[] args){

    MobilePhone phone = new MobilePhone("200g",100);

    MobilePhone oldphone = new MobilePhone("1000g",10);

    MobilePhone newphone = new MobilePhone("50g",555000);
    String parameters = phone.getParameter();
    System.out.println(parameters);
    oldphone.displayValues();
    phone.reducePrice(50);

    }

    static class  MobilePhone

    {

        String weight = "200g";
        int price;

        public MobilePhone(String weight,int price)
            {

            this.weight = weight;
            this.price = price;
            }
        //tworzenie metody zwraacajacej tekst
        public void displayValues(){
            System.out.println(this.weight+ " " + this.price);
            }

        // tworzenie metody zwracajacej String
        public String getParameter() {
            return this.weight + " "+ this.price;
        }

        public void displayValueOnly(){
            System.out.println(this.price);
        }
        // zmiana ceny podana w argumencie benefit
        public void reducePrice(int benefit){
            int reducedPrice = this.price - (this.price * benefit/100);
        System.out.println("Reduced price by "+ benefit +"% "+ "gives us " + reducedPrice);
        }

    }
}
