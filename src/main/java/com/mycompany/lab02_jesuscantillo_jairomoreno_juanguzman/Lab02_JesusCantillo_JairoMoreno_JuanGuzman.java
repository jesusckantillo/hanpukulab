/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab02_jesuscantillo_jairomoreno_juanguzman;

import java.net.MalformedURLException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.*;
import java.net.URL;


/**
         * ||ACLARACION|
         * | JUSTIFICACION JOPTIONPANE: -->
         * 
         * USO DE IMAGE ICON PARA--
         * MODIFICAR EL ICONO DEL JOPTION PANE --     
         * -USO DE JOPTIONPANE --
         * USO DE ETIQUETAS PARA MODIFICAR EL TEXTO DEL JOPTION PANE--
         * 
         *
         *  **CADA UNA DE ESTAS IMPLEMENTACIONES ESTARIA DENTRO DE LA
         * INVESTIGACION DE JOPTIONPANE OPCIONAL PARA EL BONO, NINGUNA
         * ESTRUCTURA NO VISTA EN CLASE FUE UTLIZADA PARA LA LOGICA O DISEÑO LOS
         * ALGORITMOS (PUNTOS), PLANTEADOS EN LOS ENUNCIADOS**
         *
         *
         *
         */

/**
 *
 * @author AJesus David Cantillo Guerrero - Juan Pablo Guzman - Jairo Luis Moreno
 */
public class Lab02_JesusCantillo_JairoMoreno_JuanGuzman {

