import java.util.Scanner;

public class Atividade_EstruturadeRepetiçao {
    public static void main(String[] args) {
        Algoritmo12();

    }

    private static void Algoritmo1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritmo 1");

        System.out.println("Escolha a opção que voce deseja 1- Soma 2- Subtração 3- Multiplicação 4- Divisão ");
        int opcao = scanner.nextInt();

        System.out.println("Digite o primeiro numero que voce quer fazer a operação: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o primeiro numero que voce quer fazer a operação: ");
        double num2 = scanner.nextDouble();

        switch (opcao) {

            case 1:

                System.out.println("Voce escolheu SOMA: ");

                double soma = num1 + num2;

                System.out.println(soma);

                break;

            case 2:

                System.out.println("Voce escolheu SUBTRAÇÃO: ");

                double subtracao = num1 - num2;

                System.out.println(subtracao);

                break;

            case 3:

                System.out.println("Voce escolheu MULTIPLICAÇÃO: ");

                double multiplicacao = num1 * num2;

                System.out.println(multiplicacao);

                break;

            case 4:

                System.out.println("Voce escolheu DIVISAO: ");

                double divisao = num1 / num2;

                System.out.println(divisao);

                break;

            default:
                System.out.println("Opção Invalida.");

        }
    }

    private static void Algoritmo2() {

        int soma = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                soma += i;
            }
        }

        System.out.println("Soma: " + soma);

    }

    private static void Algoritmo3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero do empregado: ");
        int numEmpregado = scanner.nextInt();

        System.out.println("Informe o numero de meses trabalhado: ");
        int numMeses = scanner.nextInt();

        if (numEmpregado == 0 || numMeses == 0) {
            System.out.println("Empregado Invalido.");

        } else {
            int numRecente = numEmpregado, numMesesRecente = numMeses;

            int numAntigo = numEmpregado, numMesesAntigo = numMeses;

            int cont = 1;

            while (cont <= 300) {

                System.out.println("Informe o numero do empregado: ");
                numEmpregado = scanner.nextInt();

                System.out.println("Informe o numero de meses trabalhado: ");
                numMeses = scanner.nextInt();

                if (numEmpregado == 0 || numMeses == 0) {
                    break;
                }

                if (numMeses < numMesesRecente) {
                    numRecente = numEmpregado;
                    numMesesRecente = numMeses;
                }

                if (numMeses > numMesesAntigo) {
                    numAntigo = numEmpregado;
                    numMesesAntigo = numMeses;
                }
                cont++;
            }

            System.out.println("Numero do mais recente: " + numRecente + " (" + numMesesRecente + " meses )");

            System.out.println("Numero do mais antigo: " + numAntigo + " (" + numMesesAntigo + " meses )");

        }
    }

    private static void Algoritmo4() {
        Scanner scanner = new Scanner(System.in);

        //Inicializando as variasveis

        double menorAltura = 999, maiorAltura = 0;
        int cont = 1, somaF = 0, quantidadeF = 0, quantidadeM = 0;
        String sexoAlto = "";


        while (cont <= 15) {

            //Entrada de dados

            System.out.println("Informe seu sexo ( M = Masculino ou F = Feminino): ");
            String sexo = scanner.next();

            System.out.println("Informe a sua altura: ");
            double altura = scanner.nextDouble();

            //Verificando menor altura do grupo

            if (altura < menorAltura)

                menorAltura = altura;

            //Guardando informaçoes pra soma da media de altura das mulheres

            if (sexo.equals("F")) {
                somaF += altura;
                quantidadeF++;

                //Somando a quantidade de homens no grupo

            } else {

                quantidadeM++;

            }

            //verificando pessoa mais alta do grupo

            if (altura > maiorAltura) {

                maiorAltura = altura;
                sexoAlto = sexo;

            }
        }

        //Saida de Dados

        System.out.println("a) Menor altura: " + menorAltura);

        System.out.println("b) Média das mulheres: " + somaF / quantidadeF);

        System.out.println("c) Homens: " + quantidadeM);

        System.out.println("d) Sexo do mais alto: " + sexoAlto);

    }

    private static void Algoritmo5() {
        Scanner scanner = new Scanner(System.in);

        //Inicializando as Variaveis

        double mediaSalario = 0, mediaNumFilhos = 0, maiorSalario = 0, salario = 0;
        int filhos = 0, cont = 0, cont250 = 0;

        //Entrada de dados
        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o salario do empregado: ");
            salario = scanner.nextDouble();

            System.out.println("Informe quantidade de filhos que tem : ");
            filhos = scanner.nextInt();

            cont++;

            if (salario >= 0) {

                System.out.println("Entrada de salario invalida,Saindo do programa");

            }

        }

        //Media de salario da população

        mediaSalario = salario / cont;

        //Media de filhos

        mediaNumFilhos = filhos / cont;

        //Maior Salario

        if (salario > maiorSalario) {

            maiorSalario = salario;

        }

        //Percentual de salario ate de 250,00

        if (salario <= 250) {

            cont250++;

        }

        System.out.println("Media de salario da população é de : - " + mediaSalario);

        System.out.println("Media de filhos que tem : - " + mediaNumFilhos);

        System.out.println("Maior Salario: - " + maiorSalario);

        System.out.println("Percentual de pessoas que ganham mais de R$250,00 : - " + cont250);
    }

    private static void Algoritmo6() {
        Scanner scanner = new Scanner(System.in);

        // inicializando Variaveis

        double soma = 0, valor = 0, quantPositivo = 0, quantNegativo = 0, total = 0, media = 0, porcenPositivo = 0, porcenNegativo = 0;

        //Entrada de Dados

        System.out.println("Digite um valor: ");
        valor = scanner.nextDouble();

        while (valor > 0) {

            soma = soma + valor;

            total = total + 1;

            if (valor > 0) {

                quantPositivo = quantPositivo + 1;

                break;

            } else {

                quantNegativo = quantNegativo + 1;

            }

        }

        if (total > 0) {

            media = soma / total;

            porcenPositivo = (quantPositivo * 100) / total;

            porcenNegativo = (quantNegativo * 100) / total;

            // Saida de Dados

            System.out.println("Media aritmetica: " + media);

            System.out.println("Quantidade de Postivo: " + quantPositivo);

            System.out.println("Quantidade de Negativo: " + quantNegativo);

            System.out.println("Percentual de Positivo: " + porcenPositivo);

            System.out.println("Percentual de Negativo: " + porcenNegativo);


        } else {

            System.out.println("Valor Invalido ");

        }
    }

    private static void Algoritmo7() {
        Scanner scanner = new Scanner(System.in);

        //Inicializando as variaveis

        int valor = 0, cont = 0, soma = 0;

        double media = 0;

        // Entrada de dados

        for (int i = 0; i < 75; i++) {


            System.out.println("Digite um valor: ");
            valor = scanner.nextInt();

            cont++;

            soma += valor;

        }

        if (cont > 0) {

            media = soma / cont;

        }

        //Saida de dados

        System.out.println("Media aritmetica: " + media);

        System.out.println("Quantidade de numeros lidos : " + cont);

    }

    private static void Algoritmo8() {
        Scanner scanner = new Scanner(System.in);

        //Inicializando variaveis

        String nome, nomeMaior, nomeMenor;
        double altura = 0, mediaAltura = 0, mediaAlturaF = 0, mediaAlturaM = 0, maiorAltura = 0, menorAltura = 0, somaAlturaTurma = 0, somaM = 0, somaF = 0;
        int sexo = 0, quantM = 0, quantF = 0;

        //Entrada de Dados

        for (int i = 1; i <= 15; i++) {

            System.out.println("Digite o seu nome : ");
            nome = scanner.next();

            System.out.println("Digite a sua altura : ");
            altura = scanner.nextDouble();

            System.out.println("Informe seu sexo ( 1 - Masculino, 2 - Feminino )");
            sexo = scanner.nextInt();

            if (i > 1) {

                maiorAltura = altura;

                menorAltura = altura;

                nomeMaior = nome;

                nomeMenor = nome;

            } else {

                if (altura > maiorAltura) {

                    maiorAltura = altura;

                    nomeMaior = nome;

                }
                if (altura < menorAltura) {

                    menorAltura = altura;

                    nomeMenor = nome;

                }

            }

            somaAlturaTurma = somaAlturaTurma + altura;

            if (sexo == 1) {

                somaM = somaM + altura;

                quantM = quantM + 1;

            } else {

                somaF = somaF + altura;

                quantF = quantF + 1;

            }


        }

        if (quantF > 0) {

            System.out.println("Media das Mulheres : " + somaF / quantF);

        } else {

            System.out.println("Não ha mulheres na turma ");

        }

        if (somaM > 0) {

            System.out.println("Media dos homens : " + somaM / quantM);

        } else {

            System.out.println(" Não ha homens na turma ");

        }

        System.out.println("A media da turma foi : " + somaAlturaTurma / 15);

    }

    private static void Algoritmo9() {
        Scanner scanner = new Scanner(System.in);

        double nota = 0, maiorNota = 0, menorNota = 0;

        while (nota >= 0) {

            System.out.println("Digite a nota: ");
            nota = scanner.nextDouble();

            if (nota >= 0) {

                System.out.println(" Nota Minima ");


            }

            if (nota >= 15) {

                System.out.println(" Nota Maior ");

            }

            if (nota < maiorNota) {

                maiorNota = nota;

            }

            if (nota < menorNota) {

                menorNota = nota;

            }

            System.out.println("A maior nota foi : " + maiorNota);

            System.out.println("A menor nota foi : " + menorNota);

        }
    }

    private static void Algoritmo10() {
        Scanner scanner = new Scanner(System.in);


        double polegada = 0, centimetro = 0;

        for (int i = 1; i <= 20; i++) {

            //Entrada de dados

            System.out.println("Digite o valor  do centimetro : ");
            centimetro = scanner.nextDouble();

            //Conversao a polegada

            polegada = centimetro * 2.54;

            //Saida de Dados

            System.out.println("A conversao de centimetros pra polegada foi de : " + polegada);

        }
    }

    private static void Algoritmo11() {
        Scanner scanner = new Scanner(System.in);

        int numero = 0, soma = 0;

        for (int i = 1; i <= 20; i++) {

            System.out.println("Digite um numero inteiro : ");
            numero = scanner.nextInt();


            if (numero % 2 == 0) {

                soma += numero;

            }

        }

        System.out.println("A soma dos Numeros pares : " + soma);

    }

    private static void Algoritmo12() {
        Scanner scanner = new Scanner(System.in);

        // Inicializando as variaveis


        int numMatricula = 0, nota = 0, notaMaior = 0, notaMenor = 0, matriculaMaior = 0, matriculaMenor = 0;

        for (int i = 1; i <= 100; i++) {

            //Entrada de dados

            System.out.println("Informe seu numero de matricula : ");
            numMatricula = scanner.nextInt();

            System.out.println("Informe sua nota : ");
            nota = scanner.nextInt();

            if (nota > notaMaior) {

                notaMaior = nota;

                matriculaMaior = numMatricula;

            }

            if (nota < notaMenor) {

                notaMenor = nota;

                matriculaMenor = numMatricula;

            }
        }

        System.out.println("Aluno com a maior nota foi : " + matriculaMaior + " Nota : " + notaMaior);

        System.out.println("Aluno com a menor nota foi : " + numMatricula + " Nota : " + notaMenor);

    }
}


