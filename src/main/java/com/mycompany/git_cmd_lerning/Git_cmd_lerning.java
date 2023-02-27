/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.git_cmd_lerning;

/**
 *
 * @author ICX
 */
public class Git_cmd_lerning {

    public static void main(String[] args) {
       int limit = 100;
	        System.out.println("Prime numbers between 1 and " + limit);
	        for (int i = 2; i <= limit; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(i + " ");
	            }
	        }
    }
}
