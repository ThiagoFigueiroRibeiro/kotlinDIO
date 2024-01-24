

    object ReceitaFederal {
        fun calcularImposto(salario: Double): Double {
            val aliquota = when {
                (salario >= 0 && salario <= 1100) -> 0.05
                (salario >= 1100.01 && salario <= 2500) -> 0.10
                (salario > 2500) -> 0.150
                else -> TODO("Criar as condições para as aliquotas de 10.00% e 15.00%.")
            }
            return aliquota * salario

            //De R$ 0.00 a R$ 1100.00 = 5.00%
            //De R$ 1100.01 a R$ 2500.00 = 10.00%
            //Maior que R$ 2500.00 = 15.00%


        }
    }
    fun main() {
        val valorSalario = readLine()!!.toDouble();
        val valorBeneficios = readLine()!!.toDouble();

        val valorImposto = ReceitaFederal.calcularImposto(valorSalario);
        val saida = valorSalario - valorImposto + valorBeneficios;
        println(String.format("%.2f", saida));
    }

