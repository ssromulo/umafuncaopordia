package com.example.aprendendo.main
import java.text.DecimalFormat


//@author: Romulo Sercundes
//@objetcive: Escrever uma função por dia a fim de resolver um problema real.

public class Execute() {
    //Nova função a partir daqui. As funções estão organizadas da mais recente para a mais antiga.

    //Função que calcula quanto é necessário de entrada para financiar um imóvel.
    fun entradaImovel(): Double{
        val valImovel: Double
        val valEntrada: Double
        val valFinan: Double
        val renda: Double

        println("Funcao que calcula o valor de entrada de um imovel.\nDigite o valor do imovel em reais: ")
        valImovel = readln().toDouble()
        println("Digite sua renda mensal em reais: ")
        renda = readln().toDouble()

        valEntrada = valImovel * 0.2
        valFinan = valImovel - valEntrada

        println("O valor de entrada do imovel eh $valEntrada.\nO valor restante a ser financiado eh $valFinan.")

        return valEntrada
    }

    //Função que calcula a média entre dois números
    fun calcMedia(): Double{
        val numA: Double
        val numB: Double
        val res: Double

        println("Funcao de calculo de media.\nDigite o valor do primeiro numero: ")
        numA = readln().toDouble()
        println("Digite o valor do segundo numero: ")
        numB = readln().toDouble()

        res = (numA + numB) / 2
        println("A media entre $numA e $numB eh: $res")
        return res
    }
    
    // Função que calcula a velocidade final de um objeto com relação à gravidade baseado em sua massa
    fun acceleration(): Double{
        println("Funcao de aceleracao.\nDigite o valor de delta T em segundos: ")
        val deltaT = readln().toDouble()

        println("Digite o valor de delta V em metros por segundos: ")
        val deltaV = readln().toDouble()

        val toDecimal = DecimalFormat("#.##")

        val deltaA = deltaV / deltaT
        val formated = toDecimal.format(deltaA)
        print("A aceleracao foi de $formated m/s")

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