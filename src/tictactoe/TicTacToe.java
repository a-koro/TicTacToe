/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author A.Korovesis
 */
public class TicTacToe {

    public static char[] positions = new char[]{'1','2','3','4','5','6','7','8','9'};
    
    public static void printGame(char[] list) {
        System.out.println(list[0]+" | "+list[1]+" | "+list[2]);
        System.out.println("---------");
        System.out.println(list[3]+" | "+list[4]+" | "+list[5]);
        System.out.println("---------");
        System.out.println(list[6]+" | "+list[7]+" | "+list[8]);
    }
    
    public static int scannerMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nChoose your position: ");
        int playerInput = sc.nextInt();
        if (playerInput==1 && positions[0]=='1') {
            return playerInput;
        }
        else if (playerInput==2 && positions[1]=='2') {
            return playerInput;
        }
        else if (playerInput==3 && positions[2]=='3') {
            return playerInput;
        }
        else if (playerInput==4 && positions[3]=='4') {
            return playerInput;
        }
        else if (playerInput==5 && positions[4]=='5') {
            return playerInput;
        }
        else if (playerInput==6 && positions[5]=='6') {
            return playerInput;
        }
        else if (playerInput==7 && positions[6]=='7') {
            return playerInput;
        }
        else if (playerInput==8 && positions[7]=='8') {
            return playerInput;
        }
        else if (playerInput==9 && positions[8]=='9') {
            return playerInput;
        }
        System.out.println("Position already played!");
        return scannerMethod();
    }
    
    public static void changeTable(int position, int player) {
        if (player==1) {
            positions[position-1]='X';
        }
        else if (player==2) {
            positions[position-1]='O';
        }
    }
    
    public static boolean winningRows(char[] positions) {
        if (positions[0]==positions[1] && positions[1]==positions[2]) {
            return true;
        }
        else if (positions[3]==positions[4] && positions[4]==positions[5]) {
            return true;
        }
        else if (positions[6]==positions[7] && positions[7]==positions[8]) {
            return true;
        }
        else if (positions[0]==positions[3] && positions[3]==positions[6]) {
            return true;
        }
        else if (positions[1]==positions[4] && positions[4]==positions[7]) {
            return true;
        }
        else if (positions[2]==positions[5] && positions[5]==positions[8]) {
            return true;
        }
        else if (positions[0]==positions[4] && positions[4]==positions[8]) {
            return true;
        }
        else if (positions[2]==positions[4] && positions[4]==positions[6]) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        while(true) {
            printGame(positions);
            System.out.println("Player X turn!");
            changeTable(scannerMethod(), 1);
            if (winningRows(positions)) {
                printGame(positions);
                System.out.println("We Have A Winner!");
                break;
            }
            printGame(positions);
            System.out.println("Player O turn!");
            changeTable(scannerMethod(), 2);
            if (winningRows(positions)) {
                printGame(positions);
                System.out.println("We Have A Winner!");
                break;
            }
        }
    }
    
}
