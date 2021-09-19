package com.greatlearningservice;

public class NoteCount {

    public void implementation(int[] notes,int amount){
        int[] counter=new int[notes.length];
        try{
            for (int i=0;i<notes.length;i++){
                if (amount>=notes[i]){
                    counter[i]=amount/notes[i];
                    amount=amount-counter[i]*notes[i];
                }
            }
            if (amount>0){
                System.out.println("Exact amount cannot be given with the highest denominations");
            }else {
                System.out.println("Your payment approach in order to give mininum no of notes will be");
                for (int i=0;i<notes.length;i++){
                    if (counter[i]!=0)
                        System.out.println(notes[i]+":"+counter[i]);
                }
            }

        }catch (ArithmeticException e){
            System.out.println(e+"notes of denomination 0 is invalid");
        }
    }
}
