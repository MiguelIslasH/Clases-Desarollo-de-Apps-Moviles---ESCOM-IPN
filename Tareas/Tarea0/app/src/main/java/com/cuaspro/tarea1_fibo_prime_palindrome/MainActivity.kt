package com.cuaspro.tarea1_fibo_prime_palindrome

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Tarea 0: Fibo-Prime-Palindrome")
        setup()
    }

    private fun isPrime(num: Int): Boolean{
        if(num < 0){
            return false
        }

        var primes = IntArray(num+1)
        var i = 0
        while(i <= num){
            primes[i] = 1
            var j = 2
            while(j * j <= num){
                if(primes[j] == 1){
                    var k = 2
                    while(k <= num/j){
                        primes[k*j] = 0
                        k += 1
                    }
                }
                j += 1
            }
            i += 1
        }

        if(primes[num] == 1){
            return true
        }

        return false
    }

    private fun isPalindrome(num: Int): Boolean{
        var stringNum = num.toString()
        if(num < 0){
            stringNum = stringNum.takeLast(stringNum.length - 1)
        }

        var pointer1 = 0
        var pointer2 = stringNum.length - 1

        while(pointer1 < pointer2){
            if(stringNum[pointer1] != stringNum[pointer2]){
                return false
            }
            pointer1 += 1
            pointer2 -= 1
        }

        return true
    }

    private fun isInFibonacci(num: Int): Boolean{

        if(num < 0 ){
            return false
        }

        var a = 0
        var b = 1
        var c = 0

        while(c <= num){
            if(c == num){
                return true
            }
            c = a + b
            a = b
            b = c
        }

        return false
    }

    private fun setup(){
        val x = 55
        val fibo =isInFibonacci(x)
        val palindrome = isPalindrome(x)
        val prime = isPrime(x)

        setTexts(x, fibo, palindrome, prime)
    }

    private fun setTexts(x: Int, fibo: Boolean, palindrome: Boolean, prime: Boolean){
        val lblTitulo = findViewById<TextView>(R.id.lblTitulo)
        val lblPrime = findViewById<TextView>(R.id.lblPrime)
        val lblPalindrome = findViewById<TextView>(R.id.lblPalindrome)
        val lblFibo = findViewById<TextView>(R.id.lblFibo)

        lblTitulo.setText("El número es: $x")
        lblFibo.setText("Está en fibonacci? " + if(fibo) "Sí" else "No")
        lblPalindrome.setText("Es un palíndromo? " + if(palindrome) "Sí" else "No")
        lblPrime.setText("Es un número primo? " + if(prime) "Sí" else "No")

    }
}