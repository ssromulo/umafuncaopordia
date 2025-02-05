package com.example.aprendendo.main
import java.text.DecimalFormat


//@author: Romulo Sercundes
//@objetcive: Escrever uma função por dia a fim de resolver um problema real.

public class Execute() {
    //Nova função a partir daqui
    
    // Função que calcula a velocidade final de um objeto com relação à gravidade baseado em sua massa
    fun acceleration(): Double{
        println("Funcao de aceleracao.\nDigite o valor de delta T em segundos: ")
        val deltaT = readln().toDouble()

        println("Digite o valor de delta V em metros por segundos: ")
        val deltaV = readln().toDouble()

        val deltaA: Double = deltaV / deltaT
        print("A aceleracao foi de $deltaA m/s")

        return deltaA
    }

    //Função que soma dois numeros
    fun sum(numA : Double, numB: Double): Double{
            val result: Double = numA + numB
            return result
    }

    //Função que calcula a velocidade média de um veículo.
    fun averageSpeed(): Double{
        val deltaS: Double //espaço em metros
        val deltaT: Double //tempo em segundos
        var aSpeed: Double //velocidade media em m/s

        //Pede ao usuário para digitar os valores
        print("Digite o espaco percorrido em metros: \n>> ")
        deltaS = readLine()!!.toDouble()

        print("Digite o tempo percorrido em segundos. \n>> ")
        deltaT = readLine()!!.toDouble()

        // Fórmula na física: Vm = deltaS / deltaT
        aSpeed = deltaS / deltaT

        //imprime e retorna o resultado
        val toPrint = String.format("%.2f", aSpeed)
        print("A velocidade media foi de $toPrint m/s.")

        return aSpeed
    }

    fun helloWorld() {
        print("Hello, world.")
    }
}