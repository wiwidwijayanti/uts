/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackku;

/**
 *
 * @author Farhan
 */
public class main {

  public static void main(String[] args){
        StackKu stackKu = new StackKu();
        String inputan = stackKu.Input_Stack();

        String cek = stackKu.convStrToStack(inputan);
        if (cek != "x"){
            stackKu.cekInput(stackKu.stackAngka,inputan);
        }
    }
}
