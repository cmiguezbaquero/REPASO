import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


/*  //Ejercicio 1 : Sistema de Aterrizaje Asistido

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce número de pista entre 1 - 5 :");
            int numeroPista = scanner.nextInt();

            if (numeroPista == 0) {
                System.out.println("Operación cancelada");
                break;

            } else if (numeroPista >= 1 && numeroPista <= 5) {
                System.out.println("Aterrizaje seguro");

            } else {
                System.out.println("Inválido");

            }

        } while (true);
*/
/*  // Ejercicio 2 : Control de Nivel de Oxígeno

        Scanner scanner = new Scanner(System.in);

        int x = 0;

        while (x < 3){

            System.out.println("Ingrese nivel de oxígeno : ");
            int porcentajeOxigeno = scanner.nextInt();

            if (porcentajeOxigeno >= 80 && porcentajeOxigeno <= 100) {
                System.out.println("Nivel óptimo");

            } else if (porcentajeOxigeno >= 40 && porcentajeOxigeno <= 79) {
                System.out.println("Nivel bajo, se requiere reabastecimiento");

            } else {
                System.out.println("Nivel crítico, evacuación de la cabina");
            }
            x++;
        }
*/
/*  //Ejercicio 3 : Simulación de Recolección de Meteoritos

        Scanner scanner = new Scanner(System.in);

        System.out.println("Número de meteoritos recolectados : ");
        int numMeteoritos = scanner.nextInt();
        recolectarMeteoritos(numMeteoritos);

        }
    public static void recolectarMeteoritos(int numMeteoritos){

        for (int i = 0; i <= numMeteoritos; i++) {
                System.out.println("Meteorito " + i*1 + " de 10 recogido. Progreso:" + i*10 + "%");
        }
        System.out.println("Misión de recolección completada");
        }
    }

 */

/*  //Ejercicio 4 : Búsqueda de Satélites Activos
        Scanner scanner = new Scanner(System.in);
        String códigoSatélite;

        do {
            System.out.println("Consulte el estado de varios satélites : ");
            códigoSatélite = scanner.nextLine();
            buscarSatélites(códigoSatélite);
        } while (!códigoSatélite.equals("FIN"));
        scanner.close();
        System.out.println("Programa finalizado");
    }

    public static void buscarSatélites(String codigoSatélite) {
            switch (codigoSatélite) {
                case "SAT-A",
                     "SAT-B",
                     "SAT-C":
                    System.out.println("Satélite activo, transmitiendo datos");
                    break;

                case "SAT-D",
                     "SAT-E":
                    System.out.println("Satélite inactivo, requiere mantenimiento");
                    break;

                default:
                    System.out.println("Código de satélite desconocido");
                    break;
        }
    }
}
*/

    //Ejercicio 5 : Cálculo de Órbita Estabilizada

        Scanner scanner = new Scanner(System.in);
        int altOrbita = scanner.nextInt();
        estabOrbita(altOrbita);

        do {
            System.out.println("Altura de la órbita : ");
            altOrbita = scanner.nextInt();

        } while (altOrbita >= 200 && altOrbita <= 500);{
        }

    }
        public static void estabOrbita ( int altOrbita){

            double tiempo = (altOrbita - 200) * 1.5;
            System.out.println("Tiempo de estabilización " + tiempo + "tiempo.");


        }
    }





