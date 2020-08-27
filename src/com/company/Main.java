package com.company;

public class Main {

    public static void main(String[] args){

    MobilePhone phone = new MobilePhone("200g",100);

    MobilePhone oldphone = new MobilePhone("1000g",10);

    MobilePhone newphone = new MobilePhone("50g",555000);
    String parameters = phone.getParameter();
    System.out.println(parameters);
    oldphone.displayValues();

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
    }
}