    public static void main(String[] args) throws MalformedURLException {
        String username;
        int op = 0, opjuegos = 0, dado1 = 0, dado2 = 0, jugadas, ventaja, puntosj1 = 0, puntosj2 = 0, jugadaj1 = 0, jugadaj2 = 0, optrigro = 0;
        String player1name, player2name, num1i, dado1i;
        int conf = 1;
        int digito1, digito2, digito3, digito4;
        int jdigito1, jdigito2, jdigito3, jdigito4;
        int famas, puntos, change;
        float angulo;
        float fact, pot, sign;
        int lim, digitos;
        int elim, n, num, opmat, auxnum, newnum;
        int mult1, mult2, res;
        float sen, cos;
        float pi = 0, signo;
        long repeticiones = 10000;
        boolean valid;
        String turno = "";
        String winner = "";
        Boolean valido = false;
        
        
        //IMPLEMENTACION DE ICONOS/
        Scanner read = new Scanner(System.in);
        Random r = new Random();
        ImageIcon icon = new ImageIcon(new URL("https://i.ibb.co/kG8vsxq/logoicon3.png"));
        ImageIcon dados = new ImageIcon(new URL("https://i.ibb.co/LSS6HC5/dados.png"));
        ImageIcon logonotext = new ImageIcon(new URL("https://i.ibb.co/K54Wv0J/logonotext.png"));
        ImageIcon triqui = new ImageIcon(new URL("https://i.ibb.co/JtQPGVD/triqui.png"));
        ImageIcon puntoyfama = new ImageIcon(new URL("https://i.ibb.co/6Rww69p/1234.png"));
        ImageIcon suma = new ImageIcon(new URL("https://i.ibb.co/9hxzFF0/suma.png"));
        ImageIcon tacha = new ImageIcon(new URL("https://i.ibb.co/fq1vP2k/tacha.png"));
        ImageIcon multipli = new ImageIcon(new URL("https://i.ibb.co/nM0vnXf/multipli.png"));
        ImageIcon smalldados = new ImageIcon(new URL("https://i.ibb.co/L9Kg1YV/smalldados.png"));
        ImageIcon trigofot = new ImageIcon(new URL("https://i.ibb.co/BKxGKPj/trigofot.png"));

        
        //INICIO DEL PROGRAMAR
        JOptionPane.showMessageDialog(null, "<html><h1 style =\"color:#FF077F;  font:32px; font-weight:bold\">Bienvenido a Hanpuku.\n"
                + "<html><p style =\"color:#FF077F;  font:20px;\"> Menu iterativo de opciones.</p></html>", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, icon);
        username = String.valueOf(JOptionPane.showInputDialog(null, "Por favor, ingrese su nombre: ", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, logonotext, null, ""));

        //DO-WHILE DE ITERACION PRINCIPAL
        do {
            do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "|| Hola " + username + ", escoja una opcion ||\n------------------------------------\n1.Miscelanea de Juegos\n------------------------------------\n2.Procesos Matematico\n------------------------------------\n3.Salir del programa\n------------------------------------", "Hanpuku", JOptionPane.QUESTION_MESSAGE));
            }while (op > 3 || op < 1); 

            //SWITCH  PRINCIPAL DE OPCIONES
            switch (op) {
                //CASO PARA LOS  JUEGOS
                case 1:
                    do {
                        opjuegos = Integer.parseInt(JOptionPane.showInputDialog(null, "| Bienvenido a la miscelanea de juegos |\n"
                                + "    Escoge tu juego preferido:\n"
                                + "----------------------------------\n"
                                + "    1. Dados\n"
                                + "----------------------------------\n"
                                + "    2. Punto y fama\n"
                                + "----------------------------------\n"
                                + "    3. Triqui\n"
                                + "----------------------------------\n"
                                + "    4. Salir al menu\n"
                                + "----------------------------------"
                        ));
                    } while (opjuegos > 4);

                    //SWITCH PARA SELECCION DE JUEGOS
                    switch (opjuegos) {

                        //DADOS
                        case 1:
                            conf = 1;
                            // VARIABLE CONF PARA MANEJAR SI EL USUARIO DESEA REPETIR LA OPCION
                            do {
                                JOptionPane.showMessageDialog(null, "                                                                            <---REGLAS--->\n" + "A. Un jugador arroja los dados (inicia el jugador 1).\n"
                                        + "B. Si el jugador saca doble, aumenta su puntaje acumulado en 1 punto y vuelve a jugar (mientras siga sacando dobles,\n se sigue anotando 1 punto y sigue arrojando el par de dados).\n"
                                        + "C. Si no saca doble, anota el valor de la jugada y le cede el turno al otro jugador.\n"
                                        + "D. El que saca mayor puntaje en la jugada aumenta su acumulado en 3 puntos.\n"
                                        + "E. Si ambos jugadores sacan el mismo valor en una jugada, ésta se anula y se inicia de nuevo la jugada sin incrementar el número de jugadas ni los puntos acumulados.\n"
                                        + "F. El partido lo gana el jugador que obtenga una ventaja de 15 puntos sobre su rival o cuando se llegue a un total de 21 jugadas.", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, dados);
                                player1name = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nombre del Jugador1:", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, dados, null, ""));
                                player2name = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nombre del Jugador2:", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, dados, null, ""));

                                jugadas = 0;
                                ventaja = 0;
                                while (jugadas < 21 && ventaja < 15) {

                                    //TURNO DEL JUGADOR 1
                                    JOptionPane.showMessageDialog(null, "Turno del jugador 1: " + player1name, "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);
                                    jugadas += 1;
                                    dado1 = r.nextInt(6) + 1;
                                    dado2 = r.nextInt(6) + 1;
                                    JOptionPane.showMessageDialog(null, "Jugada numero " + jugadas + " Jugador: " + player1name + "\n"
                                            + "Dado 1:\n " + dado1 + "\n"
                                            + "Dado 2:\n " + dado2 + "\n",
                                             "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);

                                    while (dado1 == dado2) {
                                        JOptionPane.showMessageDialog(null, "DOBLE!!, +1 punto para " + player1name + " y tira denuevo", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);
                                        puntosj1 += 1;
                                        dado1 = r.nextInt(6) + 1;
                                        dado2 = r.nextInt(6) + 1;
                                        JOptionPane.showMessageDialog(null, "Jugada bonus por doble:\n"
                                                + "Dado 1:\n " + dado1 + "\n"
                                                + "Dado 2:\n " + dado2 + "\n",
                                                 "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);

                                    }

                                    jugadaj1 = dado1 + dado2;

                                    //TURNO DEL JUGADOR 2
                                    JOptionPane.showMessageDialog(null, "Turno del jugador 2: " + player2name, "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);
                                    dado1 = r.nextInt(6) + 1;
                                    dado2 = r.nextInt(6) + 1;
                                    JOptionPane.showMessageDialog(null, "Jugada numero " + jugadas + " Jugador: " + player2name + "\n"
                                            + "Dado 1:\n " + dado1 + "\n"
                                            + "Dado 2:\n " + dado2 + "\n",
                                             "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);

                                    while (dado1 == dado2) {

                                        JOptionPane.showMessageDialog(null, "DOBLE!!, +1 punto para " + player2name + " y tira denuevo", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);
                                        puntosj2 += 1;
                                        dado1 = r.nextInt(6) + 1;
                                        dado2 = r.nextInt(6) + 1;
                                        JOptionPane.showMessageDialog(null, "Jugada numero " + jugadas + "\n"
                                                + "Dado 1:\n " + dado1 + "\n"
                                                + "Dado 2:\n " + dado2 + "\n",
                                                 "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);

                                    }

                                    jugadaj2 = dado1 + dado2;

                                    if (jugadaj1 > jugadaj2) {
                                        JOptionPane.showMessageDialog(null, "!" + player1name + " Ha ganado esta jugada, +3 puntos !, con un valor de: \n"
                                                + jugadaj1 + "\n"
                                                + player2name + " Obtuvo un valor de: " + jugadaj2, "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);
                                        puntosj1 += 3;
                                    } else {
                                        if (jugadaj2 > jugadaj1) {
                                            JOptionPane.showMessageDialog(null, "!" + player2name + " Ha ganado esta jugada, +3 puntos !, con un valor de: \n"
                                                    + jugadaj2 + "\n"
                                                    + player1name + " Obtuvo un valor de: " + jugadaj1, "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);
                                            puntosj2 += 3;

                                        } else {
                                            if (jugadaj2 == jugadaj1) {
                                                JOptionPane.showMessageDialog(null, "Se cancela la jugada, valores iguales", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);
                                                jugadas = jugadas - 1;
                                            }
                                        }
                                    }
                                    ventaja = puntosj1 - puntosj2;

                                }
                                if (puntosj1 > puntosj2) {
                                    JOptionPane.showMessageDialog(null, player1name + " Es el ganador con: " + puntosj1 + " puntos", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);
                                } else {
                                    JOptionPane.showMessageDialog(null, player2name + " Es el ganador con: " + puntosj2 + " puntos", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, smalldados);
                                }
                                do {
                                    conf = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea usar esta opción de nuevo?\n1.--> Si\n\n 2.-->No"));
                                } while (conf > 2);  //VALIDACION PARA REPETIR OPCION, LA HAY EN TODAS LAS OPCIONES

                            } while (conf == 1);
                            break;

                        //CASO PARA PUNTO Y FAMA
                        case 2:
                            conf = 1;
                            do {
                                dado1 = 0;
                                jugadas = 0;
                                JOptionPane.showMessageDialog(null, "¡Bienvenido a punto y fama!\n", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, puntoyfama);
                                JOptionPane.showMessageDialog(null, "En este juego deberas adivinar un numero de 4 cifras\n"
                                        + "por cada intento se te mostraran tu cantidad de puntos y de famas\n"
                                        + "\n"
                                        + "Los puntos son la cantidad de digitos de tu numero que estan en el numero incognita, pero no en la misma posición\n"
                                        + "Las famas son la cantidad de digitos que estan en el numero incognita y en la misma posicion\n"
                                        + "¡Mucha Suerte!", "Hanpuku", JOptionPane.INFORMATION_MESSAGE);

                                
                                do {
                                    num = r.nextInt(9999);
                                    while (num < 1000) {
                                        num = r.nextInt(9999);
                                    }
                                    //DIVISION DEL NUMERO ALEATORIO EN DIGITOS
                                    digito1 = (num / 1000) % 10;
                                    digito2 = (num / 100) % 10;
                                    digito3 = (num / 10) % 10;
                                    digito4 = (num / 1) % 10;
                                    System.out.println(digito1);
                                    System.out.println(digito2);
                                    System.out.println(digito3);
                                    System.out.println(digito4);
                                } while (digito1 == digito2 || digito1 == digito3 || digito1 == digito4 || digito2 == digito3 || digito2 == digito4 || digito3 == digito4);
                                //VALIDACION DE QUE EL NUMERO ALEATORIO CUMPLA LOS REQUISITOS

                                while (dado1 != num) {
                                    jugadas += 1;
                                    famas = 0;
                                    puntos = 0;
                                    dado1 = Integer.parseInt(JOptionPane.showInputDialog(null, username + ", Ingrese su combinación de 4 cifras diferentes: ", "Hanpuku"));
                                    jdigito1 = dado1 / 1000;
                                    jdigito2 = dado1 / 100 - dado1 / 1000 * 10;
                                    jdigito3 = dado1 / 10 - (jdigito1 * 100 + jdigito2 * 10);
                                    jdigito4 = dado1 - (10 * (jdigito1 * 100 + jdigito2 * 10 + jdigito3));
                                    while (jdigito1 == jdigito2 || jdigito1 == jdigito3 || jdigito1 == jdigito4 || jdigito2 == jdigito3 || jdigito2 == jdigito4 || jdigito3 == jdigito4 || dado1 > 9999) {
                                        //MISMA VALIDACION DE REQUISITOS PARA EL NUMERO INGRESADO POR EL USUARIO

                                        dado1 = Integer.parseInt(JOptionPane.showInputDialog(null, username + " Ingrese una combinación valida: ", "Hanpuku", JOptionPane.INFORMATION_MESSAGE));
                                        jdigito1 = dado1 / 1000;
                                        jdigito2 = dado1 / 100 - dado1 / 1000 * 10;
                                        jdigito3 = dado1 / 10 - (jdigito1 * 100 + jdigito2 * 10);
                                        jdigito4 = dado1 - (10 * (jdigito1 * 100 + jdigito2 * 10 + jdigito3));
                                    }

                                    //CONDICIONALES PARA DETERMINAR PUNTOS O FAMAS, ESTOS COMPARAN LOS NUMEROS INGRESADOS CON LOS GENERADOS ALEATORIAMENTE
                                    if (jdigito1 == digito2 || jdigito1 == digito3 || jdigito1 == digito4) {
                                        puntos += 1;
                                    }

                                    if (jdigito2 == digito1 || jdigito2 == digito3 || jdigito2 == digito4) {
                                        puntos += 1;
                                    }
                                    if (jdigito3 == digito1 || jdigito3 == digito2 || jdigito3 == digito4) {
                                        puntos += 1;
                                    }
                                    if (jdigito4 == digito1 || jdigito4 == digito2 || jdigito4 == digito3) {
                                        puntos += 1;
                                    }

                                    if (jdigito1 == digito1) {
                                        famas += 1;
                                    }

                                    if (jdigito2 == digito2) {
                                        famas += 1;
                                    }

                                    if (jdigito3 == digito3) {
                                        famas += 1;
                                    }

                                    if (jdigito4 == digito4) {
                                        famas += 1;
                                    }
                                    JOptionPane.showMessageDialog(null, "Punto y fama:\n"
                                            + "Famas: " + famas + "\n"
                                            + "Puntos: " + puntos, "Hanpuku", JOptionPane.INFORMATION_MESSAGE);

                                }
                                JOptionPane.showMessageDialog(null, "¡Haz adivinado el numero!"
                                        + " " + num
                                        + " en " + jugadas + " intentos", "Hanpuku", JOptionPane.INFORMATION_MESSAGE);
                                do {
                                    conf = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea usar esta opción de nuevo?\n1.-->Si\n\n 2.--> No"));
                                } while (conf > 2);
                            } while (conf == 1);
                            break;

                        case 3:
                            //CASO PARA EL TRIQUI

                            JOptionPane.showMessageDialog(null, "¡Bienvenido al triqui!", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, triqui);
                            conf = 1;
                            do {
                                //DECLARACION DE VARIBALES NUMERICAS PARA VALORES DE LAS POSICIONES DEL TABLERO
                                int c1 = 0,
                                        c2 = 0,
                                        c3 = 0,
                                        c4 = 0,
                                        c5 = 0,
                                        c6 = 0,
                                        c7 = 0,
                                        c8 = 0,
                                        c9 = 0;
                                //DECLARACION DE VARIABLES DE TEXTO, PARA ALMACENAR LAS EQUIS O LOS CIRCULOS QUE SE MOSTRARAN EN PANTALLA
                                String c1s = "#",
                                        c2s = "#",
                                        c3s = "#",
                                        c4s = "#",
                                        c5s = "#",
                                        c6s = "#",
                                        c7s = "#",
                                        c8s = "#",
                                        c9s = "#";

                                int circulo = 0;
                                int equis = 0;
                                jugadas = 0;
                                JOptionPane.showMessageDialog(null, "En cada turno, el jugador debera seleccionar una posición del tablero:\n"
                                        + "1  2  3\n"
                                        + "4  5  6\n"
                                        + "7  8  9\n", "Hanpuku", JOptionPane.INFORMATION_MESSAGE);

                                //BUCLE WHILE LIMITADO POR LA CANTIDAD DE JUGADAS O POR SI ALGUN JUGADOR GANA
                                while (jugadas <= 9 && circulo != 1 && equis != 1) {
                                    jugadas += 1;                                         //DETERMINANDO SI EL TURNO ES DE CIRCULO O EQUIS
                                    if (jugadas % 2 != 0) {
                                        turno = "Circulo";
                                    } else {
                                        turno = "Equis";
                                    }
                                    do {
                                        valid = true;
                                        do {
                                            //IMPRESION DEL TABLERO ACTUAL- SE ACTUALIZA EN CADA ITERACION
                                            change = Integer.parseInt(JOptionPane.showInputDialog(null, "|Ingrese la posición a modificar:\n"
                                                    +"\n"
                                                    + "1  2  3" + "                  " + c1s + "  | " + c2s + " | " + c3s + "               Jugada: " + jugadas + "\n"
                                                    + "4  5  6" + "                  " + c4s + "  | " + c5s + " | " + c6s + "               Turno: " + turno + "\n"
                                                    + "7  8  9" + "                  " + c7s + "  | " + c8s + " | " + c9s, "Hanpuku", JOptionPane.INFORMATION_MESSAGE));

                                        } while (change > 9);
                                        //SWITCH PARA VER EN QUE CASILLA SE HACE LA MODIFICACION
                                        switch (change) {
                                            case 1:
                                                if (c1 != 0) {
                                                    valid = false;  //VARIABLE VALID PARA CONFIRMAR SI LA POSICION DEL TABLERO ESTA OCUPADA Y VOLVER A PEDIR UNA POSICION
                                                    break;
                                                } else {
                                                    if (jugadas % 2 != 0) {
                                                        c1 = 1;
                                                        c1s = "O";      //ACTUALIZACION DEL TABLERO
                                                        //DEPENDIENDO SI EL TURNO ES PAR O IMPAR-ASIGNACIONES A LA VARIABLE NUMERICA Y A LA STRING
                                                    } else {
                                                        c1 = 2;
                                                        c1s = "X";
                                                    }
                                                }
                                                break;
                                            case 2:
                                                if (c2 != 0) {
                                                    valid = false;
                                                    break;
                                                } else {
                                                    if (jugadas % 2 != 0) {
                                                        c2 = 1;
                                                        c2s = "O";
                                                    } else {
                                                        c2 = 2;
                                                        c2s = "X";
                                                    }
                                                }
                                                break;
                                            case 3:
                                                if (c3 != 0) {
                                                    valid = false;
                                                    break;
                                                } else {
                                                    if (jugadas % 2 != 0) {
                                                        c3 = 1;
                                                        c3s = "O";
                                                    } else {
                                                        c3 = 2;
                                                        c3s = "X";
                                                    }
                                                }
                                                break;
                                            case 4:
                                                if (c4 != 0) {
                                                    valid = false;
                                                    break;
                                                } else {
                                                    if (jugadas % 2 != 0) {
                                                        c4 = 1;
                                                        c4s = "O";
                                                    } else {
                                                        c4 = 2;
                                                        c4s = "X";
                                                    }
                                                }
                                                break;
                                            case 5:
                                                if (c5 != 0) {
                                                    valid = false;
                                                    break;
                                                } else {
                                                    if (jugadas % 2 != 0) {
                                                        c5 = 1;
                                                        c5s = "O";
                                                    } else {
                                                        c5 = 2;
                                                        c5s = "X";
                                                    }
                                                }
                                                break;
                                            case 6:
                                                if (c6 != 0) {
                                                    valid = false;
                                                    break;
                                                } else {
                                                    if (jugadas % 2 != 0) {
                                                        c6 = 1;
                                                        c6s = "O";
                                                    } else {
                                                        c6 = 2;
                                                        c6s = "X";
                                                    }
                                                }
                                                break;
                                            case 7:
                                                if (c7 != 0) {
                                                    valid = false;
                                                    break;
                                                } else {
                                                    if (jugadas % 2 != 0) {
                                                        c7 = 1;
                                                        c7s = "O";
                                                    } else {
                                                        c7 = 2;
                                                        c7s = "X";
                                                    }
                                                }
                                                break;
                                            case 8:
                                                if (c8 != 0) {
                                                    valid = false;
                                                    break;
                                                } else {
                                                    if (jugadas % 2 != 0) {
                                                        c8 = 1;
                                                        c8s = "O";
                                                    } else {
                                                        c8 = 2;
                                                        c8s = "X";
                                                    }
                                                }
                                                break;
                                            case 9:
                                                if (c9 != 0) {
                                                    valid = false;
                                                    break;
                                                } else {
                                                    if (jugadas % 2 != 0) {
                                                        c9 = 1;
                                                        c9s = "O";
                                                    } else {
                                                        c9 = 2;
                                                        c9s = "X";
                                                    }
                                                }
                                                break;
                                        }

                                    } while (valid == false);
                                    //EN CADA ITERACION SE REALIZA UNA CONFIRMACION SOBRE SI ALGUN JUGADOR HA GANADO
                                    if ((c1 == 1 && c2 == 1 && c3 == 1) || (c1 == 1 && c4 == 1 && c7 == 1) || (c3 == 1 && c6 == 1 && c9 == 1) || (c7 == 1 && c8 == 1 && c9 == 1) || (c1 == 1 && c5 == 1 && c9 == 1) || (c3 == 1 && c5 == 1 && c7 == 1)||(c4==1 && c5==1 && c6==1)) {
                                        circulo = 1;   //SE LE ASIGNA UN VALOR 1 A LA VARIABLE GANADORA
                                        winner = "Circulo";
                                    }
                                    if ((c1 == 2 && c2 == 2 && c3 == 2) || (c1 == 2 && c4 == 2 && c7 == 2) || (c3 == 2 && c6 == 2 && c9 == 2) || (c7 == 2 && c8 == 2 && c9 == 2) || (c1 == 2 && c5 == 2 && c9 == 2) || (c3 == 2 && c5 == 2 && c7 == 2)||(c4==2 && c5==2 && c6==2)) {
                                        equis = 1;
                                        winner = "Equis";
                                    }

                                }
                                if (circulo == 0 && equis == 0) { //SI NINGUNA VARIABLE ES GANADORA, SE ENTIENDE QUE HAY EMPATE
                                    JOptionPane.showMessageDialog(null, "¡Se han agotado las casillas, empate!", "Hanpuku", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "¡TRIQUI! \n"
                                            + "Gana " + winner, "Hanpuku", JOptionPane.INFORMATION_MESSAGE);
                                }
                                do {
                                    conf = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea usar esta opción de nuevo?\n1.-->Si\n 2.--> No"));
                                } while (conf > 2);

                            } while (conf == 1);
                    }

                    break;
                case 2:
                    //CASO DEL SWITCH PRINCIPAL PARA LOS PROCESOS MATEMATICOS
                    do {
                        //DO PARA OPCIONES MATEMATICAS
                        opmat = Integer.parseInt(JOptionPane.showInputDialog(null, username + ", Bienvenido a la miscelanea de procesos matematicos\n"
                                + "\n"
                                + "Escoge la opcion de tu preferencia:\n"
                                + "--------------------------------------\n"
                                + "1. Multiplcación rusa\n"
                                + "--------------------------------------\n"
                                + "2. Eliminar un digito\n"
                                + "--------------------------------------\n"
                                + "3. Funciones trigonometricas son series de Taylor\n"
                                + "--------------------------------------\n"
                                + "4. Salir al menu\n"
                                + "--------------------------------------"
                        ,"Hanpuku",JOptionPane.INFORMATION_MESSAGE));
                        switch (opmat) {
                            case 1:
                                conf = 1;

                                JOptionPane.showMessageDialog(null, username + ", Bienvenido al algoritmo de la multiplicación rusa", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, multipli);
                                do {
                                    mult1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de su multiplicador: "));
                                    mult2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de su multiplicando: "));
                                    res = 0;
                                    //ALGORITMO DE MULTIPLICACION RUSA IMPLEMENTE CON WHILE

                                    while (mult1 >= 1) {
                                        //SE MUESTRE EN CADA ITERACION EL VALOR DEL MULTIPLICADOR Y EL MULTIPLICANDO
                                        JOptionPane.showMessageDialog(null, "| Valor del multiplicador:                                    | Valor del multiplicando:\n"
                                                + "                                  " + mult1 + "                                    " + mult2, "Hanpuku", JOptionPane.INFORMATION_MESSAGE, multipli);
                                        if ((mult1 % 2) != 0) {
                                            res = res + mult2;
                                        }
                                        mult1 = mult1 / 2;
                                        mult2 = mult2 * 2;
                                    }
                                    JOptionPane.showMessageDialog(null, "El resultado es: " + res, "Hanpuku", JOptionPane.INFORMATION_MESSAGE);
                                    do {
                                        conf = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea usar esta opción de nuevo?\n1.-->Si\n\n 2.-->No","Hanpuku",JOptionPane.INFORMATION_MESSAGE));
                                    } while (conf > 2);

                                } while (conf == 1);
                                break;
                            case 2:
                                conf = 1;
                                JOptionPane.showMessageDialog(null, "¡Bienvenido al eliminador de digitos!, con la magia de las matematicas\n se borrara un digito de un numero ingresado", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, tacha);

                                do {

                                    num = Integer.parseInt(JOptionPane.showInputDialog(null, username + ", ingrese un numero mayor que 1000"));
                                    while (num <= 1000) {
                                        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero mayor que 1000, por favor: "));
                                    }
                                    elim = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el digito a eliminar de  su numero ingresado:"));
                                    n = 1;
                                    newnum = 0;
                                    auxnum = num;
                                    //CICLO QUE RECORRE LOS DIGITOS DEL NUMERO INGRESADO Y LOS COMPARA CON EL NUMERO A ELIMINAR
                                    //SI ESTO SE CUMPLE SE ELIMINE EL DIGITO DEL NUMERO MULTIPLICANDO Y DIVIENDO
                                    while (num > 0) {
                                        auxnum = num % 10;
                                        if (auxnum != elim) {
                                            newnum = newnum + auxnum * n;
                                            n = n * 10;

                                        }

                                        num = num / 10;

                                    }
                                    JOptionPane.showMessageDialog(null, "|| El nuevo numero es: " + newnum,"Hanpuku",JOptionPane.INFORMATION_MESSAGE);
                                    do {
                                        conf = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea usar esta opción de nuevo?\n1-->Si\n\n 2-->No"));
                                    } while (conf > 2);
                                } while (conf == 1);

                                break;
                            case 3:
                                //APROXIMACION DE PI CON CICLO FOR USANDO UNA SUMATORIA
                                for (n = 0; n <= repeticiones; n++) {
                                    signo = 1;
                                    for (int i = 1; i <= n; i++) {
                                        signo = signo * (-1);
                                    }
                                    pi = pi + (signo / (2 * n + 1));
                                }
                                pi = pi * 4;

                                JOptionPane.showMessageDialog(null, "Bienvenido a nuestra implementacion de la serie de taylor,\n usaremos esta serie para aproximar el valor de las funciones trigonometricas", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, suma);
                                conf = 1;
                                do {
                                    do {
                                        //ELECCION DE UN ANGULO ENTRE 0 Y 2PI RADINAES
                                        angulo = Integer.parseInt(JOptionPane.showInputDialog(null, "|| "+ username + ", ingrese un angulo en grados sexagecimales (0-360):", "Hanpuku", JOptionPane.QUESTION_MESSAGE));
                                    } while (angulo > 360);

                                    optrigro = Integer.parseInt(JOptionPane.showInputDialog(null, username + ", Escoja la funcion trigonometrica a calcular:\n"
                                            + "1 -- Seno\n"
                                            + "2 -- Coseno\n"
                                            + "3 -- Tangente\n"
                                            + "4 -- Cosecante\n"
                                            + "5 -- Secante\n"
                                            + "6 -- Cotangente\n"
                                            + "7 -- Salir al menu", "Hanpuku", JOptionPane.QUESTION_MESSAGE));

                                    angulo = angulo * pi / 180; //CONVERSION DEL ANGULO DE GRADO SEXAGECIMALES A RADIANES

                                    lim = 100;
                                    sen = 0;
                                    cos = 0;
                                    //CALCULO DE LA FUNCION SENO PARA EL ANGULO
                                    for (n = 0; n <= lim; n++) {
                                        sign = 1;
                                        for (int i = 1; i <= n; i++) {
                                            sign = sign * (-1);
                                        }
                                        fact = 1;
                                        pot = 1;
                                        for (int i = 1; i <= (2 * n + 1); i++) {
                                            fact = fact * i;
                                            pot = pot * angulo;
                                        }
                                        sen += sign * pot / fact;
                                    }
                                    sen = (float) ((int) (sen * 1000) / 1000.0); //LIMITACION DE LA APROXIMACION 

                                    System.out.println(sen);

                                    //CALCULO DE LA FUNCION COSENO PARA EL ANGULO
                                    for (n = 0; n <= lim; n++) {
                                        sign = 1;
                                        for (int i = 1; i <= n; i++) {
                                            sign = sign * (-1);
                                        }
                                        fact = 1;
                                        pot = 1;
                                        for (int i = 1; i <= (2 * n); i++) {
                                            fact = fact * i;
                                            pot = pot * angulo;
                                        }
                                        sen += sign * pot / fact;
                                    }
                                    sen = (float) ((int) (sen * 1000) / 1000.0); //LIMITACION DE LA APROXIMACION 

                                    switch (optrigro) {
                                        //CALCULO DE SENO-COSENO-TANGENTE Y RECIPROCAS
                                        case 1:
                                            JOptionPane.showMessageDialog(null, "El seno del angulo ingresado es: " + sen, "Hanpuku", JOptionPane.INFORMATION_MESSAGE,trigofot);
                                            break;
                                        case 2:
                                            JOptionPane.showMessageDialog(null, "El coseno del angulo ingresado es: " + cos, "Hanpuku", JOptionPane.INFORMATION_MESSAGE,trigofot);
                                            break;
                                        case 3:
                                            if (cos == 0) {
                                                JOptionPane.showMessageDialog(null, "La tangente no esta definida para este angulo", "Hanpuku", JOptionPane.INFORMATION_MESSAGE,trigofot);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "La tangente del angulo ingresado es:" + sen / cos, "Hanpuku", JOptionPane.INFORMATION_MESSAGE,trigofot);
                                            }
                                            break;
                                        case 4:
                                            if (sen == 0) {
                                                JOptionPane.showMessageDialog(null, "La cosecante no esta definida para esta angulo", "Hanpuku", JOptionPane.INFORMATION_MESSAGE,trigofot);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "La cosecante del angulo ingresado es: " + 1 / sen, "Hanpuku", JOptionPane.INFORMATION_MESSAGE,trigofot);
                                            }
                                            break;
                                        case 5:
                                            if (cos == 0) {
                                                JOptionPane.showMessageDialog(null, "La secante no esta definida para este angulo", "Hanpuku", JOptionPane.INFORMATION_MESSAGE,trigofot);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "La secante del angulo ingresado es: " + 1 / cos, "Hanpuku", JOptionPane.INFORMATION_MESSAGE,trigofot);
                                            }
                                            break;
                                        case 6:
                                            if (cos/ sen == 0) {
                                                JOptionPane.showMessageDialog(null, "La cotangente no esta definida para este angulo", "Hanpuku", JOptionPane.INFORMATION_MESSAGE,trigofot);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "La cotangete del angulo ingresado es: " + (cos/sen), "Hanpuku", JOptionPane.INFORMATION_MESSAGE,trigofot);
                                            }
                                            break;
                                    }
                                    do {
                                        conf = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea usar esta opción de nuevo?\n1.-->Si\n\n 2.-->No", "Hanpuku", JOptionPane.INFORMATION_MESSAGE));
                                    } while (conf > 2);

                                } while (conf == 1);

                                break;
                        }
                        break;
                    } while (opmat < 4);
                default:
            }

        } while (op
                < 3);
        JOptionPane.showMessageDialog(
                null, "<html><p style= \"font:20px\">¡Gracias por usar Hanpuku, tu menu de confianza!</html>", "Hanpuku", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
